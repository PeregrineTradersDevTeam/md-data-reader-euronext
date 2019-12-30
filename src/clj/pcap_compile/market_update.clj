(ns pcap-compile.market-update
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd MarketUpdateDecoder MarketUpdateDecoder$UpdatesDecoder]
           [org.apache.parquet.schema MessageType]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop.api WriteSupport WriteSupport$WriteContext]
           [org.apache.parquet.hadoop ParquetOutputFormat ParquetRecordWriter]))

(def message-schema
  "
         optional int64 mkt_data_seq_num;
optional int32 rebroadcast_indicator;
optional int32 emm;
optional int64 event_time;
optional int32 mkt_data_update_type;
optional int64 symbol_index;
optional int32 number_of_orders;
optional int64 price;
optional int64 quantity;

  ")

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^MarketUpdateDecoder top-record ^MarketUpdateDecoder$UpdatesDecoder repetition]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "emm" (+ start-at 2) (.addInteger (.value (.eMM top-record))))
  (with-field-new rconsumer "event_time" (+ start-at 3) (.addLong (.eventTime top-record)))
  (with-field-new rconsumer "mkt_data_update_type" (+ start-at 4) (.addInteger (.value (.updateType repetition))))
  (with-field-new rconsumer "symbol_index" (+ start-at 5) (.addLong (.symbolIndex repetition)))
  (let [src-value (.numberOfOrders repetition)]
    (when (not= src-value (MarketUpdateDecoder$UpdatesDecoder/numberOfOrdersNullValue))
      (with-field-new rconsumer "number_of_orders"  (+ start-at 6) (.addInteger src-value))))
  (let [src-value (.price repetition)]
    (when (not= src-value (MarketUpdateDecoder$UpdatesDecoder/priceNullValue))
      (with-field-new rconsumer "price"  (+ start-at 7) (.addLong src-value))))
  (let [src-value (.quantity repetition)]
    (when (not= src-value (MarketUpdateDecoder$UpdatesDecoder/quantityNullValue))
      (with-field-new rconsumer "quantity"  (+ start-at 8) (.addLong src-value)))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-market-update.parquet")
   (make-loopfull-proxy message-write (memfn ^MarketUpdateDecoder updates) (compile-schema message-schema) {} (memfn ^MarketUpdateDecoder$UpdatesDecoder count))))

(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new MarketUpdateDecoder) buffer subOffset actingBlockLength actingVersion))

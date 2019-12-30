(ns pcap-compile.price-update
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd PriceUpdateDecoder PriceUpdateDecoder$PricesDecoder]
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
optional int32 mkt_data_price_type;
optional int64 symbol_index;
optional int64 price;
optional int64 quantity;
optional int64 imbalance_quantity;
optional int32 imbalance_qty_side;

  ")

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^PriceUpdateDecoder top-record ^PriceUpdateDecoder$PricesDecoder repetition]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "emm" (+ start-at 2) (.addInteger (.value (.eMM top-record))))
  (with-field-new rconsumer "event_time" (+ start-at 3) (.addLong (.eventTime top-record)))
  (with-field-new rconsumer "mkt_data_price_type" (+ start-at 4) (.addInteger (.value (.priceType repetition))))
  (with-field-new rconsumer "symbol_index" (+ start-at 5) (.addLong (.symbolIndex repetition)))
  (let [src-value (.price repetition)]
    (when (not= src-value (PriceUpdateDecoder$PricesDecoder/priceNullValue))
      (with-field-new rconsumer "price"  (+ start-at 6) (.addLong src-value))))
  (let [src-value (.quantity repetition)]
    (when (not= src-value (PriceUpdateDecoder$PricesDecoder/quantityNullValue))
      (with-field-new rconsumer "quantity"  (+ start-at 7) (.addLong src-value))))
  (let [src-value (.imbalanceQty repetition)]
    (when (not= src-value (PriceUpdateDecoder$PricesDecoder/imbalanceQtyNullValue))
      (with-field-new rconsumer "imbalance_quantity"  (+ start-at 8) (.addLong src-value))))
  (let [src-value (.imbalanceQtySide repetition)]
    (when (not= src-value com.euronext.optiq.dd.ImbalanceQuantitySide_enum/NULL_VAL)
      (with-field-new rconsumer "imbalance_qty_side"  (+ start-at 9) (.addInteger (.value src-value))))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-price-update.parquet")
   (make-loopfull-proxy message-write (memfn ^PriceUpdateDecoder prices) (compile-schema message-schema) {} (memfn ^PriceUpdateDecoder$PricesDecoder count))))

(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new PriceUpdateDecoder) buffer subOffset actingBlockLength actingVersion))

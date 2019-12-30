(ns pcap-compile.order-update
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd OrderUpdateDecoder OrderUpdateDecoder$OrdersDecoder]
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
optional int64 symbol_index;
optional int32 mkt_data_action_type;
optional int64 order_priority;
optional int64 previous_priority;
optional int32 order_type;
optional int64 order_price;
optional int32 order_side;
optional int64 order_qty;
optional int64 peg_offset;

  ")

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^OrderUpdateDecoder top-record ^OrderUpdateDecoder$OrdersDecoder repetition]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "emm" (+ start-at 2) (.addInteger (.value (.eMM top-record))))
  (with-field-new rconsumer "event_time" (+ start-at 3) (.addLong (.eventTime top-record)))
  (with-field-new rconsumer "symbol_index" (+ start-at 4) (.addLong (.symbolIndex repetition)))
  (with-field-new rconsumer "mkt_data_action_type" (+ start-at 5) (.addInteger (.value (.actionType repetition))))
  (let [src-value (.orderPriority repetition)]
    (when (not= src-value (OrderUpdateDecoder$OrdersDecoder/orderPriorityNullValue))
      (with-field-new rconsumer "order_priority"  (+ start-at 6) (.addLong src-value))))
  (let [src-value (.previousPriority repetition)]
    (when (not= src-value (OrderUpdateDecoder$OrdersDecoder/previousPriorityNullValue))
      (with-field-new rconsumer "previous_priority"  (+ start-at 7) (.addLong src-value))))
  (let [src-value (.orderType repetition)]
    (when (not= src-value com.euronext.optiq.dd.OrderType_enum/NULL_VAL)
      (with-field-new rconsumer "order_type"  (+ start-at 8) (.addInteger (.value src-value)))))
  (let [src-value (.orderPx repetition)]
    (when (not= src-value (OrderUpdateDecoder$OrdersDecoder/orderPxNullValue))
      (with-field-new rconsumer "order_price"  (+ start-at 9) (.addLong src-value))))
  (let [src-value (.orderSide repetition)]
    (when (not= src-value com.euronext.optiq.dd.OrderSide_enum/NULL_VAL)
      (with-field-new rconsumer "order_side"  (+ start-at 10) (.addInteger (.value src-value)))))
  (let [src-value (.orderQuantity repetition)]
    (when (not= src-value (OrderUpdateDecoder$OrdersDecoder/orderQuantityNullValue))
      (with-field-new rconsumer "order_qty"  (+ start-at 11) (.addLong src-value))))
  (let [src-value (.pegOffset repetition)]
    (when (not= src-value (OrderUpdateDecoder$OrdersDecoder/pegOffsetNullValue))
      (with-field-new rconsumer "peg_offset"  (+ start-at 12) (.addLong src-value)))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-order-update.parquet")
   (make-loopfull-proxy message-write (memfn ^OrderUpdateDecoder orders) (compile-schema message-schema) {} (memfn ^OrderUpdateDecoder$OrdersDecoder count))))

(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new OrderUpdateDecoder) buffer subOffset actingBlockLength actingVersion))

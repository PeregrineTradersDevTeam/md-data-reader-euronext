(ns pcap-compile.index-summary
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd IndexSummaryDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]))

(def message-schema
  "
         optional int64 mkt_data_seq_num;
optional int32 rebroadcast_indicator;
optional int32 emm;
optional int64 event_time;
optional int64 symbol_index;
optional int64 opening_level;
optional int64 opening_time;
optional int64 confirmed_reference_level;
optional int64 confirmed_reference_time;
optional int64 closing_reference_level;
optional int64 closing_reference_time;
optional int64 percentage_var_from_prev_close;
optional int64 high_level;
optional int64 high_time;
optional int64 low_level;
optional int64 low_time;
optional int64 liquidation_level;
optional int64 liquidation_time;

  ")
(defn- message-write [^RecordConsumer rconsumer #^long start-at ^IndexSummaryDecoder top-record]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "emm" (+ start-at 2) (.addInteger (.value (.eMM top-record))))
  (with-field-new rconsumer "event_time" (+ start-at 3) (.addLong (.eventTime top-record)))
  (with-field-new rconsumer "symbol_index" (+ start-at 4) (.addLong (.symbolIndex top-record)))
  (with-field-new rconsumer "opening_level" (+ start-at 5) (.addLong (.openingLevel top-record)))
  (with-field-new rconsumer "opening_time" (+ start-at 6) (.addLong (.openingTime top-record)))
  (let [src-value (.confirmedReferenceLevel top-record)]
    (when (not= src-value (IndexSummaryDecoder/confirmedReferenceLevelNullValue))
      (with-field-new rconsumer "confirmed_reference_level"  (+ start-at 7) (.addLong src-value))))
  (let [src-value (.confirmedReferenceTime top-record)]
    (when (not= src-value (IndexSummaryDecoder/confirmedReferenceTimeNullValue))
      (with-field-new rconsumer "confirmed_reference_time"  (+ start-at 8) (.addLong src-value))))
  (with-field-new rconsumer "closing_reference_level" (+ start-at 9) (.addLong (.closingReferenceLevel top-record)))
  (with-field-new rconsumer "closing_reference_time" (+ start-at 10) (.addLong (.closingReferenceTime top-record)))
  (with-field-new rconsumer "percentage_var_from_prev_close" (+ start-at 11) (.addLong (.prctVarfromPrevClose top-record)))
  (with-field-new rconsumer "high_level" (+ start-at 12) (.addLong (.highLevel top-record)))
  (with-field-new rconsumer "high_time" (+ start-at 13) (.addLong (.highTime top-record)))
  (with-field-new rconsumer "low_level" (+ start-at 14) (.addLong (.lowLevel top-record)))
  (with-field-new rconsumer "low_time" (+ start-at 15) (.addLong (.lowTime top-record)))
  (let [src-value (.liquidationLevel top-record)]
    (when (not= src-value (IndexSummaryDecoder/liquidationLevelNullValue))
      (with-field-new rconsumer "liquidation_level"  (+ start-at 16) (.addLong src-value))))
  (let [src-value (.liquidationTime top-record)]
    (when (not= src-value (IndexSummaryDecoder/liquidationTimeNullValue))
      (with-field-new rconsumer "liquidation_time"  (+ start-at 17) (.addLong src-value)))))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-index-summary.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new IndexSummaryDecoder) buffer subOffset actingBlockLength actingVersion))


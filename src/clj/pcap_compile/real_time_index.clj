(ns pcap-compile.real-time-index
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd RealTimeIndexDecoder]
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
optional int64 index_level;
optional int64 percentage_of_capitalization;
optional int64 percentage_var_from_prev_close;
optional int32 number_of_traded_instruments_in_index;
optional int32 index_level_type;
optional int64 index_price_code;

  ")
(defn- message-write [^RecordConsumer rconsumer #^long start-at ^RealTimeIndexDecoder top-record]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "emm" (+ start-at 2) (.addInteger (.value (.eMM top-record))))
  (with-field-new rconsumer "event_time" (+ start-at 3) (.addLong (.eventTime top-record)))
  (with-field-new rconsumer "symbol_index" (+ start-at 4) (.addLong (.symbolIndex top-record)))
  (with-field-new rconsumer "index_level" (+ start-at 5) (.addLong (.indexLevel top-record)))
  (let [src-value (.pctgOfCapitalization top-record)]
    (when (not= src-value (RealTimeIndexDecoder/pctgOfCapitalizationNullValue))
      (with-field-new rconsumer "percentage_of_capitalization"  (+ start-at 6) (.addLong src-value))))
  (with-field-new rconsumer "percentage_var_from_prev_close" (+ start-at 7) (.addLong (.prctVarfromPrevClose top-record)))
  (let [src-value (.numTradedInstruments top-record)]
    (when (not= src-value (RealTimeIndexDecoder/numTradedInstrumentsNullValue))
      (with-field-new rconsumer "number_of_traded_instruments_in_index"  (+ start-at 8) (.addInteger src-value))))
  (with-field-new rconsumer "index_level_type" (+ start-at 9) (.addInteger (.value (.indexLevelType top-record))))
  (with-field-new rconsumer "index_price_code" (+ start-at 10) (.addLong (.value (.indexPriceCode top-record)))))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-real-time-index.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new RealTimeIndexDecoder) buffer subOffset actingBlockLength actingVersion))


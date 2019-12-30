(ns pcap-compile.statistics
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd StatisticsDecoder StatisticsDecoder$NewStatsDecoder]
           [org.apache.parquet.schema MessageType]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop.api WriteSupport WriteSupport$WriteContext]
           [org.apache.parquet.hadoop ParquetOutputFormat ParquetRecordWriter]))

(def message-schema
  "
         optional int64 mkt_data_seq_num;
optional int32 rebroadcast_indicator;
optional int64 symbol_index;
optional int32 stats_update_type;
optional int64 stats_update_value;

  ")

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^StatisticsDecoder top-record ^StatisticsDecoder$NewStatsDecoder repetition]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "symbol_index" (+ start-at 2) (.addLong (.symbolIndex top-record)))
  (with-field-new rconsumer "stats_update_type" (+ start-at 3) (.addInteger (.value (.statsUpdateType repetition))))
  (let [src-value (.statsUpdateValue repetition)]
    (when (not= src-value (StatisticsDecoder$NewStatsDecoder/statsUpdateValueNullValue))
      (with-field-new rconsumer "stats_update_value"  (+ start-at 4) (.addLong src-value)))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-statistics.parquet")
   (make-loopfull-proxy message-write (memfn ^StatisticsDecoder newStats) (compile-schema message-schema) {} (memfn ^StatisticsDecoder$NewStatsDecoder count))))

(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new StatisticsDecoder) buffer subOffset actingBlockLength actingVersion))

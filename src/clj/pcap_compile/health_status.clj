(ns pcap-compile.health-status
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd HealthStatusDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]))

(def message-schema
  "
         optional int64 mkt_data_seq_num;
optional int64 event_time;

  ")
(defn- message-write [^RecordConsumer rconsumer #^long start-at ^HealthStatusDecoder top-record]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "event_time" (+ start-at 1) (.addLong (.eventTime top-record))))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-health-status.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new HealthStatusDecoder) buffer subOffset actingBlockLength actingVersion))

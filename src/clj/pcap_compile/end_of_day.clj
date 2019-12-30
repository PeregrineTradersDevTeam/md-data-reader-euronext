(ns pcap-compile.end-of-day
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd EndOfDayDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]))

(def message-schema
  "
         optional int64 mkt_data_seq_num;
optional int32 session_trading_day;

  ")
(defn- message-write [^RecordConsumer rconsumer #^long start-at ^EndOfDayDecoder top-record]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "session_trading_day" (+ start-at 1) (.addInteger (.sessionTradingDay top-record))))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-end-of-day.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new EndOfDayDecoder) buffer subOffset actingBlockLength actingVersion))

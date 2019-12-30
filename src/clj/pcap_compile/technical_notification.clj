(ns pcap-compile.technical-notification
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd TechnicalNotificationDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]))

(def message-schema
  "
         optional int64 mkt_data_seq_num;
optional int32 technical_notification_type;
optional int32 rebroadcast_indicator;
optional int64 retransmission_start_time;
optional int64 retransmission_end_time;
optional int64 symbol_index;

  ")
(defn- message-write [^RecordConsumer rconsumer #^long start-at ^TechnicalNotificationDecoder top-record]
  (let [src-value (.mDSeqNum top-record)]
    (when (not= src-value (TechnicalNotificationDecoder/mDSeqNumNullValue))
      (with-field-new rconsumer "mkt_data_seq_num"  (+ start-at 0) (.addLong src-value))))
  (with-field-new rconsumer "technical_notification_type" (+ start-at 1) (.addInteger (.value (.technicalNotificationType top-record))))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 2) (.addInteger (.rebroadcastIndicator top-record)))
  (let [src-value (.retransmissionStartTime top-record)]
    (when (not= src-value (TechnicalNotificationDecoder/retransmissionStartTimeNullValue))
      (with-field-new rconsumer "retransmission_start_time"  (+ start-at 3) (.addLong src-value))))
  (let [src-value (.retransmissionEndTime top-record)]
    (when (not= src-value (TechnicalNotificationDecoder/retransmissionEndTimeNullValue))
      (with-field-new rconsumer "retransmission_end_time"  (+ start-at 4) (.addLong src-value))))
  (let [src-value (.symbolIndex top-record)]
    (when (not= src-value (TechnicalNotificationDecoder/symbolIndexNullValue))
      (with-field-new rconsumer "symbol_index"  (+ start-at 5) (.addLong src-value)))))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-technical-notification.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new TechnicalNotificationDecoder) buffer subOffset actingBlockLength actingVersion))


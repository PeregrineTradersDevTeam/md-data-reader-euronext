(ns pcap-compile.timetable
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd TimetableDecoder TimetableDecoder$TimetablesDecoder]
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
optional int32 pattern_id;
optional int64 symbol_index;
optional int64 phase_time;
optional int32 phase_id;
optional int32 phase_qualifier;
optional int32 trading_period;
optional int32 order_entry_qualifier;
optional int32 session;

  ")

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^TimetableDecoder top-record ^TimetableDecoder$TimetablesDecoder repetition]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (let [src-value (.eMM top-record)]
    (when (not= src-value com.euronext.optiq.dd.EMM_enum/NULL_VAL)
      (with-field-new rconsumer "emm"  (+ start-at 2) (.addInteger (.value src-value)))))
  (let [src-value (.patternID top-record)]
    (when (not= src-value (TimetableDecoder/patternIDNullValue))
      (with-field-new rconsumer "pattern_id"  (+ start-at 3) (.addInteger src-value))))
  (let [src-value (.symbolIndex top-record)]
    (when (not= src-value (TimetableDecoder/symbolIndexNullValue))
      (with-field-new rconsumer "symbol_index"  (+ start-at 4) (.addLong src-value))))
  (with-field-new rconsumer "phase_time" (+ start-at 5) (.addLong (.phaseTime repetition)))
  (with-field-new rconsumer "phase_id" (+ start-at 6) (.addInteger (.value (.phaseId repetition))))
  (with-field-new rconsumer "phase_qualifier" (+ start-at 7) (.addInteger (let [field (.phaseQualifier repetition)] (.getShort (.buffer field) (.offset field)))))
  (with-field-new rconsumer "trading_period" (+ start-at 8) (.addInteger (.value (.tradingPeriod repetition))))
  (let [src-value (.orderEntryQualifier repetition)]
    (when (not= src-value com.euronext.optiq.dd.OrderEntryQualifier_enum/NULL_VAL)
      (with-field-new rconsumer "order_entry_qualifier"  (+ start-at 9) (.addInteger (.value src-value)))))
  (with-field-new rconsumer "session" (+ start-at 10) (.addInteger (.value (.session repetition)))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-timetable.parquet")
   (make-loopfull-proxy message-write (memfn ^TimetableDecoder timetables) (compile-schema message-schema) {} (memfn ^TimetableDecoder$TimetablesDecoder count))))

(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new TimetableDecoder) buffer subOffset actingBlockLength actingVersion))

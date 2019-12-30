(ns pcap-compile.market-status-change
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd MarketStatusChangeDecoder MarketStatusChangeDecoder$MarketStatesDecoder]
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
optional int32 market_data_change_type;
optional int64 symbol_index;
optional int64 event_time;
optional int32 book_state;
optional int32 status_reason;
optional int32 phase_qualifier;
optional int32 trading_period;
optional int32 trading_side;
optional int32 price_limits;
optional int32 quote_spread_multiplier;
optional int32 order_entry_qualifier;
optional int32 session;
optional int32 scheduled_event;
optional int64 scheduled_event_time;

  ")

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^MarketStatusChangeDecoder top-record ^MarketStatusChangeDecoder$MarketStatesDecoder repetition]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "emm" (+ start-at 2) (.addInteger (.value (.eMM top-record))))
  (with-field-new rconsumer "market_data_change_type" (+ start-at 3) (.addInteger (.value (.changeType repetition))))
  (with-field-new rconsumer "symbol_index" (+ start-at 4) (.addLong (.symbolIndex repetition)))
  (with-field-new rconsumer "event_time" (+ start-at 5) (.addLong (.eventTime repetition)))
  (let [src-value (.bookState repetition)]
    (when (not= src-value com.euronext.optiq.dd.BookState_enum/NULL_VAL)
      (with-field-new rconsumer "book_state"  (+ start-at 6) (.addInteger (.value src-value)))))
  (let [src-value (.statusReason repetition)]
    (when (not= src-value com.euronext.optiq.dd.StatusReason_enum/NULL_VAL)
      (with-field-new rconsumer "status_reason"  (+ start-at 7) (.addInteger (.value src-value)))))
  (with-field-new rconsumer "phase_qualifier" (+ start-at 8) (.addInteger (let [field (.phaseQualifier repetition)] (.getShort (.buffer field) (.offset field)))))
  (let [src-value (.tradingPeriod repetition)]
    (when (not= src-value com.euronext.optiq.dd.TradingPeriod_enum/NULL_VAL)
      (with-field-new rconsumer "trading_period"  (+ start-at 9) (.addInteger (.value src-value)))))
  (let [src-value (.tradingSide repetition)]
    (when (not= src-value com.euronext.optiq.dd.TradingSide_enum/NULL_VAL)
      (with-field-new rconsumer "trading_side"  (+ start-at 10) (.addInteger (.value src-value)))))
  (let [src-value (.priceLimits repetition)]
    (when (not= src-value com.euronext.optiq.dd.PriceLimits_enum/NULL_VAL)
      (with-field-new rconsumer "price_limits"  (+ start-at 11) (.addInteger (.value src-value)))))
  (let [src-value (.quoteSpreadMultiplier repetition)]
    (when (not= src-value com.euronext.optiq.dd.QuoteSpreadMultiplier_enum/NULL_VAL)
      (with-field-new rconsumer "quote_spread_multiplier"  (+ start-at 12) (.addInteger (.value src-value)))))
  (let [src-value (.orderEntryQualifier repetition)]
    (when (not= src-value com.euronext.optiq.dd.OrderEntryQualifier_enum/NULL_VAL)
      (with-field-new rconsumer "order_entry_qualifier"  (+ start-at 13) (.addInteger (.value src-value)))))
  (with-field-new rconsumer "session" (+ start-at 14) (.addInteger (.value (.session repetition))))
  (let [src-value (.scheduledEvent repetition)]
    (when (not= src-value com.euronext.optiq.dd.ScheduledEvent_enum/NULL_VAL)
      (with-field-new rconsumer "scheduled_event"  (+ start-at 15) (.addInteger (.value src-value)))))
  (let [src-value (.scheduledEventTime repetition)]
    (when (not= src-value (MarketStatusChangeDecoder$MarketStatesDecoder/scheduledEventTimeNullValue))
      (with-field-new rconsumer "scheduled_event_time"  (+ start-at 16) (.addLong src-value)))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-market-status-change.parquet")
   (make-loopfull-proxy message-write (memfn ^MarketStatusChangeDecoder marketStates) (compile-schema message-schema) {} (memfn ^MarketStatusChangeDecoder$MarketStatesDecoder count))))

(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new MarketStatusChangeDecoder) buffer subOffset actingBlockLength actingVersion))

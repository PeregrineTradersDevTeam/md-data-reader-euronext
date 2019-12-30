(ns pcap-compile.strategy-standing-data
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd StrategyStandingDataDecoder StrategyStandingDataDecoder$StrategyStandingDatarep1Decoder]
           [org.apache.parquet.schema MessageType]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop.api WriteSupport WriteSupport$WriteContext]
           [org.apache.parquet.hadoop ParquetOutputFormat ParquetRecordWriter]))

(def message-schema
  "
         optional int64 mkt_data_seq_num;
optional int32 rebroadcast_ind;
optional int32 emm;
optional int64 symbol_index;
optional binary instrument_trading_code;
optional binary exchange_code;
optional binary maturity_date;
optional binary strategy_code;
optional int64 contract_symbol_index;
optional binary cfi;
optional int64 leg_symbol_index;
optional int64 leg_price;
optional int32 leg_ratio;
optional binary leg_buy_or_sell;

  ")

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^StrategyStandingDataDecoder top-record ^StrategyStandingDataDecoder$StrategyStandingDatarep1Decoder repetition]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_ind" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "emm" (+ start-at 2) (.addInteger (.value (.eMM top-record))))
  (with-field-new rconsumer "symbol_index" (+ start-at 3) (.addLong (.symbolIndex top-record)))
  (with-field-new rconsumer "instrument_trading_code" (+ start-at 4) (.addBinary (Binary/fromCharSequence (.instrumentTradingCode top-record))))
  (with-field-new rconsumer "exchange_code" (+ start-at 5) (.addBinary (Binary/fromCharSequence (.toString (char (.value (.exchangeCode top-record)))))))
  (with-field-new rconsumer "maturity_date" (+ start-at 6) (.addBinary (Binary/fromCharSequence (.maturityDate top-record))))
  (with-field-new rconsumer "strategy_code" (+ start-at 7) (.addBinary (Binary/fromCharSequence (.toString (char (.value (.strategyCode top-record)))))))
  (with-field-new rconsumer "contract_symbol_index" (+ start-at 8) (.addLong (.contractSymbolIndex top-record)))
  (let [src-value (.cFI top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "cfi"  (+ start-at 9) (.addBinary (Binary/fromCharSequence src-value)))))
  (with-field-new rconsumer "leg_symbol_index" (+ start-at 10) (.addLong (.legSymbolIndex repetition)))
  (let [src-value (.legPrice repetition)]
    (when (not= src-value (StrategyStandingDataDecoder$StrategyStandingDatarep1Decoder/legPriceNullValue))
      (with-field-new rconsumer "leg_price"  (+ start-at 11) (.addLong src-value))))
  (with-field-new rconsumer "leg_ratio" (+ start-at 12) (.addInteger (.legRatio repetition)))
  (with-field-new rconsumer "leg_buy_or_sell" (+ start-at 13) (.addBinary (Binary/fromCharSequence (.toString (char (.value (.legBuySell repetition))))))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-strategy-standing-data.parquet")
   (make-loopfull-proxy message-write (memfn ^StrategyStandingDataDecoder strategyStandingDatarep1) (compile-schema message-schema) {} (memfn ^StrategyStandingDataDecoder$StrategyStandingDatarep1Decoder count))))

(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new StrategyStandingDataDecoder) buffer subOffset actingBlockLength actingVersion))

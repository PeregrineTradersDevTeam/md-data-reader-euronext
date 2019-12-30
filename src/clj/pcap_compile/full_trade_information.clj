(ns pcap-compile.full-trade-information
    (:use [pcap-common.macros]
          [pcap-common.parquet-util])
    (:import [com.euronext.optiq.dd FullTradeInformationDecoder]
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
optional binary trading_date_time;
optional binary publication_date_time;
optional int32 trade_type;
optional binary MiFID_instrument_id_type;
optional binary MiFID_instrument_id;
optional binary MiFID_execution_id;
optional binary MiFID_price;
optional binary MiFID_quantity;
optional binary MiFID_price_notation;
optional binary MiFID_currency;
optional binary MiFID_qty_in_msrmnt_unit_notation;
optional binary MiFID_msrmnt_unit;
optional binary MiFID_notional_amount;
optional binary notional_currency;
optional binary MiFID_clearing_flag;
optional int32 MMT_mkt_mechanism;
optional binary MMT_trading_mode;
optional binary MMT_transaction_category;
optional binary MMT_negotiation_indicator;
optional binary MMT_agency_cross_trade_indicator;
optional binary MMT_modification_indicator;
optional binary MMT_benchmark_indicator;
optional binary MMT_special_dividend_indicator;
optional binary MMT_off_book_auto_indicator;
optional binary MMT_contribution_to_price;
optional binary MMT_algo_indicator;
optional binary MMT_publication_mode;
optional binary MMT_post_trade_deferral;
optional binary MMT_duplicative_indicator;
optional int32 trade_qualifier;
optional int32 transaction_type;
optional int32 effective_date_indicator;
optional binary block_trade_code;
optional binary trade_reference;
optional int64 original_report_timestamp;
optional int32 transparency_indicator;
optional int32 currency_coefficient;
optional int32 price_multiplier;
optional int32 price_multiplier_decimals;
optional binary venue;
optional int32 start_time_vwap;
optional int32 end_time_vwap;
optional binary MiFID_emission_allowance_type;
optional binary mkt_of_reference_MIC;

  ")
(defn- message-write [^RecordConsumer rconsumer #^long start-at ^FullTradeInformationDecoder top-record]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_indicator" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "emm" (+ start-at 2) (.addInteger (.value (.eMM top-record))))
  (with-field-new rconsumer "event_time" (+ start-at 3) (.addLong (.eventTime top-record)))
  (let [src-value (.symbolIndex top-record)]
    (when (not= src-value (FullTradeInformationDecoder/symbolIndexNullValue))
      (with-field-new rconsumer "symbol_index"  (+ start-at 4) (.addLong src-value))))
  (with-field-new rconsumer "trading_date_time" (+ start-at 5) (.addBinary (Binary/fromCharSequence (.tradingDateTime top-record))))
  (let [src-value (.publicationDateTime top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "publication_date_time"  (+ start-at 6) (.addBinary (Binary/fromCharSequence src-value)))))
  (with-field-new rconsumer "trade_type" (+ start-at 7) (.addInteger (.value (.tradeType top-record))))
  (let [src-value (.mifidInstrumentIdType top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_instrument_id_type"  (+ start-at 8) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mifidInstrumentID top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_instrument_id"  (+ start-at 9) (.addBinary (Binary/fromCharSequence src-value)))))
  (with-field-new rconsumer "MiFID_execution_id" (+ start-at 10) (.addBinary (Binary/fromCharSequence (.mifidExecutionID top-record))))
  (let [src-value (.mifidPrice top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_price"  (+ start-at 11) (.addBinary (Binary/fromCharSequence src-value)))))
  (with-field-new rconsumer "MiFID_quantity" (+ start-at 12) (.addBinary (Binary/fromCharSequence (.mifidQuantity top-record))))
  (let [src-value (.mifidPriceNotation top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_price_notation"  (+ start-at 13) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mifidCurrency top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_currency"  (+ start-at 14) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.miFIDQtyinMsrmtUnitNotation top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_qty_in_msrmnt_unit_notation"  (+ start-at 15) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mifidQuantityMeasurementUnit top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_msrmnt_unit"  (+ start-at 16) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.miFIDNotionalAmount top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_notional_amount"  (+ start-at 17) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.notionalCurrency top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "notional_currency"  (+ start-at 18) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.miFIDClearingFlag top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_clearing_flag"  (+ start-at 19) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTMarketMechanism top-record)]
    (when (not= src-value com.euronext.optiq.dd.MMTMarketMechanism_enum/NULL_VAL)
      (with-field-new rconsumer "MMT_mkt_mechanism"  (+ start-at 20) (.addInteger (.value src-value)))))
  (let [src-value (.mMTTradingMode top-record)]
    (when (not= src-value com.euronext.optiq.dd.MMTTradingMode_enum/NULL_VAL)
      (with-field-new rconsumer "MMT_trading_mode"  (+ start-at 21) (.addBinary (Binary/fromCharSequence (.toString (char (.value src-value))))))))
  (let [src-value (.mMTTransactionCategory top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_transaction_category"  (+ start-at 22) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTNegotiationIndicator top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_negotiation_indicator"  (+ start-at 23) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTAgencyCrossTradeIndicator top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_agency_cross_trade_indicator"  (+ start-at 24) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTModificationIndicator top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_modification_indicator"  (+ start-at 25) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTBenchmarkIndicator top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_benchmark_indicator"  (+ start-at 26) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTSpecialDividendIndicator top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_special_dividend_indicator"  (+ start-at 27) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTOffBookAutomatedIndicator top-record)]
    (when (not= src-value com.euronext.optiq.dd.MMTOffBookAutomatedIndicator_enum/NULL_VAL)
      (with-field-new rconsumer "MMT_off_book_auto_indicator"  (+ start-at 28) (.addBinary (Binary/fromCharSequence (.toString (char (.value src-value))))))))
  (let [src-value (.mMTContributiontoPrice top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_contribution_to_price"  (+ start-at 29) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTAlgorithmicIndicator top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_algo_indicator"  (+ start-at 30) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTPublicationMode top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_publication_mode"  (+ start-at 31) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTPostTradeDeferral top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_post_trade_deferral"  (+ start-at 32) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mMTDuplicativeIndicator top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MMT_duplicative_indicator"  (+ start-at 33) (.addBinary (Binary/fromCharSequence src-value)))))
  (with-field-new rconsumer "trade_qualifier" (+ start-at 34) (.addInteger (let [field (.tradeQualifier top-record)] (.getByte (.buffer field) (.offset field)))))
  (let [src-value (.transactionType top-record)]
    (when (not= src-value com.euronext.optiq.dd.TransactionType_enum/NULL_VAL)
      (with-field-new rconsumer "transaction_type"  (+ start-at 35) (.addInteger (.value src-value)))))
  (let [src-value (.effectiveDateIndicator top-record)]
    (when (not= src-value com.euronext.optiq.dd.EffectiveDateIndicator_enum/NULL_VAL)
      (with-field-new rconsumer "effective_date_indicator"  (+ start-at 36) (.addInteger (.value src-value)))))
  (let [src-value (.blockTradeCode top-record)]
    (when (not= src-value com.euronext.optiq.dd.BlockTradeCode_enum/NULL_VAL)
      (with-field-new rconsumer "block_trade_code"  (+ start-at 37) (.addBinary (Binary/fromCharSequence (.toString (char (.value src-value))))))))
  (let [src-value (.tradeReference top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "trade_reference"  (+ start-at 38) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.originalReportTimestamp top-record)]
    (when (not= src-value (FullTradeInformationDecoder/originalReportTimestampNullValue))
      (with-field-new rconsumer "original_report_timestamp"  (+ start-at 39) (.addLong src-value))))
  (let [src-value (.transparencyIndicator top-record)]
    (when (not= src-value com.euronext.optiq.dd.TransparencyIndicator_enum/NULL_VAL)
      (with-field-new rconsumer "transparency_indicator"  (+ start-at 40) (.addInteger (.value src-value)))))
  (let [src-value (.currencyCoefficient top-record)]
    (when (not= src-value (FullTradeInformationDecoder/currencyCoefficientNullValue))
      (with-field-new rconsumer "currency_coefficient"  (+ start-at 41) (.addInteger src-value))))
  (let [src-value (.priceMultiplier top-record)]
    (when (not= src-value (FullTradeInformationDecoder/priceMultiplierNullValue))
      (with-field-new rconsumer "price_multiplier"  (+ start-at 42) (.addInteger src-value))))
  (let [src-value (.priceMultiplierDecimals top-record)]
    (when (not= src-value (FullTradeInformationDecoder/priceMultiplierDecimalsNullValue))
      (with-field-new rconsumer "price_multiplier_decimals"  (+ start-at 43) (.addInteger src-value))))
  (with-field-new rconsumer "venue" (+ start-at 44) (.addBinary (Binary/fromCharSequence (.venue top-record))))
  (let [src-value (.startTimeVwap top-record)]
    (when (not= src-value (FullTradeInformationDecoder/startTimeVwapNullValue))
      (with-field-new rconsumer "start_time_vwap"  (+ start-at 45) (.addInteger src-value))))
  (let [src-value (.endTimeVwap top-record)]
    (when (not= src-value (FullTradeInformationDecoder/endTimeVwapNullValue))
      (with-field-new rconsumer "end_time_vwap"  (+ start-at 46) (.addInteger src-value))))
  (let [src-value (.miFIDEmissionAllowanceType top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "MiFID_emission_allowance_type"  (+ start-at 47) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.marketOfReferenceMIC top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "mkt_of_reference_MIC"  (+ start-at 48) (.addBinary (Binary/fromCharSequence src-value))))))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-full-trade-information.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new FullTradeInformationDecoder) buffer subOffset actingBlockLength actingVersion))


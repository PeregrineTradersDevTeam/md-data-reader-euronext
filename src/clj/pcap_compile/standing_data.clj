(ns pcap-compile.standing-data
    (:use [pcap-common.macros]
          [pcap-common.parquet-util])
    (:import [com.euronext.optiq.dd StandingDataDecoder StandingDataDecoder$EMMPatternRepDecoder]
             [org.apache.parquet.schema MessageType]
             [java.util Map]
             [org.apache.parquet.io.api Binary RecordConsumer]
             [org.apache.parquet.hadoop.api WriteSupport WriteSupport$WriteContext]
             [org.apache.parquet.hadoop ParquetOutputFormat ParquetRecordWriter]))

(def message-schema
  "
         optional int64 mkt_data_seq_num;
optional int32 rebroadcast_ind;
optional int64 symbol_index;
optional int32 optiq_segment;
optional int32 partition_id;
optional binary full_instr_name;
optional binary instr_name;
optional binary instr_trdng_code;
optional binary instr_group_code;
optional binary isin_code;
optional int32 price_lvl_decimals;
optional int32 qty_decimals;
optional int32 amount_decimals;
optional int32 ratio_decimals;
optional binary cfi;
optional int32 instr_event_date;
optional int64 strike_price;
optional int32 dark_eligibility;
optional int64 dark_lis_thres;
optional int32 dark_min_qty;
optional int32 date_of_last_trade;
optional binary depositary_list;
optional binary main_depositary;
optional int32 first_settlement_date;
optional int32 guarantee_indicator;
optional binary icb;
optional binary issuing_country;
optional int64 last_adj_close_price;
optional int64 lot_size;
optional binary maturity_date;
optional int32 max_decimals_qty;
optional binary mic;
optional binary mic_list;
optional binary country_of_exchange;
optional binary mnemonic;
optional binary underlying_mic;
optional binary underlying_isin;
optional binary trading_currency;
optional int32 currency_coeff;
optional int32 trading_currency_indicator;
optional int32 strike_currency_indicator;
optional int64 num_instr_circulating;
  optional int64 par_value;
optional binary qty_notation;
optional int32 instr_unit_expression;
optional binary settlement_delay;
optional binary strike_currency;
optional int32 tax_code;
optional binary type_of_corporate_event;
optional int32 type_of_mkt_admission;
optional int32 repo_indicator;
optional int64 issue_price;
optional binary nominal_currency;
optional int32 issue_price_decimals;
optional int32 strike_price_decimals;
optional int32 liquid_instrument_indicator;
optional binary mkt_of_reference_mic;
optional binary icb_code;
optional int32 emm;
optional int32 pattern_id;
optional int32 tick_size_index_id;
optional int32 mkt_model;

  ")

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^StandingDataDecoder top-record ^StandingDataDecoder$EMMPatternRepDecoder repetition]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_ind" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "symbol_index" (+ start-at 2) (.addLong (.symbolIndex top-record)))
  (with-field-new rconsumer "optiq_segment" (+ start-at 3) (.addInteger (.value (.optiqSegment top-record))))
  (with-field-new rconsumer "partition_id" (+ start-at 4) (.addInteger (.partitionID top-record)))
  (let [src-value (.fullInstrumentName top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "full_instr_name"  (+ start-at 5) (.addBinary (Binary/fromCharSequence src-value)))))
  (with-field-new rconsumer "instr_name" (+ start-at 6) (.addBinary (Binary/fromCharSequence (.instrumentName top-record))))
  (let [src-value (.instrumentTradingCode top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "instr_trdng_code"  (+ start-at 7) (.addBinary (Binary/fromCharSequence src-value)))))
  (with-field-new rconsumer "instr_group_code" (+ start-at 8) (.addBinary (Binary/fromCharSequence (.instrumentGroupCode top-record))))
  (with-field-new rconsumer "isin_code" (+ start-at 9) (.addBinary (Binary/fromCharSequence (.iSINCode top-record))))
  (with-field-new rconsumer "price_lvl_decimals" (+ start-at 10) (.addInteger (.priceDecimals top-record)))
  (let [src-value (.quantityDecimals top-record)]
    (when (not= src-value (StandingDataDecoder/quantityDecimalsNullValue))
      (with-field-new rconsumer "qty_decimals"  (+ start-at 11) (.addInteger src-value))))
  (let [src-value (.amountDecimals top-record)]
    (when (not= src-value (StandingDataDecoder/amountDecimalsNullValue))
      (with-field-new rconsumer "amount_decimals"  (+ start-at 12) (.addInteger src-value))))
  (with-field-new rconsumer "ratio_decimals" (+ start-at 13) (.addInteger (.ratioDecimals top-record)))
  (with-field-new rconsumer "cfi" (+ start-at 14) (.addBinary (Binary/fromCharSequence (.cFI top-record))))
  (with-field-new rconsumer "instr_event_date" (+ start-at 15) (.addInteger (.instrumentEventDate top-record)))
  (let [src-value (.strikePrice top-record)]
    (when (not= src-value (StandingDataDecoder/strikePriceNullValue))
      (with-field-new rconsumer "strike_price"  (+ start-at 16) (.addLong src-value))))
  (let [src-value (.darkEligibility top-record)]
    (when (not= src-value (StandingDataDecoder/darkEligibilityNullValue))
      (with-field-new rconsumer "dark_eligibility"  (+ start-at 17) (.addInteger src-value))))
  (let [src-value (.darkLISThreshold top-record)]
    (when (not= src-value (StandingDataDecoder/darkLISThresholdNullValue))
      (with-field-new rconsumer "dark_lis_thres"  (+ start-at 18) (.addLong src-value))))
  (let [src-value (.darkMinQuantity top-record)]
    (when (not= src-value (StandingDataDecoder/darkMinQuantityNullValue))
      (with-field-new rconsumer "dark_min_qty"  (+ start-at 19) (.addInteger src-value))))
  (let [src-value (.dateOfLastTrade top-record)]
    (when (not= src-value (StandingDataDecoder/dateOfLastTradeNullValue))
      (with-field-new rconsumer "date_of_last_trade"  (+ start-at 20) (.addInteger src-value))))
  (let [src-value (.depositaryList top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "depositary_list"  (+ start-at 21) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mainDepositary top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "main_depositary"  (+ start-at 22) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.firstSettlementDate top-record)]
    (when (not= src-value (StandingDataDecoder/firstSettlementDateNullValue))
      (with-field-new rconsumer "first_settlement_date"  (+ start-at 23) (.addInteger src-value))))
  (let [src-value (.guaranteeIndicator top-record)]
    (when (not= src-value com.euronext.optiq.dd.GuaranteeIndicator_enum/NULL_VAL)
      (with-field-new rconsumer "guarantee_indicator"  (+ start-at 24) (.addInteger (.value src-value)))))
  (let [src-value (.iCB top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "icb"  (+ start-at 25) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.issuingCountry top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "issuing_country"  (+ start-at 26) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.lastAdjustedClosingPrice top-record)]
    (when (not= src-value (StandingDataDecoder/lastAdjustedClosingPriceNullValue))
      (with-field-new rconsumer "last_adj_close_price"  (+ start-at 27) (.addLong src-value))))
  (let [src-value (.lotSize top-record)]
    (when (not= src-value (StandingDataDecoder/lotSizeNullValue))
      (with-field-new rconsumer "lot_size"  (+ start-at 28) (.addLong src-value))))
  (let [src-value (.maturityDate top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "maturity_date"  (+ start-at 29) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.maximumDecimalsInQuantity top-record)]
    (when (not= src-value (StandingDataDecoder/maximumDecimalsInQuantityNullValue))
      (with-field-new rconsumer "max_decimals_qty"  (+ start-at 30) (.addInteger src-value))))
  (with-field-new rconsumer "mic" (+ start-at 31) (.addBinary (Binary/fromCharSequence (.mIC top-record))))
  (let [src-value (.mICList top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "mic_list"  (+ start-at 32) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.countryOfExchange top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "country_of_exchange"  (+ start-at 33) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.mnemonic top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "mnemonic"  (+ start-at 34) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.underlyingMIC top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "underlying_mic"  (+ start-at 35) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.underlyingISINCode top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "underlying_isin"  (+ start-at 36) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.tradingCurrency top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "trading_currency"  (+ start-at 37) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.currencyCoefficient top-record)]
    (when (not= src-value (StandingDataDecoder/currencyCoefficientNullValue))
      (with-field-new rconsumer "currency_coeff"  (+ start-at 38) (.addInteger src-value))))
  (let [src-value (.tradingCurrencyIndicator top-record)]
    (when (not= src-value com.euronext.optiq.dd.TradingCurrencyIndicator_enum/NULL_VAL)
      (with-field-new rconsumer "trading_currency_indicator"  (+ start-at 39) (.addInteger (.value src-value)))))
  (let [src-value (.strikeCurrencyIndicator top-record)]
    (when (not= src-value com.euronext.optiq.dd.StrikeCurrencyIndicator_enum/NULL_VAL)
      (with-field-new rconsumer "strike_currency_indicator"  (+ start-at 40) (.addInteger (.value src-value)))))
  (let [src-value (.numberInstrumentCirculating top-record)]
    (when (not= src-value (StandingDataDecoder/numberInstrumentCirculatingNullValue))
      (with-field-new rconsumer "num_instr_circulating"  (+ start-at 41) (.addLong src-value))))
  (let [src-value (.parValue top-record)]
    (when (not= src-value (StandingDataDecoder/parValueNullValue))
      (with-field-new rconsumer "par_value"  (+ start-at 42) (.addLong src-value))))
  (let [src-value (.quantityNotation top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "qty_notation"  (+ start-at 43) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.instUnitExp top-record)]
    (when (not= src-value com.euronext.optiq.dd.InstrumentUnitExpression_enum/NULL_VAL)
      (with-field-new rconsumer "instr_unit_expression"  (+ start-at 44) (.addInteger (.value src-value)))))
  (let [src-value (.settlementDelay top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "settlement_delay"  (+ start-at 45) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.strikeCurrency top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "strike_currency"  (+ start-at 46) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.taxCode top-record)]
    (when (not= src-value com.euronext.optiq.dd.TaxCode_enum/NULL_VAL)
      (with-field-new rconsumer "tax_code"  (+ start-at 47) (.addInteger (.value src-value)))))
  (let [src-value (.typeOfCorporateEvent top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "type_of_corporate_event"  (+ start-at 48) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.typeOfMarketAdmission top-record)]
    (when (not= src-value com.euronext.optiq.dd.TypeOfMarketAdmission_enum/NULL_VAL)
      (with-field-new rconsumer "type_of_mkt_admission"  (+ start-at 49) (.addInteger (.value src-value)))))
  (let [src-value (.repoIndicator top-record)]
    (when (not= src-value com.euronext.optiq.dd.RepoIndicator_enum/NULL_VAL)
      (with-field-new rconsumer "repo_indicator"  (+ start-at 50) (.addInteger (.value src-value)))))
  (let [src-value (.issuePrice top-record)]
    (when (not= src-value (StandingDataDecoder/issuePriceNullValue))
      (with-field-new rconsumer "issue_price"  (+ start-at 51) (.addLong src-value))))
  (let [src-value (.nominalCurrency top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "nominal_currency"  (+ start-at 52) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.issuePriceDecimals top-record)]
    (when (not= src-value (StandingDataDecoder/issuePriceDecimalsNullValue))
      (with-field-new rconsumer "issue_price_decimals"  (+ start-at 53) (.addInteger src-value))))
  (let [src-value (.strikePriceDecimals top-record)]
    (when (not= src-value (StandingDataDecoder/strikePriceDecimalsNullValue))
      (with-field-new rconsumer "strike_price_decimals"  (+ start-at 54) (.addInteger src-value))))
  (let [src-value (.liquidInstrumentIndicator top-record)]
    (when (not= src-value (StandingDataDecoder/liquidInstrumentIndicatorNullValue))
      (with-field-new rconsumer "liquid_instrument_indicator"  (+ start-at 55) (.addInteger src-value))))
  (let [src-value (.marketOfReferenceMIC top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "mkt_of_reference_mic"  (+ start-at 56) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.iCBCode top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "icb_code"  (+ start-at 57) (.addBinary (Binary/fromCharSequence src-value)))))
  (with-field-new rconsumer "emm" (+ start-at 58) (.addInteger (.value (.eMM repetition))))
  (let [src-value (.patternID repetition)]
    (when (not= src-value (StandingDataDecoder$EMMPatternRepDecoder/patternIDNullValue))
      (with-field-new rconsumer "pattern_id"  (+ start-at 59) (.addInteger src-value))))
  (let [src-value (.tickSizeIndexID repetition)]
    (when (not= src-value (StandingDataDecoder$EMMPatternRepDecoder/tickSizeIndexIDNullValue))
      (with-field-new rconsumer "tick_size_index_id"  (+ start-at 60) (.addInteger src-value))))
  (let [src-value (.marketModel repetition)]
    (when (not= src-value com.euronext.optiq.dd.MarketModel_enum/NULL_VAL)
      (with-field-new rconsumer "mkt_model"  (+ start-at 61) (.addInteger (.value src-value))))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-standing-data.parquet")
   (make-loopfull-proxy message-write (memfn ^StandingDataDecoder eMMPatternRep) (compile-schema message-schema) {} (memfn ^StandingDataDecoder$EMMPatternRepDecoder count))))

(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new StandingDataDecoder) buffer subOffset actingBlockLength actingVersion))

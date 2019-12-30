(ns pcap-compile.contract-standing-data
    (:use [pcap-common.macros]
          [pcap-common.parquet-util])
    (:import [com.euronext.optiq.dd ContractStandingDataDecoder ContractStandingDataDecoder$StrategyCodesDecoder]
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
optional int32 contract_event_date;
optional binary exchange_code;
optional int32 exercise_style;
optional int32 flex_indicator;
optional binary contract_name;
optional binary contract_type;
optional binary underlying_type;
optional int32 price_index_level_decimals;
optional int32 quantity_decimals;
optional int32 amount_decimals;
optional int32 ratio_multiplier_decimals;
optional binary main_depositary;
optional binary MIC;
optional binary country_of_exchange;
optional binary product_code;
optional binary underlying_MIC;
optional binary underlying_isin_code;
optional int32 underlying_expiry;
optional int32 order_type_rules;
optional binary settlement_method;
optional binary trading_currency;
optional int32 whrfc_days_before_expiry;
optional int32 whrfc_minutes_before_closing;
optional int32 min_quantity_for_initiator;
optional int32 min_quantity_for_reactor;
optional int32 whrfc_pick_up_perc;
optional int32 whrfc_improvement_period;
optional int32 available_wholesale_trade_type;
optional int32 instrument_decimals_ratio;
optional int32 instrument_tick_size;
optional int32 instrument_settlement_tick_size;
optional int32 instrument_edsp_tick_size;
optional int32 strike_price_decimals_ratio;
optional int32 delta_protect_for_mm;
optional int32 vega_protect_for_mm;
optional int32 volume_protect_for_mm;
optional int32 contract_trading_type;
optional int32 throttle_for_incoming_orders;
optional int32 strike_price_flex_increment;
optional int32 premium_pricing_tick_size;
optional int32 premium_pricing_threshold;
optional int32 tick_value;
optional int64 outright_lis_trade_threshold;
optional int64 strategy_lis_trade_threshold;
optional int64 outright_gcross_threshold;
optional int64 strategy_gcross_threshold;
optional int64 lot_size;
optional int32 intrument_unit_expression;
optional int32 tick_value_decimals;
optional binary pricing_algorithm;
optional int32 underlying_subtype;
optional binary mother_stock_isin;
optional binary reference_future_contract_secgrp;
optional binary strategy_code;

  ")

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^ContractStandingDataDecoder top-record ^ContractStandingDataDecoder$StrategyCodesDecoder repetition]
  (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
  (with-field-new rconsumer "rebroadcast_ind" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
  (with-field-new rconsumer "symbol_index" (+ start-at 2) (.addLong (.symbolIndex top-record)))
  (with-field-new rconsumer "optiq_segment" (+ start-at 3) (.addInteger (.value (.optiqSegment top-record))))
  (with-field-new rconsumer "partition_id" (+ start-at 4) (.addInteger (.partitionID top-record)))
  (let [src-value (.contractEventDate top-record)]
    (when (not= src-value (ContractStandingDataDecoder/contractEventDateNullValue))
      (with-field-new rconsumer "contract_event_date"  (+ start-at 5) (.addInteger src-value))))
  (with-field-new rconsumer "exchange_code" (+ start-at 6) (.addBinary (Binary/fromCharSequence (.toString (char (.value (.exchangeCode top-record)))))))
  (let [src-value (.exerStyle top-record)]
    (when (not= src-value com.euronext.optiq.dd.ExerciseStyle_enum/NULL_VAL)
      (with-field-new rconsumer "exercise_style"  (+ start-at 7) (.addInteger (.value src-value)))))
  (with-field-new rconsumer "flex_indicator" (+ start-at 8) (.addInteger (.flexInd top-record)))
  (with-field-new rconsumer "contract_name" (+ start-at 9) (.addBinary (Binary/fromCharSequence (.contractName top-record))))
  (let [src-value (.contractType top-record)]
    (when (not= src-value com.euronext.optiq.dd.ContractType_enum/NULL_VAL)
      (with-field-new rconsumer "contract_type"  (+ start-at 10) (.addBinary (Binary/fromCharSequence (.toString (char (.value src-value))))))))
  (with-field-new rconsumer "underlying_type" (+ start-at 11) (.addBinary (Binary/fromCharSequence (.toString (char (.value (.underlyingType top-record)))))))
  (let [src-value (.priceDecimals top-record)]
    (when (not= src-value (ContractStandingDataDecoder/priceDecimalsNullValue))
      (with-field-new rconsumer "price_index_level_decimals"  (+ start-at 12) (.addInteger src-value))))
  (let [src-value (.quantityDecimals top-record)]
    (when (not= src-value (ContractStandingDataDecoder/quantityDecimalsNullValue))
      (with-field-new rconsumer "quantity_decimals"  (+ start-at 13) (.addInteger src-value))))
  (let [src-value (.amountDecimals top-record)]
    (when (not= src-value (ContractStandingDataDecoder/amountDecimalsNullValue))
      (with-field-new rconsumer "amount_decimals"  (+ start-at 14) (.addInteger src-value))))
  (let [src-value (.ratioDecimals top-record)]
    (when (not= src-value (ContractStandingDataDecoder/ratioDecimalsNullValue))
      (with-field-new rconsumer "ratio_multiplier_decimals"  (+ start-at 15) (.addInteger src-value))))
  (let [src-value (.mainDepositary top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "main_depositary"  (+ start-at 16) (.addBinary (Binary/fromCharSequence src-value)))))
  (with-field-new rconsumer "MIC" (+ start-at 17) (.addBinary (Binary/fromCharSequence (.mIC top-record))))
  (with-field-new rconsumer "country_of_exchange" (+ start-at 18) (.addBinary (Binary/fromCharSequence (.countryOfExchange top-record))))
  (with-field-new rconsumer "product_code" (+ start-at 19) (.addBinary (Binary/fromCharSequence (.productCode top-record))))
  (let [src-value (.underlyingMIC top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "underlying_MIC"  (+ start-at 20) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.underlyingISINCode top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "underlying_isin_code"  (+ start-at 21) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.underlyingExpiry top-record)]
    (when (not= src-value (ContractStandingDataDecoder/underlyingExpiryNullValue))
      (with-field-new rconsumer "underlying_expiry"  (+ start-at 22) (.addInteger src-value))))
  (with-field-new rconsumer "order_type_rules" (+ start-at 23) (.addInteger (let [field (.orderTypeRules top-record)] (.getShort (.buffer field) (.offset field)))))
  (let [src-value (.settlementMethod top-record)]
    (when (not= src-value (ContractStandingDataDecoder/settlementMethodNullValue))
      (with-field-new rconsumer "settlement_method"  (+ start-at 24) (.addBinary (Binary/fromCharSequence (.toString (char src-value)))))))
  (with-field-new rconsumer "trading_currency" (+ start-at 25) (.addBinary (Binary/fromCharSequence (.tradingCurrency top-record))))
  (let [src-value (.whRFCDaysBeforeExpiry top-record)]
    (when (not= src-value (ContractStandingDataDecoder/whRFCDaysBeforeExpiryNullValue))
      (with-field-new rconsumer "whrfc_days_before_expiry"  (+ start-at 26) (.addInteger src-value))))
  (let [src-value (.whRFCMinutesBeforeClosing top-record)]
    (when (not= src-value (ContractStandingDataDecoder/whRFCMinutesBeforeClosingNullValue))
      (with-field-new rconsumer "whrfc_minutes_before_closing"  (+ start-at 27) (.addInteger src-value))))
  (let [src-value (.minimumQuantityForInitiator top-record)]
    (when (not= src-value (ContractStandingDataDecoder/minimumQuantityForInitiatorNullValue))
      (with-field-new rconsumer "min_quantity_for_initiator"  (+ start-at 28) (.addInteger src-value))))
  (let [src-value (.minimumQuantityForReactor top-record)]
    (when (not= src-value (ContractStandingDataDecoder/minimumQuantityForReactorNullValue))
      (with-field-new rconsumer "min_quantity_for_reactor"  (+ start-at 29) (.addInteger src-value))))
  (let [src-value (.whRFCPickUpPerc top-record)]
    (when (not= src-value (ContractStandingDataDecoder/whRFCPickUpPercNullValue))
      (with-field-new rconsumer "whrfc_pick_up_perc"  (+ start-at 30) (.addInteger src-value))))
  (let [src-value (.whRFCImprovementPeriod top-record)]
    (when (not= src-value (ContractStandingDataDecoder/whRFCImprovementPeriodNullValue))
      (with-field-new rconsumer "whrfc_improvement_period"  (+ start-at 31) (.addInteger src-value))))
  (with-field-new rconsumer "available_wholesale_trade_type" (+ start-at 32) (.addInteger (let [field (.availableWholesaleTradeType top-record)] (.getInt (.buffer field) (.offset field)))))
  (with-field-new rconsumer "instrument_decimals_ratio" (+ start-at 33) (.addInteger (.instrumentDecimalsRatio top-record)))
  (with-field-new rconsumer "instrument_tick_size" (+ start-at 34) (.addInteger (.instrumentTickSize top-record)))
  (with-field-new rconsumer "instrument_settlement_tick_size" (+ start-at 35) (.addInteger (.instrumentSettlementTickSize top-record)))
  (let [src-value (.instrumentEDSPTickSize top-record)]
    (when (not= src-value (ContractStandingDataDecoder/instrumentEDSPTickSizeNullValue))
      (with-field-new rconsumer "instrument_edsp_tick_size"  (+ start-at 36) (.addInteger src-value))))
  (let [src-value (.strikePriceDecimalsRatio top-record)]
    (when (not= src-value (ContractStandingDataDecoder/strikePriceDecimalsRatioNullValue))
      (with-field-new rconsumer "strike_price_decimals_ratio"  (+ start-at 37) (.addInteger src-value))))
  (let [src-value (.deltaProtectforMM top-record)]
    (when (not= src-value com.euronext.optiq.dd.DeltaProtectforMM_enum/NULL_VAL)
      (with-field-new rconsumer "delta_protect_for_mm"  (+ start-at 38) (.addInteger (.value src-value)))))
  (let [src-value (.vegaProtectforMM top-record)]
    (when (not= src-value com.euronext.optiq.dd.VegaProtectforMM_enum/NULL_VAL)
      (with-field-new rconsumer "vega_protect_for_mm"  (+ start-at 39) (.addInteger (.value src-value)))))
  (let [src-value (.volumeProtectforMM top-record)]
    (when (not= src-value com.euronext.optiq.dd.VolumeProtectforMM_enum/NULL_VAL)
      (with-field-new rconsumer "volume_protect_for_mm"  (+ start-at 40) (.addInteger (.value src-value)))))
  (with-field-new rconsumer "contract_trading_type" (+ start-at 41) (.addInteger (.value (.contractTradingType top-record))))
  (with-field-new rconsumer "throttle_for_incoming_orders" (+ start-at 42) (.addInteger (.throttleforIncomingOrders top-record)))
  (let [src-value (.strikePriceFlexIncrement top-record)]
    (when (not= src-value (ContractStandingDataDecoder/strikePriceFlexIncrementNullValue))
      (with-field-new rconsumer "strike_price_flex_increment"  (+ start-at 43) (.addInteger src-value))))
  (let [src-value (.premiumPricingTickSize top-record)]
    (when (not= src-value (ContractStandingDataDecoder/premiumPricingTickSizeNullValue))
      (with-field-new rconsumer "premium_pricing_tick_size"  (+ start-at 44) (.addInteger src-value))))
  (let [src-value (.premiumPricingThreshold top-record)]
    (when (not= src-value (ContractStandingDataDecoder/premiumPricingThresholdNullValue))
      (with-field-new rconsumer "premium_pricing_threshold"  (+ start-at 45) (.addInteger src-value))))
  (let [src-value (.tickValue top-record)]
    (when (not= src-value (ContractStandingDataDecoder/tickValueNullValue))
      (with-field-new rconsumer "tick_value"  (+ start-at 46) (.addInteger src-value))))
  (let [src-value (.outrightLISTradeThreshold top-record)]
    (when (not= src-value (ContractStandingDataDecoder/outrightLISTradeThresholdNullValue))
      (with-field-new rconsumer "outright_lis_trade_threshold"  (+ start-at 47) (.addLong src-value))))
  (let [src-value (.strategyLISTradeThreshold top-record)]
    (when (not= src-value (ContractStandingDataDecoder/strategyLISTradeThresholdNullValue))
      (with-field-new rconsumer "strategy_lis_trade_threshold"  (+ start-at 48) (.addLong src-value))))
  (let [src-value (.outrightGCrossTradeThreshold top-record)]
    (when (not= src-value (ContractStandingDataDecoder/outrightGCrossTradeThresholdNullValue))
      (with-field-new rconsumer "outright_gcross_threshold"  (+ start-at 49) (.addLong src-value))))
  (let [src-value (.strategyGCrossTradeThreshold top-record)]
    (when (not= src-value (ContractStandingDataDecoder/strategyGCrossTradeThresholdNullValue))
      (with-field-new rconsumer "strategy_gcross_threshold"  (+ start-at 50) (.addLong src-value))))
  (with-field-new rconsumer "lot_size" (+ start-at 51) (.addLong (.lotSize top-record)))
  (let [src-value (.instUnitExp top-record)]
    (when (not= src-value com.euronext.optiq.dd.InstrumentUnitExpression_enum/NULL_VAL)
      (with-field-new rconsumer "intrument_unit_expression"  (+ start-at 52) (.addInteger (.value src-value)))))
  (let [src-value (.tickValueDecimals top-record)]
    (when (not= src-value (ContractStandingDataDecoder/tickValueDecimalsNullValue))
      (with-field-new rconsumer "tick_value_decimals"  (+ start-at 53) (.addInteger src-value))))
  (let [src-value (.pricingAlgorithm top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "pricing_algorithm"  (+ start-at 54) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.underlyingSubtype top-record)]
    (when (not= src-value com.euronext.optiq.dd.UnderlyingSubtype_enum/NULL_VAL)
      (with-field-new rconsumer "underlying_subtype"  (+ start-at 55) (.addInteger (.value src-value)))))
  (let [src-value (.motherStockISIN top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "mother_stock_isin"  (+ start-at 56) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.referenceFutureContractSecGrp top-record)]
    (when (not (.isEmpty src-value))
      (with-field-new rconsumer "reference_future_contract_secgrp"  (+ start-at 57) (.addBinary (Binary/fromCharSequence src-value)))))
  (let [src-value (.strategyCode repetition)]
    (when (not= src-value com.euronext.optiq.dd.StrategyCode_enum/NULL_VAL)
      (with-field-new rconsumer "strategy_code"  (+ start-at 58) (.addBinary (Binary/fromCharSequence (.toString (char (.value src-value)))))))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-contract-standing-data.parquet")
   (make-loopfull-proxy message-write (memfn ^ContractStandingDataDecoder strategyCodes) (compile-schema message-schema) {} (memfn ^ContractStandingDataDecoder$StrategyCodesDecoder count))))

(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new ContractStandingDataDecoder) buffer subOffset actingBlockLength actingVersion))

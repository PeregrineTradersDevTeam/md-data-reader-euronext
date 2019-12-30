from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "FullTradeInformation-for-test",
     "-o",
     "1004",
     official_files_location + "/20190104/160000/224.0.65.200_11200.pcap.gz",
     official_files_location + "/20190104/170000/224.0.64.200_11200.pcap.gz",
     official_files_location + "/20190104/183000/224.0.64.190_11190.pcap.gz"]

print("Building FullTradeInformation")
build_parquet_data(official_application, cmdline_params)

print("Checking FullTradeInformation")
verify_datasets(official_files_location + "/Official-FullTradeInformation", "FullTradeInformation-for-test-full-trade-information.parquet", {
"MDSeqNum": "mkt_data_seq_num",
"RebroadcastIndicator": "rebroadcast_indicator",
"EMM": "emm",
"EventTime": "event_time",
"SymbolIndex": "symbol_index",
"TradingDateTime": "trading_date_time",
"PublicationDateTime": "publication_date_time",
"TradeType": "trade_type",
"MifidInstrumentIdType": "MiFID_instrument_id_type",
"MifidInstrumentID": "MiFID_instrument_id",
"MifidExecutionID": "MiFID_execution_id",
"MifidPrice": "MiFID_price",
"MifidQuantity": "MiFID_quantity",
"MifidPriceNotation": "MiFID_price_notation",
"MifidCurrency": "MiFID_currency",
"MiFIDQtyinMsrmtUnitNotation": "MiFID_qty_in_msrmnt_unit_notation",
"MifidQuantityMeasurementUnit": "MiFID_msrmnt_unit",
"MiFIDNotionalAmount": "MiFID_notional_amount",
"NotionalCurrency": "notional_currency",
"MiFIDClearingFlag": "MiFID_clearing_flag",
"MMTMarketMechanism": "MMT_mkt_mechanism",
"MMTTradingMode": "MMT_trading_mode",
"MMTTransactionCategory": "MMT_transaction_category",
"MMTNegotiationIndicator": "MMT_negotiation_indicator",
"MMTAgencyCrossTradeIndicator": "MMT_agency_cross_trade_indicator",
"MMTModificationIndicator": "MMT_modification_indicator",
"MMTBenchmarkIndicator": "MMT_benchmark_indicator",
"MMTSpecialDividendIndicator": "MMT_special_dividend_indicator",
"MMTOffBookAutomatedIndicator": "MMT_off_book_auto_indicator",
"MMTContributiontoPrice": "MMT_contribution_to_price",
"MMTAlgorithmicIndicator": "MMT_algo_indicator",
"MMTPublicationMode": "MMT_publication_mode",
"MMTPostTradeDeferral": "MMT_post_trade_deferral",
"MMTDuplicativeIndicator": "MMT_duplicative_indicator",
"TradeQualifier": "trade_qualifier",
"TransactionType": "transaction_type",
"EffectiveDateIndicator": "effective_date_indicator",
"BlockTradeCode": "block_trade_code",
"TradeReference": "trade_reference",
"OriginalReportTimestamp": "original_report_timestamp",
"TransparencyIndicator": "transparency_indicator",
"CurrencyCoefficient": "currency_coefficient",
"PriceMultiplier": "price_multiplier",
"PriceMultiplierDecimals": "price_multiplier_decimals",
"Venue": "venue",
"StartTimeVwap": "start_time_vwap",
"EndTimeVwap": "end_time_vwap",
"MiFIDEmissionAllowanceType": "MiFID_emission_allowance_type",
"MarketOfReferenceMIC": "mkt_of_reference_MIC"})


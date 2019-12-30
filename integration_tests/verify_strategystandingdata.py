from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "StrategyStandingData-for-test",
     "-o",
     "1012",
     official_files_location + "/20190104/020000/224.0.65.190_11190.pcap.gz",
     official_files_location + "/20190104/020000/224.0.64.200_11200.pcap.gz",
     official_files_location + "/20190104/020000/224.0.64.190_11190.pcap.gz"]

print("Building StrategyStandingData")
build_parquet_data(official_application, cmdline_params)

print("Checking StrategyStandingData")
verify_datasets(official_files_location + "/Official-StrategyStandingData", "StrategyStandingData-for-test-strategy-standing-data.parquet", {
 "MDSeqNum": "mkt_data_seq_num",
"RebroadcastIndicator": "rebroadcast_ind",
"EMM": "emm",
"SymbolIndex": "symbol_index",
"InstrumentTradingCode": "instrument_trading_code",
"ExchangeCode": "exchange_code",
"MaturityDate": "maturity_date",
"StrategyCode": "strategy_code",
"ContractSymbolIndex": "contract_symbol_index",
"CFI": "cfi",
"LegSymbolIndex": "leg_symbol_index",
"LegPrice": "leg_price",
"LegRatio": "leg_ratio",
"LegBuySell": "leg_buy_or_sell"
})

from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "OutrightStandingData-for-test",
     "-o",
     "1014",
     official_files_location + "/20190104//020000/224.0.65.190_11190.pcap.gz",
     official_files_location + "/20190104//020000/224.0.64.190_11190.pcap.gz",
     official_files_location + "/20190104//020000/224.0.65.210_11210.pcap.gz",
     official_files_location + "/20190104//020000/224.0.64.200_11200.pcap.gz"]

print("Building OutrightStandingData")
build_parquet_data(official_application, cmdline_params)

print("Checking OutrightStandingData")
verify_datasets(official_files_location + "/Official-OutrightStandingData", "OutrightStandingData-for-test-outright-standing-data.parquet", {
"MDSeqNum": "mkt_data_seq_num",
"RebroadcastIndicator": "rebroadcast_ind",
"SymbolIndex": "symbol_index",
"ContractSymbolIndex": "contract_symbol_index",
"InstrumentEventDate": "instrument_event_date",
"ISINCode": "isin_code",
"CFI": "cfi",
"MaturityDate": "maturity_date","OptionType": "option_type","InstrumentTradingCode": "instrument_trading_code","LotSize": "lot_size","StrikePrice": "strike_price","LastTradingDate": "last_trading_date","UnderlyingInstrumentTradingCode": "underlying_instrument_trading_code","DaysToExpiry": "days_to_expiry","EMM": "emm"
})


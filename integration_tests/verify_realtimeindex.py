from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "RealTimeIndex-for-test",
     "-o",
     "1008",
     official_files_location + "/20190114/114500/224.0.64.170_10170.pcap.gz"]


print("Building RealTimeIndex")
build_parquet_data(official_application, cmdline_params)

print("Checking RealTimeIndex")
verify_datasets(official_files_location + "Official-RealTimeIndex", "RealTimeIndex-for-test-real-time-index.parquet", {
"MDSeqNum": "mkt_data_seq_num",
"RebroadcastIndicator": "rebroadcast_indicator",
"EMM": "emm",
"EventTime": "event_time",
"SymbolIndex": "symbol_index",
"IndexLevel": "index_level",
"PctgOfCapitalization": "percentage_of_capitalization",
"PrctVarfromPrevClose": "percentage_var_from_prev_close",
"NumTradedInstruments": "number_of_traded_instruments_in_index",
"IndexLevelType": "index_level_type",
"IndexPriceCode": "index_price_code"
})

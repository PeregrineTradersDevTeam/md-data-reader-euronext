from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]
cmdline_params = ["-p",
    "OrderUpdate-for-test",
     "-o",
     "1002",
     official_files_location + "/20190114/114500/224.0.66.123_20123.pcap.gz",
     official_files_location + "/20190114/114500/224.0.65.125_10125.pcap.gz",
     official_files_location + "/20190114/114500/224.0.65.135_10135.pcap.gz",
     official_files_location + "/20190114/020000/224.0.64.104_11104.pcap.gz"]

print("Building OrderUpdate")
build_parquet_data(official_application, cmdline_params)



print("Checking OrderUpdate")
verify_datasets(official_files_location +  "/Official-OrderUpdate", "OrderUpdate-for-test-order-update.parquet", {
    "MDSeqNum": "mkt_data_seq_num",
"RebroadcastIndicator": "rebroadcast_indicator",
"EMM": "emm",
"EventTime": "event_time",
"SymbolIndex": "symbol_index",
"ActionType": "mkt_data_action_type",
"OrderPriority": "order_priority",
"PreviousPriority": "previous_priority",
"OrderType": "order_type",
"OrderPx": "order_price",
"OrderSide": "order_side",
"OrderQuantity": "order_qty",
"PegOffset": "peg_offset"
})

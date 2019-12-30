from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "MarketUpdate-for-test",
     "-o",
     "1001",
     official_files_location + "/20190104/084500/224.0.67.193_21193.pcap.gz"]


print("Building MarketUpdate")
build_parquet_data(official_application, cmdline_params)

print("Checking MarketUpdate")
verify_datasets(official_files_location + "/Official-MarketUpdate", "MarketUpdate-for-test-market-update.parquet", {
    "MDSeqNum": "mkt_data_seq_num",
    "RebroadcastIndicator":"rebroadcast_indicator",
    "EMM": "emm",
    "EventTime": "event_time",
    "UpdateType": "mkt_data_update_type",
    "SymbolIndex": "symbol_index",
    "NumberOfOrders": "number_of_orders",
    "Price": "price",
    "Quantity": "quantity"})

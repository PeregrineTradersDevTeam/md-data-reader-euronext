from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "Statistics-for-test",
     "-o",
     "1009",
     official_files_location + "/20190104/160000/224.0.65.200_11200.pcap.gz",
     official_files_location + "/20190104/170000/224.0.64.200_11200.pcap.gz",
     official_files_location + "/20190104/183000/224.0.64.190_11190.pcap.gz"]

print("Building Statistics")
build_parquet_data(official_application, cmdline_params)


print("Checking Statistics")
verify_datasets(official_files_location + "/Official-Statistics", "Statistics-for-test-statistics.parquet", {
    "MDSeqNum": "mkt_data_seq_num",
    "RebroadcastIndicator": "rebroadcast_indicator",
    "SymbolIndex": "symbol_index",
    "StatsUpdateType": "stats_update_type",
    "StatsUpdateValue": "stats_update_value"
})

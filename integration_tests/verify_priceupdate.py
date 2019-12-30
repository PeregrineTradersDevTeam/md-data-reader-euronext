from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "PriceUpdate-for-test",
     "-o",
     "1003",
     official_files_location + "/20190104/221500/224.0.66.193_21193.pcap.gz",
     official_files_location + "/20190104/170000/224.0.64.200_11200.pcap.gz",
     official_files_location + "/20190104/084500/224.0.67.193_21193.pcap.gz"]

print("Building PriceUpdate")
build_parquet_data(official_application, cmdline_params)

print("Checking PriceUpdate")
verify_datasets(official_files_location + "/Official-PriceUpdate", "PriceUpdate-for-test-price-update.parquet", {
"MDSeqNum": "mkt_data_seq_num",
"RebroadcastIndicator": "rebroadcast_indicator",
"EMM": "emm",
"EventTime": "event_time",
"PriceType": "mkt_data_price_type",
"SymbolIndex": "symbol_index",
"Price": "price",
"Quantity": "quantity",
"ImbalanceQty": "imbalance_quantity",
"ImbalanceQtySide": "imbalance_qty_side"
})

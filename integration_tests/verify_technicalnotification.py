from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "TechnicalNotification-for-test",
     "-o",
     "1106",
     official_files_location + "/20190114/020000/224.0.64.104_11104.pcap.gz"]

print("Building TechnicalNotification")
build_parquet_data(official_application, cmdline_params)

print("Checking TechnicalNotification")
verify_datasets(official_files_location + "/Official-TechnicalNotification", "TechnicalNotification-for-test-technical-notification.parquet", {
"MDSeqNum": "mkt_data_seq_num",
"TechnicalNotificationType": "technical_notification_type",
"RebroadcastIndicator": "rebroadcast_indicator",
"RetransmissionStartTime": "retransmission_start_time",
"RetransmissionEndTime": "retransmission_end_time",
"SymbolIndex": "symbol_index"
})


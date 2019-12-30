from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "Timetable-for-test",
     "-o",
     "1006",
     official_files_location + "/20190114/020000/224.0.64.110_10110.pcap.gz",
     official_files_location + "/20190114/020000/224.0.64.120_12120.pcap.gz",
     official_files_location + "/20190114/020000/224.0.65.170_10170.pcap.gz"]


print("Building Timetable")
build_parquet_data(official_application, cmdline_params)

print("Checking Timetable")

verify_datasets(official_files_location + "/Official-Timetable", "Timetable-for-test-timetable.parquet", {
    "MDSeqNum": "mkt_data_seq_num",
    "RebroadcastIndicator": "rebroadcast_indicator",
    "EMM": "emm",
    "PatternID": "pattern_id",
    "SymbolIndex": "symbol_index",
    "PhaseTime": "phase_time",
    "PhaseId": "phase_id",
    "PhaseQualifier": "phase_qualifier",
    "TradingPeriod": "trading_period",
    "OrderEntryQualifier": "order_entry_qualifier",
    "Session": "session"
    })

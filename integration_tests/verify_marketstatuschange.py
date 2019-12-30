from test_util import build_parquet_data, verify_datasets
import sys

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "MarketStatusChange-for-test",
     "-o",
     "1005",
     official_files_location + "/20190104/221500/224.0.66.213_21213.pcap.gz",
     official_files_location + "/20190104/221500/224.0.66.193_21193.pcap.gz",
     official_files_location + "/20190104/084500/224.0.67.193_21193.pcap.gz"]


print("Building MarketStatusChange")
build_parquet_data(official_application, cmdline_params)

print("Checking MarketStatusChange")
verify_datasets(official_files_location + "/Official-MarketStatusChange", "MarketStatusChange-for-test-market-status-change.parquet", {
"MDSeqNum": "mkt_data_seq_num",
"RebroadcastIndicator": "rebroadcast_indicator",
"EMM": "emm",
"ChangeType": "market_data_change_type",
"SymbolIndex": "symbol_index",
"EventTime": "event_time",
"BookState": "book_state",
"StatusReason": "status_reason",
"PhaseQualifier": "phase_qualifier",
"TradingPeriod": "trading_period",
"TradingSide": "trading_side",
"PriceLimits": "price_limits",
"QuoteSpreadMultiplier": "quote_spread_multiplier",
"OrderEntryQualifier": "order_entry_qualifier",
"Session": "session",
"ScheduledEvent": "scheduled_event",
"ScheduledEventTime": "scheduled_event_time"
})



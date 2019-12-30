from test_util import build_parquet_data, verify_datasets
import sys
import numpy as np

official_application = sys.argv[1]
official_files_location = sys.argv[2]

cmdline_params = ["-p",
    "StandingData-for-test",
     "-o",
     "1007",
     official_files_location + "/20190114/020000/224.0.64.110_10110.pcap.gz",
     official_files_location + "/20190114/020000/224.0.64.120_12120.pcap.gz",
     official_files_location + "/20190114/020000/224.0.65.170_10170.pcap.gz"]

print("Building StandingData")
build_parquet_data(official_application, cmdline_params)

print("Checking StandingData")

def convertTypeOfMarketAdmission_enum(v):
    values = {
        65: 'A',
        66: 'B',
        67: 'C',
        68: 'D',
        69: 'E',
        70: 'F',
        71: 'G',
        72: 'H',
        73: 'I',
        74: 'J',
        75: 'K',
        76: 'L',
        83: 'S',
        54: '6',
        55: '7',
        57: '9'
        }
    return values[v]


verify_datasets(official_files_location + "/Official-StandingData", "StandingData-for-test-standing-data.parquet", {
    "MDSeqNum": "mkt_data_seq_num",
    "RebroadcastIndicator": "rebroadcast_ind",
    "SymbolIndex": "symbol_index",
    "OptiqSegment": "optiq_segment",
    "PartitionID": "partition_id",
    "FullInstrumentName": "full_instr_name",
    "InstrumentName": "instr_name",
    "InstrumentTradingCode": "instr_trdng_code",
    "InstrumentGroupCode": "instr_group_code",
    "ISINCode": "isin_code",
    "PriceDecimals": "price_lvl_decimals",
    "QuantityDecimals": "qty_decimals",
    "AmountDecimals": "amount_decimals",
    "RatioDecimals": "ratio_decimals",
    "CFI": "cfi",
    "InstrumentEventDate": "instr_event_date",
    "StrikePrice": "strike_price",
    "DarkEligibility": "dark_eligibility",
    "DarkLISThreshold": "dark_lis_thres",
    "DarkMinQuantity": "dark_min_qty",
    "DateOfLastTrade": "date_of_last_trade",
    "DepositaryList": "depositary_list",
    "MainDepositary": "main_depositary",
    "FirstSettlementDate": "first_settlement_date",
    "GuaranteeIndicator": "guarantee_indicator",
    "ICB": "icb",
    "IssuingCountry": "issuing_country",
    "LastAdjustedClosingPrice": "last_adj_close_price",
    "LotSize": "lot_size",
    "MaturityDate": "maturity_date",
    "MaximumDecimalsInQuantity": "max_decimals_qty",
    "MIC": "mic",
    "MICList": "mic_list",
    "CountryOfExchange": "country_of_exchange",
    "Mnemonic": "mnemonic",
    "UnderlyingMIC": "underlying_mic",
    "UnderlyingISINCode": "underlying_isin",
    "TradingCurrency": "trading_currency",
    "CurrencyCoefficient": "currency_coeff",
    "TradingCurrencyIndicator": "trading_currency_indicator",
    "StrikeCurrencyIndicator": "strike_currency_indicator",
    "NumberInstrumentCirculating": "num_instr_circulating",
    "ParValue": "par_value",
    "QuantityNotation": "qty_notation",
    "InstUnitExp": "instr_unit_expression",
    "SettlementDelay": "settlement_delay",
    "StrikeCurrency": "strike_currency",
    "TaxCode": "tax_code",
    "TypeOfCorporateEvent": "type_of_corporate_event",
    "TypeOfMarketAdmission": "type_of_mkt_admission",
    "RepoIndicator": "repo_indicator",
    "IssuePrice": "issue_price",
    "NominalCurrency": "nominal_currency",
    "IssuePriceDecimals": "issue_price_decimals",
    "StrikePriceDecimals": "strike_price_decimals",
    "LiquidInstrumentIndicator": "liquid_instrument_indicator",
    "MarketOfReferenceMIC": "mkt_of_reference_mic",
    "ICBCode": "icb_code",
    "EMM": "emm",
    "PatternID": "pattern_id",
    "TickSizeIndexID": "tick_size_index_id",
    "MarketModel": "mkt_model"
    },{
    'ParValue': lambda v: np.uint64(v) if v else v,
    'TypeOfMarketAdmission': convertTypeOfMarketAdmission_enum})

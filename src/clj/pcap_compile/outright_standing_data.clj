
  (ns pcap-compile.outright-standing-data
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [com.euronext.optiq.dd OutrightStandingDataDecoder OutrightStandingDataDecoder$OutrightRepDecoder]
           [org.apache.parquet.schema MessageType]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop.api WriteSupport WriteSupport$WriteContext]
           [org.apache.parquet.hadoop ParquetOutputFormat ParquetRecordWriter]
           ))

  (def message-schema
   "
         optional int64 mkt_data_seq_num;
optional int32 rebroadcast_ind;
optional int64 symbol_index;
optional int64 contract_symbol_index;
optional int32 instrument_event_date;
optional binary isin_code;
optional binary cfi;
optional binary maturity_date;
optional int32 option_type;
optional binary instrument_trading_code;
optional int64 lot_size;
optional int64 strike_price;
optional int32 last_trading_date;
optional binary underlying_instrument_trading_code;
optional int32 days_to_expiry;
optional int32 emm;

  ")

  (defn- message-write [^RecordConsumer rconsumer #^long start-at ^OutrightStandingDataDecoder top-record ^OutrightStandingDataDecoder$OutrightRepDecoder repetition]
                    (with-field-new rconsumer "mkt_data_seq_num" (+ start-at 0) (.addLong (.mDSeqNum top-record)))
(with-field-new rconsumer "rebroadcast_ind" (+ start-at 1) (.addInteger (.rebroadcastIndicator top-record)))
(with-field-new rconsumer "symbol_index" (+ start-at 2) (.addLong (.symbolIndex top-record)))
(with-field-new rconsumer "contract_symbol_index" (+ start-at 3) (.addLong (.contractSymbolIndex top-record)))
(with-field-new rconsumer "instrument_event_date" (+ start-at 4) (.addInteger (.instrumentEventDate top-record)))
(with-field-new rconsumer "isin_code" (+ start-at 5) (.addBinary (Binary/fromCharSequence (.iSINCode top-record))))
(let [src-value (.cFI top-record)]
 (when (not (.isEmpty src-value))
(with-field-new rconsumer "cfi"  (+ start-at 6) (.addBinary (Binary/fromCharSequence src-value)))))
(with-field-new rconsumer "maturity_date" (+ start-at 7) (.addBinary (Binary/fromCharSequence (.maturityDate top-record))))
(let [src-value (.optionType top-record)]
 (when (not= src-value com.euronext.optiq.dd.OptionType_enum/NULL_VAL)
(with-field-new rconsumer "option_type"  (+ start-at 8) (.addInteger (.value src-value)))))
(with-field-new rconsumer "instrument_trading_code" (+ start-at 9) (.addBinary (Binary/fromCharSequence (.instrumentTradingCode top-record))))
(with-field-new rconsumer "lot_size" (+ start-at 10) (.addLong (.lotSize top-record)))
(let [src-value (.strikePrice top-record)]
 (when (not= src-value (OutrightStandingDataDecoder/strikePriceNullValue))
(with-field-new rconsumer "strike_price"  (+ start-at 11) (.addLong src-value))))
(let [src-value (.lastTradingDate top-record)]
 (when (not= src-value (OutrightStandingDataDecoder/lastTradingDateNullValue))
(with-field-new rconsumer "last_trading_date"  (+ start-at 12) (.addInteger src-value))))
(let [src-value (.underlyingInstrumentTradingCode top-record)]
 (when (not (.isEmpty src-value))
(with-field-new rconsumer "underlying_instrument_trading_code"  (+ start-at 13) (.addBinary (Binary/fromCharSequence src-value)))))
(let [src-value (.daysToExpiry top-record)]
 (when (not= src-value (OutrightStandingDataDecoder/daysToExpiryNullValue))
(with-field-new rconsumer "days_to_expiry"  (+ start-at 14) (.addInteger src-value))))
(with-field-new rconsumer "emm" (+ start-at 15) (.addInteger (.value (.eMM repetition))))
)

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer
   (str prefix "-outright-standing-data.parquet")
  (make-loopfull-proxy message-write (memfn ^OutrightStandingDataDecoder outrightRep) (compile-schema message-schema) {} (memfn ^OutrightStandingDataDecoder$OutrightRepDecoder count))
  ))

  (defn decode [subOffset actingBlockLength actingVersion buffer]
    (.wrap (new OutrightStandingDataDecoder) buffer subOffset actingBlockLength actingVersion))

  

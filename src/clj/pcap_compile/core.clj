(ns pcap-compile.core
  (:use [clojure.java.io :only [writer file]]
        [clojure.data.int-map :as i :only [int-set]]
        [clojure.stacktrace :only [print-stack-trace]]
        [pcap-common.macros]
        [pcap-common.parquet-util])
  (:require
   [pcap-compile.start-of-day :as start-of-day]
   [pcap-compile.end-of-day :as end-of-day]
   [pcap-compile.health-status :as health-status]
   [pcap-compile.technical-notification :as technical-notification]
   [pcap-compile.standing-data :as standing-data]
   [pcap-compile.contract-standing-data :as contract-standing-data]
   [pcap-compile.outright-standing-data :as outright-standing-data]
   [pcap-compile.strategy-standing-data :as strategy-standing-data]
   [pcap-compile.timetable :as timetable]
   [pcap-compile.market-update :as market-update]
   [pcap-compile.order-update :as order-update]
   [pcap-compile.price-update :as price-update]
   [pcap-compile.full-trade-information :as full-trade-information]
   [pcap-compile.statistics :as statistics]
   [pcap-compile.real-time-index :as real-time-index]
   [pcap-compile.index-summary :as index-summary]
   [pcap-compile.market-status-change :as market-status-change])
  (:import [com.peregrinetraders.beans OutputRecord BufferAndOffset]
           [com.euronext.optiq.dd MessageHeaderDecoder StartOfDayDecoder EndOfDayDecoder HealthStatusDecoder TechnicalNotificationDecoder StandingDataDecoder ContractStandingDataDecoder OutrightStandingDataDecoder StrategyStandingDataDecoder TimetableDecoder MarketUpdateDecoder OrderUpdateDecoder PriceUpdateDecoder FullTradeInformationDecoder StatisticsDecoder RealTimeIndexDecoder IndexSummaryDecoder MarketStatusChangeDecoder]
           [org.agrona.concurrent UnsafeBuffer]
           [net.jpountz.lz4 LZ4Factory LZ4SafeDecompressor]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           [com.peregrinetraders.streams PcapGenerator MasterDriver]
           [com.peregrinetraders.configuration ETLConfiguration ETLConfigurationParameters ETLConfigurationException]
           [com.peregrinetraders.decoders EuronextFrameDecoder])
  (:gen-class))

(def general-exclusion (into (i/int-set) [2101 2102]))


(def supported-message-ids
  (java.util.HashSet. [StartOfDayDecoder/TEMPLATE_ID
                       EndOfDayDecoder/TEMPLATE_ID
                       HealthStatusDecoder/TEMPLATE_ID
                       TechnicalNotificationDecoder/TEMPLATE_ID
                       StandingDataDecoder/TEMPLATE_ID
                       ContractStandingDataDecoder/TEMPLATE_ID
                       OutrightStandingDataDecoder/TEMPLATE_ID
                       StrategyStandingDataDecoder/TEMPLATE_ID
                       TimetableDecoder/TEMPLATE_ID
                       MarketUpdateDecoder/TEMPLATE_ID
                       OrderUpdateDecoder/TEMPLATE_ID
                       PriceUpdateDecoder/TEMPLATE_ID
                       FullTradeInformationDecoder/TEMPLATE_ID
                       StatisticsDecoder/TEMPLATE_ID
                       RealTimeIndexDecoder/TEMPLATE_ID
                       IndexSummaryDecoder/TEMPLATE_ID
                       MarketStatusChangeDecoder/TEMPLATE_ID]))


(defn java-stream-process-bulk-with-parquet-out [pcap_files prefix message-type-exclusions]
  (let [^ParquetRecordWriter start-of-day                (build-optional StartOfDayDecoder/TEMPLATE_ID (start-of-day/make-record-writer prefix))
             ^ParquetRecordWriter end-of-day             (build-optional EndOfDayDecoder/TEMPLATE_ID (end-of-day/make-record-writer prefix))
             ^ParquetRecordWriter health-status          (build-optional HealthStatusDecoder/TEMPLATE_ID (health-status/make-record-writer prefix))
             ^ParquetRecordWriter technical-notification (build-optional TechnicalNotificationDecoder/TEMPLATE_ID (technical-notification/make-record-writer prefix))
             ^ParquetRecordWriter standing-data          (build-optional StandingDataDecoder/TEMPLATE_ID (standing-data/make-record-writer prefix))
             ^ParquetRecordWriter contract-standing-data (build-optional ContractStandingDataDecoder/TEMPLATE_ID (contract-standing-data/make-record-writer prefix))
             ^ParquetRecordWriter outright-standing-data (build-optional OutrightStandingDataDecoder/TEMPLATE_ID (outright-standing-data/make-record-writer prefix))
             ^ParquetRecordWriter strategy-standing-data (build-optional StrategyStandingDataDecoder/TEMPLATE_ID (strategy-standing-data/make-record-writer prefix))
             ^ParquetRecordWriter timetable              (build-optional TimetableDecoder/TEMPLATE_ID (timetable/make-record-writer prefix))
             ^ParquetRecordWriter market-update          (build-optional MarketUpdateDecoder/TEMPLATE_ID (market-update/make-record-writer prefix))
             ^ParquetRecordWriter order-update           (build-optional OrderUpdateDecoder/TEMPLATE_ID (order-update/make-record-writer prefix))
             ^ParquetRecordWriter price-update           (build-optional PriceUpdateDecoder/TEMPLATE_ID (price-update/make-record-writer prefix))
             ^ParquetRecordWriter full-trade-information (build-optional FullTradeInformationDecoder/TEMPLATE_ID (full-trade-information/make-record-writer prefix))
             ^ParquetRecordWriter statistics             (build-optional StatisticsDecoder/TEMPLATE_ID (statistics/make-record-writer prefix))
             ^ParquetRecordWriter real-time-index        (build-optional RealTimeIndexDecoder/TEMPLATE_ID (real-time-index/make-record-writer prefix))
             ^ParquetRecordWriter index-summary          (build-optional IndexSummaryDecoder/TEMPLATE_ID (index-summary/make-record-writer prefix))
             ^ParquetRecordWriter market-status-change   (build-optional MarketStatusChangeDecoder/TEMPLATE_ID (market-status-change/make-record-writer prefix))

             decode-sbe-message-to-parquet (fn [packet-usec market-usec templateId subOffset actingBlockLength actingVersion buffer]
                                             (condp = templateId
                                               StartOfDayDecoder/TEMPLATE_ID            (writeout start-of-day start-of-day/decode)
                                               MarketUpdateDecoder/TEMPLATE_ID          (writeout market-update market-update/decode)
                                               EndOfDayDecoder/TEMPLATE_ID              (writeout end-of-day end-of-day/decode)
                                               HealthStatusDecoder/TEMPLATE_ID          (writeout health-status health-status/decode)
                                               TechnicalNotificationDecoder/TEMPLATE_ID (writeout technical-notification technical-notification/decode)
                                               StandingDataDecoder/TEMPLATE_ID          (writeout standing-data standing-data/decode)
                                               ContractStandingDataDecoder/TEMPLATE_ID  (writeout contract-standing-data contract-standing-data/decode)
                                               OutrightStandingDataDecoder/TEMPLATE_ID  (writeout outright-standing-data outright-standing-data/decode)
                                               StrategyStandingDataDecoder/TEMPLATE_ID  (writeout strategy-standing-data strategy-standing-data/decode)
                                               TimetableDecoder/TEMPLATE_ID             (writeout timetable timetable/decode)
                                               OrderUpdateDecoder/TEMPLATE_ID           (writeout order-update order-update/decode)
                                               PriceUpdateDecoder/TEMPLATE_ID           (writeout price-update price-update/decode)
                                               FullTradeInformationDecoder/TEMPLATE_ID  (writeout full-trade-information full-trade-information/decode)
                                               StatisticsDecoder/TEMPLATE_ID            (writeout statistics statistics/decode)
                                               RealTimeIndexDecoder/TEMPLATE_ID         (writeout real-time-index real-time-index/decode)
                                               IndexSummaryDecoder/TEMPLATE_ID          (writeout index-summary index-summary/decode)
                                               MarketStatusChangeDecoder/TEMPLATE_ID    (writeout market-status-change market-status-change/decode)
                                               )
                                             templateId)
        master-decode (jconsumer [^BufferAndOffset info]
                           (let [buffer        (.getBuffer info)
                                 offset        (.getOffset info)
                                 header        (.wrap (MessageHeaderDecoder.) buffer offset)
                                 templateId    (.templateId header)
                                 encodedLength (.encodedLength header)
                                 blockLength   (.blockLength header)
                                 version       (.version header)]
                             (if (or (contains? general-exclusion templateId)
                                     (contains? message-type-exclusions templateId))
                               nil
                               (decode-sbe-message-to-parquet
                                (.getPacketTime info)
                                (.getMarketTime info)
                                templateId
                                (+ offset encodedLength)
                                blockLength
                                version
                                (.getBuffer info)))))
        ]
    (try (MasterDriver/masterStream pcap_files (EuronextFrameDecoder.)  master-decode)
         (finally
           (let [close-optional #(when (not (contains? message-type-exclusions %1)) (.close %2 nil))]
             (close-optional StartOfDayDecoder/TEMPLATE_ID start-of-day)
             (close-optional EndOfDayDecoder/TEMPLATE_ID end-of-day)
             (close-optional HealthStatusDecoder/TEMPLATE_ID health-status)
             (close-optional TechnicalNotificationDecoder/TEMPLATE_ID technical-notification)
             (close-optional StandingDataDecoder/TEMPLATE_ID standing-data)
             (close-optional ContractStandingDataDecoder/TEMPLATE_ID contract-standing-data)
             (close-optional OutrightStandingDataDecoder/TEMPLATE_ID outright-standing-data)
             (close-optional StrategyStandingDataDecoder/TEMPLATE_ID strategy-standing-data)
             (close-optional TimetableDecoder/TEMPLATE_ID timetable)
             (close-optional MarketUpdateDecoder/TEMPLATE_ID market-update)
             (close-optional OrderUpdateDecoder/TEMPLATE_ID order-update)
             (close-optional PriceUpdateDecoder/TEMPLATE_ID price-update)
             (close-optional FullTradeInformationDecoder/TEMPLATE_ID full-trade-information)
             (close-optional StatisticsDecoder/TEMPLATE_ID statistics)
             (close-optional RealTimeIndexDecoder/TEMPLATE_ID real-time-index)
             (close-optional IndexSummaryDecoder/TEMPLATE_ID index-summary)
             (close-optional MarketStatusChangeDecoder/TEMPLATE_ID market-status-change))))
    ))

(defn -main
  "I don't do a whole lot."
  [& args]
  (if (< (count args) 1)
    (do
      (println (str "
Euronext transformation exchange tool.
The utility allows extraction of Messages embedded in gzipped Pcap files.
"))
      (ETLConfiguration/printSummary " -jar <jarfile> [options] folder1 folder2 ...")
      (println "
The configuration file is a JSON containing the same command line options, as well as the extra
\"folders\" key, the list of folders.
NOTE: Options provided on the command-line override those in the configuration file.
"))
    (try
      (let [configuration-parameters (ETLConfiguration/initializeAppConfiguration (into-array String args)
                                                                                  (java.util.HashSet. supported-message-ids))

            pcap-files               (java.util.ArrayList.
                                      (->> (.getFolders configuration-parameters)
                                           (map #(into [] (ETLConfiguration/filesFromDir %)))
                                           flatten
                                           sort))
            prefix                   (.getPrefix configuration-parameters)
            excluded-messages        (ETLConfiguration/excludedMessages configuration-parameters
                                                                        supported-message-ids)]
        (java-stream-process-bulk-with-parquet-out pcap-files prefix excluded-messages))
      (catch ETLConfigurationException e
        (println (str "Process cannot start\n" (.getMessage e)))))))

(comment (-main "-p" (str "test-pyarrow" (java.lang.Math/random)) "sample_data/"))

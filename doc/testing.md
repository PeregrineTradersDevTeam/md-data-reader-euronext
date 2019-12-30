# Testing
The Euronext test suite covers almost all message types. This is because they were nice enough to provide an internal reader, making it possible to compare the application’s output with their own interpretation of the binary data.

A sample dataset was built from a day’s worth of Pico data, with a reasonable sample of each message type. This is to be found in sample_data/201901XX folders.

The data from the internal tool has been compiled into sample_data/Official_XXXXX csv files, for each message type.

This means the actual test code has a very simple structure:

1. Declare which sample sources to look at
2. Execute the application, selecting only the samples & message type
3. Compare each column of the result Parquet dataset to the respective column in the corresponding CSV file

The bulk of step #3 is handled by the utility `verify_datasets`, each test needs only to specify the 
column correspondence. The simplest test to start with is verify_marketupdate.py

The entry-point `run_tests.sh` performs a bit of optimisation, by running the tests through GNU Parallel.

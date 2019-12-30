#!/bin/bash
APPLICATION_LOCATION=$1
SAMPLE_DATA_LOCATION=$2
CURRENT_DIR=`pwd`
TEST_DIR=`mktemp -d -t euronext_test.XXXXX`

cd $TEST_DIR
find $CURRENT_DIR -name "verify*.py" | parallel python {} $APPLICATION_LOCATION $SAMPLE_DATA_LOCATION

echo $TEST_DIR
#rm -r $TEST_DIR

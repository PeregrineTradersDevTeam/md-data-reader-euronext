import pyarrow.parquet as pq
import pandas as pd
import math
import numpy as np
import subprocess


def build_parquet_data(app_location, cmdline_params):
    total_params = ["java", "-jar", app_location] + cmdline_params
    try:
        output = subprocess.check_output(total_params, stderr=subprocess.STDOUT)
        print(output.decode())
    except subprocess.CalledProcessError as e:
        print("Failed with errors: ", e.output.decode())
        exit(1)

def verify_datasets(verification_file, parquet_file, field_translation, converters = {}):
    def is_float(val):
        return type(val) == float or type(val) == np.float64

    def snip_verificaton_string(s):
        i = s.find("\\x00")
        if i >= 0:
            retval = s[0:i]
            if len(retval) == 0:
                return None
            return retval
        else:
            return s


    def nan_preserving_assert(colA, colB, converter = None):
        assert len(colA) == len(colB), "Column lengths not equal %r %r" % (len(colA), len(colB))
        for i in range(len(colA)):
            itemA = colA[i]
            itemB = colB[i]
            if converter:
                itemB = converter(itemB)
            if is_float(itemA) and is_float(itemB) and math.isnan(itemA) and math.isnan(itemB):
                continue
            if itemA is None and is_float(itemB) and math.isnan(itemB):
                continue
            if itemB is None and is_float(itemA) and math.isnan(itemA):
                continue
            if is_float(itemB) and not is_float(itemA):
                itemB = str(itemB)
            if type(itemB) == bytes:
                itemB = itemB.decode('utf-8')
            if type(itemA) == str:
                itemA = snip_verificaton_string(itemA)
            assert itemA == itemB or str(itemA) == str(itemB) or float(itemA) == float(itemB) or int(itemA) == int(itemB), "Failed at index %r " % i 

    verification_data = pd.read_csv(verification_file, dtype=str)
    parquet_data = pq.read_table(parquet_file).to_pandas(integer_object_nulls=True)
    for verification_column, parquet_column in field_translation.items():
        print("Checking\t\t", verification_column)
        converter=None
        if verification_column in converters:
            converter = converters[verification_column]
        nan_preserving_assert(verification_data[verification_column].values,parquet_data[parquet_column].values, converter)

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTBenchmarkIndicator_enum
{
    BENC((byte)66),

    RFPT((byte)83),

    No_Benchmark_or_Reference_Price_Trade((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTBenchmarkIndicator_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTBenchmarkIndicator_enum get(final byte value)
    {
        switch (value)
        {
            case 66: return BENC;
            case 83: return RFPT;
            case 45: return No_Benchmark_or_Reference_Price_Trade;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

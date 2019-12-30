/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum TradingPeriod_enum
{
    Opening((short)1),

    Standard((short)2),

    Closing((short)3),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TradingPeriod_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static TradingPeriod_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Opening;
            case 2: return Standard;
            case 3: return Closing;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTAgencyCrossTradeIndicator_enum
{
    ACTX((byte)88),

    No_Agency_Cross_Trade((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTAgencyCrossTradeIndicator_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTAgencyCrossTradeIndicator_enum get(final byte value)
    {
        switch (value)
        {
            case 88: return ACTX;
            case 45: return No_Agency_Cross_Trade;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

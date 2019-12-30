/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum PriceLimits_enum
{
    Price_Limits_Enabled___Normal((short)1),

    Price_Limits_Enabled___Wide((short)2),

    Price_Limits_Enabled___Widest((short)3),

    Price_Limits_Disabled((short)4),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    PriceLimits_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static PriceLimits_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Price_Limits_Enabled___Normal;
            case 2: return Price_Limits_Enabled___Wide;
            case 3: return Price_Limits_Enabled___Widest;
            case 4: return Price_Limits_Disabled;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

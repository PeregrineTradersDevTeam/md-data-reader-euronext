/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum QuoteSpreadMultiplier_enum
{
    Quote_Spread_Multiplier_1((short)1),

    Quote_Spread_Multiplier_2((short)2),

    Quote_Spread_Multiplier_3((short)3),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    QuoteSpreadMultiplier_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static QuoteSpreadMultiplier_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Quote_Spread_Multiplier_1;
            case 2: return Quote_Spread_Multiplier_2;
            case 3: return Quote_Spread_Multiplier_3;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

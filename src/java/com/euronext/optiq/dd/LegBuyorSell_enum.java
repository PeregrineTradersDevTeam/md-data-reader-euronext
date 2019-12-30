/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum LegBuyorSell_enum
{
    Buy((byte)66),

    Sell((byte)83),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    LegBuyorSell_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static LegBuyorSell_enum get(final byte value)
    {
        switch (value)
        {
            case 66: return Buy;
            case 83: return Sell;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

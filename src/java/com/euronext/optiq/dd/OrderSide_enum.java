/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum OrderSide_enum
{
    Buy((short)1),

    Sell((short)2),

    Cross((short)3),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    OrderSide_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static OrderSide_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Buy;
            case 2: return Sell;
            case 3: return Cross;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum UnderlyingType_enum
{
    Commodity((byte)67),

    Future((byte)70),

    Index((byte)73),

    Stock((byte)83),

    Exchange_Rate((byte)88),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    UnderlyingType_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static UnderlyingType_enum get(final byte value)
    {
        switch (value)
        {
            case 67: return Commodity;
            case 70: return Future;
            case 73: return Index;
            case 83: return Stock;
            case 88: return Exchange_Rate;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

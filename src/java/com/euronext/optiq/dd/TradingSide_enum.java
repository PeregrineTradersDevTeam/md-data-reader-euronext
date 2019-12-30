/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum TradingSide_enum
{
    Bid_Only((short)1),

    Offer_Only((short)2),

    PAKO((short)3),

    Both_Sides((short)4),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TradingSide_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static TradingSide_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Bid_Only;
            case 2: return Offer_Only;
            case 3: return PAKO;
            case 4: return Both_Sides;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

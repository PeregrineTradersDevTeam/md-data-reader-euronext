/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum QuoteUpdateType_enum
{
    Best_Bid((short)1),

    Best_Offer((short)2),

    Cancel_Bid((short)5),

    Cancel_Offer((short)6),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    QuoteUpdateType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static QuoteUpdateType_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Best_Bid;
            case 2: return Best_Offer;
            case 5: return Cancel_Bid;
            case 6: return Cancel_Offer;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

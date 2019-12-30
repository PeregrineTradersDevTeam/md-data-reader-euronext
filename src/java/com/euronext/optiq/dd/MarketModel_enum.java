/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum MarketModel_enum
{
    Order_Driven((short)1),

    Quote_Driven((short)2),

    IPO((short)3),

    Primary_Market((short)4),

    RFQ((short)5),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MarketModel_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static MarketModel_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Order_Driven;
            case 2: return Quote_Driven;
            case 3: return IPO;
            case 4: return Primary_Market;
            case 5: return RFQ;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

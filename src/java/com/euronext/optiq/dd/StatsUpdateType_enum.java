/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum StatsUpdateType_enum
{
    Daily_High((short)5),

    Daily_Low((short)6),

    Yearly_High((short)7),

    Yearly_Low((short)8),

    Lifetime_High((short)9),

    Lifetime_Low((short)10),

    Variation_Last_Price((short)14),

    Open_Price((short)15),

    Trade_Count((short)16),

    Last_Traded_Price((short)17),

    Percent_Variation_Previous_Close((short)18),

    Off_Book_Cumul_Qty((short)19),

    On_Book_Auction_Cumul_Qty((short)21),

    On_Book_Continuous_Cumul_Qty((short)22),

    On_and_Off_Book_Cumul_Qty((short)23),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    StatsUpdateType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static StatsUpdateType_enum get(final short value)
    {
        switch (value)
        {
            case 5: return Daily_High;
            case 6: return Daily_Low;
            case 7: return Yearly_High;
            case 8: return Yearly_Low;
            case 9: return Lifetime_High;
            case 10: return Lifetime_Low;
            case 14: return Variation_Last_Price;
            case 15: return Open_Price;
            case 16: return Trade_Count;
            case 17: return Last_Traded_Price;
            case 18: return Percent_Variation_Previous_Close;
            case 19: return Off_Book_Cumul_Qty;
            case 21: return On_Book_Auction_Cumul_Qty;
            case 22: return On_Book_Continuous_Cumul_Qty;
            case 23: return On_and_Off_Book_Cumul_Qty;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

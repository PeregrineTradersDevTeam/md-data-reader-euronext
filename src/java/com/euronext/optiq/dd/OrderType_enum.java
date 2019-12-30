/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum OrderType_enum
{
    Market((short)1),

    Limit((short)2),

    Stop_market_or_Stop_market_on_quote((short)3),

    Stop_limit_or_Stop_limit_on_quote((short)4),

    Primary_Peg((short)5),

    Market_to_limit((short)6),

    Market_Peg((short)7),

    Mid_Point_Peg((short)8),

    Average_Price((short)9),

    Iceberg((short)10),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    OrderType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static OrderType_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Market;
            case 2: return Limit;
            case 3: return Stop_market_or_Stop_market_on_quote;
            case 4: return Stop_limit_or_Stop_limit_on_quote;
            case 5: return Primary_Peg;
            case 6: return Market_to_limit;
            case 7: return Market_Peg;
            case 8: return Mid_Point_Peg;
            case 9: return Average_Price;
            case 10: return Iceberg;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

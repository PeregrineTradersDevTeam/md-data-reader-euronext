/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum IndexPriceCode_enum
{
    Only_Index((short)0),

    Index_and_Session_High((short)1),

    Index_and_Session_Low((short)2),

    Index_and_Session_High_and_Low__typically_first_price_((short)3),

    Only_Session_High((short)4),

    Only_Session_Low((short)5),

    Previous_Day_Close((short)6),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    IndexPriceCode_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static IndexPriceCode_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Only_Index;
            case 1: return Index_and_Session_High;
            case 2: return Index_and_Session_Low;
            case 3: return Index_and_Session_High_and_Low__typically_first_price_;
            case 4: return Only_Session_High;
            case 5: return Only_Session_Low;
            case 6: return Previous_Day_Close;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

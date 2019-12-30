/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum StrikeCurrencyIndicator_enum
{
    Change_rate_not_applied_to_the_strike_price((short)0),

    Change_rate_applied_to_the_strike_price((short)1),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    StrikeCurrencyIndicator_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static StrikeCurrencyIndicator_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Change_rate_not_applied_to_the_strike_price;
            case 1: return Change_rate_applied_to_the_strike_price;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

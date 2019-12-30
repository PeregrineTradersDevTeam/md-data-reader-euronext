/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum TradingCurrencyIndicator_enum
{
    Change_rate_not_applied_to_the_traded_price((short)0),

    Change_rate_applied_to_the_traded_price((short)1),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TradingCurrencyIndicator_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static TradingCurrencyIndicator_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Change_rate_not_applied_to_the_traded_price;
            case 1: return Change_rate_applied_to_the_traded_price;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

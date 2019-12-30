/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EffectiveDateIndicator_enum
{
    Seller_declaration_is_received_on_the_cur_trading_session_day((short)0),

    Seller_declaration_received_before_the_cur_trading_session_day((short)1),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    EffectiveDateIndicator_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static EffectiveDateIndicator_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Seller_declaration_is_received_on_the_cur_trading_session_day;
            case 1: return Seller_declaration_received_before_the_cur_trading_session_day;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum ExchangeCode_enum
{
    Amsterdam_Equity_Derivatives((byte)65),

    Brussels_Equity_Derivatives((byte)66),

    Paris_Equity_Underlyings((byte)67),

    Brussels_Cash_Underlyings((byte)68),

    Brussels_Index_Derivatives((byte)70),

    Amsterdam_Cash_Underlyings((byte)71),

    Lisbon_Cash_Underlyings((byte)72),

    Paris_Index_Derivatives((byte)74),

    Amsterdam_Index_Derivatives((byte)75),

    Lisbon_Index_Derivatives((byte)77),

    Paris_Equity_Derivatives((byte)80),

    Amsterdam_Commodities_Derivatives((byte)82),

    Lisbon_Equity_Derivatives((byte)83),

    Paris_Commodities_Derivatives((byte)89),

    Amsterdam_Currency_Derivatives((byte)90),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    ExchangeCode_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static ExchangeCode_enum get(final byte value)
    {
        switch (value)
        {
            case 65: return Amsterdam_Equity_Derivatives;
            case 66: return Brussels_Equity_Derivatives;
            case 67: return Paris_Equity_Underlyings;
            case 68: return Brussels_Cash_Underlyings;
            case 70: return Brussels_Index_Derivatives;
            case 71: return Amsterdam_Cash_Underlyings;
            case 72: return Lisbon_Cash_Underlyings;
            case 74: return Paris_Index_Derivatives;
            case 75: return Amsterdam_Index_Derivatives;
            case 77: return Lisbon_Index_Derivatives;
            case 80: return Paris_Equity_Derivatives;
            case 82: return Amsterdam_Commodities_Derivatives;
            case 83: return Lisbon_Equity_Derivatives;
            case 89: return Paris_Commodities_Derivatives;
            case 90: return Amsterdam_Currency_Derivatives;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

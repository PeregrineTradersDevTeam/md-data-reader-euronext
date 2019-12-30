/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTSpecialDividendIndicator_enum
{
    SDIV((byte)69),

    No_Special_Dividend_Trade((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTSpecialDividendIndicator_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTSpecialDividendIndicator_enum get(final byte value)
    {
        switch (value)
        {
            case 69: return SDIV;
            case 45: return No_Special_Dividend_Trade;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

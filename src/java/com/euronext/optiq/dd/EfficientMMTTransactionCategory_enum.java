/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTTransactionCategory_enum
{
    Dark_Trade((byte)68),

    RPRI((byte)82),

    XFPH((byte)89),

    TPAC((byte)90),

    None_apply((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTTransactionCategory_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTTransactionCategory_enum get(final byte value)
    {
        switch (value)
        {
            case 68: return Dark_Trade;
            case 82: return RPRI;
            case 89: return XFPH;
            case 90: return TPAC;
            case 45: return None_apply;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

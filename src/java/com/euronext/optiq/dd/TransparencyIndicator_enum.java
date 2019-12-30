/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum TransparencyIndicator_enum
{
    LitRegular_Trade((short)0),

    Dark_Trade_and_Immediate_Publication((short)1),

    Dark_Trade_and_Deferred_Publication((short)2),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TransparencyIndicator_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static TransparencyIndicator_enum get(final short value)
    {
        switch (value)
        {
            case 0: return LitRegular_Trade;
            case 1: return Dark_Trade_and_Immediate_Publication;
            case 2: return Dark_Trade_and_Deferred_Publication;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

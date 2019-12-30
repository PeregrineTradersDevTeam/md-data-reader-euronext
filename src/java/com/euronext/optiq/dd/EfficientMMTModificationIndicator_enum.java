/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTModificationIndicator_enum
{
    AMND((byte)65),

    CANC((byte)67),

    New_Trade((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTModificationIndicator_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTModificationIndicator_enum get(final byte value)
    {
        switch (value)
        {
            case 65: return AMND;
            case 67: return CANC;
            case 45: return New_Trade;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTDuplicativeIndicator_enum
{
    DUPL((byte)49),

    Unique_Trade_Report((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTDuplicativeIndicator_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTDuplicativeIndicator_enum get(final byte value)
    {
        switch (value)
        {
            case 49: return DUPL;
            case 45: return Unique_Trade_Report;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

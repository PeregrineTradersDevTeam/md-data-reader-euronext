/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTAlgorithmicIndicator_enum
{
    ALGO((byte)72),

    No_Algorithmic_Trade((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTAlgorithmicIndicator_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTAlgorithmicIndicator_enum get(final byte value)
    {
        switch (value)
        {
            case 72: return ALGO;
            case 45: return No_Algorithmic_Trade;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

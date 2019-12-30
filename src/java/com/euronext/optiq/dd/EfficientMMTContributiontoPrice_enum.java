/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTContributiontoPrice_enum
{
    TNCP((byte)74),

    PNDG((byte)78),

    Plain_Vanilla_Trade((byte)80),

    NPFT((byte)84),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTContributiontoPrice_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTContributiontoPrice_enum get(final byte value)
    {
        switch (value)
        {
            case 74: return TNCP;
            case 78: return PNDG;
            case 80: return Plain_Vanilla_Trade;
            case 84: return NPFT;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTNegotiationIndicator_enum
{
    NLIQ((byte)49),

    OILQ((byte)50),

    PRIC((byte)51),

    ILQD((byte)52),

    SIZE((byte)53),

    ILQD_SIZE((byte)54),

    Negotiated_Trade((byte)78),

    No_Negotiated_Trade((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTNegotiationIndicator_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTNegotiationIndicator_enum get(final byte value)
    {
        switch (value)
        {
            case 49: return NLIQ;
            case 50: return OILQ;
            case 51: return PRIC;
            case 52: return ILQD;
            case 53: return SIZE;
            case 54: return ILQD_SIZE;
            case 78: return Negotiated_Trade;
            case 45: return No_Negotiated_Trade;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

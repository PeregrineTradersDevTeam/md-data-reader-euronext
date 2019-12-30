/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTPublicationMode_enum
{
    Non_Immediate_Publication((byte)49),

    LRGS((byte)50),

    ILQD((byte)51),

    SIZE((byte)52),

    ILQD_SIZE((byte)53),

    ILQD_LRGS((byte)54),

    Immediate_Publication((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTPublicationMode_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTPublicationMode_enum get(final byte value)
    {
        switch (value)
        {
            case 49: return Non_Immediate_Publication;
            case 50: return LRGS;
            case 51: return ILQD;
            case 52: return SIZE;
            case 53: return ILQD_SIZE;
            case 54: return ILQD_LRGS;
            case 45: return Immediate_Publication;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

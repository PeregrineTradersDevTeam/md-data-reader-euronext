/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTPostTradeDeferral_enum
{
    LMTF((byte)49),

    DATF((byte)50),

    VOLO((byte)51),

    FWAF((byte)52),

    IDAF((byte)53),

    VOLW((byte)54),

    FULF((byte)55),

    FULA((byte)56),

    FULV((byte)57),

    FULJ((byte)86),

    COAF((byte)87),

    Not_Applicable((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTPostTradeDeferral_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTPostTradeDeferral_enum get(final byte value)
    {
        switch (value)
        {
            case 49: return LMTF;
            case 50: return DATF;
            case 51: return VOLO;
            case 52: return FWAF;
            case 53: return IDAF;
            case 54: return VOLW;
            case 55: return FULF;
            case 56: return FULA;
            case 57: return FULV;
            case 86: return FULJ;
            case 87: return COAF;
            case 45: return Not_Applicable;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

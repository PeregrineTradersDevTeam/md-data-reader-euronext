/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum PhaseId_enum
{
    Inaccessible((short)1),

    Closed((short)2),

    Call((short)3),

    Uncrossing((short)4),

    Continuous((short)5),

    Continuous_Uncrossing((short)7),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    PhaseId_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static PhaseId_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Inaccessible;
            case 2: return Closed;
            case 3: return Call;
            case 4: return Uncrossing;
            case 5: return Continuous;
            case 7: return Continuous_Uncrossing;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

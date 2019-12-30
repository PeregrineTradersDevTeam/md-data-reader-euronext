/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum ExerciseStyle_enum
{
    European((short)0),

    American((short)1),

    Asian((short)2),

    Bermudan((short)3),

    Other((short)4),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ExerciseStyle_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static ExerciseStyle_enum get(final short value)
    {
        switch (value)
        {
            case 0: return European;
            case 1: return American;
            case 2: return Asian;
            case 3: return Bermudan;
            case 4: return Other;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

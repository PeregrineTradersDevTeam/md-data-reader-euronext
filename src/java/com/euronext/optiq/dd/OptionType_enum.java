/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum OptionType_enum
{
    Call((short)1),

    Put((short)2),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    OptionType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static OptionType_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Call;
            case 2: return Put;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

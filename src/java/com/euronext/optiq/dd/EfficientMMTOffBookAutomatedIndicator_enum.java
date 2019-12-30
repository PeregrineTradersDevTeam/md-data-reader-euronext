/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTOffBookAutomatedIndicator_enum
{
    Off_Book_Non_Automated((byte)77),

    Off_Book_Automated((byte)81),

    Unspecified_or_does_not_apply((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTOffBookAutomatedIndicator_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTOffBookAutomatedIndicator_enum get(final byte value)
    {
        switch (value)
        {
            case 77: return Off_Book_Non_Automated;
            case 81: return Off_Book_Automated;
            case 45: return Unspecified_or_does_not_apply;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

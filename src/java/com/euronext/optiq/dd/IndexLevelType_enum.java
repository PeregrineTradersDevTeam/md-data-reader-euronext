/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum IndexLevelType_enum
{
    Indicative_Index((short)0),

    Official_Opening_Index((short)1),

    RealTime_Index((short)2),

    Automatic_Indicative_Index((short)3),

    Preliminary_Reference_Index((short)4),

    Closing_Reference_Index((short)5),

    Confirmed_Reference_Index((short)6),

    Options_Liquidation_Index((short)7),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    IndexLevelType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static IndexLevelType_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Indicative_Index;
            case 1: return Official_Opening_Index;
            case 2: return RealTime_Index;
            case 3: return Automatic_Indicative_Index;
            case 4: return Preliminary_Reference_Index;
            case 5: return Closing_Reference_Index;
            case 6: return Confirmed_Reference_Index;
            case 7: return Options_Liquidation_Index;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

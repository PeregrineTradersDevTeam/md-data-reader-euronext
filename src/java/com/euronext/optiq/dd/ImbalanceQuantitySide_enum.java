/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum ImbalanceQuantitySide_enum
{
    No_imbalance((short)0),

    Buy((short)1),

    Sell((short)2),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ImbalanceQuantitySide_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static ImbalanceQuantitySide_enum get(final short value)
    {
        switch (value)
        {
            case 0: return No_imbalance;
            case 1: return Buy;
            case 2: return Sell;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

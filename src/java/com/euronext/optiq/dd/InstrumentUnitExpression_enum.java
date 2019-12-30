/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum InstrumentUnitExpression_enum
{
    Units((short)1),

    Percentage_of_Nominal_Excluding_Accrued_Interest_Clean((short)2),

    Basis_Points((short)3),

    Percentage_of_Nominal_Including_Accrued_Interest_Dirty((short)5),

    Kilograms((short)8),

    Ounces((short)9),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    InstrumentUnitExpression_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static InstrumentUnitExpression_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Units;
            case 2: return Percentage_of_Nominal_Excluding_Accrued_Interest_Clean;
            case 3: return Basis_Points;
            case 5: return Percentage_of_Nominal_Including_Accrued_Interest_Dirty;
            case 8: return Kilograms;
            case 9: return Ounces;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

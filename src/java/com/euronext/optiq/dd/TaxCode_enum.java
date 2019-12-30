/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum TaxCode_enum
{
    Not_eligible_to_PEA___The_stock_has_never_been_a_Monory_stock((short)0),

    Eligible_to_PEA((short)3),

    Not_provided((short)9),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TaxCode_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static TaxCode_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Not_eligible_to_PEA___The_stock_has_never_been_a_Monory_stock;
            case 3: return Eligible_to_PEA;
            case 9: return Not_provided;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

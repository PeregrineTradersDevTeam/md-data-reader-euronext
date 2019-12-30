/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum GuaranteeIndicator_enum
{
    This_instrument_is_not_guaranteed((short)0),

    This_instrument_is_guaranteed((short)1),

    This_instrument_is_not_clearable((short)2),

    Guaranteed_Cleared_Borrowing_Lending_Service((short)8),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    GuaranteeIndicator_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static GuaranteeIndicator_enum get(final short value)
    {
        switch (value)
        {
            case 0: return This_instrument_is_not_guaranteed;
            case 1: return This_instrument_is_guaranteed;
            case 2: return This_instrument_is_not_clearable;
            case 8: return Guaranteed_Cleared_Borrowing_Lending_Service;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

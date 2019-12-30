/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum TechnicalNotificationType_enum
{
    Instrument_Book_Retransmission_End((short)1),

    Trade_Retransmission_Start((short)10),

    Trade_Retransmission_End((short)11),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TechnicalNotificationType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static TechnicalNotificationType_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Instrument_Book_Retransmission_End;
            case 10: return Trade_Retransmission_Start;
            case 11: return Trade_Retransmission_End;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

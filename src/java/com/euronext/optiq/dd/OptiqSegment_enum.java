/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum OptiqSegment_enum
{
    Equities((short)1),

    Funds((short)2),

    Fixed_Income((short)3),

    Warrants_and_Certificates((short)4),

    Bourse_de_Luxembourg((short)5),

    Options((short)6),

    Futures((short)7),

    Commodities((short)8),

    Indices((short)9),

    Trade_Reporting_and_Publication((short)10),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    OptiqSegment_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static OptiqSegment_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Equities;
            case 2: return Funds;
            case 3: return Fixed_Income;
            case 4: return Warrants_and_Certificates;
            case 5: return Bourse_de_Luxembourg;
            case 6: return Options;
            case 7: return Futures;
            case 8: return Commodities;
            case 9: return Indices;
            case 10: return Trade_Reporting_and_Publication;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum UnderlyingSubtype_enum
{
    Basket((short)0),

    Dividend((short)1),

    ETF((short)2),

    Share((short)3),

    Dividend_Index((short)4),

    Equity_Index((short)5),

    TRF_Index((short)6),

    Volatility_Index((short)7),

    Future_On_Commodities((short)8),

    FX_Cross_Rates((short)9),

    FX_Emerging_Markets((short)10),

    FX_Majors((short)11),

    Agricultural((short)12),

    Environmental((short)13),

    Freight((short)14),

    Fertilizer((short)15),

    Industrial_products((short)16),

    Inflation((short)17),

    Multi_Commodity_Exotic((short)18),

    Metals((short)19),

    Energy((short)20),

    Official_economic_statistics((short)21),

    Other_C10((short)22),

    Other((short)23),

    Paper((short)24),

    Polypropylene((short)25),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    UnderlyingSubtype_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static UnderlyingSubtype_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Basket;
            case 1: return Dividend;
            case 2: return ETF;
            case 3: return Share;
            case 4: return Dividend_Index;
            case 5: return Equity_Index;
            case 6: return TRF_Index;
            case 7: return Volatility_Index;
            case 8: return Future_On_Commodities;
            case 9: return FX_Cross_Rates;
            case 10: return FX_Emerging_Markets;
            case 11: return FX_Majors;
            case 12: return Agricultural;
            case 13: return Environmental;
            case 14: return Freight;
            case 15: return Fertilizer;
            case 16: return Industrial_products;
            case 17: return Inflation;
            case 18: return Multi_Commodity_Exotic;
            case 19: return Metals;
            case 20: return Energy;
            case 21: return Official_economic_statistics;
            case 22: return Other_C10;
            case 23: return Other;
            case 24: return Paper;
            case 25: return Polypropylene;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

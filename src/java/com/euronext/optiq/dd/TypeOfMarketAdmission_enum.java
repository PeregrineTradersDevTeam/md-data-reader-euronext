/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum TypeOfMarketAdmission_enum
{
    Instruments_traded_on_the_primary_market((byte)65),

    Instruments_traded_on_the_secondary_market((byte)66),

    Instruments_traded_on_the_New_Market((byte)67),

    Non_regulated_market_instruments_traded_on_the_free_market((byte)68),

    Non_regulated_market_Alternext((byte)69),

    Non_listed((byte)70),

    Regulated_Market_Non_equities((byte)71),

    Regulated_Market_Equities_Segment_A((byte)72),

    Regulated_Market_Equities_Segment_B((byte)73),

    Regulated_Market_Equities_Segment_C((byte)74),

    Regulated_Market_All_securities_Special_Segment((byte)75),

    Regulated_Market_Equities_Other_instruments((byte)76),

    OPCVM_SICOMI_non_listed_French_Investment_Funds((byte)83),

    Off_Market((byte)54),

    Gold_Currencies_and_Indices((byte)55),

    Foreign((byte)57),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    TypeOfMarketAdmission_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static TypeOfMarketAdmission_enum get(final byte value)
    {
        switch (value)
        {
            case 65: return Instruments_traded_on_the_primary_market;
            case 66: return Instruments_traded_on_the_secondary_market;
            case 67: return Instruments_traded_on_the_New_Market;
            case 68: return Non_regulated_market_instruments_traded_on_the_free_market;
            case 69: return Non_regulated_market_Alternext;
            case 70: return Non_listed;
            case 71: return Regulated_Market_Non_equities;
            case 72: return Regulated_Market_Equities_Segment_A;
            case 73: return Regulated_Market_Equities_Segment_B;
            case 74: return Regulated_Market_Equities_Segment_C;
            case 75: return Regulated_Market_All_securities_Special_Segment;
            case 76: return Regulated_Market_Equities_Other_instruments;
            case 83: return OPCVM_SICOMI_non_listed_French_Investment_Funds;
            case 54: return Off_Market;
            case 55: return Gold_Currencies_and_Indices;
            case 57: return Foreign;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

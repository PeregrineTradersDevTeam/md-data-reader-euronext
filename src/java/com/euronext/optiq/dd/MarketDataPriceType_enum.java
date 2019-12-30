/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum MarketDataPriceType_enum
{
    Official_Daily((short)2),

    Official_Market_Close((short)4),

    Official_Expiry((short)6),

    Provisional_Intraday((short)7),

    Official_Intraday((short)8),

    Official_YDSP((short)9),

    NAV_for_the_instruments_eligible_to_the_NAV_Trading_Facility((short)10),

    Adjusted_Closing_Price((short)12),

    Subscription_Price((short)13),

    Indicative_Matching_Price((short)14),

    Min_Price_Out_of_Session_Trades((short)19),

    Max_Price_Out_of_Session_Trades((short)20),

    Min_Price_Out_of_Session_Block_Trades((short)21),

    Max_Price_Out_of_Session_Block_Trades((short)22),

    Valuation_Price((short)23),

    Fund_Subscription((short)24),

    Fund_Redemption((short)25),

    Uncrossing_Price((short)26),

    Last_Traded_Price((short)27),

    AIP((short)28),

    Net_Asset_Value((short)30),

    External_Reference_Price((short)31),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MarketDataPriceType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static MarketDataPriceType_enum get(final short value)
    {
        switch (value)
        {
            case 2: return Official_Daily;
            case 4: return Official_Market_Close;
            case 6: return Official_Expiry;
            case 7: return Provisional_Intraday;
            case 8: return Official_Intraday;
            case 9: return Official_YDSP;
            case 10: return NAV_for_the_instruments_eligible_to_the_NAV_Trading_Facility;
            case 12: return Adjusted_Closing_Price;
            case 13: return Subscription_Price;
            case 14: return Indicative_Matching_Price;
            case 19: return Min_Price_Out_of_Session_Trades;
            case 20: return Max_Price_Out_of_Session_Trades;
            case 21: return Min_Price_Out_of_Session_Block_Trades;
            case 22: return Max_Price_Out_of_Session_Block_Trades;
            case 23: return Valuation_Price;
            case 24: return Fund_Subscription;
            case 25: return Fund_Redemption;
            case 26: return Uncrossing_Price;
            case 27: return Last_Traded_Price;
            case 28: return AIP;
            case 30: return Net_Asset_Value;
            case 31: return External_Reference_Price;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

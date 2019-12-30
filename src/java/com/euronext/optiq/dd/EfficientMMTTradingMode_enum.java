/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTTradingMode_enum
{
    Undefined_Auction_equal_Uncrossing((byte)49),

    Continuous_Trading((byte)50),

    At_Market_Close_Trading((byte)51),

    Out_of_Main_Session_Trading((byte)52),

    Trade_Reporting_On_Exchange((byte)53),

    Trade_Reporting_Off_Exchange((byte)54),

    Trade_Reporting_Systematic_Internaliser((byte)55),

    Scheduled_Intraday_Auction_equal_Uncrossing((byte)73),

    Scheduled_Closing_Auction_equal_Uncrossing((byte)75),

    Scheduled_Opening_Auction_equal_Uncrossing((byte)79),

    Unscheduled_Auction_equal_Uncrossing((byte)85),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    EfficientMMTTradingMode_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static EfficientMMTTradingMode_enum get(final byte value)
    {
        switch (value)
        {
            case 49: return Undefined_Auction_equal_Uncrossing;
            case 50: return Continuous_Trading;
            case 51: return At_Market_Close_Trading;
            case 52: return Out_of_Main_Session_Trading;
            case 53: return Trade_Reporting_On_Exchange;
            case 54: return Trade_Reporting_Off_Exchange;
            case 55: return Trade_Reporting_Systematic_Internaliser;
            case 73: return Scheduled_Intraday_Auction_equal_Uncrossing;
            case 75: return Scheduled_Closing_Auction_equal_Uncrossing;
            case 79: return Scheduled_Opening_Auction_equal_Uncrossing;
            case 85: return Unscheduled_Auction_equal_Uncrossing;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

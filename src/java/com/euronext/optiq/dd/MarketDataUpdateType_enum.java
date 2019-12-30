/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum MarketDataUpdateType_enum
{
    Best_Bid((short)1),

    Best_Offer((short)2),

    New_Bid((short)3),

    New_Offer((short)4),

    Updated_Bid((short)5),

    Updated_Offer((short)6),

    Total_Traded_Volume((short)7),

    Implied_Bid((short)8),

    Implied_Offer((short)9),

    Request_for_Quote((short)10),

    Request_for_Quote_Bid((short)11),

    Request_for_Size((short)12),

    Request_for_Quote_Offer((short)13),

    High_Dynamic_Collar((short)14),

    Low_Dynamic_Collar((short)15),

    New_Bid_RLP((short)16),

    New_Offer_RLP((short)17),

    Updated_Bid_RLP((short)18),

    Updated_Offer_RLP((short)19),

    Conventional_Trade((short)24),

    Request_for_Cross_RFC_Queued((short)25),

    Request_for_Cross_RFC((short)26),

    Large_in_Scale_LiS_Trade((short)27),

    Basis_Trade((short)28),

    Large_in_Scale_LiS_Package_Trade((short)29),

    Guaranteed_Cross_Trade((short)30),

    Against_Actual_Trade((short)31),

    Asset_Allocation_Trade((short)32),

    Exchange_for_Swap_Trade((short)34),

    Dark_Trade((short)35),

    Exchange_for_Physical_Trade_Cash_Leg((short)36),

    Strategy_Leg_Conventional_Trade((short)37),

    Strategy_Leg_Large_in_Scale_LiS_Trade((short)38),

    Strategy_Leg_Basis_Trade((short)39),

    Strategy_Leg_Guaranteed_Cross_Trade((short)40),

    Strategy_Leg_Against_Actual_Trade((short)41),

    Strategy_Leg_Asset_Allocation_Trade((short)42),

    Strategy_Leg_Exchange_For_Swap_Trade((short)44),

    Strategy_Leg_Exchange_For_Physical_Trade((short)45),

    BoB_Trade((short)46),

    AtomX_Trade((short)48),

    Trade_Cancellation((short)50),

    Out_of_Market_Trade((short)51),

    Delta_Neutral_Trade_Underlying_Cash_Leg((short)52),

    Delta_Neutral_Trade_Underlying_Future_Leg((short)53),

    Euronext_Fund_Service_Trade((short)54),

    Secondary_Listing_Trade((short)55),

    Request_for_Cross_Trade((short)56),

    Request_for_Cross_Strategy_Leg_Trade((short)57),

    New_Bid_With_Liquidity_Provider((short)58),

    New_Offer_With_Liquidity_Provider((short)59),

    Updated_Bid_With_Liquidity_Provider((short)60),

    Updated_Offer_With_Liquidity_Provider((short)61),

    Low_Static_Collar((short)63),

    High_Static_Collar((short)64),

    Market_VWAP_Operation_Trade((short)65),

    Request_for_Size_Bid((short)66),

    Request_for_Size_Offer((short)67),

    Low_LP_Collar((short)70),

    High_LP_Collar((short)71),

    ETF_MTF_NAV_Trade_price_in_bp((short)72),

    ETF_MTF_NAV_Dark_Trade_price_in_bp((short)73),

    New_Bid_on_Wholesale_RFC((short)74),

    New_Offer_on_Wholesale_RFC((short)75),

    Updated_Bid_on_Wholesale_RFC((short)76),

    Updated_Offer_on_Wholesale_RFC((short)77),

    Clear_Wholesale_RFC((short)78),

    Guaranteed_Cross_Negotiated_deal_NLIQ((short)79),

    Guaranteed_Cross_Negotiated_deal_OILQ((short)80),

    Large_in_Scale_Trade((short)81),

    Large_in_Scale_Trade_in_basis_points((short)82),

    Large_in_Scale_Package_Trade_in_basis_points((short)83),

    Strategy_Leg_Large_in_Scale_Trade_in_basis_points((short)84),

    Clear_Book((short)254),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MarketDataUpdateType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static MarketDataUpdateType_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Best_Bid;
            case 2: return Best_Offer;
            case 3: return New_Bid;
            case 4: return New_Offer;
            case 5: return Updated_Bid;
            case 6: return Updated_Offer;
            case 7: return Total_Traded_Volume;
            case 8: return Implied_Bid;
            case 9: return Implied_Offer;
            case 10: return Request_for_Quote;
            case 11: return Request_for_Quote_Bid;
            case 12: return Request_for_Size;
            case 13: return Request_for_Quote_Offer;
            case 14: return High_Dynamic_Collar;
            case 15: return Low_Dynamic_Collar;
            case 16: return New_Bid_RLP;
            case 17: return New_Offer_RLP;
            case 18: return Updated_Bid_RLP;
            case 19: return Updated_Offer_RLP;
            case 24: return Conventional_Trade;
            case 25: return Request_for_Cross_RFC_Queued;
            case 26: return Request_for_Cross_RFC;
            case 27: return Large_in_Scale_LiS_Trade;
            case 28: return Basis_Trade;
            case 29: return Large_in_Scale_LiS_Package_Trade;
            case 30: return Guaranteed_Cross_Trade;
            case 31: return Against_Actual_Trade;
            case 32: return Asset_Allocation_Trade;
            case 34: return Exchange_for_Swap_Trade;
            case 35: return Dark_Trade;
            case 36: return Exchange_for_Physical_Trade_Cash_Leg;
            case 37: return Strategy_Leg_Conventional_Trade;
            case 38: return Strategy_Leg_Large_in_Scale_LiS_Trade;
            case 39: return Strategy_Leg_Basis_Trade;
            case 40: return Strategy_Leg_Guaranteed_Cross_Trade;
            case 41: return Strategy_Leg_Against_Actual_Trade;
            case 42: return Strategy_Leg_Asset_Allocation_Trade;
            case 44: return Strategy_Leg_Exchange_For_Swap_Trade;
            case 45: return Strategy_Leg_Exchange_For_Physical_Trade;
            case 46: return BoB_Trade;
            case 48: return AtomX_Trade;
            case 50: return Trade_Cancellation;
            case 51: return Out_of_Market_Trade;
            case 52: return Delta_Neutral_Trade_Underlying_Cash_Leg;
            case 53: return Delta_Neutral_Trade_Underlying_Future_Leg;
            case 54: return Euronext_Fund_Service_Trade;
            case 55: return Secondary_Listing_Trade;
            case 56: return Request_for_Cross_Trade;
            case 57: return Request_for_Cross_Strategy_Leg_Trade;
            case 58: return New_Bid_With_Liquidity_Provider;
            case 59: return New_Offer_With_Liquidity_Provider;
            case 60: return Updated_Bid_With_Liquidity_Provider;
            case 61: return Updated_Offer_With_Liquidity_Provider;
            case 63: return Low_Static_Collar;
            case 64: return High_Static_Collar;
            case 65: return Market_VWAP_Operation_Trade;
            case 66: return Request_for_Size_Bid;
            case 67: return Request_for_Size_Offer;
            case 70: return Low_LP_Collar;
            case 71: return High_LP_Collar;
            case 72: return ETF_MTF_NAV_Trade_price_in_bp;
            case 73: return ETF_MTF_NAV_Dark_Trade_price_in_bp;
            case 74: return New_Bid_on_Wholesale_RFC;
            case 75: return New_Offer_on_Wholesale_RFC;
            case 76: return Updated_Bid_on_Wholesale_RFC;
            case 77: return Updated_Offer_on_Wholesale_RFC;
            case 78: return Clear_Wholesale_RFC;
            case 79: return Guaranteed_Cross_Negotiated_deal_NLIQ;
            case 80: return Guaranteed_Cross_Negotiated_deal_OILQ;
            case 81: return Large_in_Scale_Trade;
            case 82: return Large_in_Scale_Trade_in_basis_points;
            case 83: return Large_in_Scale_Package_Trade_in_basis_points;
            case 84: return Strategy_Leg_Large_in_Scale_Trade_in_basis_points;
            case 254: return Clear_Book;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

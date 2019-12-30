/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum TradeType_enum
{
    Conventional_Trade((short)1),

    Large_in_Scale_LiS_Trade((short)2),

    Basis_Trade((short)3),

    Large_in_Scale_LiS_Package_Trade((short)4),

    Guaranteed_Cross_Trade((short)5),

    Against_Actual_Trade((short)6),

    Asset_Allocation_Trade((short)7),

    Exchange_for_Swap_Trade((short)9),

    Exchange_for_Physical_Trade_Cash_Leg((short)10),

    Strategy_Leg_Conventional_Trade((short)11),

    Strategy_Leg_Large_in_Scale_LiS_Trade((short)12),

    Strategy_Leg_Basis_Trade((short)13),

    Strategy_Leg_Guaranteed_Cross_Trade((short)14),

    Strategy_Leg_Against_Actual_Trade((short)15),

    Strategy_Leg_Asset_Allocation_Trade((short)16),

    Strategy_Leg_Exchange_For_Swap_Trade((short)18),

    Strategy_Leg_Exchange_For_Physical_Trade((short)19),

    BoB_Trade((short)20),

    AtomX_Trade((short)22),

    Trade_Cancellation((short)24),

    Out_of_Market_Trade((short)25),

    Delta_Neutral_Trade_Underlying_Cash_Leg((short)26),

    Market_VWAP_Operation_Trade((short)27),

    Euronext_Fund_Service_Trade((short)28),

    Secondary_Listing_Trade((short)29),

    Request_for_Cross_Trade((short)30),

    Request_for_cross_strategy_Leg_Trade((short)31),

    Trade_Publication((short)32),

    Dark_Trade((short)33),

    Delta_Neutral_Trade_Underlying_Future_Leg((short)34),

    Total_Traded_Volume((short)36),

    ETF_MTF_NAV_Trade_price_in_bp((short)37),

    ETF_MTF_NAV_Dark_Trade_price_in_bp((short)38),

    Guaranteed_Cross_Negotiated_deal_NLIQ((short)39),

    Guaranteed_Cross_Negotiated_deal_OILQ((short)40),

    Large_in_Scale_Trade((short)41),

    Large_in_Scale_Trade_in_basis_points((short)42),

    Large_in_Scale_Package_Trade_in_basis_points((short)43),

    Strategy_Leg_Large_in_Scale_Trade_in_basis_points((short)44),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TradeType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static TradeType_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Conventional_Trade;
            case 2: return Large_in_Scale_LiS_Trade;
            case 3: return Basis_Trade;
            case 4: return Large_in_Scale_LiS_Package_Trade;
            case 5: return Guaranteed_Cross_Trade;
            case 6: return Against_Actual_Trade;
            case 7: return Asset_Allocation_Trade;
            case 9: return Exchange_for_Swap_Trade;
            case 10: return Exchange_for_Physical_Trade_Cash_Leg;
            case 11: return Strategy_Leg_Conventional_Trade;
            case 12: return Strategy_Leg_Large_in_Scale_LiS_Trade;
            case 13: return Strategy_Leg_Basis_Trade;
            case 14: return Strategy_Leg_Guaranteed_Cross_Trade;
            case 15: return Strategy_Leg_Against_Actual_Trade;
            case 16: return Strategy_Leg_Asset_Allocation_Trade;
            case 18: return Strategy_Leg_Exchange_For_Swap_Trade;
            case 19: return Strategy_Leg_Exchange_For_Physical_Trade;
            case 20: return BoB_Trade;
            case 22: return AtomX_Trade;
            case 24: return Trade_Cancellation;
            case 25: return Out_of_Market_Trade;
            case 26: return Delta_Neutral_Trade_Underlying_Cash_Leg;
            case 27: return Market_VWAP_Operation_Trade;
            case 28: return Euronext_Fund_Service_Trade;
            case 29: return Secondary_Listing_Trade;
            case 30: return Request_for_Cross_Trade;
            case 31: return Request_for_cross_strategy_Leg_Trade;
            case 32: return Trade_Publication;
            case 33: return Dark_Trade;
            case 34: return Delta_Neutral_Trade_Underlying_Future_Leg;
            case 36: return Total_Traded_Volume;
            case 37: return ETF_MTF_NAV_Trade_price_in_bp;
            case 38: return ETF_MTF_NAV_Dark_Trade_price_in_bp;
            case 39: return Guaranteed_Cross_Negotiated_deal_NLIQ;
            case 40: return Guaranteed_Cross_Negotiated_deal_OILQ;
            case 41: return Large_in_Scale_Trade;
            case 42: return Large_in_Scale_Trade_in_basis_points;
            case 43: return Large_in_Scale_Package_Trade_in_basis_points;
            case 44: return Strategy_Leg_Large_in_Scale_Trade_in_basis_points;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

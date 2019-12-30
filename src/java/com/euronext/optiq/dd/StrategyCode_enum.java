/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum StrategyCode_enum
{
    Jelly_Roll((byte)65),

    Butterfly((byte)66),

    Call_or_Put_Cabinet((byte)67),

    Spread((byte)68),

    Calendar_Spread((byte)69),

    Diagonal_Calendar_Spread((byte)70),

    Guts((byte)71),

    Two_by_One_Ratio_Spread((byte)72),

    Iron_Butterfly((byte)73),

    Combo((byte)74),

    Strangle((byte)75),

    Ladder((byte)76),

    Strip((byte)77),

    Straddle_Calendar_Spread((byte)78),

    Pack((byte)79),

    Diagonal_Straddle_Calendar_Spread((byte)80),

    Simple_Inter_Commodity_Spread((byte)81),

    Conversion_Reversal((byte)82),

    Straddle((byte)83),

    Volatility_Trade((byte)86),

    Condor((byte)87),

    Box((byte)88),

    Bundle((byte)89),

    Reduced_Tick_Spread((byte)90),

    Ladder_versus_Underlying((byte)97),

    Butterfly_versus_Underlying((byte)98),

    Call_Spread_versus_Put_versus_Underlying((byte)99),

    Call_or_Put_Spread_versus_Underlying((byte)100),

    Call_or_Put_Calendar_Spread_versus_Underlying((byte)101),

    CallPut_Diagonal_Calendar_Spread_versus_Underlying((byte)102),

    Guts_versus_Underlying((byte)103),

    Two_by_One_Call_or_Put_Ratio_Spread_versus_Underlying((byte)104),

    Iron_Butterfly_versus_Underlying((byte)105),

    Combo_versus_Underlying((byte)106),

    Strangle_versus_Underlying((byte)107),

    Exchange_for_Physical((byte)109),

    Straddle_Calendar_Spread_versus_Underlying((byte)110),

    Put_Spread_versus_Call_versus_Underlying((byte)112),

    Diagonal_Straddle_Calendar_Spread_versus_Underlying((byte)113),

    Synthetic((byte)114),

    Straddle_versus_Underlying((byte)115),

    Condor_versus_Underlying((byte)116),

    Buy_Write((byte)117),

    Iron_Condor_versus_Underlying((byte)118),

    Iron_Condor((byte)119),

    Call_Spread_versus_Sell_a_Put((byte)120),

    Put_Spread_versus_Sell_a_Call((byte)121),

    Put_Straddle_versus_Sell_a_Call_or_a_Put((byte)122),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    StrategyCode_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static StrategyCode_enum get(final byte value)
    {
        switch (value)
        {
            case 65: return Jelly_Roll;
            case 66: return Butterfly;
            case 67: return Call_or_Put_Cabinet;
            case 68: return Spread;
            case 69: return Calendar_Spread;
            case 70: return Diagonal_Calendar_Spread;
            case 71: return Guts;
            case 72: return Two_by_One_Ratio_Spread;
            case 73: return Iron_Butterfly;
            case 74: return Combo;
            case 75: return Strangle;
            case 76: return Ladder;
            case 77: return Strip;
            case 78: return Straddle_Calendar_Spread;
            case 79: return Pack;
            case 80: return Diagonal_Straddle_Calendar_Spread;
            case 81: return Simple_Inter_Commodity_Spread;
            case 82: return Conversion_Reversal;
            case 83: return Straddle;
            case 86: return Volatility_Trade;
            case 87: return Condor;
            case 88: return Box;
            case 89: return Bundle;
            case 90: return Reduced_Tick_Spread;
            case 97: return Ladder_versus_Underlying;
            case 98: return Butterfly_versus_Underlying;
            case 99: return Call_Spread_versus_Put_versus_Underlying;
            case 100: return Call_or_Put_Spread_versus_Underlying;
            case 101: return Call_or_Put_Calendar_Spread_versus_Underlying;
            case 102: return CallPut_Diagonal_Calendar_Spread_versus_Underlying;
            case 103: return Guts_versus_Underlying;
            case 104: return Two_by_One_Call_or_Put_Ratio_Spread_versus_Underlying;
            case 105: return Iron_Butterfly_versus_Underlying;
            case 106: return Combo_versus_Underlying;
            case 107: return Strangle_versus_Underlying;
            case 109: return Exchange_for_Physical;
            case 110: return Straddle_Calendar_Spread_versus_Underlying;
            case 112: return Put_Spread_versus_Call_versus_Underlying;
            case 113: return Diagonal_Straddle_Calendar_Spread_versus_Underlying;
            case 114: return Synthetic;
            case 115: return Straddle_versus_Underlying;
            case 116: return Condor_versus_Underlying;
            case 117: return Buy_Write;
            case 118: return Iron_Condor_versus_Underlying;
            case 119: return Iron_Condor;
            case 120: return Call_Spread_versus_Sell_a_Put;
            case 121: return Put_Spread_versus_Sell_a_Call;
            case 122: return Put_Straddle_versus_Sell_a_Call_or_a_Put;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

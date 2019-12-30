/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum ContractTradingType_enum
{
    Traded_as_an_outright((short)1),

    Not_traded_but_listed_in_contract_data_Traders_may_subscribe_to((short)2),

    Traded_as_a_simple_intercommodity_spread((short)3),

    Traded_as_an_intercommodity_spread((short)4),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ContractTradingType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static ContractTradingType_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Traded_as_an_outright;
            case 2: return Not_traded_but_listed_in_contract_data_Traders_may_subscribe_to;
            case 3: return Traded_as_a_simple_intercommodity_spread;
            case 4: return Traded_as_an_intercommodity_spread;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum BlockTradeCode_enum
{
    Block_Trade((byte)66),

    Regular_trade_or_Negotiated_deal((byte)78),

    Undefined((byte)45),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    BlockTradeCode_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static BlockTradeCode_enum get(final byte value)
    {
        switch (value)
        {
            case 66: return Block_Trade;
            case 78: return Regular_trade_or_Negotiated_deal;
            case 45: return Undefined;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

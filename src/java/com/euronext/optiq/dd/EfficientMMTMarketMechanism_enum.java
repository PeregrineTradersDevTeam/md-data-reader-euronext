/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EfficientMMTMarketMechanism_enum
{
    Central_Limit_Order_Book((short)1),

    Quote_Driven_Market((short)2),

    Dark_Order_Book((short)3),

    Off_Book_including_Voice_or_Messaging_Trading((short)4),

    Periodic_Auction_equal_Uncrossing((short)5),

    Request_for_Quotes((short)6),

    Other((short)7),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    EfficientMMTMarketMechanism_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static EfficientMMTMarketMechanism_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Central_Limit_Order_Book;
            case 2: return Quote_Driven_Market;
            case 3: return Dark_Order_Book;
            case 4: return Off_Book_including_Voice_or_Messaging_Trading;
            case 5: return Periodic_Auction_equal_Uncrossing;
            case 6: return Request_for_Quotes;
            case 7: return Other;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

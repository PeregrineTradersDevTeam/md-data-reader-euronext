/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum MarketDataActionType_enum
{
    NewOrder((short)1),

    DeletionOfIdentifiedOrder((short)2),

    DeletionOfAllOrdersBySide((short)3),

    ModificationOfExistingOrderWithoutLossOfPriority((short)4),

    RetransmissionOfAllOrders((short)5),

    ModificationOfExistingOrderWithLossOfPriority((short)6),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MarketDataActionType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static MarketDataActionType_enum get(final short value)
    {
        switch (value)
        {
            case 1: return NewOrder;
            case 2: return DeletionOfIdentifiedOrder;
            case 3: return DeletionOfAllOrdersBySide;
            case 4: return ModificationOfExistingOrderWithoutLossOfPriority;
            case 5: return RetransmissionOfAllOrders;
            case 6: return ModificationOfExistingOrderWithLossOfPriority;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum ScheduledEvent_enum
{
    Cancel_Previously_Scheduled_Event((short)0),

    Reopening((short)1),

    Resumption_of_trading((short)3),

    Closed((short)4),

    Expiry((short)5),

    Wholesale_Large_in_Scale_LiS_trades_open_extension((short)6),

    Wholesale_Basis_trades_open_extension((short)7),

    Wholesale_Against_Actuals_trades_open_extension((short)8),

    Wholesale_Large_in_Scale_LiS_Package_trades_open_extension((short)9),

    Wholesale_Exchange_For_Swaps_trades_open_extension((short)10),

    Wholesale_Trades_Open_Extension((short)11),

    Suspension((short)12),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ScheduledEvent_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static ScheduledEvent_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Cancel_Previously_Scheduled_Event;
            case 1: return Reopening;
            case 3: return Resumption_of_trading;
            case 4: return Closed;
            case 5: return Expiry;
            case 6: return Wholesale_Large_in_Scale_LiS_trades_open_extension;
            case 7: return Wholesale_Basis_trades_open_extension;
            case 8: return Wholesale_Against_Actuals_trades_open_extension;
            case 9: return Wholesale_Large_in_Scale_LiS_Package_trades_open_extension;
            case 10: return Wholesale_Exchange_For_Swaps_trades_open_extension;
            case 11: return Wholesale_Trades_Open_Extension;
            case 12: return Suspension;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

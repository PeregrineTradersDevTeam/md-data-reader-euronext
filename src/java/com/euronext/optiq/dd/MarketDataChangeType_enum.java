/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum MarketDataChangeType_enum
{
    Status_Changes((short)0),

    Scheduled_Event_Notification((short)1),

    Status_Change_and_Scheduled_Event_Notification((short)2),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MarketDataChangeType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static MarketDataChangeType_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Status_Changes;
            case 1: return Scheduled_Event_Notification;
            case 2: return Status_Change_and_Scheduled_Event_Notification;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

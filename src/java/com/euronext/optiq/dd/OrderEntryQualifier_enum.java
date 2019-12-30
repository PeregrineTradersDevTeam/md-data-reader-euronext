/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum OrderEntryQualifier_enum
{
    Order_EntryCancelModify_Disabled((short)0),

    Order_EntryCancelModify_Enabled((short)1),

    Cancel_and_Modify_Only((short)2),

    Cancel_Only((short)3),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    OrderEntryQualifier_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static OrderEntryQualifier_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Order_EntryCancelModify_Disabled;
            case 1: return Order_EntryCancelModify_Enabled;
            case 2: return Cancel_and_Modify_Only;
            case 3: return Cancel_Only;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

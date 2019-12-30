/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum StatusReason_enum
{
    Scheduled((short)0),

    Collars_Breach((short)4),

    Automatic_Reopening((short)7),

    No_Liquidity_Provider((short)8),

    KnockIn_by_Issuer((short)11),

    KnockOut_by_Exchange((short)12),

    KnockOut_by_Issuer((short)13),

    Action_by_Market_Operations((short)15),

    Waiting_for_Tradable_State((short)16),

    New_Listing((short)20),

    Due_to_Underlying((short)21),

    Outside_of_LP_quotes((short)22),

    Technical((short)23),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    StatusReason_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static StatusReason_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Scheduled;
            case 4: return Collars_Breach;
            case 7: return Automatic_Reopening;
            case 8: return No_Liquidity_Provider;
            case 11: return KnockIn_by_Issuer;
            case 12: return KnockOut_by_Exchange;
            case 13: return KnockOut_by_Issuer;
            case 15: return Action_by_Market_Operations;
            case 16: return Waiting_for_Tradable_State;
            case 20: return New_Listing;
            case 21: return Due_to_Underlying;
            case 22: return Outside_of_LP_quotes;
            case 23: return Technical;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum TransactionType_enum
{
    Plain_Vanilla_Trade((short)1),

    Dark_Trade((short)2),

    Benchmark_Trade((short)3),

    Technical_Trade((short)4),

    Giveup_Givein_Trade((short)5),

    Ex_Cum_dividend_Trade((short)6),

    Trade_With_Condition((short)7),

    Summary_Report((short)15),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TransactionType_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static TransactionType_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Plain_Vanilla_Trade;
            case 2: return Dark_Trade;
            case 3: return Benchmark_Trade;
            case 4: return Technical_Trade;
            case 5: return Giveup_Givein_Trade;
            case 6: return Ex_Cum_dividend_Trade;
            case 7: return Trade_With_Condition;
            case 15: return Summary_Report;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

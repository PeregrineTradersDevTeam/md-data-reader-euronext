/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum RepoIndicator_enum
{
    Instr_neither_eligible_for_SRD_or_Loan_and_Lending_Mkt((short)0),

    Instr_eligible_for_SRD_and_for_Loan_and_Lending_Market((short)1),

    Instr_eligible_for_the_SRD_long_only((short)2),

    Instr_eligible_for_Loan_and_Lending_Mkt_and_for_SRD_long_only((short)3),

    Easytoborrow_Instr_eligible_for_SRD_and_for_Loan_and_Lending_Mkt((short)4),

    Instr_eligible_for_the_Loan_and_Lending_Market((short)5),

    Non_significant((short)8),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    RepoIndicator_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static RepoIndicator_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Instr_neither_eligible_for_SRD_or_Loan_and_Lending_Mkt;
            case 1: return Instr_eligible_for_SRD_and_for_Loan_and_Lending_Market;
            case 2: return Instr_eligible_for_the_SRD_long_only;
            case 3: return Instr_eligible_for_Loan_and_Lending_Mkt_and_for_SRD_long_only;
            case 4: return Easytoborrow_Instr_eligible_for_SRD_and_for_Loan_and_Lending_Mkt;
            case 5: return Instr_eligible_for_the_Loan_and_Lending_Market;
            case 8: return Non_significant;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

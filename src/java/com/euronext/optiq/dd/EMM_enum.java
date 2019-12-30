/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum EMM_enum
{
    Cash_and_Derivative_Central_Order_Book((short)1),

    NAV_Trading_Facility((short)2),

    Derivatives_Wholesales((short)4),

    Cash_On_Exchange_Off_book((short)5),

    Euronext_off_exchange_trade_reports((short)6),

    Derivatives_On_Exchange_Off_book((short)7),

    ETF_MTF_NAV_Central_Order_Book((short)8),

    Not_Applicable((short)99),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    EMM_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static EMM_enum get(final short value)
    {
        switch (value)
        {
            case 1: return Cash_and_Derivative_Central_Order_Book;
            case 2: return NAV_Trading_Facility;
            case 4: return Derivatives_Wholesales;
            case 5: return Cash_On_Exchange_Off_book;
            case 6: return Euronext_off_exchange_trade_reports;
            case 7: return Derivatives_On_Exchange_Off_book;
            case 8: return ETF_MTF_NAV_Central_Order_Book;
            case 99: return Not_Applicable;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

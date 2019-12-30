/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum VolumeProtectforMM_enum
{
    Protection_for_Market_Makers_enabled_at_a_contract_level((short)0),

    Protection_for_MM_enabled_at_a_contract_and_expiry_level((short)1),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    VolumeProtectforMM_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static VolumeProtectforMM_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Protection_for_Market_Makers_enabled_at_a_contract_level;
            case 1: return Protection_for_MM_enabled_at_a_contract_and_expiry_level;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

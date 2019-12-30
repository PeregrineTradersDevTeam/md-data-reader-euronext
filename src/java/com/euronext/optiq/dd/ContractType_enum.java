/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum ContractType_enum
{
    Future((byte)70),

    Option((byte)79),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    ContractType_enum(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static ContractType_enum get(final byte value)
    {
        switch (value)
        {
            case 70: return Future;
            case 79: return Option;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

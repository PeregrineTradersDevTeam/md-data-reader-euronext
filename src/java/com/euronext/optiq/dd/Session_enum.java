/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

public enum Session_enum
{
    Session_0((short)0),

    Session_1((short)1),

    Session_2((short)2),

    Session_3((short)3),

    Session_4((short)4),

    Session_5((short)5),

    Session_6((short)6),

    Session_7((short)7),

    Session_8((short)8),

    Session_9((short)9),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    Session_enum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static Session_enum get(final short value)
    {
        switch (value)
        {
            case 0: return Session_0;
            case 1: return Session_1;
            case 2: return Session_2;
            case 3: return Session_3;
            case 4: return Session_4;
            case 5: return Session_5;
            case 6: return Session_6;
            case 7: return Session_7;
            case 8: return Session_8;
            case 9: return Session_9;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}

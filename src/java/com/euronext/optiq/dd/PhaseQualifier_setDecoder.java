/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class PhaseQualifier_setDecoder
{
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final int ENCODED_LENGTH = 2;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public PhaseQualifier_setDecoder wrap(final DirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public int encodedLength()
    {
        return ENCODED_LENGTH;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public boolean isEmpty()
    {
        return 0 == buffer.getShort(offset);
    }

    public boolean noQualifier()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 0));
    }

    public static boolean noQualifier(final short value)
    {
        return 0 != (value & (1 << 0));
    }

    public boolean callBBOOnly()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 1));
    }

    public static boolean callBBOOnly(final short value)
    {
        return 0 != (value & (1 << 1));
    }

    public boolean tradingAtLast()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 2));
    }

    public static boolean tradingAtLast(final short value)
    {
        return 0 != (value & (1 << 2));
    }

    public boolean randomUncrossing()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 3));
    }

    public static boolean randomUncrossing(final short value)
    {
        return 0 != (value & (1 << 3));
    }

    public boolean suspended()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 4));
    }

    public static boolean suspended(final short value)
    {
        return 0 != (value & (1 << 4));
    }

    public boolean wholesaleAllowed()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 5));
    }

    public static boolean wholesaleAllowed(final short value)
    {
        return 0 != (value & (1 << 5));
    }

    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        builder.append('{');
        boolean atLeastOne = false;
        if (noQualifier())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("noQualifier");
            atLeastOne = true;
        }
        if (callBBOOnly())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("callBBOOnly");
            atLeastOne = true;
        }
        if (tradingAtLast())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("tradingAtLast");
            atLeastOne = true;
        }
        if (randomUncrossing())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("randomUncrossing");
            atLeastOne = true;
        }
        if (suspended())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("suspended");
            atLeastOne = true;
        }
        if (wholesaleAllowed())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("wholesaleAllowed");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}

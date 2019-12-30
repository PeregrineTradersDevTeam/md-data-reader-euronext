/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class OrderTypeRules_setDecoder
{
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final int ENCODED_LENGTH = 2;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public OrderTypeRules_setDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public boolean market()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 0));
    }

    public static boolean market(final short value)
    {
        return 0 != (value & (1 << 0));
    }

    public boolean limit()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 1));
    }

    public static boolean limit(final short value)
    {
        return 0 != (value & (1 << 1));
    }

    public boolean stopStopLoss()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 2));
    }

    public static boolean stopStopLoss(final short value)
    {
        return 0 != (value & (1 << 2));
    }

    public boolean stopLimit()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 3));
    }

    public static boolean stopLimit(final short value)
    {
        return 0 != (value & (1 << 3));
    }

    public boolean marketOnOpenMOO()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 4));
    }

    public static boolean marketOnOpenMOO(final short value)
    {
        return 0 != (value & (1 << 4));
    }

    public boolean tradeAtSettlement()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 5));
    }

    public static boolean tradeAtSettlement(final short value)
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
        if (market())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("market");
            atLeastOne = true;
        }
        if (limit())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("limit");
            atLeastOne = true;
        }
        if (stopStopLoss())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("stopStopLoss");
            atLeastOne = true;
        }
        if (stopLimit())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("stopLimit");
            atLeastOne = true;
        }
        if (marketOnOpenMOO())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("marketOnOpenMOO");
            atLeastOne = true;
        }
        if (tradeAtSettlement())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("tradeAtSettlement");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}

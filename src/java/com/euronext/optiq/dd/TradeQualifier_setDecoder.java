/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class TradeQualifier_setDecoder
{
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final int ENCODED_LENGTH = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public TradeQualifier_setDecoder wrap(final DirectBuffer buffer, final int offset)
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
        return 0 == buffer.getByte(offset);
    }

    public boolean uncrossingTrade()
    {
        return 0 != (buffer.getByte(offset) & (1 << 0));
    }

    public static boolean uncrossingTrade(final byte value)
    {
        return 0 != (value & (1 << 0));
    }

    public boolean firstTradePrice()
    {
        return 0 != (buffer.getByte(offset) & (1 << 1));
    }

    public static boolean firstTradePrice(final byte value)
    {
        return 0 != (value & (1 << 1));
    }

    public boolean passiveOrder()
    {
        return 0 != (buffer.getByte(offset) & (1 << 2));
    }

    public static boolean passiveOrder(final byte value)
    {
        return 0 != (value & (1 << 2));
    }

    public boolean aggressiveOrder()
    {
        return 0 != (buffer.getByte(offset) & (1 << 3));
    }

    public static boolean aggressiveOrder(final byte value)
    {
        return 0 != (value & (1 << 3));
    }

    public boolean tradeCreationByMarketOperations()
    {
        return 0 != (buffer.getByte(offset) & (1 << 4));
    }

    public static boolean tradeCreationByMarketOperations(final byte value)
    {
        return 0 != (value & (1 << 4));
    }

    public boolean nAVTradeExpressedInBps()
    {
        return 0 != (buffer.getByte(offset) & (1 << 5));
    }

    public static boolean nAVTradeExpressedInBps(final byte value)
    {
        return 0 != (value & (1 << 5));
    }

    public boolean nAVTradeExpressedInPriceCurrency()
    {
        return 0 != (buffer.getByte(offset) & (1 << 6));
    }

    public static boolean nAVTradeExpressedInPriceCurrency(final byte value)
    {
        return 0 != (value & (1 << 6));
    }

    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        builder.append('{');
        boolean atLeastOne = false;
        if (uncrossingTrade())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("uncrossingTrade");
            atLeastOne = true;
        }
        if (firstTradePrice())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("firstTradePrice");
            atLeastOne = true;
        }
        if (passiveOrder())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("passiveOrder");
            atLeastOne = true;
        }
        if (aggressiveOrder())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("aggressiveOrder");
            atLeastOne = true;
        }
        if (tradeCreationByMarketOperations())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("tradeCreationByMarketOperations");
            atLeastOne = true;
        }
        if (nAVTradeExpressedInBps())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("nAVTradeExpressedInBps");
            atLeastOne = true;
        }
        if (nAVTradeExpressedInPriceCurrency())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("nAVTradeExpressedInPriceCurrency");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}

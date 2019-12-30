/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class AvailableWholesaleTradeType_setDecoder
{
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final int ENCODED_LENGTH = 4;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public AvailableWholesaleTradeType_setDecoder wrap(final DirectBuffer buffer, final int offset)
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
        return 0 == buffer.getInt(offset);
    }

    public boolean largeInScaleTradeFormerlyBlockTrade()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 0));
    }

    public static boolean largeInScaleTradeFormerlyBlockTrade(final int value)
    {
        return 0 != (value & (1 << 0));
    }

    public boolean basisTrade()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 1));
    }

    public static boolean basisTrade(final int value)
    {
        return 0 != (value & (1 << 1));
    }

    public boolean againstActual()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 2));
    }

    public static boolean againstActual(final int value)
    {
        return 0 != (value & (1 << 2));
    }

    public boolean assetAllocation()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 3));
    }

    public static boolean assetAllocation(final int value)
    {
        return 0 != (value & (1 << 3));
    }

    public boolean largeInScalePackageTrade()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 4));
    }

    public static boolean largeInScalePackageTrade(final int value)
    {
        return 0 != (value & (1 << 4));
    }

    public boolean guaranteedCrossTrade()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 5));
    }

    public static boolean guaranteedCrossTrade(final int value)
    {
        return 0 != (value & (1 << 5));
    }

    public boolean exchangeForSwap()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 6));
    }

    public static boolean exchangeForSwap(final int value)
    {
        return 0 != (value & (1 << 6));
    }

    public boolean requestForCross()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 7));
    }

    public static boolean requestForCross(final int value)
    {
        return 0 != (value & (1 << 7));
    }

    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        builder.append('{');
        boolean atLeastOne = false;
        if (largeInScaleTradeFormerlyBlockTrade())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("largeInScaleTradeFormerlyBlockTrade");
            atLeastOne = true;
        }
        if (basisTrade())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("basisTrade");
            atLeastOne = true;
        }
        if (againstActual())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("againstActual");
            atLeastOne = true;
        }
        if (assetAllocation())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("assetAllocation");
            atLeastOne = true;
        }
        if (largeInScalePackageTrade())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("largeInScalePackageTrade");
            atLeastOne = true;
        }
        if (guaranteedCrossTrade())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("guaranteedCrossTrade");
            atLeastOne = true;
        }
        if (exchangeForSwap())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("exchangeForSwap");
            atLeastOne = true;
        }
        if (requestForCross())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("requestForCross");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}

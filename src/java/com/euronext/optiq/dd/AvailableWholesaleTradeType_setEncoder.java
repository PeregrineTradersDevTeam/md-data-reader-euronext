/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class AvailableWholesaleTradeType_setEncoder
{
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final int ENCODED_LENGTH = 4;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public AvailableWholesaleTradeType_setEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public MutableDirectBuffer buffer()
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

    public AvailableWholesaleTradeType_setEncoder clear()
    {
        buffer.putInt(offset, (int)0L, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public AvailableWholesaleTradeType_setEncoder largeInScaleTradeFormerlyBlockTrade(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 0) : bits & ~(1 << 0);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int largeInScaleTradeFormerlyBlockTrade(final int bits, final boolean value)
    {
        return value ? bits | (1 << 0) : bits & ~(1 << 0);
    }

    public AvailableWholesaleTradeType_setEncoder basisTrade(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 1) : bits & ~(1 << 1);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int basisTrade(final int bits, final boolean value)
    {
        return value ? bits | (1 << 1) : bits & ~(1 << 1);
    }

    public AvailableWholesaleTradeType_setEncoder againstActual(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 2) : bits & ~(1 << 2);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int againstActual(final int bits, final boolean value)
    {
        return value ? bits | (1 << 2) : bits & ~(1 << 2);
    }

    public AvailableWholesaleTradeType_setEncoder assetAllocation(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 3) : bits & ~(1 << 3);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int assetAllocation(final int bits, final boolean value)
    {
        return value ? bits | (1 << 3) : bits & ~(1 << 3);
    }

    public AvailableWholesaleTradeType_setEncoder largeInScalePackageTrade(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 4) : bits & ~(1 << 4);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int largeInScalePackageTrade(final int bits, final boolean value)
    {
        return value ? bits | (1 << 4) : bits & ~(1 << 4);
    }

    public AvailableWholesaleTradeType_setEncoder guaranteedCrossTrade(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 5) : bits & ~(1 << 5);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int guaranteedCrossTrade(final int bits, final boolean value)
    {
        return value ? bits | (1 << 5) : bits & ~(1 << 5);
    }

    public AvailableWholesaleTradeType_setEncoder exchangeForSwap(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 6) : bits & ~(1 << 6);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int exchangeForSwap(final int bits, final boolean value)
    {
        return value ? bits | (1 << 6) : bits & ~(1 << 6);
    }

    public AvailableWholesaleTradeType_setEncoder requestForCross(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 7) : bits & ~(1 << 7);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int requestForCross(final int bits, final boolean value)
    {
        return value ? bits | (1 << 7) : bits & ~(1 << 7);
    }
}

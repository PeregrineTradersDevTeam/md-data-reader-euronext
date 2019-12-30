/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class TradeQualifier_setEncoder
{
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final int ENCODED_LENGTH = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public TradeQualifier_setEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public TradeQualifier_setEncoder clear()
    {
        buffer.putByte(offset, (byte)(short)0);
        return this;
    }

    public TradeQualifier_setEncoder uncrossingTrade(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 0) : bits & ~(1 << 0));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte uncrossingTrade(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 0) : bits & ~(1 << 0));
    }

    public TradeQualifier_setEncoder firstTradePrice(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 1) : bits & ~(1 << 1));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte firstTradePrice(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 1) : bits & ~(1 << 1));
    }

    public TradeQualifier_setEncoder passiveOrder(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 2) : bits & ~(1 << 2));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte passiveOrder(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 2) : bits & ~(1 << 2));
    }

    public TradeQualifier_setEncoder aggressiveOrder(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 3) : bits & ~(1 << 3));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte aggressiveOrder(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 3) : bits & ~(1 << 3));
    }

    public TradeQualifier_setEncoder tradeCreationByMarketOperations(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 4) : bits & ~(1 << 4));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte tradeCreationByMarketOperations(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 4) : bits & ~(1 << 4));
    }

    public TradeQualifier_setEncoder nAVTradeExpressedInBps(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 5) : bits & ~(1 << 5));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte nAVTradeExpressedInBps(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 5) : bits & ~(1 << 5));
    }

    public TradeQualifier_setEncoder nAVTradeExpressedInPriceCurrency(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 6) : bits & ~(1 << 6));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte nAVTradeExpressedInPriceCurrency(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 6) : bits & ~(1 << 6));
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class OrderTypeRules_setEncoder
{
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final int ENCODED_LENGTH = 2;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public OrderTypeRules_setEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public OrderTypeRules_setEncoder clear()
    {
        buffer.putShort(offset, (short)0, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public OrderTypeRules_setEncoder market(final boolean value)
    {
        short bits = buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = (short)(value ? bits | (1 << 0) : bits & ~(1 << 0));
        buffer.putShort(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static short market(final short bits, final boolean value)
    {
        return (short)(value ? bits | (1 << 0) : bits & ~(1 << 0));
    }

    public OrderTypeRules_setEncoder limit(final boolean value)
    {
        short bits = buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = (short)(value ? bits | (1 << 1) : bits & ~(1 << 1));
        buffer.putShort(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static short limit(final short bits, final boolean value)
    {
        return (short)(value ? bits | (1 << 1) : bits & ~(1 << 1));
    }

    public OrderTypeRules_setEncoder stopStopLoss(final boolean value)
    {
        short bits = buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = (short)(value ? bits | (1 << 2) : bits & ~(1 << 2));
        buffer.putShort(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static short stopStopLoss(final short bits, final boolean value)
    {
        return (short)(value ? bits | (1 << 2) : bits & ~(1 << 2));
    }

    public OrderTypeRules_setEncoder stopLimit(final boolean value)
    {
        short bits = buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = (short)(value ? bits | (1 << 3) : bits & ~(1 << 3));
        buffer.putShort(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static short stopLimit(final short bits, final boolean value)
    {
        return (short)(value ? bits | (1 << 3) : bits & ~(1 << 3));
    }

    public OrderTypeRules_setEncoder marketOnOpenMOO(final boolean value)
    {
        short bits = buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = (short)(value ? bits | (1 << 4) : bits & ~(1 << 4));
        buffer.putShort(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static short marketOnOpenMOO(final short bits, final boolean value)
    {
        return (short)(value ? bits | (1 << 4) : bits & ~(1 << 4));
    }

    public OrderTypeRules_setEncoder tradeAtSettlement(final boolean value)
    {
        short bits = buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = (short)(value ? bits | (1 << 5) : bits & ~(1 << 5));
        buffer.putShort(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static short tradeAtSettlement(final short bits, final boolean value)
    {
        return (short)(value ? bits | (1 << 5) : bits & ~(1 << 5));
    }
}

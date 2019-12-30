/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class OrderUpdateEncoder
{
    public static final int BLOCK_LENGTH = 18;
    public static final int TEMPLATE_ID = 1002;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final OrderUpdateEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
    protected int offset;
    protected int limit;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public OrderUpdateEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public OrderUpdateEncoder wrapAndApplyHeader(
        final MutableDirectBuffer buffer, final int offset, final MessageHeaderEncoder headerEncoder)
    {
        headerEncoder
            .wrap(buffer, offset)
            .blockLength(BLOCK_LENGTH)
            .templateId(TEMPLATE_ID)
            .schemaId(SCHEMA_ID)
            .version(SCHEMA_VERSION);

        return wrap(buffer, offset + MessageHeaderEncoder.ENCODED_LENGTH);
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int mDSeqNumId()
    {
        return 1;
    }

    public static int mDSeqNumSinceVersion()
    {
        return 0;
    }

    public static int mDSeqNumEncodingOffset()
    {
        return 0;
    }

    public static int mDSeqNumEncodingLength()
    {
        return 8;
    }

    public static String mDSeqNumMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long mDSeqNumNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long mDSeqNumMinValue()
    {
        return 0x0L;
    }

    public static long mDSeqNumMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderUpdateEncoder mDSeqNum(final long value)
    {
        buffer.putLong(offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int rebroadcastIndicatorId()
    {
        return 2;
    }

    public static int rebroadcastIndicatorSinceVersion()
    {
        return 0;
    }

    public static int rebroadcastIndicatorEncodingOffset()
    {
        return 8;
    }

    public static int rebroadcastIndicatorEncodingLength()
    {
        return 1;
    }

    public static String rebroadcastIndicatorMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short rebroadcastIndicatorNullValue()
    {
        return (short)255;
    }

    public static short rebroadcastIndicatorMinValue()
    {
        return (short)0;
    }

    public static short rebroadcastIndicatorMaxValue()
    {
        return (short)254;
    }

    public OrderUpdateEncoder rebroadcastIndicator(final short value)
    {
        buffer.putByte(offset + 8, (byte)value);
        return this;
    }


    public static int eMMId()
    {
        return 3;
    }

    public static int eMMSinceVersion()
    {
        return 0;
    }

    public static int eMMEncodingOffset()
    {
        return 9;
    }

    public static int eMMEncodingLength()
    {
        return 1;
    }

    public static String eMMMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "required";
        }

        return "";
    }

    public OrderUpdateEncoder eMM(final EMM_enum value)
    {
        buffer.putByte(offset + 9, (byte)value.value());
        return this;
    }

    public static int eventTimeId()
    {
        return 4;
    }

    public static int eventTimeSinceVersion()
    {
        return 0;
    }

    public static int eventTimeEncodingOffset()
    {
        return 10;
    }

    public static int eventTimeEncodingLength()
    {
        return 8;
    }

    public static String eventTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long eventTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long eventTimeMinValue()
    {
        return 0x0L;
    }

    public static long eventTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderUpdateEncoder eventTime(final long value)
    {
        buffer.putLong(offset + 10, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    private final OrdersEncoder orders = new OrdersEncoder(this);

    public static long ordersId()
    {
        return 5;
    }

    public OrdersEncoder ordersCount(final int count)
    {
        orders.wrap(buffer, count);
        return orders;
    }

    public static class OrdersEncoder
    {
        public static final int HEADER_SIZE = 2;
        private final OrderUpdateEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;

        OrdersEncoder(final OrderUpdateEncoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 254)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = -1;
            this.count = count;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            buffer.putByte(limit + 0, (byte)(short)40);
            buffer.putByte(limit + 1, (byte)(short)count);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 40;
        }

        public OrdersEncoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + sbeBlockLength());
            ++index;

            return this;
        }

        public static int symbolIndexId()
        {
            return 1;
        }

        public static int symbolIndexSinceVersion()
        {
            return 0;
        }

        public static int symbolIndexEncodingOffset()
        {
            return 0;
        }

        public static int symbolIndexEncodingLength()
        {
            return 4;
        }

        public static String symbolIndexMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public static long symbolIndexNullValue()
        {
            return 4294967295L;
        }

        public static long symbolIndexMinValue()
        {
            return 0L;
        }

        public static long symbolIndexMaxValue()
        {
            return 4294967294L;
        }

        public OrdersEncoder symbolIndex(final long value)
        {
            buffer.putInt(offset + 0, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int actionTypeId()
        {
            return 2;
        }

        public static int actionTypeSinceVersion()
        {
            return 0;
        }

        public static int actionTypeEncodingOffset()
        {
            return 4;
        }

        public static int actionTypeEncodingLength()
        {
            return 1;
        }

        public static String actionTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "required";
            }

            return "";
        }

        public OrdersEncoder actionType(final MarketDataActionType_enum value)
        {
            buffer.putByte(offset + 4, (byte)value.value());
            return this;
        }

        public static int orderPriorityId()
        {
            return 3;
        }

        public static int orderPrioritySinceVersion()
        {
            return 0;
        }

        public static int orderPriorityEncodingOffset()
        {
            return 5;
        }

        public static int orderPriorityEncodingLength()
        {
            return 8;
        }

        public static String orderPriorityMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public static long orderPriorityNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long orderPriorityMinValue()
        {
            return 0x0L;
        }

        public static long orderPriorityMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public OrdersEncoder orderPriority(final long value)
        {
            buffer.putLong(offset + 5, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int previousPriorityId()
        {
            return 4;
        }

        public static int previousPrioritySinceVersion()
        {
            return 0;
        }

        public static int previousPriorityEncodingOffset()
        {
            return 13;
        }

        public static int previousPriorityEncodingLength()
        {
            return 8;
        }

        public static String previousPriorityMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public static long previousPriorityNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long previousPriorityMinValue()
        {
            return 0x0L;
        }

        public static long previousPriorityMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public OrdersEncoder previousPriority(final long value)
        {
            buffer.putLong(offset + 13, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int orderTypeId()
        {
            return 5;
        }

        public static int orderTypeSinceVersion()
        {
            return 0;
        }

        public static int orderTypeEncodingOffset()
        {
            return 21;
        }

        public static int orderTypeEncodingLength()
        {
            return 1;
        }

        public static String orderTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public OrdersEncoder orderType(final OrderType_enum value)
        {
            buffer.putByte(offset + 21, (byte)value.value());
            return this;
        }

        public static int orderPxId()
        {
            return 6;
        }

        public static int orderPxSinceVersion()
        {
            return 0;
        }

        public static int orderPxEncodingOffset()
        {
            return 22;
        }

        public static int orderPxEncodingLength()
        {
            return 8;
        }

        public static String orderPxMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public static long orderPxNullValue()
        {
            return -9223372036854775808L;
        }

        public static long orderPxMinValue()
        {
            return -9223372036854775807L;
        }

        public static long orderPxMaxValue()
        {
            return 9223372036854775807L;
        }

        public OrdersEncoder orderPx(final long value)
        {
            buffer.putLong(offset + 22, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int orderSideId()
        {
            return 7;
        }

        public static int orderSideSinceVersion()
        {
            return 0;
        }

        public static int orderSideEncodingOffset()
        {
            return 30;
        }

        public static int orderSideEncodingLength()
        {
            return 1;
        }

        public static String orderSideMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public OrdersEncoder orderSide(final OrderSide_enum value)
        {
            buffer.putByte(offset + 30, (byte)value.value());
            return this;
        }

        public static int orderQuantityId()
        {
            return 8;
        }

        public static int orderQuantitySinceVersion()
        {
            return 0;
        }

        public static int orderQuantityEncodingOffset()
        {
            return 31;
        }

        public static int orderQuantityEncodingLength()
        {
            return 8;
        }

        public static String orderQuantityMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public static long orderQuantityNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long orderQuantityMinValue()
        {
            return 0x0L;
        }

        public static long orderQuantityMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public OrdersEncoder orderQuantity(final long value)
        {
            buffer.putLong(offset + 31, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int pegOffsetId()
        {
            return 9;
        }

        public static int pegOffsetSinceVersion()
        {
            return 0;
        }

        public static int pegOffsetEncodingOffset()
        {
            return 39;
        }

        public static int pegOffsetEncodingLength()
        {
            return 1;
        }

        public static String pegOffsetMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public static byte pegOffsetNullValue()
        {
            return (byte)-128;
        }

        public static byte pegOffsetMinValue()
        {
            return (byte)-127;
        }

        public static byte pegOffsetMaxValue()
        {
            return (byte)127;
        }

        public OrdersEncoder pegOffset(final byte value)
        {
            buffer.putByte(offset + 39, value);
            return this;
        }

    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        OrderUpdateDecoder writer = new OrderUpdateDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

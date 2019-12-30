/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class OrderUpdateDecoder
{
    public static final int BLOCK_LENGTH = 18;
    public static final int TEMPLATE_ID = 1002;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final OrderUpdateDecoder parentMessage = this;
    private DirectBuffer buffer;
    protected int offset;
    protected int limit;
    protected int actingBlockLength;
    protected int actingVersion;

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

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public OrderUpdateDecoder wrap(
        final DirectBuffer buffer, final int offset, final int actingBlockLength, final int actingVersion)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
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

    public long mDSeqNum()
    {
        return buffer.getLong(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public short rebroadcastIndicator()
    {
        return ((short)(buffer.getByte(offset + 8) & 0xFF));
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

    public EMM_enum eMM()
    {
        return EMM_enum.get(((short)(buffer.getByte(offset + 9) & 0xFF)));
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

    public long eventTime()
    {
        return buffer.getLong(offset + 10, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    private final OrdersDecoder orders = new OrdersDecoder(this);

    public static long ordersDecoderId()
    {
        return 5;
    }

    public static int ordersDecoderSinceVersion()
    {
        return 0;
    }

    public OrdersDecoder orders()
    {
        orders.wrap(buffer);
        return orders;
    }

    public static class OrdersDecoder
        implements Iterable<OrdersDecoder>, java.util.Iterator<OrdersDecoder>
    {
        public static final int HEADER_SIZE = 2;
        private final OrderUpdateDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        OrdersDecoder(final OrderUpdateDecoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final DirectBuffer buffer)
        {
            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }
            index = -1;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            blockLength = (int)((short)(buffer.getByte(limit + 0) & 0xFF));
            count = (int)((short)(buffer.getByte(limit + 1) & 0xFF));
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 40;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<OrdersDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return (index + 1) < count;
        }

        public OrdersDecoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
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

        public long symbolIndex()
        {
            return (buffer.getInt(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

        public MarketDataActionType_enum actionType()
        {
            return MarketDataActionType_enum.get(((short)(buffer.getByte(offset + 4) & 0xFF)));
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

        public long orderPriority()
        {
            return buffer.getLong(offset + 5, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        public long previousPriority()
        {
            return buffer.getLong(offset + 13, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        public OrderType_enum orderType()
        {
            return OrderType_enum.get(((short)(buffer.getByte(offset + 21) & 0xFF)));
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

        public long orderPx()
        {
            return buffer.getLong(offset + 22, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        public OrderSide_enum orderSide()
        {
            return OrderSide_enum.get(((short)(buffer.getByte(offset + 30) & 0xFF)));
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

        public long orderQuantity()
        {
            return buffer.getLong(offset + 31, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        public byte pegOffset()
        {
            return buffer.getByte(offset + 39);
        }



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='symbolIndex', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("symbolIndex=");
            builder.append(symbolIndex());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='actionType', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=1, offset=4, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='MarketDataActionType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=4, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("actionType=");
            builder.append(actionType());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='orderPriority', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=8, offset=5, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=5, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("orderPriority=");
            builder.append(orderPriority());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='previousPriority', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=8, offset=13, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=13, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("previousPriority=");
            builder.append(previousPriority());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='orderType', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=1, offset=21, componentTokenCount=14, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='OrderType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=21, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("orderType=");
            builder.append(orderType());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='orderPx', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=8, offset=22, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=22, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("orderPx=");
            builder.append(orderPx());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='orderSide', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=1, offset=30, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='OrderSide_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=30, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("orderSide=");
            builder.append(orderSide());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='orderQuantity', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=8, offset=31, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=31, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("orderQuantity=");
            builder.append(orderQuantity());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='pegOffset', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=1, offset=39, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='int8_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=39, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT8, byteOrder=LITTLE_ENDIAN, minValue=-127, maxValue=127, nullValue=-128, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("pegOffset=");
            builder.append(pegOffset());
            builder.append(')');
            return builder;
        }
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[OrderUpdate](sbeTemplateId=");
        builder.append(TEMPLATE_ID);
        builder.append("|sbeSchemaId=");
        builder.append(SCHEMA_ID);
        builder.append("|sbeSchemaVersion=");
        if (parentMessage.actingVersion != SCHEMA_VERSION)
        {
            builder.append(parentMessage.actingVersion);
            builder.append('/');
        }
        builder.append(SCHEMA_VERSION);
        builder.append("|sbeBlockLength=");
        if (actingBlockLength != BLOCK_LENGTH)
        {
            builder.append(actingBlockLength);
            builder.append('/');
        }
        builder.append(BLOCK_LENGTH);
        builder.append("):");
        //Token{signal=BEGIN_FIELD, name='mDSeqNum', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=8, offset=0, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=0, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mDSeqNum=");
        builder.append(mDSeqNum());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='rebroadcastIndicator', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=1, offset=8, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=8, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("rebroadcastIndicator=");
        builder.append(rebroadcastIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='eMM', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=1, offset=9, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EMM_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=9, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("eMM=");
        builder.append(eMM());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='eventTime', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=8, offset=10, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=10, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("eventTime=");
        builder.append(eventTime());
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='Orders', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=40, offset=18, componentTokenCount=55, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("orders=[");
        OrdersDecoder orders = orders();
        if (orders.count() > 0)
        {
            while (orders.hasNext())
            {
                orders.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}

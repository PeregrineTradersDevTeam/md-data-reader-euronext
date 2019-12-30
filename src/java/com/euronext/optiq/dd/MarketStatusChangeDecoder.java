/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class MarketStatusChangeDecoder
{
    public static final int BLOCK_LENGTH = 10;
    public static final int TEMPLATE_ID = 1005;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MarketStatusChangeDecoder parentMessage = this;
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

    public MarketStatusChangeDecoder wrap(
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


    private final MarketStatesDecoder marketStates = new MarketStatesDecoder(this);

    public static long marketStatesDecoderId()
    {
        return 4;
    }

    public static int marketStatesDecoderSinceVersion()
    {
        return 0;
    }

    public MarketStatesDecoder marketStates()
    {
        marketStates.wrap(buffer);
        return marketStates;
    }

    public static class MarketStatesDecoder
        implements Iterable<MarketStatesDecoder>, java.util.Iterator<MarketStatesDecoder>
    {
        public static final int HEADER_SIZE = 2;
        private final MarketStatusChangeDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        MarketStatesDecoder(final MarketStatusChangeDecoder parentMessage)
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
            return 32;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<MarketStatesDecoder> iterator()
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

        public MarketStatesDecoder next()
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

        public static int changeTypeId()
        {
            return 1;
        }

        public static int changeTypeSinceVersion()
        {
            return 0;
        }

        public static int changeTypeEncodingOffset()
        {
            return 0;
        }

        public static int changeTypeEncodingLength()
        {
            return 1;
        }

        public static String changeTypeMetaAttribute(final MetaAttribute metaAttribute)
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

        public MarketDataChangeType_enum changeType()
        {
            return MarketDataChangeType_enum.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
        }


        public static int symbolIndexId()
        {
            return 2;
        }

        public static int symbolIndexSinceVersion()
        {
            return 0;
        }

        public static int symbolIndexEncodingOffset()
        {
            return 1;
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
            return (buffer.getInt(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
        }


        public static int eventTimeId()
        {
            return 3;
        }

        public static int eventTimeSinceVersion()
        {
            return 0;
        }

        public static int eventTimeEncodingOffset()
        {
            return 5;
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
            return buffer.getLong(offset + 5, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int bookStateId()
        {
            return 4;
        }

        public static int bookStateSinceVersion()
        {
            return 0;
        }

        public static int bookStateEncodingOffset()
        {
            return 13;
        }

        public static int bookStateEncodingLength()
        {
            return 1;
        }

        public static String bookStateMetaAttribute(final MetaAttribute metaAttribute)
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

        public BookState_enum bookState()
        {
            return BookState_enum.get(((short)(buffer.getByte(offset + 13) & 0xFF)));
        }


        public static int statusReasonId()
        {
            return 5;
        }

        public static int statusReasonSinceVersion()
        {
            return 0;
        }

        public static int statusReasonEncodingOffset()
        {
            return 14;
        }

        public static int statusReasonEncodingLength()
        {
            return 1;
        }

        public static String statusReasonMetaAttribute(final MetaAttribute metaAttribute)
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

        public StatusReason_enum statusReason()
        {
            return StatusReason_enum.get(((short)(buffer.getByte(offset + 14) & 0xFF)));
        }


        public static int phaseQualifierId()
        {
            return 6;
        }

        public static int phaseQualifierSinceVersion()
        {
            return 0;
        }

        public static int phaseQualifierEncodingOffset()
        {
            return 15;
        }

        public static int phaseQualifierEncodingLength()
        {
            return 2;
        }

        public static String phaseQualifierMetaAttribute(final MetaAttribute metaAttribute)
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

        private final PhaseQualifier_setDecoder phaseQualifier = new PhaseQualifier_setDecoder();

        public PhaseQualifier_setDecoder phaseQualifier()
        {
            phaseQualifier.wrap(buffer, offset + 15);
            return phaseQualifier;
        }

        public static int tradingPeriodId()
        {
            return 7;
        }

        public static int tradingPeriodSinceVersion()
        {
            return 0;
        }

        public static int tradingPeriodEncodingOffset()
        {
            return 17;
        }

        public static int tradingPeriodEncodingLength()
        {
            return 1;
        }

        public static String tradingPeriodMetaAttribute(final MetaAttribute metaAttribute)
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

        public TradingPeriod_enum tradingPeriod()
        {
            return TradingPeriod_enum.get(((short)(buffer.getByte(offset + 17) & 0xFF)));
        }


        public static int tradingSideId()
        {
            return 8;
        }

        public static int tradingSideSinceVersion()
        {
            return 0;
        }

        public static int tradingSideEncodingOffset()
        {
            return 18;
        }

        public static int tradingSideEncodingLength()
        {
            return 1;
        }

        public static String tradingSideMetaAttribute(final MetaAttribute metaAttribute)
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

        public TradingSide_enum tradingSide()
        {
            return TradingSide_enum.get(((short)(buffer.getByte(offset + 18) & 0xFF)));
        }


        public static int priceLimitsId()
        {
            return 9;
        }

        public static int priceLimitsSinceVersion()
        {
            return 0;
        }

        public static int priceLimitsEncodingOffset()
        {
            return 19;
        }

        public static int priceLimitsEncodingLength()
        {
            return 1;
        }

        public static String priceLimitsMetaAttribute(final MetaAttribute metaAttribute)
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

        public PriceLimits_enum priceLimits()
        {
            return PriceLimits_enum.get(((short)(buffer.getByte(offset + 19) & 0xFF)));
        }


        public static int quoteSpreadMultiplierId()
        {
            return 10;
        }

        public static int quoteSpreadMultiplierSinceVersion()
        {
            return 0;
        }

        public static int quoteSpreadMultiplierEncodingOffset()
        {
            return 20;
        }

        public static int quoteSpreadMultiplierEncodingLength()
        {
            return 1;
        }

        public static String quoteSpreadMultiplierMetaAttribute(final MetaAttribute metaAttribute)
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

        public QuoteSpreadMultiplier_enum quoteSpreadMultiplier()
        {
            return QuoteSpreadMultiplier_enum.get(((short)(buffer.getByte(offset + 20) & 0xFF)));
        }


        public static int orderEntryQualifierId()
        {
            return 11;
        }

        public static int orderEntryQualifierSinceVersion()
        {
            return 0;
        }

        public static int orderEntryQualifierEncodingOffset()
        {
            return 21;
        }

        public static int orderEntryQualifierEncodingLength()
        {
            return 1;
        }

        public static String orderEntryQualifierMetaAttribute(final MetaAttribute metaAttribute)
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

        public OrderEntryQualifier_enum orderEntryQualifier()
        {
            return OrderEntryQualifier_enum.get(((short)(buffer.getByte(offset + 21) & 0xFF)));
        }


        public static int sessionId()
        {
            return 12;
        }

        public static int sessionSinceVersion()
        {
            return 0;
        }

        public static int sessionEncodingOffset()
        {
            return 22;
        }

        public static int sessionEncodingLength()
        {
            return 1;
        }

        public static String sessionMetaAttribute(final MetaAttribute metaAttribute)
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

        public Session_enum session()
        {
            return Session_enum.get(((short)(buffer.getByte(offset + 22) & 0xFF)));
        }


        public static int scheduledEventId()
        {
            return 13;
        }

        public static int scheduledEventSinceVersion()
        {
            return 0;
        }

        public static int scheduledEventEncodingOffset()
        {
            return 23;
        }

        public static int scheduledEventEncodingLength()
        {
            return 1;
        }

        public static String scheduledEventMetaAttribute(final MetaAttribute metaAttribute)
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

        public ScheduledEvent_enum scheduledEvent()
        {
            return ScheduledEvent_enum.get(((short)(buffer.getByte(offset + 23) & 0xFF)));
        }


        public static int scheduledEventTimeId()
        {
            return 14;
        }

        public static int scheduledEventTimeSinceVersion()
        {
            return 0;
        }

        public static int scheduledEventTimeEncodingOffset()
        {
            return 24;
        }

        public static int scheduledEventTimeEncodingLength()
        {
            return 8;
        }

        public static String scheduledEventTimeMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long scheduledEventTimeNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long scheduledEventTimeMinValue()
        {
            return 0x0L;
        }

        public static long scheduledEventTimeMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public long scheduledEventTime()
        {
            return buffer.getLong(offset + 24, java.nio.ByteOrder.LITTLE_ENDIAN);
        }



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='changeType', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=7, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='MarketDataChangeType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("changeType=");
            builder.append(changeType());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='symbolIndex', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=4, offset=1, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=1, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("symbolIndex=");
            builder.append(symbolIndex());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='eventTime', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=8, offset=5, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=5, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("eventTime=");
            builder.append(eventTime());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='bookState', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=1, offset=13, componentTokenCount=13, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='BookState_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=13, componentTokenCount=11, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("bookState=");
            builder.append(bookState());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='statusReason', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=1, offset=14, componentTokenCount=17, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='StatusReason_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=14, componentTokenCount=15, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("statusReason=");
            builder.append(statusReason());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='phaseQualifier', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=2, offset=15, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_SET, name='PhaseQualifier_set', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=15, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("phaseQualifier=");
            builder.append(phaseQualifier());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='tradingPeriod', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=1, offset=17, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='TradingPeriod_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=17, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("tradingPeriod=");
            builder.append(tradingPeriod());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='tradingSide', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=1, offset=18, componentTokenCount=8, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='TradingSide_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=18, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("tradingSide=");
            builder.append(tradingSide());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='priceLimits', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=1, offset=19, componentTokenCount=8, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='PriceLimits_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=19, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("priceLimits=");
            builder.append(priceLimits());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='quoteSpreadMultiplier', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=1, offset=20, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='QuoteSpreadMultiplier_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=20, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("quoteSpreadMultiplier=");
            builder.append(quoteSpreadMultiplier());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='orderEntryQualifier', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=1, offset=21, componentTokenCount=8, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='OrderEntryQualifier_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=21, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("orderEntryQualifier=");
            builder.append(orderEntryQualifier());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='session', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=1, offset=22, componentTokenCount=14, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='Session_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=22, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("session=");
            builder.append(session());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='scheduledEvent', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=1, offset=23, componentTokenCount=16, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='ScheduledEvent_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=23, componentTokenCount=14, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("scheduledEvent=");
            builder.append(scheduledEvent());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='scheduledEventTime', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=8, offset=24, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=24, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("scheduledEventTime=");
            builder.append(scheduledEventTime());
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
        builder.append("[MarketStatusChange](sbeTemplateId=");
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
        //Token{signal=BEGIN_GROUP, name='MarketStates', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=32, offset=10, componentTokenCount=130, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("marketStates=[");
        MarketStatesDecoder marketStates = marketStates();
        if (marketStates.count() > 0)
        {
            while (marketStates.hasNext())
            {
                marketStates.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}

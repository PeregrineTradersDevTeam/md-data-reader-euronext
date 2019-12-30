/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class MarketStatusChangeEncoder
{
    public static final int BLOCK_LENGTH = 10;
    public static final int TEMPLATE_ID = 1005;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MarketStatusChangeEncoder parentMessage = this;
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

    public MarketStatusChangeEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public MarketStatusChangeEncoder wrapAndApplyHeader(
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

    public MarketStatusChangeEncoder mDSeqNum(final long value)
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

    public MarketStatusChangeEncoder rebroadcastIndicator(final short value)
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

    public MarketStatusChangeEncoder eMM(final EMM_enum value)
    {
        buffer.putByte(offset + 9, (byte)value.value());
        return this;
    }

    private final MarketStatesEncoder marketStates = new MarketStatesEncoder(this);

    public static long marketStatesId()
    {
        return 4;
    }

    public MarketStatesEncoder marketStatesCount(final int count)
    {
        marketStates.wrap(buffer, count);
        return marketStates;
    }

    public static class MarketStatesEncoder
    {
        public static final int HEADER_SIZE = 2;
        private final MarketStatusChangeEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;

        MarketStatesEncoder(final MarketStatusChangeEncoder parentMessage)
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
            buffer.putByte(limit + 0, (byte)(short)32);
            buffer.putByte(limit + 1, (byte)(short)count);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 32;
        }

        public MarketStatesEncoder next()
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

        public MarketStatesEncoder changeType(final MarketDataChangeType_enum value)
        {
            buffer.putByte(offset + 0, (byte)value.value());
            return this;
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

        public MarketStatesEncoder symbolIndex(final long value)
        {
            buffer.putInt(offset + 1, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
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

        public MarketStatesEncoder eventTime(final long value)
        {
            buffer.putLong(offset + 5, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
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

        public MarketStatesEncoder bookState(final BookState_enum value)
        {
            buffer.putByte(offset + 13, (byte)value.value());
            return this;
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

        public MarketStatesEncoder statusReason(final StatusReason_enum value)
        {
            buffer.putByte(offset + 14, (byte)value.value());
            return this;
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

        private final PhaseQualifier_setEncoder phaseQualifier = new PhaseQualifier_setEncoder();

        public PhaseQualifier_setEncoder phaseQualifier()
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

        public MarketStatesEncoder tradingPeriod(final TradingPeriod_enum value)
        {
            buffer.putByte(offset + 17, (byte)value.value());
            return this;
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

        public MarketStatesEncoder tradingSide(final TradingSide_enum value)
        {
            buffer.putByte(offset + 18, (byte)value.value());
            return this;
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

        public MarketStatesEncoder priceLimits(final PriceLimits_enum value)
        {
            buffer.putByte(offset + 19, (byte)value.value());
            return this;
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

        public MarketStatesEncoder quoteSpreadMultiplier(final QuoteSpreadMultiplier_enum value)
        {
            buffer.putByte(offset + 20, (byte)value.value());
            return this;
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

        public MarketStatesEncoder orderEntryQualifier(final OrderEntryQualifier_enum value)
        {
            buffer.putByte(offset + 21, (byte)value.value());
            return this;
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

        public MarketStatesEncoder session(final Session_enum value)
        {
            buffer.putByte(offset + 22, (byte)value.value());
            return this;
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

        public MarketStatesEncoder scheduledEvent(final ScheduledEvent_enum value)
        {
            buffer.putByte(offset + 23, (byte)value.value());
            return this;
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

        public MarketStatesEncoder scheduledEventTime(final long value)
        {
            buffer.putLong(offset + 24, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        MarketStatusChangeDecoder writer = new MarketStatusChangeDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

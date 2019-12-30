/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class TimetableEncoder
{
    public static final int BLOCK_LENGTH = 16;
    public static final int TEMPLATE_ID = 1006;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final TimetableEncoder parentMessage = this;
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

    public TimetableEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public TimetableEncoder wrapAndApplyHeader(
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

    public TimetableEncoder mDSeqNum(final long value)
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

    public TimetableEncoder rebroadcastIndicator(final short value)
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
            case PRESENCE: return "optional";
        }

        return "";
    }

    public TimetableEncoder eMM(final EMM_enum value)
    {
        buffer.putByte(offset + 9, (byte)value.value());
        return this;
    }

    public static int patternIDId()
    {
        return 4;
    }

    public static int patternIDSinceVersion()
    {
        return 0;
    }

    public static int patternIDEncodingOffset()
    {
        return 10;
    }

    public static int patternIDEncodingLength()
    {
        return 2;
    }

    public static String patternIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int patternIDNullValue()
    {
        return 65535;
    }

    public static int patternIDMinValue()
    {
        return 0;
    }

    public static int patternIDMaxValue()
    {
        return 65534;
    }

    public TimetableEncoder patternID(final int value)
    {
        buffer.putShort(offset + 10, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int symbolIndexId()
    {
        return 5;
    }

    public static int symbolIndexSinceVersion()
    {
        return 0;
    }

    public static int symbolIndexEncodingOffset()
    {
        return 12;
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

    public TimetableEncoder symbolIndex(final long value)
    {
        buffer.putInt(offset + 12, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    private final TimetablesEncoder timetables = new TimetablesEncoder(this);

    public static long timetablesId()
    {
        return 6;
    }

    public TimetablesEncoder timetablesCount(final int count)
    {
        timetables.wrap(buffer, count);
        return timetables;
    }

    public static class TimetablesEncoder
    {
        public static final int HEADER_SIZE = 2;
        private final TimetableEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;

        TimetablesEncoder(final TimetableEncoder parentMessage)
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
            buffer.putByte(limit + 0, (byte)(short)14);
            buffer.putByte(limit + 1, (byte)(short)count);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 14;
        }

        public TimetablesEncoder next()
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

        public static int phaseTimeId()
        {
            return 1;
        }

        public static int phaseTimeSinceVersion()
        {
            return 0;
        }

        public static int phaseTimeEncodingOffset()
        {
            return 0;
        }

        public static int phaseTimeEncodingLength()
        {
            return 8;
        }

        public static String phaseTimeMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long phaseTimeNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long phaseTimeMinValue()
        {
            return 0x0L;
        }

        public static long phaseTimeMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public TimetablesEncoder phaseTime(final long value)
        {
            buffer.putLong(offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int phaseIdId()
        {
            return 2;
        }

        public static int phaseIdSinceVersion()
        {
            return 0;
        }

        public static int phaseIdEncodingOffset()
        {
            return 8;
        }

        public static int phaseIdEncodingLength()
        {
            return 1;
        }

        public static String phaseIdMetaAttribute(final MetaAttribute metaAttribute)
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

        public TimetablesEncoder phaseId(final PhaseId_enum value)
        {
            buffer.putByte(offset + 8, (byte)value.value());
            return this;
        }

        public static int phaseQualifierId()
        {
            return 3;
        }

        public static int phaseQualifierSinceVersion()
        {
            return 0;
        }

        public static int phaseQualifierEncodingOffset()
        {
            return 9;
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
            phaseQualifier.wrap(buffer, offset + 9);
            return phaseQualifier;
        }

        public static int tradingPeriodId()
        {
            return 4;
        }

        public static int tradingPeriodSinceVersion()
        {
            return 0;
        }

        public static int tradingPeriodEncodingOffset()
        {
            return 11;
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
                case PRESENCE: return "required";
            }

            return "";
        }

        public TimetablesEncoder tradingPeriod(final TradingPeriod_enum value)
        {
            buffer.putByte(offset + 11, (byte)value.value());
            return this;
        }

        public static int orderEntryQualifierId()
        {
            return 5;
        }

        public static int orderEntryQualifierSinceVersion()
        {
            return 0;
        }

        public static int orderEntryQualifierEncodingOffset()
        {
            return 12;
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

        public TimetablesEncoder orderEntryQualifier(final OrderEntryQualifier_enum value)
        {
            buffer.putByte(offset + 12, (byte)value.value());
            return this;
        }

        public static int sessionId()
        {
            return 6;
        }

        public static int sessionSinceVersion()
        {
            return 0;
        }

        public static int sessionEncodingOffset()
        {
            return 13;
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

        public TimetablesEncoder session(final Session_enum value)
        {
            buffer.putByte(offset + 13, (byte)value.value());
            return this;
        }
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        TimetableDecoder writer = new TimetableDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

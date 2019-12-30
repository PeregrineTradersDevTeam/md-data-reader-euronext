/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class IndexSummaryEncoder
{
    public static final int BLOCK_LENGTH = 126;
    public static final int TEMPLATE_ID = 1011;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final IndexSummaryEncoder parentMessage = this;
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

    public IndexSummaryEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public IndexSummaryEncoder wrapAndApplyHeader(
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

    public IndexSummaryEncoder mDSeqNum(final long value)
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

    public IndexSummaryEncoder rebroadcastIndicator(final short value)
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

    public IndexSummaryEncoder eMM(final EMM_enum value)
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

    public IndexSummaryEncoder eventTime(final long value)
    {
        buffer.putLong(offset + 10, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        return 18;
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

    public IndexSummaryEncoder symbolIndex(final long value)
    {
        buffer.putInt(offset + 18, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int openingLevelId()
    {
        return 6;
    }

    public static int openingLevelSinceVersion()
    {
        return 0;
    }

    public static int openingLevelEncodingOffset()
    {
        return 22;
    }

    public static int openingLevelEncodingLength()
    {
        return 8;
    }

    public static String openingLevelMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long openingLevelNullValue()
    {
        return -9223372036854775808L;
    }

    public static long openingLevelMinValue()
    {
        return -9223372036854775807L;
    }

    public static long openingLevelMaxValue()
    {
        return 9223372036854775807L;
    }

    public IndexSummaryEncoder openingLevel(final long value)
    {
        buffer.putLong(offset + 22, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int openingTimeId()
    {
        return 7;
    }

    public static int openingTimeSinceVersion()
    {
        return 0;
    }

    public static int openingTimeEncodingOffset()
    {
        return 30;
    }

    public static int openingTimeEncodingLength()
    {
        return 8;
    }

    public static String openingTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long openingTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long openingTimeMinValue()
    {
        return 0x0L;
    }

    public static long openingTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public IndexSummaryEncoder openingTime(final long value)
    {
        buffer.putLong(offset + 30, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int confirmedReferenceLevelId()
    {
        return 8;
    }

    public static int confirmedReferenceLevelSinceVersion()
    {
        return 0;
    }

    public static int confirmedReferenceLevelEncodingOffset()
    {
        return 38;
    }

    public static int confirmedReferenceLevelEncodingLength()
    {
        return 8;
    }

    public static String confirmedReferenceLevelMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long confirmedReferenceLevelNullValue()
    {
        return -9223372036854775808L;
    }

    public static long confirmedReferenceLevelMinValue()
    {
        return -9223372036854775807L;
    }

    public static long confirmedReferenceLevelMaxValue()
    {
        return 9223372036854775807L;
    }

    public IndexSummaryEncoder confirmedReferenceLevel(final long value)
    {
        buffer.putLong(offset + 38, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int confirmedReferenceTimeId()
    {
        return 9;
    }

    public static int confirmedReferenceTimeSinceVersion()
    {
        return 0;
    }

    public static int confirmedReferenceTimeEncodingOffset()
    {
        return 46;
    }

    public static int confirmedReferenceTimeEncodingLength()
    {
        return 8;
    }

    public static String confirmedReferenceTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long confirmedReferenceTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long confirmedReferenceTimeMinValue()
    {
        return 0x0L;
    }

    public static long confirmedReferenceTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public IndexSummaryEncoder confirmedReferenceTime(final long value)
    {
        buffer.putLong(offset + 46, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int closingReferenceLevelId()
    {
        return 10;
    }

    public static int closingReferenceLevelSinceVersion()
    {
        return 0;
    }

    public static int closingReferenceLevelEncodingOffset()
    {
        return 54;
    }

    public static int closingReferenceLevelEncodingLength()
    {
        return 8;
    }

    public static String closingReferenceLevelMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long closingReferenceLevelNullValue()
    {
        return -9223372036854775808L;
    }

    public static long closingReferenceLevelMinValue()
    {
        return -9223372036854775807L;
    }

    public static long closingReferenceLevelMaxValue()
    {
        return 9223372036854775807L;
    }

    public IndexSummaryEncoder closingReferenceLevel(final long value)
    {
        buffer.putLong(offset + 54, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int closingReferenceTimeId()
    {
        return 11;
    }

    public static int closingReferenceTimeSinceVersion()
    {
        return 0;
    }

    public static int closingReferenceTimeEncodingOffset()
    {
        return 62;
    }

    public static int closingReferenceTimeEncodingLength()
    {
        return 8;
    }

    public static String closingReferenceTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long closingReferenceTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long closingReferenceTimeMinValue()
    {
        return 0x0L;
    }

    public static long closingReferenceTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public IndexSummaryEncoder closingReferenceTime(final long value)
    {
        buffer.putLong(offset + 62, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int prctVarfromPrevCloseId()
    {
        return 12;
    }

    public static int prctVarfromPrevCloseSinceVersion()
    {
        return 0;
    }

    public static int prctVarfromPrevCloseEncodingOffset()
    {
        return 70;
    }

    public static int prctVarfromPrevCloseEncodingLength()
    {
        return 8;
    }

    public static String prctVarfromPrevCloseMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long prctVarfromPrevCloseNullValue()
    {
        return -9223372036854775808L;
    }

    public static long prctVarfromPrevCloseMinValue()
    {
        return -9223372036854775807L;
    }

    public static long prctVarfromPrevCloseMaxValue()
    {
        return 9223372036854775807L;
    }

    public IndexSummaryEncoder prctVarfromPrevClose(final long value)
    {
        buffer.putLong(offset + 70, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int highLevelId()
    {
        return 13;
    }

    public static int highLevelSinceVersion()
    {
        return 0;
    }

    public static int highLevelEncodingOffset()
    {
        return 78;
    }

    public static int highLevelEncodingLength()
    {
        return 8;
    }

    public static String highLevelMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long highLevelNullValue()
    {
        return -9223372036854775808L;
    }

    public static long highLevelMinValue()
    {
        return -9223372036854775807L;
    }

    public static long highLevelMaxValue()
    {
        return 9223372036854775807L;
    }

    public IndexSummaryEncoder highLevel(final long value)
    {
        buffer.putLong(offset + 78, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int highTimeId()
    {
        return 14;
    }

    public static int highTimeSinceVersion()
    {
        return 0;
    }

    public static int highTimeEncodingOffset()
    {
        return 86;
    }

    public static int highTimeEncodingLength()
    {
        return 8;
    }

    public static String highTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long highTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long highTimeMinValue()
    {
        return 0x0L;
    }

    public static long highTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public IndexSummaryEncoder highTime(final long value)
    {
        buffer.putLong(offset + 86, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int lowLevelId()
    {
        return 15;
    }

    public static int lowLevelSinceVersion()
    {
        return 0;
    }

    public static int lowLevelEncodingOffset()
    {
        return 94;
    }

    public static int lowLevelEncodingLength()
    {
        return 8;
    }

    public static String lowLevelMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long lowLevelNullValue()
    {
        return -9223372036854775808L;
    }

    public static long lowLevelMinValue()
    {
        return -9223372036854775807L;
    }

    public static long lowLevelMaxValue()
    {
        return 9223372036854775807L;
    }

    public IndexSummaryEncoder lowLevel(final long value)
    {
        buffer.putLong(offset + 94, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int lowTimeId()
    {
        return 16;
    }

    public static int lowTimeSinceVersion()
    {
        return 0;
    }

    public static int lowTimeEncodingOffset()
    {
        return 102;
    }

    public static int lowTimeEncodingLength()
    {
        return 8;
    }

    public static String lowTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long lowTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long lowTimeMinValue()
    {
        return 0x0L;
    }

    public static long lowTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public IndexSummaryEncoder lowTime(final long value)
    {
        buffer.putLong(offset + 102, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int liquidationLevelId()
    {
        return 17;
    }

    public static int liquidationLevelSinceVersion()
    {
        return 0;
    }

    public static int liquidationLevelEncodingOffset()
    {
        return 110;
    }

    public static int liquidationLevelEncodingLength()
    {
        return 8;
    }

    public static String liquidationLevelMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long liquidationLevelNullValue()
    {
        return -9223372036854775808L;
    }

    public static long liquidationLevelMinValue()
    {
        return -9223372036854775807L;
    }

    public static long liquidationLevelMaxValue()
    {
        return 9223372036854775807L;
    }

    public IndexSummaryEncoder liquidationLevel(final long value)
    {
        buffer.putLong(offset + 110, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int liquidationTimeId()
    {
        return 18;
    }

    public static int liquidationTimeSinceVersion()
    {
        return 0;
    }

    public static int liquidationTimeEncodingOffset()
    {
        return 118;
    }

    public static int liquidationTimeEncodingLength()
    {
        return 8;
    }

    public static String liquidationTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long liquidationTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long liquidationTimeMinValue()
    {
        return 0x0L;
    }

    public static long liquidationTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public IndexSummaryEncoder liquidationTime(final long value)
    {
        buffer.putLong(offset + 118, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        IndexSummaryDecoder writer = new IndexSummaryDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

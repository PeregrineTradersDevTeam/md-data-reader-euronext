/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class RealTimeIndexEncoder
{
    public static final int BLOCK_LENGTH = 50;
    public static final int TEMPLATE_ID = 1008;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final RealTimeIndexEncoder parentMessage = this;
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

    public RealTimeIndexEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public RealTimeIndexEncoder wrapAndApplyHeader(
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

    public RealTimeIndexEncoder mDSeqNum(final long value)
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

    public RealTimeIndexEncoder rebroadcastIndicator(final short value)
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

    public RealTimeIndexEncoder eMM(final EMM_enum value)
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

    public RealTimeIndexEncoder eventTime(final long value)
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

    public RealTimeIndexEncoder symbolIndex(final long value)
    {
        buffer.putInt(offset + 18, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int indexLevelId()
    {
        return 6;
    }

    public static int indexLevelSinceVersion()
    {
        return 0;
    }

    public static int indexLevelEncodingOffset()
    {
        return 22;
    }

    public static int indexLevelEncodingLength()
    {
        return 8;
    }

    public static String indexLevelMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long indexLevelNullValue()
    {
        return -9223372036854775808L;
    }

    public static long indexLevelMinValue()
    {
        return -9223372036854775807L;
    }

    public static long indexLevelMaxValue()
    {
        return 9223372036854775807L;
    }

    public RealTimeIndexEncoder indexLevel(final long value)
    {
        buffer.putLong(offset + 22, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int pctgOfCapitalizationId()
    {
        return 7;
    }

    public static int pctgOfCapitalizationSinceVersion()
    {
        return 0;
    }

    public static int pctgOfCapitalizationEncodingOffset()
    {
        return 30;
    }

    public static int pctgOfCapitalizationEncodingLength()
    {
        return 8;
    }

    public static String pctgOfCapitalizationMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long pctgOfCapitalizationNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long pctgOfCapitalizationMinValue()
    {
        return 0x0L;
    }

    public static long pctgOfCapitalizationMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public RealTimeIndexEncoder pctgOfCapitalization(final long value)
    {
        buffer.putLong(offset + 30, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int prctVarfromPrevCloseId()
    {
        return 8;
    }

    public static int prctVarfromPrevCloseSinceVersion()
    {
        return 0;
    }

    public static int prctVarfromPrevCloseEncodingOffset()
    {
        return 38;
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

    public RealTimeIndexEncoder prctVarfromPrevClose(final long value)
    {
        buffer.putLong(offset + 38, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int numTradedInstrumentsId()
    {
        return 9;
    }

    public static int numTradedInstrumentsSinceVersion()
    {
        return 0;
    }

    public static int numTradedInstrumentsEncodingOffset()
    {
        return 46;
    }

    public static int numTradedInstrumentsEncodingLength()
    {
        return 2;
    }

    public static String numTradedInstrumentsMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int numTradedInstrumentsNullValue()
    {
        return 65535;
    }

    public static int numTradedInstrumentsMinValue()
    {
        return 0;
    }

    public static int numTradedInstrumentsMaxValue()
    {
        return 65534;
    }

    public RealTimeIndexEncoder numTradedInstruments(final int value)
    {
        buffer.putShort(offset + 46, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int indexLevelTypeId()
    {
        return 10;
    }

    public static int indexLevelTypeSinceVersion()
    {
        return 0;
    }

    public static int indexLevelTypeEncodingOffset()
    {
        return 48;
    }

    public static int indexLevelTypeEncodingLength()
    {
        return 1;
    }

    public static String indexLevelTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public RealTimeIndexEncoder indexLevelType(final IndexLevelType_enum value)
    {
        buffer.putByte(offset + 48, (byte)value.value());
        return this;
    }

    public static int indexPriceCodeId()
    {
        return 11;
    }

    public static int indexPriceCodeSinceVersion()
    {
        return 0;
    }

    public static int indexPriceCodeEncodingOffset()
    {
        return 49;
    }

    public static int indexPriceCodeEncodingLength()
    {
        return 1;
    }

    public static String indexPriceCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public RealTimeIndexEncoder indexPriceCode(final IndexPriceCode_enum value)
    {
        buffer.putByte(offset + 49, (byte)value.value());
        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        RealTimeIndexDecoder writer = new RealTimeIndexDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

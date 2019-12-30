/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class IndexSummaryDecoder
{
    public static final int BLOCK_LENGTH = 126;
    public static final int TEMPLATE_ID = 1011;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final IndexSummaryDecoder parentMessage = this;
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

    public IndexSummaryDecoder wrap(
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

    public long symbolIndex()
    {
        return (buffer.getInt(offset + 18, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

    public long openingLevel()
    {
        return buffer.getLong(offset + 22, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long openingTime()
    {
        return buffer.getLong(offset + 30, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long confirmedReferenceLevel()
    {
        return buffer.getLong(offset + 38, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long confirmedReferenceTime()
    {
        return buffer.getLong(offset + 46, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long closingReferenceLevel()
    {
        return buffer.getLong(offset + 54, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long closingReferenceTime()
    {
        return buffer.getLong(offset + 62, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long prctVarfromPrevClose()
    {
        return buffer.getLong(offset + 70, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long highLevel()
    {
        return buffer.getLong(offset + 78, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long highTime()
    {
        return buffer.getLong(offset + 86, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long lowLevel()
    {
        return buffer.getLong(offset + 94, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long lowTime()
    {
        return buffer.getLong(offset + 102, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long liquidationLevel()
    {
        return buffer.getLong(offset + 110, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long liquidationTime()
    {
        return buffer.getLong(offset + 118, java.nio.ByteOrder.LITTLE_ENDIAN);
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[IndexSummary](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='symbolIndex', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=4, offset=18, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=18, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("symbolIndex=");
        builder.append(symbolIndex());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='openingLevel', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=8, offset=22, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=22, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("openingLevel=");
        builder.append(openingLevel());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='openingTime', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=8, offset=30, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=30, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("openingTime=");
        builder.append(openingTime());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='confirmedReferenceLevel', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=8, offset=38, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=38, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("confirmedReferenceLevel=");
        builder.append(confirmedReferenceLevel());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='confirmedReferenceTime', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=8, offset=46, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=46, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("confirmedReferenceTime=");
        builder.append(confirmedReferenceTime());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='closingReferenceLevel', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=8, offset=54, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=54, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("closingReferenceLevel=");
        builder.append(closingReferenceLevel());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='closingReferenceTime', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=8, offset=62, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=62, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("closingReferenceTime=");
        builder.append(closingReferenceTime());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='prctVarfromPrevClose', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=8, offset=70, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=70, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("prctVarfromPrevClose=");
        builder.append(prctVarfromPrevClose());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='highLevel', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=8, offset=78, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=78, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("highLevel=");
        builder.append(highLevel());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='highTime', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=8, offset=86, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=86, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("highTime=");
        builder.append(highTime());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='lowLevel', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=8, offset=94, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=94, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("lowLevel=");
        builder.append(lowLevel());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='lowTime', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=8, offset=102, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=102, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("lowTime=");
        builder.append(lowTime());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='liquidationLevel', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=8, offset=110, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=110, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("liquidationLevel=");
        builder.append(liquidationLevel());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='liquidationTime', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=8, offset=118, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=118, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("liquidationTime=");
        builder.append(liquidationTime());

        limit(originalLimit);

        return builder;
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class RealTimeIndexDecoder
{
    public static final int BLOCK_LENGTH = 50;
    public static final int TEMPLATE_ID = 1008;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final RealTimeIndexDecoder parentMessage = this;
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

    public RealTimeIndexDecoder wrap(
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

    public long indexLevel()
    {
        return buffer.getLong(offset + 22, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long pctgOfCapitalization()
    {
        return buffer.getLong(offset + 30, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long prctVarfromPrevClose()
    {
        return buffer.getLong(offset + 38, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public int numTradedInstruments()
    {
        return (buffer.getShort(offset + 46, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

    public IndexLevelType_enum indexLevelType()
    {
        return IndexLevelType_enum.get(((short)(buffer.getByte(offset + 48) & 0xFF)));
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

    public IndexPriceCode_enum indexPriceCode()
    {
        return IndexPriceCode_enum.get(((short)(buffer.getByte(offset + 49) & 0xFF)));
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[RealTimeIndex](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='indexLevel', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=8, offset=22, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=22, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("indexLevel=");
        builder.append(indexLevel());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='pctgOfCapitalization', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=8, offset=30, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=30, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("pctgOfCapitalization=");
        builder.append(pctgOfCapitalization());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='prctVarfromPrevClose', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=8, offset=38, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=38, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("prctVarfromPrevClose=");
        builder.append(prctVarfromPrevClose());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='numTradedInstruments', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=2, offset=46, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=46, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("numTradedInstruments=");
        builder.append(numTradedInstruments());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='indexLevelType', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=1, offset=48, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='IndexLevelType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=48, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("indexLevelType=");
        builder.append(indexLevelType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='indexPriceCode', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=1, offset=49, componentTokenCount=11, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='IndexPriceCode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=49, componentTokenCount=9, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("indexPriceCode=");
        builder.append(indexPriceCode());

        limit(originalLimit);

        return builder;
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class TimetableDecoder
{
    public static final int BLOCK_LENGTH = 16;
    public static final int TEMPLATE_ID = 1006;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final TimetableDecoder parentMessage = this;
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

    public TimetableDecoder wrap(
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
            case PRESENCE: return "optional";
        }

        return "";
    }

    public EMM_enum eMM()
    {
        return EMM_enum.get(((short)(buffer.getByte(offset + 9) & 0xFF)));
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

    public int patternID()
    {
        return (buffer.getShort(offset + 10, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

    public long symbolIndex()
    {
        return (buffer.getInt(offset + 12, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    private final TimetablesDecoder timetables = new TimetablesDecoder(this);

    public static long timetablesDecoderId()
    {
        return 6;
    }

    public static int timetablesDecoderSinceVersion()
    {
        return 0;
    }

    public TimetablesDecoder timetables()
    {
        timetables.wrap(buffer);
        return timetables;
    }

    public static class TimetablesDecoder
        implements Iterable<TimetablesDecoder>, java.util.Iterator<TimetablesDecoder>
    {
        public static final int HEADER_SIZE = 2;
        private final TimetableDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        TimetablesDecoder(final TimetableDecoder parentMessage)
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
            return 14;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<TimetablesDecoder> iterator()
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

        public TimetablesDecoder next()
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

        public long phaseTime()
        {
            return buffer.getLong(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        public PhaseId_enum phaseId()
        {
            return PhaseId_enum.get(((short)(buffer.getByte(offset + 8) & 0xFF)));
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

        private final PhaseQualifier_setDecoder phaseQualifier = new PhaseQualifier_setDecoder();

        public PhaseQualifier_setDecoder phaseQualifier()
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

        public TradingPeriod_enum tradingPeriod()
        {
            return TradingPeriod_enum.get(((short)(buffer.getByte(offset + 11) & 0xFF)));
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

        public OrderEntryQualifier_enum orderEntryQualifier()
        {
            return OrderEntryQualifier_enum.get(((short)(buffer.getByte(offset + 12) & 0xFF)));
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

        public Session_enum session()
        {
            return Session_enum.get(((short)(buffer.getByte(offset + 13) & 0xFF)));
        }



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='phaseTime', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=8, offset=0, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=0, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("phaseTime=");
            builder.append(phaseTime());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='phaseId', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=1, offset=8, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='PhaseId_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=8, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("phaseId=");
            builder.append(phaseId());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='phaseQualifier', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=2, offset=9, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_SET, name='PhaseQualifier_set', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=9, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("phaseQualifier=");
            builder.append(phaseQualifier());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='tradingPeriod', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=1, offset=11, componentTokenCount=7, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='TradingPeriod_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=11, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("tradingPeriod=");
            builder.append(tradingPeriod());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='orderEntryQualifier', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=1, offset=12, componentTokenCount=8, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='OrderEntryQualifier_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=12, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("orderEntryQualifier=");
            builder.append(orderEntryQualifier());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='session', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=1, offset=13, componentTokenCount=14, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='Session_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=13, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("session=");
            builder.append(session());
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
        builder.append("[Timetable](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='eMM', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=1, offset=9, componentTokenCount=12, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EMM_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=9, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("eMM=");
        builder.append(eMM());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='patternID', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=2, offset=10, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=10, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("patternID=");
        builder.append(patternID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='symbolIndex', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=4, offset=12, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=12, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("symbolIndex=");
        builder.append(symbolIndex());
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='Timetables', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=14, offset=16, componentTokenCount=58, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("timetables=[");
        TimetablesDecoder timetables = timetables();
        if (timetables.count() > 0)
        {
            while (timetables.hasNext())
            {
                timetables.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}

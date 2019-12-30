/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class StrategyStandingDataDecoder
{
    public static final int BLOCK_LENGTH = 49;
    public static final int TEMPLATE_ID = 1012;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final StrategyStandingDataDecoder parentMessage = this;
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

    public StrategyStandingDataDecoder wrap(
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


    public static int symbolIndexId()
    {
        return 4;
    }

    public static int symbolIndexSinceVersion()
    {
        return 0;
    }

    public static int symbolIndexEncodingOffset()
    {
        return 10;
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
        return (buffer.getInt(offset + 10, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int instrumentTradingCodeId()
    {
        return 5;
    }

    public static int instrumentTradingCodeSinceVersion()
    {
        return 0;
    }

    public static int instrumentTradingCodeEncodingOffset()
    {
        return 14;
    }

    public static int instrumentTradingCodeEncodingLength()
    {
        return 15;
    }

    public static String instrumentTradingCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte instrumentTradingCodeNullValue()
    {
        return (byte)0;
    }

    public static byte instrumentTradingCodeMinValue()
    {
        return (byte)32;
    }

    public static byte instrumentTradingCodeMaxValue()
    {
        return (byte)126;
    }

    public static int instrumentTradingCodeLength()
    {
        return 15;
    }

    public byte instrumentTradingCode(final int index)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 14 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String instrumentTradingCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getInstrumentTradingCode(final byte[] dst, final int dstOffset)
    {
        final int length = 15;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 14, dst, dstOffset, length);

        return length;
    }

    public String instrumentTradingCode()
    {
        final byte[] dst = new byte[15];
        buffer.getBytes(this.offset + 14, dst, 0, 15);

        int end = 0;
        for (; end < 15 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getInstrumentTradingCode(final Appendable value)
    {
        for (int i = 0; i < 15 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 14 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int exchangeCodeId()
    {
        return 6;
    }

    public static int exchangeCodeSinceVersion()
    {
        return 0;
    }

    public static int exchangeCodeEncodingOffset()
    {
        return 29;
    }

    public static int exchangeCodeEncodingLength()
    {
        return 1;
    }

    public static String exchangeCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public ExchangeCode_enum exchangeCode()
    {
        return ExchangeCode_enum.get(buffer.getByte(offset + 29));
    }


    public static int maturityDateId()
    {
        return 7;
    }

    public static int maturityDateSinceVersion()
    {
        return 0;
    }

    public static int maturityDateEncodingOffset()
    {
        return 30;
    }

    public static int maturityDateEncodingLength()
    {
        return 8;
    }

    public static String maturityDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte maturityDateNullValue()
    {
        return (byte)0;
    }

    public static byte maturityDateMinValue()
    {
        return (byte)32;
    }

    public static byte maturityDateMaxValue()
    {
        return (byte)126;
    }

    public static int maturityDateLength()
    {
        return 8;
    }

    public byte maturityDate(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 30 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String maturityDateCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMaturityDate(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 30, dst, dstOffset, length);

        return length;
    }

    public String maturityDate()
    {
        final byte[] dst = new byte[8];
        buffer.getBytes(this.offset + 30, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMaturityDate(final Appendable value)
    {
        for (int i = 0; i < 8 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 30 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int strategyCodeId()
    {
        return 8;
    }

    public static int strategyCodeSinceVersion()
    {
        return 0;
    }

    public static int strategyCodeEncodingOffset()
    {
        return 38;
    }

    public static int strategyCodeEncodingLength()
    {
        return 1;
    }

    public static String strategyCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public StrategyCode_enum strategyCode()
    {
        return StrategyCode_enum.get(buffer.getByte(offset + 38));
    }


    public static int contractSymbolIndexId()
    {
        return 9;
    }

    public static int contractSymbolIndexSinceVersion()
    {
        return 0;
    }

    public static int contractSymbolIndexEncodingOffset()
    {
        return 39;
    }

    public static int contractSymbolIndexEncodingLength()
    {
        return 4;
    }

    public static String contractSymbolIndexMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long contractSymbolIndexNullValue()
    {
        return 4294967295L;
    }

    public static long contractSymbolIndexMinValue()
    {
        return 0L;
    }

    public static long contractSymbolIndexMaxValue()
    {
        return 4294967294L;
    }

    public long contractSymbolIndex()
    {
        return (buffer.getInt(offset + 39, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int cFIId()
    {
        return 10;
    }

    public static int cFISinceVersion()
    {
        return 0;
    }

    public static int cFIEncodingOffset()
    {
        return 43;
    }

    public static int cFIEncodingLength()
    {
        return 6;
    }

    public static String cFIMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte cFINullValue()
    {
        return (byte)0;
    }

    public static byte cFIMinValue()
    {
        return (byte)32;
    }

    public static byte cFIMaxValue()
    {
        return (byte)126;
    }

    public static int cFILength()
    {
        return 6;
    }

    public byte cFI(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 43 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String cFICharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getCFI(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 43, dst, dstOffset, length);

        return length;
    }

    public String cFI()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 43, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCFI(final Appendable value)
    {
        for (int i = 0; i < 6 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 43 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    private final StrategyStandingDatarep1Decoder strategyStandingDatarep1 = new StrategyStandingDatarep1Decoder(this);

    public static long strategyStandingDatarep1DecoderId()
    {
        return 11;
    }

    public static int strategyStandingDatarep1DecoderSinceVersion()
    {
        return 0;
    }

    public StrategyStandingDatarep1Decoder strategyStandingDatarep1()
    {
        strategyStandingDatarep1.wrap(buffer);
        return strategyStandingDatarep1;
    }

    public static class StrategyStandingDatarep1Decoder
        implements Iterable<StrategyStandingDatarep1Decoder>, java.util.Iterator<StrategyStandingDatarep1Decoder>
    {
        public static final int HEADER_SIZE = 2;
        private final StrategyStandingDataDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        StrategyStandingDatarep1Decoder(final StrategyStandingDataDecoder parentMessage)
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
            return 17;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<StrategyStandingDatarep1Decoder> iterator()
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

        public StrategyStandingDatarep1Decoder next()
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

        public static int legSymbolIndexId()
        {
            return 1;
        }

        public static int legSymbolIndexSinceVersion()
        {
            return 0;
        }

        public static int legSymbolIndexEncodingOffset()
        {
            return 0;
        }

        public static int legSymbolIndexEncodingLength()
        {
            return 4;
        }

        public static String legSymbolIndexMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long legSymbolIndexNullValue()
        {
            return 4294967295L;
        }

        public static long legSymbolIndexMinValue()
        {
            return 0L;
        }

        public static long legSymbolIndexMaxValue()
        {
            return 4294967294L;
        }

        public long legSymbolIndex()
        {
            return (buffer.getInt(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
        }


        public static int legPriceId()
        {
            return 2;
        }

        public static int legPriceSinceVersion()
        {
            return 0;
        }

        public static int legPriceEncodingOffset()
        {
            return 4;
        }

        public static int legPriceEncodingLength()
        {
            return 8;
        }

        public static String legPriceMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long legPriceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long legPriceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long legPriceMaxValue()
        {
            return 9223372036854775807L;
        }

        public long legPrice()
        {
            return buffer.getLong(offset + 4, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int legRatioId()
        {
            return 3;
        }

        public static int legRatioSinceVersion()
        {
            return 0;
        }

        public static int legRatioEncodingOffset()
        {
            return 12;
        }

        public static int legRatioEncodingLength()
        {
            return 4;
        }

        public static String legRatioMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long legRatioNullValue()
        {
            return 4294967295L;
        }

        public static long legRatioMinValue()
        {
            return 0L;
        }

        public static long legRatioMaxValue()
        {
            return 4294967294L;
        }

        public long legRatio()
        {
            return (buffer.getInt(offset + 12, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
        }


        public static int legBuySellId()
        {
            return 4;
        }

        public static int legBuySellSinceVersion()
        {
            return 0;
        }

        public static int legBuySellEncodingOffset()
        {
            return 16;
        }

        public static int legBuySellEncodingLength()
        {
            return 1;
        }

        public static String legBuySellMetaAttribute(final MetaAttribute metaAttribute)
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

        public LegBuyorSell_enum legBuySell()
        {
            return LegBuyorSell_enum.get(buffer.getByte(offset + 16));
        }



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='legSymbolIndex', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("legSymbolIndex=");
            builder.append(legSymbolIndex());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='legPrice', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=8, offset=4, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=4, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("legPrice=");
            builder.append(legPrice());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='legRatio', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=4, offset=12, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=12, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("legRatio=");
            builder.append(legRatio());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='legBuySell', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=1, offset=16, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='LegBuyorSell_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=16, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("legBuySell=");
            builder.append(legBuySell());
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
        builder.append("[StrategyStandingData](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='symbolIndex', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=4, offset=10, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=10, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("symbolIndex=");
        builder.append(symbolIndex());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentTradingCode', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=15, offset=14, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char15', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=15, offset=14, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentTradingCode=");
        for (int i = 0; i < instrumentTradingCodeLength() && instrumentTradingCode(i) > 0; i++)
        {
            builder.append((char)instrumentTradingCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='exchangeCode', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=1, offset=29, componentTokenCount=19, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='ExchangeCode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=29, componentTokenCount=17, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("exchangeCode=");
        builder.append(exchangeCode());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='maturityDate', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=8, offset=30, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char8', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=30, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("maturityDate=");
        for (int i = 0; i < maturityDateLength() && maturityDate(i) > 0; i++)
        {
            builder.append((char)maturityDate(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strategyCode', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=1, offset=38, componentTokenCount=52, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='StrategyCode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=38, componentTokenCount=50, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strategyCode=");
        builder.append(strategyCode());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='contractSymbolIndex', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=4, offset=39, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=39, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("contractSymbolIndex=");
        builder.append(contractSymbolIndex());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='cFI', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=6, offset=43, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char6', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=6, offset=43, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("cFI=");
        for (int i = 0; i < cFILength() && cFI(i) > 0; i++)
        {
            builder.append((char)cFI(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='StrategyStandingDatarep1', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=17, offset=49, componentTokenCount=21, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strategyStandingDatarep1=[");
        StrategyStandingDatarep1Decoder strategyStandingDatarep1 = strategyStandingDatarep1();
        if (strategyStandingDatarep1.count() > 0)
        {
            while (strategyStandingDatarep1.hasNext())
            {
                strategyStandingDatarep1.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class OutrightStandingDataDecoder
{
    public static final int BLOCK_LENGTH = 96;
    public static final int TEMPLATE_ID = 1014;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final OutrightStandingDataDecoder parentMessage = this;
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

    public OutrightStandingDataDecoder wrap(
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


    public static int symbolIndexId()
    {
        return 3;
    }

    public static int symbolIndexSinceVersion()
    {
        return 0;
    }

    public static int symbolIndexEncodingOffset()
    {
        return 9;
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
        return (buffer.getInt(offset + 9, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int contractSymbolIndexId()
    {
        return 4;
    }

    public static int contractSymbolIndexSinceVersion()
    {
        return 0;
    }

    public static int contractSymbolIndexEncodingOffset()
    {
        return 13;
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
        return (buffer.getInt(offset + 13, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int instrumentEventDateId()
    {
        return 5;
    }

    public static int instrumentEventDateSinceVersion()
    {
        return 0;
    }

    public static int instrumentEventDateEncodingOffset()
    {
        return 17;
    }

    public static int instrumentEventDateEncodingLength()
    {
        return 2;
    }

    public static String instrumentEventDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int instrumentEventDateNullValue()
    {
        return 65535;
    }

    public static int instrumentEventDateMinValue()
    {
        return 0;
    }

    public static int instrumentEventDateMaxValue()
    {
        return 65534;
    }

    public int instrumentEventDate()
    {
        return (buffer.getShort(offset + 17, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    public static int iSINCodeId()
    {
        return 6;
    }

    public static int iSINCodeSinceVersion()
    {
        return 0;
    }

    public static int iSINCodeEncodingOffset()
    {
        return 19;
    }

    public static int iSINCodeEncodingLength()
    {
        return 12;
    }

    public static String iSINCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte iSINCodeNullValue()
    {
        return (byte)0;
    }

    public static byte iSINCodeMinValue()
    {
        return (byte)32;
    }

    public static byte iSINCodeMaxValue()
    {
        return (byte)126;
    }

    public static int iSINCodeLength()
    {
        return 12;
    }

    public byte iSINCode(final int index)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 19 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String iSINCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getISINCode(final byte[] dst, final int dstOffset)
    {
        final int length = 12;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 19, dst, dstOffset, length);

        return length;
    }

    public String iSINCode()
    {
        final byte[] dst = new byte[12];
        buffer.getBytes(this.offset + 19, dst, 0, 12);

        int end = 0;
        for (; end < 12 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getISINCode(final Appendable value)
    {
        for (int i = 0; i < 12 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 19 + i) & 0xFF;
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


    public static int cFIId()
    {
        return 7;
    }

    public static int cFISinceVersion()
    {
        return 0;
    }

    public static int cFIEncodingOffset()
    {
        return 31;
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

        final int pos = this.offset + 31 + (index * 1);

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

        buffer.getBytes(this.offset + 31, dst, dstOffset, length);

        return length;
    }

    public String cFI()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 31, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCFI(final Appendable value)
    {
        for (int i = 0; i < 6 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 31 + i) & 0xFF;
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


    public static int maturityDateId()
    {
        return 8;
    }

    public static int maturityDateSinceVersion()
    {
        return 0;
    }

    public static int maturityDateEncodingOffset()
    {
        return 37;
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

        final int pos = this.offset + 37 + (index * 1);

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

        buffer.getBytes(this.offset + 37, dst, dstOffset, length);

        return length;
    }

    public String maturityDate()
    {
        final byte[] dst = new byte[8];
        buffer.getBytes(this.offset + 37, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMaturityDate(final Appendable value)
    {
        for (int i = 0; i < 8 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 37 + i) & 0xFF;
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


    public static int optionTypeId()
    {
        return 9;
    }

    public static int optionTypeSinceVersion()
    {
        return 0;
    }

    public static int optionTypeEncodingOffset()
    {
        return 45;
    }

    public static int optionTypeEncodingLength()
    {
        return 1;
    }

    public static String optionTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public OptionType_enum optionType()
    {
        return OptionType_enum.get(((short)(buffer.getByte(offset + 45) & 0xFF)));
    }


    public static int instrumentTradingCodeId()
    {
        return 10;
    }

    public static int instrumentTradingCodeSinceVersion()
    {
        return 0;
    }

    public static int instrumentTradingCodeEncodingOffset()
    {
        return 46;
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

        final int pos = this.offset + 46 + (index * 1);

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

        buffer.getBytes(this.offset + 46, dst, dstOffset, length);

        return length;
    }

    public String instrumentTradingCode()
    {
        final byte[] dst = new byte[15];
        buffer.getBytes(this.offset + 46, dst, 0, 15);

        int end = 0;
        for (; end < 15 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getInstrumentTradingCode(final Appendable value)
    {
        for (int i = 0; i < 15 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 46 + i) & 0xFF;
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


    public static int lotSizeId()
    {
        return 11;
    }

    public static int lotSizeSinceVersion()
    {
        return 0;
    }

    public static int lotSizeEncodingOffset()
    {
        return 61;
    }

    public static int lotSizeEncodingLength()
    {
        return 8;
    }

    public static String lotSizeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long lotSizeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long lotSizeMinValue()
    {
        return 0x0L;
    }

    public static long lotSizeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long lotSize()
    {
        return buffer.getLong(offset + 61, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int strikePriceId()
    {
        return 12;
    }

    public static int strikePriceSinceVersion()
    {
        return 0;
    }

    public static int strikePriceEncodingOffset()
    {
        return 69;
    }

    public static int strikePriceEncodingLength()
    {
        return 8;
    }

    public static String strikePriceMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long strikePriceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long strikePriceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long strikePriceMaxValue()
    {
        return 9223372036854775807L;
    }

    public long strikePrice()
    {
        return buffer.getLong(offset + 69, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int lastTradingDateId()
    {
        return 13;
    }

    public static int lastTradingDateSinceVersion()
    {
        return 0;
    }

    public static int lastTradingDateEncodingOffset()
    {
        return 77;
    }

    public static int lastTradingDateEncodingLength()
    {
        return 2;
    }

    public static String lastTradingDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int lastTradingDateNullValue()
    {
        return 65535;
    }

    public static int lastTradingDateMinValue()
    {
        return 0;
    }

    public static int lastTradingDateMaxValue()
    {
        return 65534;
    }

    public int lastTradingDate()
    {
        return (buffer.getShort(offset + 77, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    public static int underlyingInstrumentTradingCodeId()
    {
        return 14;
    }

    public static int underlyingInstrumentTradingCodeSinceVersion()
    {
        return 0;
    }

    public static int underlyingInstrumentTradingCodeEncodingOffset()
    {
        return 79;
    }

    public static int underlyingInstrumentTradingCodeEncodingLength()
    {
        return 15;
    }

    public static String underlyingInstrumentTradingCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte underlyingInstrumentTradingCodeNullValue()
    {
        return (byte)0;
    }

    public static byte underlyingInstrumentTradingCodeMinValue()
    {
        return (byte)32;
    }

    public static byte underlyingInstrumentTradingCodeMaxValue()
    {
        return (byte)126;
    }

    public static int underlyingInstrumentTradingCodeLength()
    {
        return 15;
    }

    public byte underlyingInstrumentTradingCode(final int index)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 79 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String underlyingInstrumentTradingCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getUnderlyingInstrumentTradingCode(final byte[] dst, final int dstOffset)
    {
        final int length = 15;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 79, dst, dstOffset, length);

        return length;
    }

    public String underlyingInstrumentTradingCode()
    {
        final byte[] dst = new byte[15];
        buffer.getBytes(this.offset + 79, dst, 0, 15);

        int end = 0;
        for (; end < 15 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnderlyingInstrumentTradingCode(final Appendable value)
    {
        for (int i = 0; i < 15 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 79 + i) & 0xFF;
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


    public static int daysToExpiryId()
    {
        return 15;
    }

    public static int daysToExpirySinceVersion()
    {
        return 0;
    }

    public static int daysToExpiryEncodingOffset()
    {
        return 94;
    }

    public static int daysToExpiryEncodingLength()
    {
        return 2;
    }

    public static String daysToExpiryMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int daysToExpiryNullValue()
    {
        return 65535;
    }

    public static int daysToExpiryMinValue()
    {
        return 0;
    }

    public static int daysToExpiryMaxValue()
    {
        return 65534;
    }

    public int daysToExpiry()
    {
        return (buffer.getShort(offset + 94, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    private final OutrightRepDecoder outrightRep = new OutrightRepDecoder(this);

    public static long outrightRepDecoderId()
    {
        return 16;
    }

    public static int outrightRepDecoderSinceVersion()
    {
        return 0;
    }

    public OutrightRepDecoder outrightRep()
    {
        outrightRep.wrap(buffer);
        return outrightRep;
    }

    public static class OutrightRepDecoder
        implements Iterable<OutrightRepDecoder>, java.util.Iterator<OutrightRepDecoder>
    {
        public static final int HEADER_SIZE = 2;
        private final OutrightStandingDataDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        OutrightRepDecoder(final OutrightStandingDataDecoder parentMessage)
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
            return 1;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<OutrightRepDecoder> iterator()
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

        public OutrightRepDecoder next()
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

        public static int eMMId()
        {
            return 1;
        }

        public static int eMMSinceVersion()
        {
            return 0;
        }

        public static int eMMEncodingOffset()
        {
            return 0;
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
            return EMM_enum.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
        }



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='eMM', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='EMM_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("eMM=");
            builder.append(eMM());
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
        builder.append("[OutrightStandingData](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='symbolIndex', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=4, offset=9, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=9, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("symbolIndex=");
        builder.append(symbolIndex());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='contractSymbolIndex', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=4, offset=13, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=13, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("contractSymbolIndex=");
        builder.append(contractSymbolIndex());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentEventDate', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=2, offset=17, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=17, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentEventDate=");
        builder.append(instrumentEventDate());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='iSINCode', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=12, offset=19, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char12', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=12, offset=19, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("iSINCode=");
        for (int i = 0; i < iSINCodeLength() && iSINCode(i) > 0; i++)
        {
            builder.append((char)iSINCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='cFI', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=6, offset=31, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char6', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=6, offset=31, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("cFI=");
        for (int i = 0; i < cFILength() && cFI(i) > 0; i++)
        {
            builder.append((char)cFI(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='maturityDate', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=8, offset=37, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char8', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=37, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("maturityDate=");
        for (int i = 0; i < maturityDateLength() && maturityDate(i) > 0; i++)
        {
            builder.append((char)maturityDate(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='optionType', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=1, offset=45, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='OptionType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=45, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("optionType=");
        builder.append(optionType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentTradingCode', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=15, offset=46, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char15', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=15, offset=46, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentTradingCode=");
        for (int i = 0; i < instrumentTradingCodeLength() && instrumentTradingCode(i) > 0; i++)
        {
            builder.append((char)instrumentTradingCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='lotSize', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=8, offset=61, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=61, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("lotSize=");
        builder.append(lotSize());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strikePrice', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=8, offset=69, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=69, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strikePrice=");
        builder.append(strikePrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='lastTradingDate', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=2, offset=77, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=77, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("lastTradingDate=");
        builder.append(lastTradingDate());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingInstrumentTradingCode', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=15, offset=79, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char15', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=15, offset=79, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingInstrumentTradingCode=");
        for (int i = 0; i < underlyingInstrumentTradingCodeLength() && underlyingInstrumentTradingCode(i) > 0; i++)
        {
            builder.append((char)underlyingInstrumentTradingCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='daysToExpiry', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=2, offset=94, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=94, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("daysToExpiry=");
        builder.append(daysToExpiry());
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='OutrightRep', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=1, offset=96, componentTokenCount=18, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("outrightRep=[");
        OutrightRepDecoder outrightRep = outrightRep();
        if (outrightRep.count() > 0)
        {
            while (outrightRep.hasNext())
            {
                outrightRep.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}

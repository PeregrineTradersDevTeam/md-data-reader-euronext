/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class FullTradeInformationDecoder
{
    public static final int BLOCK_LENGTH = 391;
    public static final int TEMPLATE_ID = 1004;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final FullTradeInformationDecoder parentMessage = this;
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

    public FullTradeInformationDecoder wrap(
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


    public static int tradingDateTimeId()
    {
        return 6;
    }

    public static int tradingDateTimeSinceVersion()
    {
        return 0;
    }

    public static int tradingDateTimeEncodingOffset()
    {
        return 22;
    }

    public static int tradingDateTimeEncodingLength()
    {
        return 27;
    }

    public static String tradingDateTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte tradingDateTimeNullValue()
    {
        return (byte)0;
    }

    public static byte tradingDateTimeMinValue()
    {
        return (byte)32;
    }

    public static byte tradingDateTimeMaxValue()
    {
        return (byte)126;
    }

    public static int tradingDateTimeLength()
    {
        return 27;
    }

    public byte tradingDateTime(final int index)
    {
        if (index < 0 || index >= 27)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 22 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradingDateTimeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getTradingDateTime(final byte[] dst, final int dstOffset)
    {
        final int length = 27;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 22, dst, dstOffset, length);

        return length;
    }

    public String tradingDateTime()
    {
        final byte[] dst = new byte[27];
        buffer.getBytes(this.offset + 22, dst, 0, 27);

        int end = 0;
        for (; end < 27 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getTradingDateTime(final Appendable value)
    {
        for (int i = 0; i < 27 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 22 + i) & 0xFF;
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


    public static int publicationDateTimeId()
    {
        return 7;
    }

    public static int publicationDateTimeSinceVersion()
    {
        return 0;
    }

    public static int publicationDateTimeEncodingOffset()
    {
        return 49;
    }

    public static int publicationDateTimeEncodingLength()
    {
        return 27;
    }

    public static String publicationDateTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte publicationDateTimeNullValue()
    {
        return (byte)0;
    }

    public static byte publicationDateTimeMinValue()
    {
        return (byte)32;
    }

    public static byte publicationDateTimeMaxValue()
    {
        return (byte)126;
    }

    public static int publicationDateTimeLength()
    {
        return 27;
    }

    public byte publicationDateTime(final int index)
    {
        if (index < 0 || index >= 27)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 49 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String publicationDateTimeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getPublicationDateTime(final byte[] dst, final int dstOffset)
    {
        final int length = 27;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 49, dst, dstOffset, length);

        return length;
    }

    public String publicationDateTime()
    {
        final byte[] dst = new byte[27];
        buffer.getBytes(this.offset + 49, dst, 0, 27);

        int end = 0;
        for (; end < 27 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getPublicationDateTime(final Appendable value)
    {
        for (int i = 0; i < 27 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 49 + i) & 0xFF;
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


    public static int tradeTypeId()
    {
        return 8;
    }

    public static int tradeTypeSinceVersion()
    {
        return 0;
    }

    public static int tradeTypeEncodingOffset()
    {
        return 76;
    }

    public static int tradeTypeEncodingLength()
    {
        return 1;
    }

    public static String tradeTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public TradeType_enum tradeType()
    {
        return TradeType_enum.get(((short)(buffer.getByte(offset + 76) & 0xFF)));
    }


    public static int mifidInstrumentIdTypeId()
    {
        return 9;
    }

    public static int mifidInstrumentIdTypeSinceVersion()
    {
        return 0;
    }

    public static int mifidInstrumentIdTypeEncodingOffset()
    {
        return 77;
    }

    public static int mifidInstrumentIdTypeEncodingLength()
    {
        return 4;
    }

    public static String mifidInstrumentIdTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mifidInstrumentIdTypeNullValue()
    {
        return (byte)0;
    }

    public static byte mifidInstrumentIdTypeMinValue()
    {
        return (byte)32;
    }

    public static byte mifidInstrumentIdTypeMaxValue()
    {
        return (byte)126;
    }

    public static int mifidInstrumentIdTypeLength()
    {
        return 4;
    }

    public byte mifidInstrumentIdType(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 77 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mifidInstrumentIdTypeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMifidInstrumentIdType(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 77, dst, dstOffset, length);

        return length;
    }

    public String mifidInstrumentIdType()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 77, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidInstrumentIdType(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 77 + i) & 0xFF;
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


    public static int mifidInstrumentIDId()
    {
        return 10;
    }

    public static int mifidInstrumentIDSinceVersion()
    {
        return 0;
    }

    public static int mifidInstrumentIDEncodingOffset()
    {
        return 81;
    }

    public static int mifidInstrumentIDEncodingLength()
    {
        return 12;
    }

    public static String mifidInstrumentIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mifidInstrumentIDNullValue()
    {
        return (byte)0;
    }

    public static byte mifidInstrumentIDMinValue()
    {
        return (byte)32;
    }

    public static byte mifidInstrumentIDMaxValue()
    {
        return (byte)126;
    }

    public static int mifidInstrumentIDLength()
    {
        return 12;
    }

    public byte mifidInstrumentID(final int index)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 81 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mifidInstrumentIDCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMifidInstrumentID(final byte[] dst, final int dstOffset)
    {
        final int length = 12;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 81, dst, dstOffset, length);

        return length;
    }

    public String mifidInstrumentID()
    {
        final byte[] dst = new byte[12];
        buffer.getBytes(this.offset + 81, dst, 0, 12);

        int end = 0;
        for (; end < 12 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidInstrumentID(final Appendable value)
    {
        for (int i = 0; i < 12 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 81 + i) & 0xFF;
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


    public static int mifidExecutionIDId()
    {
        return 11;
    }

    public static int mifidExecutionIDSinceVersion()
    {
        return 0;
    }

    public static int mifidExecutionIDEncodingOffset()
    {
        return 93;
    }

    public static int mifidExecutionIDEncodingLength()
    {
        return 52;
    }

    public static String mifidExecutionIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mifidExecutionIDNullValue()
    {
        return (byte)0;
    }

    public static byte mifidExecutionIDMinValue()
    {
        return (byte)32;
    }

    public static byte mifidExecutionIDMaxValue()
    {
        return (byte)126;
    }

    public static int mifidExecutionIDLength()
    {
        return 52;
    }

    public byte mifidExecutionID(final int index)
    {
        if (index < 0 || index >= 52)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 93 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mifidExecutionIDCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMifidExecutionID(final byte[] dst, final int dstOffset)
    {
        final int length = 52;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 93, dst, dstOffset, length);

        return length;
    }

    public String mifidExecutionID()
    {
        final byte[] dst = new byte[52];
        buffer.getBytes(this.offset + 93, dst, 0, 52);

        int end = 0;
        for (; end < 52 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidExecutionID(final Appendable value)
    {
        for (int i = 0; i < 52 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 93 + i) & 0xFF;
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


    public static int mifidPriceId()
    {
        return 12;
    }

    public static int mifidPriceSinceVersion()
    {
        return 0;
    }

    public static int mifidPriceEncodingOffset()
    {
        return 145;
    }

    public static int mifidPriceEncodingLength()
    {
        return 20;
    }

    public static String mifidPriceMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mifidPriceNullValue()
    {
        return (byte)0;
    }

    public static byte mifidPriceMinValue()
    {
        return (byte)32;
    }

    public static byte mifidPriceMaxValue()
    {
        return (byte)126;
    }

    public static int mifidPriceLength()
    {
        return 20;
    }

    public byte mifidPrice(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 145 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mifidPriceCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMifidPrice(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 145, dst, dstOffset, length);

        return length;
    }

    public String mifidPrice()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 145, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidPrice(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 145 + i) & 0xFF;
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


    public static int mifidQuantityId()
    {
        return 13;
    }

    public static int mifidQuantitySinceVersion()
    {
        return 0;
    }

    public static int mifidQuantityEncodingOffset()
    {
        return 165;
    }

    public static int mifidQuantityEncodingLength()
    {
        return 20;
    }

    public static String mifidQuantityMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mifidQuantityNullValue()
    {
        return (byte)0;
    }

    public static byte mifidQuantityMinValue()
    {
        return (byte)32;
    }

    public static byte mifidQuantityMaxValue()
    {
        return (byte)126;
    }

    public static int mifidQuantityLength()
    {
        return 20;
    }

    public byte mifidQuantity(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 165 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mifidQuantityCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMifidQuantity(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 165, dst, dstOffset, length);

        return length;
    }

    public String mifidQuantity()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 165, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidQuantity(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 165 + i) & 0xFF;
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


    public static int mifidPriceNotationId()
    {
        return 14;
    }

    public static int mifidPriceNotationSinceVersion()
    {
        return 0;
    }

    public static int mifidPriceNotationEncodingOffset()
    {
        return 185;
    }

    public static int mifidPriceNotationEncodingLength()
    {
        return 4;
    }

    public static String mifidPriceNotationMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mifidPriceNotationNullValue()
    {
        return (byte)0;
    }

    public static byte mifidPriceNotationMinValue()
    {
        return (byte)32;
    }

    public static byte mifidPriceNotationMaxValue()
    {
        return (byte)126;
    }

    public static int mifidPriceNotationLength()
    {
        return 4;
    }

    public byte mifidPriceNotation(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 185 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mifidPriceNotationCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMifidPriceNotation(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 185, dst, dstOffset, length);

        return length;
    }

    public String mifidPriceNotation()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 185, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidPriceNotation(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 185 + i) & 0xFF;
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


    public static int mifidCurrencyId()
    {
        return 15;
    }

    public static int mifidCurrencySinceVersion()
    {
        return 0;
    }

    public static int mifidCurrencyEncodingOffset()
    {
        return 189;
    }

    public static int mifidCurrencyEncodingLength()
    {
        return 3;
    }

    public static String mifidCurrencyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mifidCurrencyNullValue()
    {
        return (byte)0;
    }

    public static byte mifidCurrencyMinValue()
    {
        return (byte)32;
    }

    public static byte mifidCurrencyMaxValue()
    {
        return (byte)126;
    }

    public static int mifidCurrencyLength()
    {
        return 3;
    }

    public byte mifidCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 189 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mifidCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMifidCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 189, dst, dstOffset, length);

        return length;
    }

    public String mifidCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 189, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 189 + i) & 0xFF;
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


    public static int miFIDQtyinMsrmtUnitNotationId()
    {
        return 16;
    }

    public static int miFIDQtyinMsrmtUnitNotationSinceVersion()
    {
        return 0;
    }

    public static int miFIDQtyinMsrmtUnitNotationEncodingOffset()
    {
        return 192;
    }

    public static int miFIDQtyinMsrmtUnitNotationEncodingLength()
    {
        return 25;
    }

    public static String miFIDQtyinMsrmtUnitNotationMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte miFIDQtyinMsrmtUnitNotationNullValue()
    {
        return (byte)0;
    }

    public static byte miFIDQtyinMsrmtUnitNotationMinValue()
    {
        return (byte)32;
    }

    public static byte miFIDQtyinMsrmtUnitNotationMaxValue()
    {
        return (byte)126;
    }

    public static int miFIDQtyinMsrmtUnitNotationLength()
    {
        return 25;
    }

    public byte miFIDQtyinMsrmtUnitNotation(final int index)
    {
        if (index < 0 || index >= 25)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 192 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String miFIDQtyinMsrmtUnitNotationCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMiFIDQtyinMsrmtUnitNotation(final byte[] dst, final int dstOffset)
    {
        final int length = 25;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 192, dst, dstOffset, length);

        return length;
    }

    public String miFIDQtyinMsrmtUnitNotation()
    {
        final byte[] dst = new byte[25];
        buffer.getBytes(this.offset + 192, dst, 0, 25);

        int end = 0;
        for (; end < 25 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMiFIDQtyinMsrmtUnitNotation(final Appendable value)
    {
        for (int i = 0; i < 25 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 192 + i) & 0xFF;
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


    public static int mifidQuantityMeasurementUnitId()
    {
        return 17;
    }

    public static int mifidQuantityMeasurementUnitSinceVersion()
    {
        return 0;
    }

    public static int mifidQuantityMeasurementUnitEncodingOffset()
    {
        return 217;
    }

    public static int mifidQuantityMeasurementUnitEncodingLength()
    {
        return 20;
    }

    public static String mifidQuantityMeasurementUnitMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mifidQuantityMeasurementUnitNullValue()
    {
        return (byte)0;
    }

    public static byte mifidQuantityMeasurementUnitMinValue()
    {
        return (byte)32;
    }

    public static byte mifidQuantityMeasurementUnitMaxValue()
    {
        return (byte)126;
    }

    public static int mifidQuantityMeasurementUnitLength()
    {
        return 20;
    }

    public byte mifidQuantityMeasurementUnit(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 217 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mifidQuantityMeasurementUnitCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMifidQuantityMeasurementUnit(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 217, dst, dstOffset, length);

        return length;
    }

    public String mifidQuantityMeasurementUnit()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 217, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidQuantityMeasurementUnit(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 217 + i) & 0xFF;
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


    public static int miFIDNotionalAmountId()
    {
        return 18;
    }

    public static int miFIDNotionalAmountSinceVersion()
    {
        return 0;
    }

    public static int miFIDNotionalAmountEncodingOffset()
    {
        return 237;
    }

    public static int miFIDNotionalAmountEncodingLength()
    {
        return 20;
    }

    public static String miFIDNotionalAmountMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte miFIDNotionalAmountNullValue()
    {
        return (byte)0;
    }

    public static byte miFIDNotionalAmountMinValue()
    {
        return (byte)32;
    }

    public static byte miFIDNotionalAmountMaxValue()
    {
        return (byte)126;
    }

    public static int miFIDNotionalAmountLength()
    {
        return 20;
    }

    public byte miFIDNotionalAmount(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 237 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String miFIDNotionalAmountCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMiFIDNotionalAmount(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 237, dst, dstOffset, length);

        return length;
    }

    public String miFIDNotionalAmount()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 237, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMiFIDNotionalAmount(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 237 + i) & 0xFF;
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


    public static int notionalCurrencyId()
    {
        return 19;
    }

    public static int notionalCurrencySinceVersion()
    {
        return 0;
    }

    public static int notionalCurrencyEncodingOffset()
    {
        return 257;
    }

    public static int notionalCurrencyEncodingLength()
    {
        return 3;
    }

    public static String notionalCurrencyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte notionalCurrencyNullValue()
    {
        return (byte)0;
    }

    public static byte notionalCurrencyMinValue()
    {
        return (byte)32;
    }

    public static byte notionalCurrencyMaxValue()
    {
        return (byte)126;
    }

    public static int notionalCurrencyLength()
    {
        return 3;
    }

    public byte notionalCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 257 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String notionalCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getNotionalCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 257, dst, dstOffset, length);

        return length;
    }

    public String notionalCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 257, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getNotionalCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 257 + i) & 0xFF;
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


    public static int miFIDClearingFlagId()
    {
        return 20;
    }

    public static int miFIDClearingFlagSinceVersion()
    {
        return 0;
    }

    public static int miFIDClearingFlagEncodingOffset()
    {
        return 260;
    }

    public static int miFIDClearingFlagEncodingLength()
    {
        return 5;
    }

    public static String miFIDClearingFlagMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte miFIDClearingFlagNullValue()
    {
        return (byte)0;
    }

    public static byte miFIDClearingFlagMinValue()
    {
        return (byte)32;
    }

    public static byte miFIDClearingFlagMaxValue()
    {
        return (byte)126;
    }

    public static int miFIDClearingFlagLength()
    {
        return 5;
    }

    public byte miFIDClearingFlag(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 260 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String miFIDClearingFlagCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMiFIDClearingFlag(final byte[] dst, final int dstOffset)
    {
        final int length = 5;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 260, dst, dstOffset, length);

        return length;
    }

    public String miFIDClearingFlag()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 260, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMiFIDClearingFlag(final Appendable value)
    {
        for (int i = 0; i < 5 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 260 + i) & 0xFF;
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


    public static int mMTMarketMechanismId()
    {
        return 21;
    }

    public static int mMTMarketMechanismSinceVersion()
    {
        return 0;
    }

    public static int mMTMarketMechanismEncodingOffset()
    {
        return 265;
    }

    public static int mMTMarketMechanismEncodingLength()
    {
        return 1;
    }

    public static String mMTMarketMechanismMetaAttribute(final MetaAttribute metaAttribute)
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

    public MMTMarketMechanism_enum mMTMarketMechanism()
    {
        return MMTMarketMechanism_enum.get(((short)(buffer.getByte(offset + 265) & 0xFF)));
    }


    public static int mMTTradingModeId()
    {
        return 22;
    }

    public static int mMTTradingModeSinceVersion()
    {
        return 0;
    }

    public static int mMTTradingModeEncodingOffset()
    {
        return 266;
    }

    public static int mMTTradingModeEncodingLength()
    {
        return 1;
    }

    public static String mMTTradingModeMetaAttribute(final MetaAttribute metaAttribute)
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

    public MMTTradingMode_enum mMTTradingMode()
    {
        return MMTTradingMode_enum.get(buffer.getByte(offset + 266));
    }


    public static int mMTTransactionCategoryId()
    {
        return 23;
    }

    public static int mMTTransactionCategorySinceVersion()
    {
        return 0;
    }

    public static int mMTTransactionCategoryEncodingOffset()
    {
        return 267;
    }

    public static int mMTTransactionCategoryEncodingLength()
    {
        return 4;
    }

    public static String mMTTransactionCategoryMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTTransactionCategoryNullValue()
    {
        return (byte)0;
    }

    public static byte mMTTransactionCategoryMinValue()
    {
        return (byte)32;
    }

    public static byte mMTTransactionCategoryMaxValue()
    {
        return (byte)126;
    }

    public static int mMTTransactionCategoryLength()
    {
        return 4;
    }

    public byte mMTTransactionCategory(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 267 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTTransactionCategoryCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTTransactionCategory(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 267, dst, dstOffset, length);

        return length;
    }

    public String mMTTransactionCategory()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 267, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTTransactionCategory(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 267 + i) & 0xFF;
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


    public static int mMTNegotiationIndicatorId()
    {
        return 24;
    }

    public static int mMTNegotiationIndicatorSinceVersion()
    {
        return 0;
    }

    public static int mMTNegotiationIndicatorEncodingOffset()
    {
        return 271;
    }

    public static int mMTNegotiationIndicatorEncodingLength()
    {
        return 4;
    }

    public static String mMTNegotiationIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTNegotiationIndicatorNullValue()
    {
        return (byte)0;
    }

    public static byte mMTNegotiationIndicatorMinValue()
    {
        return (byte)32;
    }

    public static byte mMTNegotiationIndicatorMaxValue()
    {
        return (byte)126;
    }

    public static int mMTNegotiationIndicatorLength()
    {
        return 4;
    }

    public byte mMTNegotiationIndicator(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 271 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTNegotiationIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTNegotiationIndicator(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 271, dst, dstOffset, length);

        return length;
    }

    public String mMTNegotiationIndicator()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 271, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTNegotiationIndicator(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 271 + i) & 0xFF;
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


    public static int mMTAgencyCrossTradeIndicatorId()
    {
        return 25;
    }

    public static int mMTAgencyCrossTradeIndicatorSinceVersion()
    {
        return 0;
    }

    public static int mMTAgencyCrossTradeIndicatorEncodingOffset()
    {
        return 275;
    }

    public static int mMTAgencyCrossTradeIndicatorEncodingLength()
    {
        return 4;
    }

    public static String mMTAgencyCrossTradeIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTAgencyCrossTradeIndicatorNullValue()
    {
        return (byte)0;
    }

    public static byte mMTAgencyCrossTradeIndicatorMinValue()
    {
        return (byte)32;
    }

    public static byte mMTAgencyCrossTradeIndicatorMaxValue()
    {
        return (byte)126;
    }

    public static int mMTAgencyCrossTradeIndicatorLength()
    {
        return 4;
    }

    public byte mMTAgencyCrossTradeIndicator(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 275 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTAgencyCrossTradeIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTAgencyCrossTradeIndicator(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 275, dst, dstOffset, length);

        return length;
    }

    public String mMTAgencyCrossTradeIndicator()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 275, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTAgencyCrossTradeIndicator(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 275 + i) & 0xFF;
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


    public static int mMTModificationIndicatorId()
    {
        return 26;
    }

    public static int mMTModificationIndicatorSinceVersion()
    {
        return 0;
    }

    public static int mMTModificationIndicatorEncodingOffset()
    {
        return 279;
    }

    public static int mMTModificationIndicatorEncodingLength()
    {
        return 4;
    }

    public static String mMTModificationIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTModificationIndicatorNullValue()
    {
        return (byte)0;
    }

    public static byte mMTModificationIndicatorMinValue()
    {
        return (byte)32;
    }

    public static byte mMTModificationIndicatorMaxValue()
    {
        return (byte)126;
    }

    public static int mMTModificationIndicatorLength()
    {
        return 4;
    }

    public byte mMTModificationIndicator(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 279 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTModificationIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTModificationIndicator(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 279, dst, dstOffset, length);

        return length;
    }

    public String mMTModificationIndicator()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 279, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTModificationIndicator(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 279 + i) & 0xFF;
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


    public static int mMTBenchmarkIndicatorId()
    {
        return 27;
    }

    public static int mMTBenchmarkIndicatorSinceVersion()
    {
        return 0;
    }

    public static int mMTBenchmarkIndicatorEncodingOffset()
    {
        return 283;
    }

    public static int mMTBenchmarkIndicatorEncodingLength()
    {
        return 4;
    }

    public static String mMTBenchmarkIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTBenchmarkIndicatorNullValue()
    {
        return (byte)0;
    }

    public static byte mMTBenchmarkIndicatorMinValue()
    {
        return (byte)32;
    }

    public static byte mMTBenchmarkIndicatorMaxValue()
    {
        return (byte)126;
    }

    public static int mMTBenchmarkIndicatorLength()
    {
        return 4;
    }

    public byte mMTBenchmarkIndicator(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 283 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTBenchmarkIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTBenchmarkIndicator(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 283, dst, dstOffset, length);

        return length;
    }

    public String mMTBenchmarkIndicator()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 283, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTBenchmarkIndicator(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 283 + i) & 0xFF;
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


    public static int mMTSpecialDividendIndicatorId()
    {
        return 28;
    }

    public static int mMTSpecialDividendIndicatorSinceVersion()
    {
        return 0;
    }

    public static int mMTSpecialDividendIndicatorEncodingOffset()
    {
        return 287;
    }

    public static int mMTSpecialDividendIndicatorEncodingLength()
    {
        return 4;
    }

    public static String mMTSpecialDividendIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTSpecialDividendIndicatorNullValue()
    {
        return (byte)0;
    }

    public static byte mMTSpecialDividendIndicatorMinValue()
    {
        return (byte)32;
    }

    public static byte mMTSpecialDividendIndicatorMaxValue()
    {
        return (byte)126;
    }

    public static int mMTSpecialDividendIndicatorLength()
    {
        return 4;
    }

    public byte mMTSpecialDividendIndicator(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 287 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTSpecialDividendIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTSpecialDividendIndicator(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 287, dst, dstOffset, length);

        return length;
    }

    public String mMTSpecialDividendIndicator()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 287, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTSpecialDividendIndicator(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 287 + i) & 0xFF;
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


    public static int mMTOffBookAutomatedIndicatorId()
    {
        return 29;
    }

    public static int mMTOffBookAutomatedIndicatorSinceVersion()
    {
        return 0;
    }

    public static int mMTOffBookAutomatedIndicatorEncodingOffset()
    {
        return 291;
    }

    public static int mMTOffBookAutomatedIndicatorEncodingLength()
    {
        return 1;
    }

    public static String mMTOffBookAutomatedIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public MMTOffBookAutomatedIndicator_enum mMTOffBookAutomatedIndicator()
    {
        return MMTOffBookAutomatedIndicator_enum.get(buffer.getByte(offset + 291));
    }


    public static int mMTContributiontoPriceId()
    {
        return 30;
    }

    public static int mMTContributiontoPriceSinceVersion()
    {
        return 0;
    }

    public static int mMTContributiontoPriceEncodingOffset()
    {
        return 292;
    }

    public static int mMTContributiontoPriceEncodingLength()
    {
        return 4;
    }

    public static String mMTContributiontoPriceMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTContributiontoPriceNullValue()
    {
        return (byte)0;
    }

    public static byte mMTContributiontoPriceMinValue()
    {
        return (byte)32;
    }

    public static byte mMTContributiontoPriceMaxValue()
    {
        return (byte)126;
    }

    public static int mMTContributiontoPriceLength()
    {
        return 4;
    }

    public byte mMTContributiontoPrice(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 292 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTContributiontoPriceCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTContributiontoPrice(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 292, dst, dstOffset, length);

        return length;
    }

    public String mMTContributiontoPrice()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 292, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTContributiontoPrice(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 292 + i) & 0xFF;
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


    public static int mMTAlgorithmicIndicatorId()
    {
        return 31;
    }

    public static int mMTAlgorithmicIndicatorSinceVersion()
    {
        return 0;
    }

    public static int mMTAlgorithmicIndicatorEncodingOffset()
    {
        return 296;
    }

    public static int mMTAlgorithmicIndicatorEncodingLength()
    {
        return 4;
    }

    public static String mMTAlgorithmicIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTAlgorithmicIndicatorNullValue()
    {
        return (byte)0;
    }

    public static byte mMTAlgorithmicIndicatorMinValue()
    {
        return (byte)32;
    }

    public static byte mMTAlgorithmicIndicatorMaxValue()
    {
        return (byte)126;
    }

    public static int mMTAlgorithmicIndicatorLength()
    {
        return 4;
    }

    public byte mMTAlgorithmicIndicator(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 296 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTAlgorithmicIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTAlgorithmicIndicator(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 296, dst, dstOffset, length);

        return length;
    }

    public String mMTAlgorithmicIndicator()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 296, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTAlgorithmicIndicator(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 296 + i) & 0xFF;
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


    public static int mMTPublicationModeId()
    {
        return 32;
    }

    public static int mMTPublicationModeSinceVersion()
    {
        return 0;
    }

    public static int mMTPublicationModeEncodingOffset()
    {
        return 300;
    }

    public static int mMTPublicationModeEncodingLength()
    {
        return 4;
    }

    public static String mMTPublicationModeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTPublicationModeNullValue()
    {
        return (byte)0;
    }

    public static byte mMTPublicationModeMinValue()
    {
        return (byte)32;
    }

    public static byte mMTPublicationModeMaxValue()
    {
        return (byte)126;
    }

    public static int mMTPublicationModeLength()
    {
        return 4;
    }

    public byte mMTPublicationMode(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 300 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTPublicationModeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTPublicationMode(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 300, dst, dstOffset, length);

        return length;
    }

    public String mMTPublicationMode()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 300, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTPublicationMode(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 300 + i) & 0xFF;
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


    public static int mMTPostTradeDeferralId()
    {
        return 33;
    }

    public static int mMTPostTradeDeferralSinceVersion()
    {
        return 0;
    }

    public static int mMTPostTradeDeferralEncodingOffset()
    {
        return 304;
    }

    public static int mMTPostTradeDeferralEncodingLength()
    {
        return 4;
    }

    public static String mMTPostTradeDeferralMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTPostTradeDeferralNullValue()
    {
        return (byte)0;
    }

    public static byte mMTPostTradeDeferralMinValue()
    {
        return (byte)32;
    }

    public static byte mMTPostTradeDeferralMaxValue()
    {
        return (byte)126;
    }

    public static int mMTPostTradeDeferralLength()
    {
        return 4;
    }

    public byte mMTPostTradeDeferral(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 304 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTPostTradeDeferralCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTPostTradeDeferral(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 304, dst, dstOffset, length);

        return length;
    }

    public String mMTPostTradeDeferral()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 304, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTPostTradeDeferral(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 304 + i) & 0xFF;
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


    public static int mMTDuplicativeIndicatorId()
    {
        return 34;
    }

    public static int mMTDuplicativeIndicatorSinceVersion()
    {
        return 0;
    }

    public static int mMTDuplicativeIndicatorEncodingOffset()
    {
        return 308;
    }

    public static int mMTDuplicativeIndicatorEncodingLength()
    {
        return 4;
    }

    public static String mMTDuplicativeIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mMTDuplicativeIndicatorNullValue()
    {
        return (byte)0;
    }

    public static byte mMTDuplicativeIndicatorMinValue()
    {
        return (byte)32;
    }

    public static byte mMTDuplicativeIndicatorMaxValue()
    {
        return (byte)126;
    }

    public static int mMTDuplicativeIndicatorLength()
    {
        return 4;
    }

    public byte mMTDuplicativeIndicator(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 308 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mMTDuplicativeIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMMTDuplicativeIndicator(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 308, dst, dstOffset, length);

        return length;
    }

    public String mMTDuplicativeIndicator()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 308, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMMTDuplicativeIndicator(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 308 + i) & 0xFF;
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


    public static int tradeQualifierId()
    {
        return 35;
    }

    public static int tradeQualifierSinceVersion()
    {
        return 0;
    }

    public static int tradeQualifierEncodingOffset()
    {
        return 312;
    }

    public static int tradeQualifierEncodingLength()
    {
        return 1;
    }

    public static String tradeQualifierMetaAttribute(final MetaAttribute metaAttribute)
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

    private final TradeQualifier_setDecoder tradeQualifier = new TradeQualifier_setDecoder();

    public TradeQualifier_setDecoder tradeQualifier()
    {
        tradeQualifier.wrap(buffer, offset + 312);
        return tradeQualifier;
    }

    public static int transactionTypeId()
    {
        return 36;
    }

    public static int transactionTypeSinceVersion()
    {
        return 0;
    }

    public static int transactionTypeEncodingOffset()
    {
        return 313;
    }

    public static int transactionTypeEncodingLength()
    {
        return 1;
    }

    public static String transactionTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public TransactionType_enum transactionType()
    {
        return TransactionType_enum.get(((short)(buffer.getByte(offset + 313) & 0xFF)));
    }


    public static int effectiveDateIndicatorId()
    {
        return 37;
    }

    public static int effectiveDateIndicatorSinceVersion()
    {
        return 0;
    }

    public static int effectiveDateIndicatorEncodingOffset()
    {
        return 314;
    }

    public static int effectiveDateIndicatorEncodingLength()
    {
        return 1;
    }

    public static String effectiveDateIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public EffectiveDateIndicator_enum effectiveDateIndicator()
    {
        return EffectiveDateIndicator_enum.get(((short)(buffer.getByte(offset + 314) & 0xFF)));
    }


    public static int blockTradeCodeId()
    {
        return 38;
    }

    public static int blockTradeCodeSinceVersion()
    {
        return 0;
    }

    public static int blockTradeCodeEncodingOffset()
    {
        return 315;
    }

    public static int blockTradeCodeEncodingLength()
    {
        return 1;
    }

    public static String blockTradeCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public BlockTradeCode_enum blockTradeCode()
    {
        return BlockTradeCode_enum.get(buffer.getByte(offset + 315));
    }


    public static int tradeReferenceId()
    {
        return 39;
    }

    public static int tradeReferenceSinceVersion()
    {
        return 0;
    }

    public static int tradeReferenceEncodingOffset()
    {
        return 316;
    }

    public static int tradeReferenceEncodingLength()
    {
        return 30;
    }

    public static String tradeReferenceMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte tradeReferenceNullValue()
    {
        return (byte)0;
    }

    public static byte tradeReferenceMinValue()
    {
        return (byte)32;
    }

    public static byte tradeReferenceMaxValue()
    {
        return (byte)126;
    }

    public static int tradeReferenceLength()
    {
        return 30;
    }

    public byte tradeReference(final int index)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 316 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradeReferenceCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getTradeReference(final byte[] dst, final int dstOffset)
    {
        final int length = 30;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 316, dst, dstOffset, length);

        return length;
    }

    public String tradeReference()
    {
        final byte[] dst = new byte[30];
        buffer.getBytes(this.offset + 316, dst, 0, 30);

        int end = 0;
        for (; end < 30 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getTradeReference(final Appendable value)
    {
        for (int i = 0; i < 30 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 316 + i) & 0xFF;
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


    public static int originalReportTimestampId()
    {
        return 40;
    }

    public static int originalReportTimestampSinceVersion()
    {
        return 0;
    }

    public static int originalReportTimestampEncodingOffset()
    {
        return 346;
    }

    public static int originalReportTimestampEncodingLength()
    {
        return 8;
    }

    public static String originalReportTimestampMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long originalReportTimestampNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long originalReportTimestampMinValue()
    {
        return 0x0L;
    }

    public static long originalReportTimestampMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long originalReportTimestamp()
    {
        return buffer.getLong(offset + 346, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int transparencyIndicatorId()
    {
        return 41;
    }

    public static int transparencyIndicatorSinceVersion()
    {
        return 0;
    }

    public static int transparencyIndicatorEncodingOffset()
    {
        return 354;
    }

    public static int transparencyIndicatorEncodingLength()
    {
        return 1;
    }

    public static String transparencyIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public TransparencyIndicator_enum transparencyIndicator()
    {
        return TransparencyIndicator_enum.get(((short)(buffer.getByte(offset + 354) & 0xFF)));
    }


    public static int currencyCoefficientId()
    {
        return 42;
    }

    public static int currencyCoefficientSinceVersion()
    {
        return 0;
    }

    public static int currencyCoefficientEncodingOffset()
    {
        return 355;
    }

    public static int currencyCoefficientEncodingLength()
    {
        return 4;
    }

    public static String currencyCoefficientMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long currencyCoefficientNullValue()
    {
        return 4294967295L;
    }

    public static long currencyCoefficientMinValue()
    {
        return 0L;
    }

    public static long currencyCoefficientMaxValue()
    {
        return 4294967294L;
    }

    public long currencyCoefficient()
    {
        return (buffer.getInt(offset + 355, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int priceMultiplierId()
    {
        return 43;
    }

    public static int priceMultiplierSinceVersion()
    {
        return 0;
    }

    public static int priceMultiplierEncodingOffset()
    {
        return 359;
    }

    public static int priceMultiplierEncodingLength()
    {
        return 4;
    }

    public static String priceMultiplierMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long priceMultiplierNullValue()
    {
        return 4294967295L;
    }

    public static long priceMultiplierMinValue()
    {
        return 0L;
    }

    public static long priceMultiplierMaxValue()
    {
        return 4294967294L;
    }

    public long priceMultiplier()
    {
        return (buffer.getInt(offset + 359, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int priceMultiplierDecimalsId()
    {
        return 44;
    }

    public static int priceMultiplierDecimalsSinceVersion()
    {
        return 0;
    }

    public static int priceMultiplierDecimalsEncodingOffset()
    {
        return 363;
    }

    public static int priceMultiplierDecimalsEncodingLength()
    {
        return 1;
    }

    public static String priceMultiplierDecimalsMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short priceMultiplierDecimalsNullValue()
    {
        return (short)255;
    }

    public static short priceMultiplierDecimalsMinValue()
    {
        return (short)0;
    }

    public static short priceMultiplierDecimalsMaxValue()
    {
        return (short)254;
    }

    public short priceMultiplierDecimals()
    {
        return ((short)(buffer.getByte(offset + 363) & 0xFF));
    }


    public static int venueId()
    {
        return 45;
    }

    public static int venueSinceVersion()
    {
        return 0;
    }

    public static int venueEncodingOffset()
    {
        return 364;
    }

    public static int venueEncodingLength()
    {
        return 11;
    }

    public static String venueMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte venueNullValue()
    {
        return (byte)0;
    }

    public static byte venueMinValue()
    {
        return (byte)32;
    }

    public static byte venueMaxValue()
    {
        return (byte)126;
    }

    public static int venueLength()
    {
        return 11;
    }

    public byte venue(final int index)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 364 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String venueCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getVenue(final byte[] dst, final int dstOffset)
    {
        final int length = 11;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 364, dst, dstOffset, length);

        return length;
    }

    public String venue()
    {
        final byte[] dst = new byte[11];
        buffer.getBytes(this.offset + 364, dst, 0, 11);

        int end = 0;
        for (; end < 11 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getVenue(final Appendable value)
    {
        for (int i = 0; i < 11 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 364 + i) & 0xFF;
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


    public static int startTimeVwapId()
    {
        return 46;
    }

    public static int startTimeVwapSinceVersion()
    {
        return 0;
    }

    public static int startTimeVwapEncodingOffset()
    {
        return 375;
    }

    public static int startTimeVwapEncodingLength()
    {
        return 4;
    }

    public static String startTimeVwapMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long startTimeVwapNullValue()
    {
        return 4294967295L;
    }

    public static long startTimeVwapMinValue()
    {
        return 0L;
    }

    public static long startTimeVwapMaxValue()
    {
        return 4294967294L;
    }

    public long startTimeVwap()
    {
        return (buffer.getInt(offset + 375, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int endTimeVwapId()
    {
        return 47;
    }

    public static int endTimeVwapSinceVersion()
    {
        return 0;
    }

    public static int endTimeVwapEncodingOffset()
    {
        return 379;
    }

    public static int endTimeVwapEncodingLength()
    {
        return 4;
    }

    public static String endTimeVwapMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long endTimeVwapNullValue()
    {
        return 4294967295L;
    }

    public static long endTimeVwapMinValue()
    {
        return 0L;
    }

    public static long endTimeVwapMaxValue()
    {
        return 4294967294L;
    }

    public long endTimeVwap()
    {
        return (buffer.getInt(offset + 379, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int miFIDEmissionAllowanceTypeId()
    {
        return 48;
    }

    public static int miFIDEmissionAllowanceTypeSinceVersion()
    {
        return 0;
    }

    public static int miFIDEmissionAllowanceTypeEncodingOffset()
    {
        return 383;
    }

    public static int miFIDEmissionAllowanceTypeEncodingLength()
    {
        return 4;
    }

    public static String miFIDEmissionAllowanceTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte miFIDEmissionAllowanceTypeNullValue()
    {
        return (byte)0;
    }

    public static byte miFIDEmissionAllowanceTypeMinValue()
    {
        return (byte)32;
    }

    public static byte miFIDEmissionAllowanceTypeMaxValue()
    {
        return (byte)126;
    }

    public static int miFIDEmissionAllowanceTypeLength()
    {
        return 4;
    }

    public byte miFIDEmissionAllowanceType(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 383 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String miFIDEmissionAllowanceTypeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMiFIDEmissionAllowanceType(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 383, dst, dstOffset, length);

        return length;
    }

    public String miFIDEmissionAllowanceType()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 383, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMiFIDEmissionAllowanceType(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 383 + i) & 0xFF;
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


    public static int marketOfReferenceMICId()
    {
        return 49;
    }

    public static int marketOfReferenceMICSinceVersion()
    {
        return 0;
    }

    public static int marketOfReferenceMICEncodingOffset()
    {
        return 387;
    }

    public static int marketOfReferenceMICEncodingLength()
    {
        return 4;
    }

    public static String marketOfReferenceMICMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte marketOfReferenceMICNullValue()
    {
        return (byte)0;
    }

    public static byte marketOfReferenceMICMinValue()
    {
        return (byte)32;
    }

    public static byte marketOfReferenceMICMaxValue()
    {
        return (byte)126;
    }

    public static int marketOfReferenceMICLength()
    {
        return 4;
    }

    public byte marketOfReferenceMIC(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 387 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String marketOfReferenceMICCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMarketOfReferenceMIC(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 387, dst, dstOffset, length);

        return length;
    }

    public String marketOfReferenceMIC()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 387, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMarketOfReferenceMIC(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 387 + i) & 0xFF;
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



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[FullTradeInformation](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='tradingDateTime', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=27, offset=22, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char27', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=27, offset=22, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradingDateTime=");
        for (int i = 0; i < tradingDateTimeLength() && tradingDateTime(i) > 0; i++)
        {
            builder.append((char)tradingDateTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='publicationDateTime', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=27, offset=49, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char27', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=27, offset=49, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("publicationDateTime=");
        for (int i = 0; i < publicationDateTimeLength() && publicationDateTime(i) > 0; i++)
        {
            builder.append((char)publicationDateTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tradeType', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=1, offset=76, componentTokenCount=43, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='TradeType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=76, componentTokenCount=41, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradeType=");
        builder.append(tradeType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidInstrumentIdType', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=4, offset=77, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=77, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidInstrumentIdType=");
        for (int i = 0; i < mifidInstrumentIdTypeLength() && mifidInstrumentIdType(i) > 0; i++)
        {
            builder.append((char)mifidInstrumentIdType(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidInstrumentID', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=12, offset=81, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char12', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=12, offset=81, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidInstrumentID=");
        for (int i = 0; i < mifidInstrumentIDLength() && mifidInstrumentID(i) > 0; i++)
        {
            builder.append((char)mifidInstrumentID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidExecutionID', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=52, offset=93, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char52', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=52, offset=93, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidExecutionID=");
        for (int i = 0; i < mifidExecutionIDLength() && mifidExecutionID(i) > 0; i++)
        {
            builder.append((char)mifidExecutionID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidPrice', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=20, offset=145, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=145, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidPrice=");
        for (int i = 0; i < mifidPriceLength() && mifidPrice(i) > 0; i++)
        {
            builder.append((char)mifidPrice(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidQuantity', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=20, offset=165, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=165, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidQuantity=");
        for (int i = 0; i < mifidQuantityLength() && mifidQuantity(i) > 0; i++)
        {
            builder.append((char)mifidQuantity(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidPriceNotation', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=4, offset=185, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=185, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidPriceNotation=");
        for (int i = 0; i < mifidPriceNotationLength() && mifidPriceNotation(i) > 0; i++)
        {
            builder.append((char)mifidPriceNotation(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidCurrency', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=3, offset=189, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=189, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidCurrency=");
        for (int i = 0; i < mifidCurrencyLength() && mifidCurrency(i) > 0; i++)
        {
            builder.append((char)mifidCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='miFIDQtyinMsrmtUnitNotation', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=25, offset=192, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char25', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=25, offset=192, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("miFIDQtyinMsrmtUnitNotation=");
        for (int i = 0; i < miFIDQtyinMsrmtUnitNotationLength() && miFIDQtyinMsrmtUnitNotation(i) > 0; i++)
        {
            builder.append((char)miFIDQtyinMsrmtUnitNotation(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidQuantityMeasurementUnit', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=20, offset=217, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=217, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidQuantityMeasurementUnit=");
        for (int i = 0; i < mifidQuantityMeasurementUnitLength() && mifidQuantityMeasurementUnit(i) > 0; i++)
        {
            builder.append((char)mifidQuantityMeasurementUnit(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='miFIDNotionalAmount', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=20, offset=237, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=237, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("miFIDNotionalAmount=");
        for (int i = 0; i < miFIDNotionalAmountLength() && miFIDNotionalAmount(i) > 0; i++)
        {
            builder.append((char)miFIDNotionalAmount(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='notionalCurrency', referencedName='null', description='null', id=19, version=0, deprecated=0, encodedLength=3, offset=257, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=257, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("notionalCurrency=");
        for (int i = 0; i < notionalCurrencyLength() && notionalCurrency(i) > 0; i++)
        {
            builder.append((char)notionalCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='miFIDClearingFlag', referencedName='null', description='null', id=20, version=0, deprecated=0, encodedLength=5, offset=260, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char5', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=260, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("miFIDClearingFlag=");
        for (int i = 0; i < miFIDClearingFlagLength() && miFIDClearingFlag(i) > 0; i++)
        {
            builder.append((char)miFIDClearingFlag(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTMarketMechanism', referencedName='null', description='null', id=21, version=0, deprecated=0, encodedLength=1, offset=265, componentTokenCount=10, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='MMTMarketMechanism_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=265, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTMarketMechanism=");
        builder.append(mMTMarketMechanism());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTTradingMode', referencedName='null', description='null', id=22, version=0, deprecated=0, encodedLength=1, offset=266, componentTokenCount=15, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='MMTTradingMode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=266, componentTokenCount=13, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTTradingMode=");
        builder.append(mMTTradingMode());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTTransactionCategory', referencedName='null', description='null', id=23, version=0, deprecated=0, encodedLength=4, offset=267, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=267, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTTransactionCategory=");
        for (int i = 0; i < mMTTransactionCategoryLength() && mMTTransactionCategory(i) > 0; i++)
        {
            builder.append((char)mMTTransactionCategory(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTNegotiationIndicator', referencedName='null', description='null', id=24, version=0, deprecated=0, encodedLength=4, offset=271, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=271, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTNegotiationIndicator=");
        for (int i = 0; i < mMTNegotiationIndicatorLength() && mMTNegotiationIndicator(i) > 0; i++)
        {
            builder.append((char)mMTNegotiationIndicator(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTAgencyCrossTradeIndicator', referencedName='null', description='null', id=25, version=0, deprecated=0, encodedLength=4, offset=275, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=275, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTAgencyCrossTradeIndicator=");
        for (int i = 0; i < mMTAgencyCrossTradeIndicatorLength() && mMTAgencyCrossTradeIndicator(i) > 0; i++)
        {
            builder.append((char)mMTAgencyCrossTradeIndicator(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTModificationIndicator', referencedName='null', description='null', id=26, version=0, deprecated=0, encodedLength=4, offset=279, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=279, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTModificationIndicator=");
        for (int i = 0; i < mMTModificationIndicatorLength() && mMTModificationIndicator(i) > 0; i++)
        {
            builder.append((char)mMTModificationIndicator(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTBenchmarkIndicator', referencedName='null', description='null', id=27, version=0, deprecated=0, encodedLength=4, offset=283, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=283, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTBenchmarkIndicator=");
        for (int i = 0; i < mMTBenchmarkIndicatorLength() && mMTBenchmarkIndicator(i) > 0; i++)
        {
            builder.append((char)mMTBenchmarkIndicator(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTSpecialDividendIndicator', referencedName='null', description='null', id=28, version=0, deprecated=0, encodedLength=4, offset=287, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=287, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTSpecialDividendIndicator=");
        for (int i = 0; i < mMTSpecialDividendIndicatorLength() && mMTSpecialDividendIndicator(i) > 0; i++)
        {
            builder.append((char)mMTSpecialDividendIndicator(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTOffBookAutomatedIndicator', referencedName='null', description='null', id=29, version=0, deprecated=0, encodedLength=1, offset=291, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='MMTOffBookAutomatedIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=291, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTOffBookAutomatedIndicator=");
        builder.append(mMTOffBookAutomatedIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTContributiontoPrice', referencedName='null', description='null', id=30, version=0, deprecated=0, encodedLength=4, offset=292, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=292, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTContributiontoPrice=");
        for (int i = 0; i < mMTContributiontoPriceLength() && mMTContributiontoPrice(i) > 0; i++)
        {
            builder.append((char)mMTContributiontoPrice(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTAlgorithmicIndicator', referencedName='null', description='null', id=31, version=0, deprecated=0, encodedLength=4, offset=296, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=296, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTAlgorithmicIndicator=");
        for (int i = 0; i < mMTAlgorithmicIndicatorLength() && mMTAlgorithmicIndicator(i) > 0; i++)
        {
            builder.append((char)mMTAlgorithmicIndicator(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTPublicationMode', referencedName='null', description='null', id=32, version=0, deprecated=0, encodedLength=4, offset=300, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=300, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTPublicationMode=");
        for (int i = 0; i < mMTPublicationModeLength() && mMTPublicationMode(i) > 0; i++)
        {
            builder.append((char)mMTPublicationMode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTPostTradeDeferral', referencedName='null', description='null', id=33, version=0, deprecated=0, encodedLength=4, offset=304, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=304, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTPostTradeDeferral=");
        for (int i = 0; i < mMTPostTradeDeferralLength() && mMTPostTradeDeferral(i) > 0; i++)
        {
            builder.append((char)mMTPostTradeDeferral(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mMTDuplicativeIndicator', referencedName='null', description='null', id=34, version=0, deprecated=0, encodedLength=4, offset=308, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=308, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mMTDuplicativeIndicator=");
        for (int i = 0; i < mMTDuplicativeIndicatorLength() && mMTDuplicativeIndicator(i) > 0; i++)
        {
            builder.append((char)mMTDuplicativeIndicator(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tradeQualifier', referencedName='null', description='null', id=35, version=0, deprecated=0, encodedLength=1, offset=312, componentTokenCount=11, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_SET, name='TradeQualifier_set', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=312, componentTokenCount=9, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradeQualifier=");
        builder.append(tradeQualifier());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='transactionType', referencedName='null', description='null', id=36, version=0, deprecated=0, encodedLength=1, offset=313, componentTokenCount=12, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='TransactionType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=313, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("transactionType=");
        builder.append(transactionType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='effectiveDateIndicator', referencedName='null', description='null', id=37, version=0, deprecated=0, encodedLength=1, offset=314, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EffectiveDateIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=314, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("effectiveDateIndicator=");
        builder.append(effectiveDateIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='blockTradeCode', referencedName='null', description='null', id=38, version=0, deprecated=0, encodedLength=1, offset=315, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='BlockTradeCode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=315, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("blockTradeCode=");
        builder.append(blockTradeCode());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tradeReference', referencedName='null', description='null', id=39, version=0, deprecated=0, encodedLength=30, offset=316, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char30', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=30, offset=316, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradeReference=");
        for (int i = 0; i < tradeReferenceLength() && tradeReference(i) > 0; i++)
        {
            builder.append((char)tradeReference(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='originalReportTimestamp', referencedName='null', description='null', id=40, version=0, deprecated=0, encodedLength=8, offset=346, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=346, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("originalReportTimestamp=");
        builder.append(originalReportTimestamp());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='transparencyIndicator', referencedName='null', description='null', id=41, version=0, deprecated=0, encodedLength=1, offset=354, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='TransparencyIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=354, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("transparencyIndicator=");
        builder.append(transparencyIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='currencyCoefficient', referencedName='null', description='null', id=42, version=0, deprecated=0, encodedLength=4, offset=355, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=355, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("currencyCoefficient=");
        builder.append(currencyCoefficient());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='priceMultiplier', referencedName='null', description='null', id=43, version=0, deprecated=0, encodedLength=4, offset=359, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=359, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("priceMultiplier=");
        builder.append(priceMultiplier());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='priceMultiplierDecimals', referencedName='null', description='null', id=44, version=0, deprecated=0, encodedLength=1, offset=363, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=363, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("priceMultiplierDecimals=");
        builder.append(priceMultiplierDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='venue', referencedName='null', description='null', id=45, version=0, deprecated=0, encodedLength=11, offset=364, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char11', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=11, offset=364, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("venue=");
        for (int i = 0; i < venueLength() && venue(i) > 0; i++)
        {
            builder.append((char)venue(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='startTimeVwap', referencedName='null', description='null', id=46, version=0, deprecated=0, encodedLength=4, offset=375, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=375, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("startTimeVwap=");
        builder.append(startTimeVwap());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='endTimeVwap', referencedName='null', description='null', id=47, version=0, deprecated=0, encodedLength=4, offset=379, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=379, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("endTimeVwap=");
        builder.append(endTimeVwap());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='miFIDEmissionAllowanceType', referencedName='null', description='null', id=48, version=0, deprecated=101, encodedLength=4, offset=383, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=383, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("miFIDEmissionAllowanceType=");
        for (int i = 0; i < miFIDEmissionAllowanceTypeLength() && miFIDEmissionAllowanceType(i) > 0; i++)
        {
            builder.append((char)miFIDEmissionAllowanceType(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='marketOfReferenceMIC', referencedName='null', description='null', id=49, version=0, deprecated=101, encodedLength=4, offset=387, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=387, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("marketOfReferenceMIC=");
        for (int i = 0; i < marketOfReferenceMICLength() && marketOfReferenceMIC(i) > 0; i++)
        {
            builder.append((char)marketOfReferenceMIC(i));
        }

        limit(originalLimit);

        return builder;
    }
}

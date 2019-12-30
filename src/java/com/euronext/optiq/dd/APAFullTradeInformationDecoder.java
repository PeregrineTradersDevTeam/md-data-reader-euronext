/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class APAFullTradeInformationDecoder
{
    public static final int BLOCK_LENGTH = 333;
    public static final int TEMPLATE_ID = 1028;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final APAFullTradeInformationDecoder parentMessage = this;
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

    public APAFullTradeInformationDecoder wrap(
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


    public static int tradingDateTimeId()
    {
        return 5;
    }

    public static int tradingDateTimeSinceVersion()
    {
        return 0;
    }

    public static int tradingDateTimeEncodingOffset()
    {
        return 18;
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

        final int pos = this.offset + 18 + (index * 1);

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

        buffer.getBytes(this.offset + 18, dst, dstOffset, length);

        return length;
    }

    public String tradingDateTime()
    {
        final byte[] dst = new byte[27];
        buffer.getBytes(this.offset + 18, dst, 0, 27);

        int end = 0;
        for (; end < 27 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getTradingDateTime(final Appendable value)
    {
        for (int i = 0; i < 27 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 18 + i) & 0xFF;
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
        return 6;
    }

    public static int publicationDateTimeSinceVersion()
    {
        return 0;
    }

    public static int publicationDateTimeEncodingOffset()
    {
        return 45;
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

        final int pos = this.offset + 45 + (index * 1);

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

        buffer.getBytes(this.offset + 45, dst, dstOffset, length);

        return length;
    }

    public String publicationDateTime()
    {
        final byte[] dst = new byte[27];
        buffer.getBytes(this.offset + 45, dst, 0, 27);

        int end = 0;
        for (; end < 27 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getPublicationDateTime(final Appendable value)
    {
        for (int i = 0; i < 27 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 45 + i) & 0xFF;
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
        return 7;
    }

    public static int tradeTypeSinceVersion()
    {
        return 0;
    }

    public static int tradeTypeEncodingOffset()
    {
        return 72;
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
        return TradeType_enum.get(((short)(buffer.getByte(offset + 72) & 0xFF)));
    }


    public static int mifidInstrumentIdTypeId()
    {
        return 8;
    }

    public static int mifidInstrumentIdTypeSinceVersion()
    {
        return 0;
    }

    public static int mifidInstrumentIdTypeEncodingOffset()
    {
        return 73;
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

        final int pos = this.offset + 73 + (index * 1);

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

        buffer.getBytes(this.offset + 73, dst, dstOffset, length);

        return length;
    }

    public String mifidInstrumentIdType()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 73, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidInstrumentIdType(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 73 + i) & 0xFF;
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
        return 9;
    }

    public static int mifidInstrumentIDSinceVersion()
    {
        return 0;
    }

    public static int mifidInstrumentIDEncodingOffset()
    {
        return 77;
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

        final int pos = this.offset + 77 + (index * 1);

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

        buffer.getBytes(this.offset + 77, dst, dstOffset, length);

        return length;
    }

    public String mifidInstrumentID()
    {
        final byte[] dst = new byte[12];
        buffer.getBytes(this.offset + 77, dst, 0, 12);

        int end = 0;
        for (; end < 12 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidInstrumentID(final Appendable value)
    {
        for (int i = 0; i < 12 ; ++i)
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


    public static int miFIDTransactionIDId()
    {
        return 10;
    }

    public static int miFIDTransactionIDSinceVersion()
    {
        return 0;
    }

    public static int miFIDTransactionIDEncodingOffset()
    {
        return 89;
    }

    public static int miFIDTransactionIDEncodingLength()
    {
        return 52;
    }

    public static String miFIDTransactionIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte miFIDTransactionIDNullValue()
    {
        return (byte)0;
    }

    public static byte miFIDTransactionIDMinValue()
    {
        return (byte)32;
    }

    public static byte miFIDTransactionIDMaxValue()
    {
        return (byte)126;
    }

    public static int miFIDTransactionIDLength()
    {
        return 52;
    }

    public byte miFIDTransactionID(final int index)
    {
        if (index < 0 || index >= 52)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 89 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String miFIDTransactionIDCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMiFIDTransactionID(final byte[] dst, final int dstOffset)
    {
        final int length = 52;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 89, dst, dstOffset, length);

        return length;
    }

    public String miFIDTransactionID()
    {
        final byte[] dst = new byte[52];
        buffer.getBytes(this.offset + 89, dst, 0, 52);

        int end = 0;
        for (; end < 52 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMiFIDTransactionID(final Appendable value)
    {
        for (int i = 0; i < 52 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 89 + i) & 0xFF;
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
        return 11;
    }

    public static int mifidPriceSinceVersion()
    {
        return 0;
    }

    public static int mifidPriceEncodingOffset()
    {
        return 141;
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

        final int pos = this.offset + 141 + (index * 1);

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

        buffer.getBytes(this.offset + 141, dst, dstOffset, length);

        return length;
    }

    public String mifidPrice()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 141, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidPrice(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 141 + i) & 0xFF;
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
        return 12;
    }

    public static int mifidQuantitySinceVersion()
    {
        return 0;
    }

    public static int mifidQuantityEncodingOffset()
    {
        return 161;
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

        final int pos = this.offset + 161 + (index * 1);

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

        buffer.getBytes(this.offset + 161, dst, dstOffset, length);

        return length;
    }

    public String mifidQuantity()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 161, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidQuantity(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 161 + i) & 0xFF;
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
        return 13;
    }

    public static int mifidPriceNotationSinceVersion()
    {
        return 0;
    }

    public static int mifidPriceNotationEncodingOffset()
    {
        return 181;
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

        final int pos = this.offset + 181 + (index * 1);

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

        buffer.getBytes(this.offset + 181, dst, dstOffset, length);

        return length;
    }

    public String mifidPriceNotation()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 181, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidPriceNotation(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 181 + i) & 0xFF;
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
        return 14;
    }

    public static int mifidCurrencySinceVersion()
    {
        return 0;
    }

    public static int mifidCurrencyEncodingOffset()
    {
        return 185;
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

        final int pos = this.offset + 185 + (index * 1);

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

        buffer.getBytes(this.offset + 185, dst, dstOffset, length);

        return length;
    }

    public String mifidCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 185, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
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


    public static int miFIDQtyinMsrmtUnitNotationId()
    {
        return 15;
    }

    public static int miFIDQtyinMsrmtUnitNotationSinceVersion()
    {
        return 0;
    }

    public static int miFIDQtyinMsrmtUnitNotationEncodingOffset()
    {
        return 188;
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

        final int pos = this.offset + 188 + (index * 1);

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

        buffer.getBytes(this.offset + 188, dst, dstOffset, length);

        return length;
    }

    public String miFIDQtyinMsrmtUnitNotation()
    {
        final byte[] dst = new byte[25];
        buffer.getBytes(this.offset + 188, dst, 0, 25);

        int end = 0;
        for (; end < 25 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMiFIDQtyinMsrmtUnitNotation(final Appendable value)
    {
        for (int i = 0; i < 25 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 188 + i) & 0xFF;
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
        return 16;
    }

    public static int mifidQuantityMeasurementUnitSinceVersion()
    {
        return 0;
    }

    public static int mifidQuantityMeasurementUnitEncodingOffset()
    {
        return 213;
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

        final int pos = this.offset + 213 + (index * 1);

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

        buffer.getBytes(this.offset + 213, dst, dstOffset, length);

        return length;
    }

    public String mifidQuantityMeasurementUnit()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 213, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidQuantityMeasurementUnit(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 213 + i) & 0xFF;
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
        return 17;
    }

    public static int miFIDNotionalAmountSinceVersion()
    {
        return 0;
    }

    public static int miFIDNotionalAmountEncodingOffset()
    {
        return 233;
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

        final int pos = this.offset + 233 + (index * 1);

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

        buffer.getBytes(this.offset + 233, dst, dstOffset, length);

        return length;
    }

    public String miFIDNotionalAmount()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 233, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMiFIDNotionalAmount(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 233 + i) & 0xFF;
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
        return 18;
    }

    public static int notionalCurrencySinceVersion()
    {
        return 0;
    }

    public static int notionalCurrencyEncodingOffset()
    {
        return 253;
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

        final int pos = this.offset + 253 + (index * 1);

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

        buffer.getBytes(this.offset + 253, dst, dstOffset, length);

        return length;
    }

    public String notionalCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 253, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getNotionalCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 253 + i) & 0xFF;
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
        return 19;
    }

    public static int miFIDClearingFlagSinceVersion()
    {
        return 0;
    }

    public static int miFIDClearingFlagEncodingOffset()
    {
        return 256;
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

        final int pos = this.offset + 256 + (index * 1);

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

        buffer.getBytes(this.offset + 256, dst, dstOffset, length);

        return length;
    }

    public String miFIDClearingFlag()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 256, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMiFIDClearingFlag(final Appendable value)
    {
        for (int i = 0; i < 5 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 256 + i) & 0xFF;
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


    public static int efficientMMTMarketMechanismId()
    {
        return 20;
    }

    public static int efficientMMTMarketMechanismSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTMarketMechanismEncodingOffset()
    {
        return 261;
    }

    public static int efficientMMTMarketMechanismEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTMarketMechanismMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTMarketMechanism_enum efficientMMTMarketMechanism()
    {
        return EfficientMMTMarketMechanism_enum.get(((short)(buffer.getByte(offset + 261) & 0xFF)));
    }


    public static int efficientMMTTradingModeId()
    {
        return 21;
    }

    public static int efficientMMTTradingModeSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTTradingModeEncodingOffset()
    {
        return 262;
    }

    public static int efficientMMTTradingModeEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTTradingModeMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTTradingMode_enum efficientMMTTradingMode()
    {
        return EfficientMMTTradingMode_enum.get(buffer.getByte(offset + 262));
    }


    public static int efficientMMTTransactionCategoryId()
    {
        return 22;
    }

    public static int efficientMMTTransactionCategorySinceVersion()
    {
        return 0;
    }

    public static int efficientMMTTransactionCategoryEncodingOffset()
    {
        return 263;
    }

    public static int efficientMMTTransactionCategoryEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTTransactionCategoryMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTTransactionCategory_enum efficientMMTTransactionCategory()
    {
        return EfficientMMTTransactionCategory_enum.get(buffer.getByte(offset + 263));
    }


    public static int efficientMMTNegotiationIndicatorId()
    {
        return 23;
    }

    public static int efficientMMTNegotiationIndicatorSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTNegotiationIndicatorEncodingOffset()
    {
        return 264;
    }

    public static int efficientMMTNegotiationIndicatorEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTNegotiationIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTNegotiationIndicator_enum efficientMMTNegotiationIndicator()
    {
        return EfficientMMTNegotiationIndicator_enum.get(buffer.getByte(offset + 264));
    }


    public static int efficientMMTAgencyCrossTradeIndicatorId()
    {
        return 24;
    }

    public static int efficientMMTAgencyCrossTradeIndicatorSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTAgencyCrossTradeIndicatorEncodingOffset()
    {
        return 265;
    }

    public static int efficientMMTAgencyCrossTradeIndicatorEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTAgencyCrossTradeIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTAgencyCrossTradeIndicator_enum efficientMMTAgencyCrossTradeIndicator()
    {
        return EfficientMMTAgencyCrossTradeIndicator_enum.get(buffer.getByte(offset + 265));
    }


    public static int efficientMMTModificationIndicatorId()
    {
        return 25;
    }

    public static int efficientMMTModificationIndicatorSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTModificationIndicatorEncodingOffset()
    {
        return 266;
    }

    public static int efficientMMTModificationIndicatorEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTModificationIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTModificationIndicator_enum efficientMMTModificationIndicator()
    {
        return EfficientMMTModificationIndicator_enum.get(buffer.getByte(offset + 266));
    }


    public static int efficientMMTBenchmarkIndicatorId()
    {
        return 26;
    }

    public static int efficientMMTBenchmarkIndicatorSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTBenchmarkIndicatorEncodingOffset()
    {
        return 267;
    }

    public static int efficientMMTBenchmarkIndicatorEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTBenchmarkIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTBenchmarkIndicator_enum efficientMMTBenchmarkIndicator()
    {
        return EfficientMMTBenchmarkIndicator_enum.get(buffer.getByte(offset + 267));
    }


    public static int efficientMMTSpecialDividendIndicatorId()
    {
        return 27;
    }

    public static int efficientMMTSpecialDividendIndicatorSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTSpecialDividendIndicatorEncodingOffset()
    {
        return 268;
    }

    public static int efficientMMTSpecialDividendIndicatorEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTSpecialDividendIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTSpecialDividendIndicator_enum efficientMMTSpecialDividendIndicator()
    {
        return EfficientMMTSpecialDividendIndicator_enum.get(buffer.getByte(offset + 268));
    }


    public static int efficientMMTOffBookAutomatedIndicatorId()
    {
        return 28;
    }

    public static int efficientMMTOffBookAutomatedIndicatorSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTOffBookAutomatedIndicatorEncodingOffset()
    {
        return 269;
    }

    public static int efficientMMTOffBookAutomatedIndicatorEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTOffBookAutomatedIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTOffBookAutomatedIndicator_enum efficientMMTOffBookAutomatedIndicator()
    {
        return EfficientMMTOffBookAutomatedIndicator_enum.get(buffer.getByte(offset + 269));
    }


    public static int efficientMMTContributiontoPriceId()
    {
        return 29;
    }

    public static int efficientMMTContributiontoPriceSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTContributiontoPriceEncodingOffset()
    {
        return 270;
    }

    public static int efficientMMTContributiontoPriceEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTContributiontoPriceMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTContributiontoPrice_enum efficientMMTContributiontoPrice()
    {
        return EfficientMMTContributiontoPrice_enum.get(buffer.getByte(offset + 270));
    }


    public static int efficientMMTAlgorithmicIndicatorId()
    {
        return 30;
    }

    public static int efficientMMTAlgorithmicIndicatorSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTAlgorithmicIndicatorEncodingOffset()
    {
        return 271;
    }

    public static int efficientMMTAlgorithmicIndicatorEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTAlgorithmicIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTAlgorithmicIndicator_enum efficientMMTAlgorithmicIndicator()
    {
        return EfficientMMTAlgorithmicIndicator_enum.get(buffer.getByte(offset + 271));
    }


    public static int efficientMMTPublicationModeId()
    {
        return 31;
    }

    public static int efficientMMTPublicationModeSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTPublicationModeEncodingOffset()
    {
        return 272;
    }

    public static int efficientMMTPublicationModeEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTPublicationModeMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTPublicationMode_enum efficientMMTPublicationMode()
    {
        return EfficientMMTPublicationMode_enum.get(buffer.getByte(offset + 272));
    }


    public static int efficientMMTPostTradeDeferralId()
    {
        return 32;
    }

    public static int efficientMMTPostTradeDeferralSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTPostTradeDeferralEncodingOffset()
    {
        return 273;
    }

    public static int efficientMMTPostTradeDeferralEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTPostTradeDeferralMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTPostTradeDeferral_enum efficientMMTPostTradeDeferral()
    {
        return EfficientMMTPostTradeDeferral_enum.get(buffer.getByte(offset + 273));
    }


    public static int efficientMMTDuplicativeIndicatorId()
    {
        return 33;
    }

    public static int efficientMMTDuplicativeIndicatorSinceVersion()
    {
        return 0;
    }

    public static int efficientMMTDuplicativeIndicatorEncodingOffset()
    {
        return 274;
    }

    public static int efficientMMTDuplicativeIndicatorEncodingLength()
    {
        return 1;
    }

    public static String efficientMMTDuplicativeIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public EfficientMMTDuplicativeIndicator_enum efficientMMTDuplicativeIndicator()
    {
        return EfficientMMTDuplicativeIndicator_enum.get(buffer.getByte(offset + 274));
    }


    public static int tradeReferenceId()
    {
        return 34;
    }

    public static int tradeReferenceSinceVersion()
    {
        return 0;
    }

    public static int tradeReferenceEncodingOffset()
    {
        return 275;
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

        final int pos = this.offset + 275 + (index * 1);

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

        buffer.getBytes(this.offset + 275, dst, dstOffset, length);

        return length;
    }

    public String tradeReference()
    {
        final byte[] dst = new byte[30];
        buffer.getBytes(this.offset + 275, dst, 0, 30);

        int end = 0;
        for (; end < 30 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getTradeReference(final Appendable value)
    {
        for (int i = 0; i < 30 ; ++i)
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


    public static int originalReportTimestampId()
    {
        return 35;
    }

    public static int originalReportTimestampSinceVersion()
    {
        return 0;
    }

    public static int originalReportTimestampEncodingOffset()
    {
        return 305;
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
        return buffer.getLong(offset + 305, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int priceMultiplierId()
    {
        return 36;
    }

    public static int priceMultiplierSinceVersion()
    {
        return 0;
    }

    public static int priceMultiplierEncodingOffset()
    {
        return 313;
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
        return (buffer.getInt(offset + 313, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int priceMultiplierDecimalsId()
    {
        return 37;
    }

    public static int priceMultiplierDecimalsSinceVersion()
    {
        return 0;
    }

    public static int priceMultiplierDecimalsEncodingOffset()
    {
        return 317;
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
        return ((short)(buffer.getByte(offset + 317) & 0xFF));
    }


    public static int venueId()
    {
        return 38;
    }

    public static int venueSinceVersion()
    {
        return 0;
    }

    public static int venueEncodingOffset()
    {
        return 318;
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

        final int pos = this.offset + 318 + (index * 1);

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

        buffer.getBytes(this.offset + 318, dst, dstOffset, length);

        return length;
    }

    public String venue()
    {
        final byte[] dst = new byte[11];
        buffer.getBytes(this.offset + 318, dst, 0, 11);

        int end = 0;
        for (; end < 11 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getVenue(final Appendable value)
    {
        for (int i = 0; i < 11 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 318 + i) & 0xFF;
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


    public static int miFIDEmissionAllowanceTypeId()
    {
        return 39;
    }

    public static int miFIDEmissionAllowanceTypeSinceVersion()
    {
        return 0;
    }

    public static int miFIDEmissionAllowanceTypeEncodingOffset()
    {
        return 329;
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

        final int pos = this.offset + 329 + (index * 1);

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

        buffer.getBytes(this.offset + 329, dst, dstOffset, length);

        return length;
    }

    public String miFIDEmissionAllowanceType()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 329, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMiFIDEmissionAllowanceType(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 329 + i) & 0xFF;
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
        builder.append("[APAFullTradeInformation](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='tradingDateTime', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=27, offset=18, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char27', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=27, offset=18, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradingDateTime=");
        for (int i = 0; i < tradingDateTimeLength() && tradingDateTime(i) > 0; i++)
        {
            builder.append((char)tradingDateTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='publicationDateTime', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=27, offset=45, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char27', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=27, offset=45, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("publicationDateTime=");
        for (int i = 0; i < publicationDateTimeLength() && publicationDateTime(i) > 0; i++)
        {
            builder.append((char)publicationDateTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tradeType', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=1, offset=72, componentTokenCount=43, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='TradeType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=72, componentTokenCount=41, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradeType=");
        builder.append(tradeType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidInstrumentIdType', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=4, offset=73, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=73, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidInstrumentIdType=");
        for (int i = 0; i < mifidInstrumentIdTypeLength() && mifidInstrumentIdType(i) > 0; i++)
        {
            builder.append((char)mifidInstrumentIdType(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidInstrumentID', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=12, offset=77, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char12', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=12, offset=77, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidInstrumentID=");
        for (int i = 0; i < mifidInstrumentIDLength() && mifidInstrumentID(i) > 0; i++)
        {
            builder.append((char)mifidInstrumentID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='miFIDTransactionID', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=52, offset=89, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char52', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=52, offset=89, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("miFIDTransactionID=");
        for (int i = 0; i < miFIDTransactionIDLength() && miFIDTransactionID(i) > 0; i++)
        {
            builder.append((char)miFIDTransactionID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidPrice', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=20, offset=141, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=141, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidPrice=");
        for (int i = 0; i < mifidPriceLength() && mifidPrice(i) > 0; i++)
        {
            builder.append((char)mifidPrice(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidQuantity', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=20, offset=161, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=161, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidQuantity=");
        for (int i = 0; i < mifidQuantityLength() && mifidQuantity(i) > 0; i++)
        {
            builder.append((char)mifidQuantity(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidPriceNotation', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=4, offset=181, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=181, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidPriceNotation=");
        for (int i = 0; i < mifidPriceNotationLength() && mifidPriceNotation(i) > 0; i++)
        {
            builder.append((char)mifidPriceNotation(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidCurrency', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=3, offset=185, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=185, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidCurrency=");
        for (int i = 0; i < mifidCurrencyLength() && mifidCurrency(i) > 0; i++)
        {
            builder.append((char)mifidCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='miFIDQtyinMsrmtUnitNotation', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=25, offset=188, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char25', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=25, offset=188, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("miFIDQtyinMsrmtUnitNotation=");
        for (int i = 0; i < miFIDQtyinMsrmtUnitNotationLength() && miFIDQtyinMsrmtUnitNotation(i) > 0; i++)
        {
            builder.append((char)miFIDQtyinMsrmtUnitNotation(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidQuantityMeasurementUnit', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=20, offset=213, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=213, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidQuantityMeasurementUnit=");
        for (int i = 0; i < mifidQuantityMeasurementUnitLength() && mifidQuantityMeasurementUnit(i) > 0; i++)
        {
            builder.append((char)mifidQuantityMeasurementUnit(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='miFIDNotionalAmount', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=20, offset=233, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=233, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("miFIDNotionalAmount=");
        for (int i = 0; i < miFIDNotionalAmountLength() && miFIDNotionalAmount(i) > 0; i++)
        {
            builder.append((char)miFIDNotionalAmount(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='notionalCurrency', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=3, offset=253, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=253, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("notionalCurrency=");
        for (int i = 0; i < notionalCurrencyLength() && notionalCurrency(i) > 0; i++)
        {
            builder.append((char)notionalCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='miFIDClearingFlag', referencedName='null', description='null', id=19, version=0, deprecated=0, encodedLength=5, offset=256, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char5', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=256, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("miFIDClearingFlag=");
        for (int i = 0; i < miFIDClearingFlagLength() && miFIDClearingFlag(i) > 0; i++)
        {
            builder.append((char)miFIDClearingFlag(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTMarketMechanism', referencedName='null', description='null', id=20, version=0, deprecated=0, encodedLength=1, offset=261, componentTokenCount=11, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTMarketMechanism_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=261, componentTokenCount=9, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTMarketMechanism=");
        builder.append(efficientMMTMarketMechanism());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTTradingMode', referencedName='null', description='null', id=21, version=0, deprecated=0, encodedLength=1, offset=262, componentTokenCount=15, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTTradingMode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=262, componentTokenCount=13, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTTradingMode=");
        builder.append(efficientMMTTradingMode());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTTransactionCategory', referencedName='null', description='null', id=22, version=0, deprecated=0, encodedLength=1, offset=263, componentTokenCount=9, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTTransactionCategory_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=263, componentTokenCount=7, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTTransactionCategory=");
        builder.append(efficientMMTTransactionCategory());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTNegotiationIndicator', referencedName='null', description='null', id=23, version=0, deprecated=0, encodedLength=1, offset=264, componentTokenCount=12, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTNegotiationIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=264, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTNegotiationIndicator=");
        builder.append(efficientMMTNegotiationIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTAgencyCrossTradeIndicator', referencedName='null', description='null', id=24, version=0, deprecated=0, encodedLength=1, offset=265, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTAgencyCrossTradeIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=265, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTAgencyCrossTradeIndicator=");
        builder.append(efficientMMTAgencyCrossTradeIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTModificationIndicator', referencedName='null', description='null', id=25, version=0, deprecated=0, encodedLength=1, offset=266, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTModificationIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=266, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTModificationIndicator=");
        builder.append(efficientMMTModificationIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTBenchmarkIndicator', referencedName='null', description='null', id=26, version=0, deprecated=0, encodedLength=1, offset=267, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTBenchmarkIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=267, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTBenchmarkIndicator=");
        builder.append(efficientMMTBenchmarkIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTSpecialDividendIndicator', referencedName='null', description='null', id=27, version=0, deprecated=0, encodedLength=1, offset=268, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTSpecialDividendIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=268, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTSpecialDividendIndicator=");
        builder.append(efficientMMTSpecialDividendIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTOffBookAutomatedIndicator', referencedName='null', description='null', id=28, version=0, deprecated=0, encodedLength=1, offset=269, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTOffBookAutomatedIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=269, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTOffBookAutomatedIndicator=");
        builder.append(efficientMMTOffBookAutomatedIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTContributiontoPrice', referencedName='null', description='null', id=29, version=0, deprecated=0, encodedLength=1, offset=270, componentTokenCount=8, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTContributiontoPrice_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=270, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTContributiontoPrice=");
        builder.append(efficientMMTContributiontoPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTAlgorithmicIndicator', referencedName='null', description='null', id=30, version=0, deprecated=0, encodedLength=1, offset=271, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTAlgorithmicIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=271, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTAlgorithmicIndicator=");
        builder.append(efficientMMTAlgorithmicIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTPublicationMode', referencedName='null', description='null', id=31, version=0, deprecated=0, encodedLength=1, offset=272, componentTokenCount=11, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTPublicationMode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=272, componentTokenCount=9, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTPublicationMode=");
        builder.append(efficientMMTPublicationMode());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTPostTradeDeferral', referencedName='null', description='null', id=32, version=0, deprecated=0, encodedLength=1, offset=273, componentTokenCount=16, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTPostTradeDeferral_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=273, componentTokenCount=14, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTPostTradeDeferral=");
        builder.append(efficientMMTPostTradeDeferral());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='efficientMMTDuplicativeIndicator', referencedName='null', description='null', id=33, version=0, deprecated=0, encodedLength=1, offset=274, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='EfficientMMTDuplicativeIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=274, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("efficientMMTDuplicativeIndicator=");
        builder.append(efficientMMTDuplicativeIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tradeReference', referencedName='null', description='null', id=34, version=0, deprecated=0, encodedLength=30, offset=275, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char30', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=30, offset=275, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradeReference=");
        for (int i = 0; i < tradeReferenceLength() && tradeReference(i) > 0; i++)
        {
            builder.append((char)tradeReference(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='originalReportTimestamp', referencedName='null', description='null', id=35, version=0, deprecated=0, encodedLength=8, offset=305, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=305, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("originalReportTimestamp=");
        builder.append(originalReportTimestamp());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='priceMultiplier', referencedName='null', description='null', id=36, version=0, deprecated=0, encodedLength=4, offset=313, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=313, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("priceMultiplier=");
        builder.append(priceMultiplier());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='priceMultiplierDecimals', referencedName='null', description='null', id=37, version=0, deprecated=0, encodedLength=1, offset=317, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=317, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("priceMultiplierDecimals=");
        builder.append(priceMultiplierDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='venue', referencedName='null', description='null', id=38, version=0, deprecated=0, encodedLength=11, offset=318, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char11', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=11, offset=318, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("venue=");
        for (int i = 0; i < venueLength() && venue(i) > 0; i++)
        {
            builder.append((char)venue(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='miFIDEmissionAllowanceType', referencedName='null', description='null', id=39, version=0, deprecated=0, encodedLength=4, offset=329, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=329, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("miFIDEmissionAllowanceType=");
        for (int i = 0; i < miFIDEmissionAllowanceTypeLength() && miFIDEmissionAllowanceType(i) > 0; i++)
        {
            builder.append((char)miFIDEmissionAllowanceType(i));
        }

        limit(originalLimit);

        return builder;
    }
}

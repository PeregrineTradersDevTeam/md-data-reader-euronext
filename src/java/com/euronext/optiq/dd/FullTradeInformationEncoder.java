/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class FullTradeInformationEncoder
{
    public static final int BLOCK_LENGTH = 391;
    public static final int TEMPLATE_ID = 1004;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final FullTradeInformationEncoder parentMessage = this;
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

    public FullTradeInformationEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public FullTradeInformationEncoder wrapAndApplyHeader(
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

    public FullTradeInformationEncoder mDSeqNum(final long value)
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

    public FullTradeInformationEncoder rebroadcastIndicator(final short value)
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

    public FullTradeInformationEncoder eMM(final EMM_enum value)
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

    public FullTradeInformationEncoder eventTime(final long value)
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

    public FullTradeInformationEncoder symbolIndex(final long value)
    {
        buffer.putInt(offset + 18, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public FullTradeInformationEncoder tradingDateTime(final int index, final byte value)
    {
        if (index < 0 || index >= 27)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 22 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tradingDateTimeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putTradingDateTime(final byte[] src, final int srcOffset)
    {
        final int length = 27;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 22, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder tradingDateTime(final String src)
    {
        final int length = 27;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 22, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 22 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder tradingDateTime(final CharSequence src)
    {
        final int length = 27;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 22 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 22 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder publicationDateTime(final int index, final byte value)
    {
        if (index < 0 || index >= 27)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 49 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String publicationDateTimeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putPublicationDateTime(final byte[] src, final int srcOffset)
    {
        final int length = 27;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 49, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder publicationDateTime(final String src)
    {
        final int length = 27;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 49, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 49 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder publicationDateTime(final CharSequence src)
    {
        final int length = 27;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 49 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 49 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder tradeType(final TradeType_enum value)
    {
        buffer.putByte(offset + 76, (byte)value.value());
        return this;
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

    public FullTradeInformationEncoder mifidInstrumentIdType(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 77 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidInstrumentIdTypeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMifidInstrumentIdType(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 77, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mifidInstrumentIdType(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 77, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 77 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mifidInstrumentIdType(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 77 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 77 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mifidInstrumentID(final int index, final byte value)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 81 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidInstrumentIDCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMifidInstrumentID(final byte[] src, final int srcOffset)
    {
        final int length = 12;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 81, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mifidInstrumentID(final String src)
    {
        final int length = 12;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 81, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 81 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mifidInstrumentID(final CharSequence src)
    {
        final int length = 12;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 81 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 81 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mifidExecutionID(final int index, final byte value)
    {
        if (index < 0 || index >= 52)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 93 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidExecutionIDCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMifidExecutionID(final byte[] src, final int srcOffset)
    {
        final int length = 52;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 93, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mifidExecutionID(final String src)
    {
        final int length = 52;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 93, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 93 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mifidExecutionID(final CharSequence src)
    {
        final int length = 52;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 93 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 93 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mifidPrice(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 145 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidPriceCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMifidPrice(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 145, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mifidPrice(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 145, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 145 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mifidPrice(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 145 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 145 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mifidQuantity(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 165 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidQuantityCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMifidQuantity(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 165, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mifidQuantity(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 165, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 165 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mifidQuantity(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 165 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 165 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mifidPriceNotation(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 185 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidPriceNotationCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMifidPriceNotation(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 185, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mifidPriceNotation(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 185, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 185 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mifidPriceNotation(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 185 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 185 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mifidCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 189 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMifidCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 189, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mifidCurrency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 189, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 189 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mifidCurrency(final CharSequence src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 189 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 189 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder miFIDQtyinMsrmtUnitNotation(final int index, final byte value)
    {
        if (index < 0 || index >= 25)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 192 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String miFIDQtyinMsrmtUnitNotationCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMiFIDQtyinMsrmtUnitNotation(final byte[] src, final int srcOffset)
    {
        final int length = 25;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 192, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder miFIDQtyinMsrmtUnitNotation(final String src)
    {
        final int length = 25;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 192, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 192 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder miFIDQtyinMsrmtUnitNotation(final CharSequence src)
    {
        final int length = 25;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 192 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 192 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mifidQuantityMeasurementUnit(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 217 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidQuantityMeasurementUnitCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMifidQuantityMeasurementUnit(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 217, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mifidQuantityMeasurementUnit(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 217, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 217 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mifidQuantityMeasurementUnit(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 217 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 217 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder miFIDNotionalAmount(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 237 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String miFIDNotionalAmountCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMiFIDNotionalAmount(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 237, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder miFIDNotionalAmount(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 237, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 237 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder miFIDNotionalAmount(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 237 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 237 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder notionalCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 257 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String notionalCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putNotionalCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 257, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder notionalCurrency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 257, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 257 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder notionalCurrency(final CharSequence src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 257 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 257 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder miFIDClearingFlag(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 260 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String miFIDClearingFlagCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMiFIDClearingFlag(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 260, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder miFIDClearingFlag(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 260, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 260 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder miFIDClearingFlag(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 260 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 260 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTMarketMechanism(final MMTMarketMechanism_enum value)
    {
        buffer.putByte(offset + 265, (byte)value.value());
        return this;
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

    public FullTradeInformationEncoder mMTTradingMode(final MMTTradingMode_enum value)
    {
        buffer.putByte(offset + 266, value.value());
        return this;
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

    public FullTradeInformationEncoder mMTTransactionCategory(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 267 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTTransactionCategoryCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTTransactionCategory(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 267, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTTransactionCategory(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 267, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 267 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTTransactionCategory(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 267 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 267 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTNegotiationIndicator(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 271 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTNegotiationIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTNegotiationIndicator(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 271, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTNegotiationIndicator(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 271, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 271 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTNegotiationIndicator(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 271 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 271 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTAgencyCrossTradeIndicator(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 275 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTAgencyCrossTradeIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTAgencyCrossTradeIndicator(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 275, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTAgencyCrossTradeIndicator(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 275, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 275 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTAgencyCrossTradeIndicator(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 275 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 275 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTModificationIndicator(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 279 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTModificationIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTModificationIndicator(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 279, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTModificationIndicator(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 279, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 279 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTModificationIndicator(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 279 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 279 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTBenchmarkIndicator(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 283 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTBenchmarkIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTBenchmarkIndicator(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 283, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTBenchmarkIndicator(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 283, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 283 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTBenchmarkIndicator(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 283 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 283 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTSpecialDividendIndicator(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 287 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTSpecialDividendIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTSpecialDividendIndicator(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 287, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTSpecialDividendIndicator(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 287, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 287 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTSpecialDividendIndicator(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 287 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 287 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTOffBookAutomatedIndicator(final MMTOffBookAutomatedIndicator_enum value)
    {
        buffer.putByte(offset + 291, value.value());
        return this;
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

    public FullTradeInformationEncoder mMTContributiontoPrice(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 292 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTContributiontoPriceCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTContributiontoPrice(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 292, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTContributiontoPrice(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 292, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 292 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTContributiontoPrice(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 292 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 292 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTAlgorithmicIndicator(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 296 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTAlgorithmicIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTAlgorithmicIndicator(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 296, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTAlgorithmicIndicator(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 296, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 296 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTAlgorithmicIndicator(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 296 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 296 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTPublicationMode(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 300 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTPublicationModeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTPublicationMode(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 300, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTPublicationMode(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 300, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 300 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTPublicationMode(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 300 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 300 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTPostTradeDeferral(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 304 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTPostTradeDeferralCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTPostTradeDeferral(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 304, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTPostTradeDeferral(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 304, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 304 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTPostTradeDeferral(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 304 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 304 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder mMTDuplicativeIndicator(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 308 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mMTDuplicativeIndicatorCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMMTDuplicativeIndicator(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 308, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder mMTDuplicativeIndicator(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 308, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 308 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder mMTDuplicativeIndicator(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 308 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 308 + i, (byte)0);
        }

        return this;
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

    private final TradeQualifier_setEncoder tradeQualifier = new TradeQualifier_setEncoder();

    public TradeQualifier_setEncoder tradeQualifier()
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

    public FullTradeInformationEncoder transactionType(final TransactionType_enum value)
    {
        buffer.putByte(offset + 313, (byte)value.value());
        return this;
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

    public FullTradeInformationEncoder effectiveDateIndicator(final EffectiveDateIndicator_enum value)
    {
        buffer.putByte(offset + 314, (byte)value.value());
        return this;
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

    public FullTradeInformationEncoder blockTradeCode(final BlockTradeCode_enum value)
    {
        buffer.putByte(offset + 315, value.value());
        return this;
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

    public FullTradeInformationEncoder tradeReference(final int index, final byte value)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 316 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tradeReferenceCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putTradeReference(final byte[] src, final int srcOffset)
    {
        final int length = 30;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 316, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder tradeReference(final String src)
    {
        final int length = 30;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 316, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 316 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder tradeReference(final CharSequence src)
    {
        final int length = 30;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 316 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 316 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder originalReportTimestamp(final long value)
    {
        buffer.putLong(offset + 346, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public FullTradeInformationEncoder transparencyIndicator(final TransparencyIndicator_enum value)
    {
        buffer.putByte(offset + 354, (byte)value.value());
        return this;
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

    public FullTradeInformationEncoder currencyCoefficient(final long value)
    {
        buffer.putInt(offset + 355, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public FullTradeInformationEncoder priceMultiplier(final long value)
    {
        buffer.putInt(offset + 359, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public FullTradeInformationEncoder priceMultiplierDecimals(final short value)
    {
        buffer.putByte(offset + 363, (byte)value);
        return this;
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

    public FullTradeInformationEncoder venue(final int index, final byte value)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 364 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String venueCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putVenue(final byte[] src, final int srcOffset)
    {
        final int length = 11;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 364, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder venue(final String src)
    {
        final int length = 11;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 364, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 364 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder venue(final CharSequence src)
    {
        final int length = 11;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 364 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 364 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder startTimeVwap(final long value)
    {
        buffer.putInt(offset + 375, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public FullTradeInformationEncoder endTimeVwap(final long value)
    {
        buffer.putInt(offset + 379, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public FullTradeInformationEncoder miFIDEmissionAllowanceType(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 383 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String miFIDEmissionAllowanceTypeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMiFIDEmissionAllowanceType(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 383, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder miFIDEmissionAllowanceType(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 383, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 383 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder miFIDEmissionAllowanceType(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 383 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 383 + i, (byte)0);
        }

        return this;
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

    public FullTradeInformationEncoder marketOfReferenceMIC(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 387 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String marketOfReferenceMICCharacterEncoding()
    {
        return "US-ASCII";
    }

    public FullTradeInformationEncoder putMarketOfReferenceMIC(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 387, src, srcOffset, length);

        return this;
    }

    public FullTradeInformationEncoder marketOfReferenceMIC(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 387, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 387 + start, (byte)0);
        }

        return this;
    }

    public FullTradeInformationEncoder marketOfReferenceMIC(final CharSequence src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 387 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 387 + i, (byte)0);
        }

        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        FullTradeInformationDecoder writer = new FullTradeInformationDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

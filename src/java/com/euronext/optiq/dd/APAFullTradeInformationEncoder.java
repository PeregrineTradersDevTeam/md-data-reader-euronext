/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class APAFullTradeInformationEncoder
{
    public static final int BLOCK_LENGTH = 333;
    public static final int TEMPLATE_ID = 1028;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final APAFullTradeInformationEncoder parentMessage = this;
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

    public APAFullTradeInformationEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public APAFullTradeInformationEncoder wrapAndApplyHeader(
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

    public APAFullTradeInformationEncoder mDSeqNum(final long value)
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

    public APAFullTradeInformationEncoder rebroadcastIndicator(final short value)
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

    public APAFullTradeInformationEncoder eMM(final EMM_enum value)
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

    public APAFullTradeInformationEncoder eventTime(final long value)
    {
        buffer.putLong(offset + 10, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public APAFullTradeInformationEncoder tradingDateTime(final int index, final byte value)
    {
        if (index < 0 || index >= 27)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 18 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tradingDateTimeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putTradingDateTime(final byte[] src, final int srcOffset)
    {
        final int length = 27;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 18, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder tradingDateTime(final String src)
    {
        final int length = 27;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 18, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 18 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder tradingDateTime(final CharSequence src)
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
            buffer.putByte(this.offset + 18 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 18 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder publicationDateTime(final int index, final byte value)
    {
        if (index < 0 || index >= 27)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 45 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String publicationDateTimeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putPublicationDateTime(final byte[] src, final int srcOffset)
    {
        final int length = 27;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 45, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder publicationDateTime(final String src)
    {
        final int length = 27;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 45, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 45 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder publicationDateTime(final CharSequence src)
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
            buffer.putByte(this.offset + 45 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 45 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder tradeType(final TradeType_enum value)
    {
        buffer.putByte(offset + 72, (byte)value.value());
        return this;
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

    public APAFullTradeInformationEncoder mifidInstrumentIdType(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 73 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidInstrumentIdTypeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMifidInstrumentIdType(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 73, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder mifidInstrumentIdType(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 73, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 73 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder mifidInstrumentIdType(final CharSequence src)
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
            buffer.putByte(this.offset + 73 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 73 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder mifidInstrumentID(final int index, final byte value)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 77 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidInstrumentIDCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMifidInstrumentID(final byte[] src, final int srcOffset)
    {
        final int length = 12;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 77, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder mifidInstrumentID(final String src)
    {
        final int length = 12;
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

    public APAFullTradeInformationEncoder mifidInstrumentID(final CharSequence src)
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
            buffer.putByte(this.offset + 77 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 77 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder miFIDTransactionID(final int index, final byte value)
    {
        if (index < 0 || index >= 52)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 89 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String miFIDTransactionIDCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMiFIDTransactionID(final byte[] src, final int srcOffset)
    {
        final int length = 52;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 89, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder miFIDTransactionID(final String src)
    {
        final int length = 52;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 89, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 89 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder miFIDTransactionID(final CharSequence src)
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
            buffer.putByte(this.offset + 89 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 89 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder mifidPrice(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 141 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidPriceCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMifidPrice(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 141, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder mifidPrice(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 141, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 141 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder mifidPrice(final CharSequence src)
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
            buffer.putByte(this.offset + 141 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 141 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder mifidQuantity(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 161 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidQuantityCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMifidQuantity(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 161, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder mifidQuantity(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 161, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 161 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder mifidQuantity(final CharSequence src)
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
            buffer.putByte(this.offset + 161 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 161 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder mifidPriceNotation(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 181 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidPriceNotationCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMifidPriceNotation(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 181, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder mifidPriceNotation(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 181, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 181 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder mifidPriceNotation(final CharSequence src)
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
            buffer.putByte(this.offset + 181 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 181 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder mifidCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 185 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMifidCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 185, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder mifidCurrency(final String src)
    {
        final int length = 3;
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

    public APAFullTradeInformationEncoder mifidCurrency(final CharSequence src)
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
            buffer.putByte(this.offset + 185 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 185 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder miFIDQtyinMsrmtUnitNotation(final int index, final byte value)
    {
        if (index < 0 || index >= 25)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 188 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String miFIDQtyinMsrmtUnitNotationCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMiFIDQtyinMsrmtUnitNotation(final byte[] src, final int srcOffset)
    {
        final int length = 25;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 188, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder miFIDQtyinMsrmtUnitNotation(final String src)
    {
        final int length = 25;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 188, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 188 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder miFIDQtyinMsrmtUnitNotation(final CharSequence src)
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
            buffer.putByte(this.offset + 188 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 188 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder mifidQuantityMeasurementUnit(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 213 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidQuantityMeasurementUnitCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMifidQuantityMeasurementUnit(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 213, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder mifidQuantityMeasurementUnit(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 213, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 213 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder mifidQuantityMeasurementUnit(final CharSequence src)
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
            buffer.putByte(this.offset + 213 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 213 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder miFIDNotionalAmount(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 233 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String miFIDNotionalAmountCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMiFIDNotionalAmount(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 233, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder miFIDNotionalAmount(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 233, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 233 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder miFIDNotionalAmount(final CharSequence src)
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
            buffer.putByte(this.offset + 233 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 233 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder notionalCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 253 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String notionalCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putNotionalCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 253, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder notionalCurrency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 253, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 253 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder notionalCurrency(final CharSequence src)
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
            buffer.putByte(this.offset + 253 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 253 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder miFIDClearingFlag(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 256 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String miFIDClearingFlagCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMiFIDClearingFlag(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 256, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder miFIDClearingFlag(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 256, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 256 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder miFIDClearingFlag(final CharSequence src)
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
            buffer.putByte(this.offset + 256 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 256 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder efficientMMTMarketMechanism(final EfficientMMTMarketMechanism_enum value)
    {
        buffer.putByte(offset + 261, (byte)value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTTradingMode(final EfficientMMTTradingMode_enum value)
    {
        buffer.putByte(offset + 262, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTTransactionCategory(final EfficientMMTTransactionCategory_enum value)
    {
        buffer.putByte(offset + 263, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTNegotiationIndicator(final EfficientMMTNegotiationIndicator_enum value)
    {
        buffer.putByte(offset + 264, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTAgencyCrossTradeIndicator(final EfficientMMTAgencyCrossTradeIndicator_enum value)
    {
        buffer.putByte(offset + 265, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTModificationIndicator(final EfficientMMTModificationIndicator_enum value)
    {
        buffer.putByte(offset + 266, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTBenchmarkIndicator(final EfficientMMTBenchmarkIndicator_enum value)
    {
        buffer.putByte(offset + 267, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTSpecialDividendIndicator(final EfficientMMTSpecialDividendIndicator_enum value)
    {
        buffer.putByte(offset + 268, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTOffBookAutomatedIndicator(final EfficientMMTOffBookAutomatedIndicator_enum value)
    {
        buffer.putByte(offset + 269, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTContributiontoPrice(final EfficientMMTContributiontoPrice_enum value)
    {
        buffer.putByte(offset + 270, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTAlgorithmicIndicator(final EfficientMMTAlgorithmicIndicator_enum value)
    {
        buffer.putByte(offset + 271, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTPublicationMode(final EfficientMMTPublicationMode_enum value)
    {
        buffer.putByte(offset + 272, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTPostTradeDeferral(final EfficientMMTPostTradeDeferral_enum value)
    {
        buffer.putByte(offset + 273, value.value());
        return this;
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

    public APAFullTradeInformationEncoder efficientMMTDuplicativeIndicator(final EfficientMMTDuplicativeIndicator_enum value)
    {
        buffer.putByte(offset + 274, value.value());
        return this;
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

    public APAFullTradeInformationEncoder tradeReference(final int index, final byte value)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 275 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tradeReferenceCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putTradeReference(final byte[] src, final int srcOffset)
    {
        final int length = 30;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 275, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder tradeReference(final String src)
    {
        final int length = 30;
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

    public APAFullTradeInformationEncoder tradeReference(final CharSequence src)
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
            buffer.putByte(this.offset + 275 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 275 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder originalReportTimestamp(final long value)
    {
        buffer.putLong(offset + 305, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public APAFullTradeInformationEncoder priceMultiplier(final long value)
    {
        buffer.putInt(offset + 313, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public APAFullTradeInformationEncoder priceMultiplierDecimals(final short value)
    {
        buffer.putByte(offset + 317, (byte)value);
        return this;
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

    public APAFullTradeInformationEncoder venue(final int index, final byte value)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 318 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String venueCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putVenue(final byte[] src, final int srcOffset)
    {
        final int length = 11;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 318, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder venue(final String src)
    {
        final int length = 11;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 318, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 318 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder venue(final CharSequence src)
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
            buffer.putByte(this.offset + 318 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 318 + i, (byte)0);
        }

        return this;
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

    public APAFullTradeInformationEncoder miFIDEmissionAllowanceType(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 329 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String miFIDEmissionAllowanceTypeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAFullTradeInformationEncoder putMiFIDEmissionAllowanceType(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 329, src, srcOffset, length);

        return this;
    }

    public APAFullTradeInformationEncoder miFIDEmissionAllowanceType(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 329, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 329 + start, (byte)0);
        }

        return this;
    }

    public APAFullTradeInformationEncoder miFIDEmissionAllowanceType(final CharSequence src)
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
            buffer.putByte(this.offset + 329 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 329 + i, (byte)0);
        }

        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        APAFullTradeInformationDecoder writer = new APAFullTradeInformationDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

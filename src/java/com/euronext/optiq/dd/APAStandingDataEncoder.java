/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class APAStandingDataEncoder
{
    public static final int BLOCK_LENGTH = 217;
    public static final int TEMPLATE_ID = 1027;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final APAStandingDataEncoder parentMessage = this;
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

    public APAStandingDataEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public APAStandingDataEncoder wrapAndApplyHeader(
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

    public APAStandingDataEncoder mDSeqNum(final long value)
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

    public APAStandingDataEncoder rebroadcastIndicator(final short value)
    {
        buffer.putByte(offset + 8, (byte)value);
        return this;
    }


    public static int mifidInstrumentIdTypeId()
    {
        return 3;
    }

    public static int mifidInstrumentIdTypeSinceVersion()
    {
        return 0;
    }

    public static int mifidInstrumentIdTypeEncodingOffset()
    {
        return 9;
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
            case PRESENCE: return "required";
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

    public APAStandingDataEncoder mifidInstrumentIdType(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 9 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidInstrumentIdTypeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putMifidInstrumentIdType(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 9, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder mifidInstrumentIdType(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 9, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 9 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder mifidInstrumentIdType(final CharSequence src)
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
            buffer.putByte(this.offset + 9 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 9 + i, (byte)0);
        }

        return this;
    }

    public static int mifidInstrumentIDId()
    {
        return 4;
    }

    public static int mifidInstrumentIDSinceVersion()
    {
        return 0;
    }

    public static int mifidInstrumentIDEncodingOffset()
    {
        return 13;
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
            case PRESENCE: return "required";
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

    public APAStandingDataEncoder mifidInstrumentID(final int index, final byte value)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 13 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mifidInstrumentIDCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putMifidInstrumentID(final byte[] src, final int srcOffset)
    {
        final int length = 12;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 13, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder mifidInstrumentID(final String src)
    {
        final int length = 12;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 13, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 13 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder mifidInstrumentID(final CharSequence src)
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
            buffer.putByte(this.offset + 13 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 13 + i, (byte)0);
        }

        return this;
    }

    public static int fullInstrumentNameId()
    {
        return 5;
    }

    public static int fullInstrumentNameSinceVersion()
    {
        return 0;
    }

    public static int fullInstrumentNameEncodingOffset()
    {
        return 25;
    }

    public static int fullInstrumentNameEncodingLength()
    {
        return 102;
    }

    public static String fullInstrumentNameMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte fullInstrumentNameNullValue()
    {
        return (byte)0;
    }

    public static byte fullInstrumentNameMinValue()
    {
        return (byte)32;
    }

    public static byte fullInstrumentNameMaxValue()
    {
        return (byte)126;
    }

    public static int fullInstrumentNameLength()
    {
        return 102;
    }

    public APAStandingDataEncoder fullInstrumentName(final int index, final byte value)
    {
        if (index < 0 || index >= 102)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 25 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String fullInstrumentNameCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putFullInstrumentName(final byte[] src, final int srcOffset)
    {
        final int length = 102;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 25, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder fullInstrumentName(final String src)
    {
        final int length = 102;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 25, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 25 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder fullInstrumentName(final CharSequence src)
    {
        final int length = 102;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 25 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 25 + i, (byte)0);
        }

        return this;
    }

    public static int cFIId()
    {
        return 6;
    }

    public static int cFISinceVersion()
    {
        return 0;
    }

    public static int cFIEncodingOffset()
    {
        return 127;
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

    public APAStandingDataEncoder cFI(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 127 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String cFICharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putCFI(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 127, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder cFI(final String src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 127, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 127 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder cFI(final CharSequence src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 127 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 127 + i, (byte)0);
        }

        return this;
    }

    public static int notionalCurrencyId()
    {
        return 7;
    }

    public static int notionalCurrencySinceVersion()
    {
        return 0;
    }

    public static int notionalCurrencyEncodingOffset()
    {
        return 133;
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

    public APAStandingDataEncoder notionalCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 133 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String notionalCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putNotionalCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 133, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder notionalCurrency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 133, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 133 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder notionalCurrency(final CharSequence src)
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
            buffer.putByte(this.offset + 133 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 133 + i, (byte)0);
        }

        return this;
    }

    public static int secondNotionalCurrencyId()
    {
        return 8;
    }

    public static int secondNotionalCurrencySinceVersion()
    {
        return 0;
    }

    public static int secondNotionalCurrencyEncodingOffset()
    {
        return 136;
    }

    public static int secondNotionalCurrencyEncodingLength()
    {
        return 3;
    }

    public static String secondNotionalCurrencyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte secondNotionalCurrencyNullValue()
    {
        return (byte)0;
    }

    public static byte secondNotionalCurrencyMinValue()
    {
        return (byte)32;
    }

    public static byte secondNotionalCurrencyMaxValue()
    {
        return (byte)126;
    }

    public static int secondNotionalCurrencyLength()
    {
        return 3;
    }

    public APAStandingDataEncoder secondNotionalCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 136 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String secondNotionalCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putSecondNotionalCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 136, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder secondNotionalCurrency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 136, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 136 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder secondNotionalCurrency(final CharSequence src)
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
            buffer.putByte(this.offset + 136 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 136 + i, (byte)0);
        }

        return this;
    }

    public static int priceMultiplierId()
    {
        return 9;
    }

    public static int priceMultiplierSinceVersion()
    {
        return 0;
    }

    public static int priceMultiplierEncodingOffset()
    {
        return 139;
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

    public APAStandingDataEncoder priceMultiplier(final long value)
    {
        buffer.putInt(offset + 139, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int priceMultiplierDecimalsId()
    {
        return 10;
    }

    public static int priceMultiplierDecimalsSinceVersion()
    {
        return 0;
    }

    public static int priceMultiplierDecimalsEncodingOffset()
    {
        return 143;
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

    public APAStandingDataEncoder priceMultiplierDecimals(final short value)
    {
        buffer.putByte(offset + 143, (byte)value);
        return this;
    }


    public static int underlyingISINCodeId()
    {
        return 11;
    }

    public static int underlyingISINCodeSinceVersion()
    {
        return 0;
    }

    public static int underlyingISINCodeEncodingOffset()
    {
        return 144;
    }

    public static int underlyingISINCodeEncodingLength()
    {
        return 12;
    }

    public static String underlyingISINCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte underlyingISINCodeNullValue()
    {
        return (byte)0;
    }

    public static byte underlyingISINCodeMinValue()
    {
        return (byte)32;
    }

    public static byte underlyingISINCodeMaxValue()
    {
        return (byte)126;
    }

    public static int underlyingISINCodeLength()
    {
        return 12;
    }

    public APAStandingDataEncoder underlyingISINCode(final int index, final byte value)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 144 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String underlyingISINCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putUnderlyingISINCode(final byte[] src, final int srcOffset)
    {
        final int length = 12;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 144, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder underlyingISINCode(final String src)
    {
        final int length = 12;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 144, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 144 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder underlyingISINCode(final CharSequence src)
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
            buffer.putByte(this.offset + 144 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 144 + i, (byte)0);
        }

        return this;
    }

    public static int underlyingIndexNameId()
    {
        return 12;
    }

    public static int underlyingIndexNameSinceVersion()
    {
        return 0;
    }

    public static int underlyingIndexNameEncodingOffset()
    {
        return 156;
    }

    public static int underlyingIndexNameEncodingLength()
    {
        return 25;
    }

    public static String underlyingIndexNameMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte underlyingIndexNameNullValue()
    {
        return (byte)0;
    }

    public static byte underlyingIndexNameMinValue()
    {
        return (byte)32;
    }

    public static byte underlyingIndexNameMaxValue()
    {
        return (byte)126;
    }

    public static int underlyingIndexNameLength()
    {
        return 25;
    }

    public APAStandingDataEncoder underlyingIndexName(final int index, final byte value)
    {
        if (index < 0 || index >= 25)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 156 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String underlyingIndexNameCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putUnderlyingIndexName(final byte[] src, final int srcOffset)
    {
        final int length = 25;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 156, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder underlyingIndexName(final String src)
    {
        final int length = 25;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 156, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 156 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder underlyingIndexName(final CharSequence src)
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
            buffer.putByte(this.offset + 156 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 156 + i, (byte)0);
        }

        return this;
    }

    public static int underlyingIndexTermId()
    {
        return 13;
    }

    public static int underlyingIndexTermSinceVersion()
    {
        return 0;
    }

    public static int underlyingIndexTermEncodingOffset()
    {
        return 181;
    }

    public static int underlyingIndexTermEncodingLength()
    {
        return 8;
    }

    public static String underlyingIndexTermMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte underlyingIndexTermNullValue()
    {
        return (byte)0;
    }

    public static byte underlyingIndexTermMinValue()
    {
        return (byte)32;
    }

    public static byte underlyingIndexTermMaxValue()
    {
        return (byte)126;
    }

    public static int underlyingIndexTermLength()
    {
        return 8;
    }

    public APAStandingDataEncoder underlyingIndexTerm(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 181 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String underlyingIndexTermCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putUnderlyingIndexTerm(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 181, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder underlyingIndexTerm(final String src)
    {
        final int length = 8;
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

    public APAStandingDataEncoder underlyingIndexTerm(final CharSequence src)
    {
        final int length = 8;
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

    public static int optionTypeId()
    {
        return 14;
    }

    public static int optionTypeSinceVersion()
    {
        return 0;
    }

    public static int optionTypeEncodingOffset()
    {
        return 189;
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

    public APAStandingDataEncoder optionType(final OptionType_enum value)
    {
        buffer.putByte(offset + 189, (byte)value.value());
        return this;
    }

    public static int strikePriceId()
    {
        return 15;
    }

    public static int strikePriceSinceVersion()
    {
        return 0;
    }

    public static int strikePriceEncodingOffset()
    {
        return 190;
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

    public APAStandingDataEncoder strikePrice(final long value)
    {
        buffer.putLong(offset + 190, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int strikePriceDecimalsId()
    {
        return 16;
    }

    public static int strikePriceDecimalsSinceVersion()
    {
        return 0;
    }

    public static int strikePriceDecimalsEncodingOffset()
    {
        return 198;
    }

    public static int strikePriceDecimalsEncodingLength()
    {
        return 1;
    }

    public static String strikePriceDecimalsMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short strikePriceDecimalsNullValue()
    {
        return (short)255;
    }

    public static short strikePriceDecimalsMinValue()
    {
        return (short)0;
    }

    public static short strikePriceDecimalsMaxValue()
    {
        return (short)254;
    }

    public APAStandingDataEncoder strikePriceDecimals(final short value)
    {
        buffer.putByte(offset + 198, (byte)value);
        return this;
    }


    public static int exerStyleId()
    {
        return 17;
    }

    public static int exerStyleSinceVersion()
    {
        return 0;
    }

    public static int exerStyleEncodingOffset()
    {
        return 199;
    }

    public static int exerStyleEncodingLength()
    {
        return 1;
    }

    public static String exerStyleMetaAttribute(final MetaAttribute metaAttribute)
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

    public APAStandingDataEncoder exerStyle(final ExerciseStyle_enum value)
    {
        buffer.putByte(offset + 199, (byte)value.value());
        return this;
    }

    public static int maturityDateId()
    {
        return 18;
    }

    public static int maturityDateSinceVersion()
    {
        return 0;
    }

    public static int maturityDateEncodingOffset()
    {
        return 200;
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
            case PRESENCE: return "optional";
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

    public APAStandingDataEncoder maturityDate(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 200 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String maturityDateCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putMaturityDate(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 200, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder maturityDate(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 200, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 200 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder maturityDate(final CharSequence src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 200 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 200 + i, (byte)0);
        }

        return this;
    }

    public static int expiryDateId()
    {
        return 19;
    }

    public static int expiryDateSinceVersion()
    {
        return 0;
    }

    public static int expiryDateEncodingOffset()
    {
        return 208;
    }

    public static int expiryDateEncodingLength()
    {
        return 8;
    }

    public static String expiryDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte expiryDateNullValue()
    {
        return (byte)0;
    }

    public static byte expiryDateMinValue()
    {
        return (byte)32;
    }

    public static byte expiryDateMaxValue()
    {
        return (byte)126;
    }

    public static int expiryDateLength()
    {
        return 8;
    }

    public APAStandingDataEncoder expiryDate(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 208 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String expiryDateCharacterEncoding()
    {
        return "US-ASCII";
    }

    public APAStandingDataEncoder putExpiryDate(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 208, src, srcOffset, length);

        return this;
    }

    public APAStandingDataEncoder expiryDate(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 208, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 208 + start, (byte)0);
        }

        return this;
    }

    public APAStandingDataEncoder expiryDate(final CharSequence src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 208 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 208 + i, (byte)0);
        }

        return this;
    }

    public static int settlementMethodId()
    {
        return 20;
    }

    public static int settlementMethodSinceVersion()
    {
        return 0;
    }

    public static int settlementMethodEncodingOffset()
    {
        return 216;
    }

    public static int settlementMethodEncodingLength()
    {
        return 1;
    }

    public static String settlementMethodMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte settlementMethodNullValue()
    {
        return (byte)0;
    }

    public static byte settlementMethodMinValue()
    {
        return (byte)32;
    }

    public static byte settlementMethodMaxValue()
    {
        return (byte)126;
    }

    public APAStandingDataEncoder settlementMethod(final byte value)
    {
        buffer.putByte(offset + 216, value);
        return this;
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        APAStandingDataDecoder writer = new APAStandingDataDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

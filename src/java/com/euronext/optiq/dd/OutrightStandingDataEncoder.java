/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class OutrightStandingDataEncoder
{
    public static final int BLOCK_LENGTH = 96;
    public static final int TEMPLATE_ID = 1014;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final OutrightStandingDataEncoder parentMessage = this;
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

    public OutrightStandingDataEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public OutrightStandingDataEncoder wrapAndApplyHeader(
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

    public OutrightStandingDataEncoder mDSeqNum(final long value)
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

    public OutrightStandingDataEncoder rebroadcastIndicator(final short value)
    {
        buffer.putByte(offset + 8, (byte)value);
        return this;
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

    public OutrightStandingDataEncoder symbolIndex(final long value)
    {
        buffer.putInt(offset + 9, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public OutrightStandingDataEncoder contractSymbolIndex(final long value)
    {
        buffer.putInt(offset + 13, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public OutrightStandingDataEncoder instrumentEventDate(final int value)
    {
        buffer.putShort(offset + 17, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public OutrightStandingDataEncoder iSINCode(final int index, final byte value)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 19 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String iSINCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public OutrightStandingDataEncoder putISINCode(final byte[] src, final int srcOffset)
    {
        final int length = 12;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 19, src, srcOffset, length);

        return this;
    }

    public OutrightStandingDataEncoder iSINCode(final String src)
    {
        final int length = 12;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 19, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 19 + start, (byte)0);
        }

        return this;
    }

    public OutrightStandingDataEncoder iSINCode(final CharSequence src)
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
            buffer.putByte(this.offset + 19 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 19 + i, (byte)0);
        }

        return this;
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

    public OutrightStandingDataEncoder cFI(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 31 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String cFICharacterEncoding()
    {
        return "US-ASCII";
    }

    public OutrightStandingDataEncoder putCFI(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 31, src, srcOffset, length);

        return this;
    }

    public OutrightStandingDataEncoder cFI(final String src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 31, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 31 + start, (byte)0);
        }

        return this;
    }

    public OutrightStandingDataEncoder cFI(final CharSequence src)
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
            buffer.putByte(this.offset + 31 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 31 + i, (byte)0);
        }

        return this;
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

    public OutrightStandingDataEncoder maturityDate(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 37 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String maturityDateCharacterEncoding()
    {
        return "US-ASCII";
    }

    public OutrightStandingDataEncoder putMaturityDate(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 37, src, srcOffset, length);

        return this;
    }

    public OutrightStandingDataEncoder maturityDate(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 37, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 37 + start, (byte)0);
        }

        return this;
    }

    public OutrightStandingDataEncoder maturityDate(final CharSequence src)
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
            buffer.putByte(this.offset + 37 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 37 + i, (byte)0);
        }

        return this;
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

    public OutrightStandingDataEncoder optionType(final OptionType_enum value)
    {
        buffer.putByte(offset + 45, (byte)value.value());
        return this;
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

    public OutrightStandingDataEncoder instrumentTradingCode(final int index, final byte value)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 46 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String instrumentTradingCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public OutrightStandingDataEncoder putInstrumentTradingCode(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 46, src, srcOffset, length);

        return this;
    }

    public OutrightStandingDataEncoder instrumentTradingCode(final String src)
    {
        final int length = 15;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 46, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 46 + start, (byte)0);
        }

        return this;
    }

    public OutrightStandingDataEncoder instrumentTradingCode(final CharSequence src)
    {
        final int length = 15;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 46 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 46 + i, (byte)0);
        }

        return this;
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

    public OutrightStandingDataEncoder lotSize(final long value)
    {
        buffer.putLong(offset + 61, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public OutrightStandingDataEncoder strikePrice(final long value)
    {
        buffer.putLong(offset + 69, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public OutrightStandingDataEncoder lastTradingDate(final int value)
    {
        buffer.putShort(offset + 77, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public OutrightStandingDataEncoder underlyingInstrumentTradingCode(final int index, final byte value)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 79 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String underlyingInstrumentTradingCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public OutrightStandingDataEncoder putUnderlyingInstrumentTradingCode(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 79, src, srcOffset, length);

        return this;
    }

    public OutrightStandingDataEncoder underlyingInstrumentTradingCode(final String src)
    {
        final int length = 15;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 79, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 79 + start, (byte)0);
        }

        return this;
    }

    public OutrightStandingDataEncoder underlyingInstrumentTradingCode(final CharSequence src)
    {
        final int length = 15;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 79 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 79 + i, (byte)0);
        }

        return this;
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

    public OutrightStandingDataEncoder daysToExpiry(final int value)
    {
        buffer.putShort(offset + 94, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    private final OutrightRepEncoder outrightRep = new OutrightRepEncoder(this);

    public static long outrightRepId()
    {
        return 16;
    }

    public OutrightRepEncoder outrightRepCount(final int count)
    {
        outrightRep.wrap(buffer, count);
        return outrightRep;
    }

    public static class OutrightRepEncoder
    {
        public static final int HEADER_SIZE = 2;
        private final OutrightStandingDataEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;

        OutrightRepEncoder(final OutrightStandingDataEncoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 254)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = -1;
            this.count = count;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            buffer.putByte(limit + 0, (byte)(short)1);
            buffer.putByte(limit + 1, (byte)(short)count);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 1;
        }

        public OutrightRepEncoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + sbeBlockLength());
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

        public OutrightRepEncoder eMM(final EMM_enum value)
        {
            buffer.putByte(offset + 0, (byte)value.value());
            return this;
        }
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        OutrightStandingDataDecoder writer = new OutrightStandingDataDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

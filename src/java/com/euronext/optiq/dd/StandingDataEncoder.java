/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class StandingDataEncoder
{
    public static final int BLOCK_LENGTH = 385;
    public static final int TEMPLATE_ID = 1007;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final StandingDataEncoder parentMessage = this;
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

    public StandingDataEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public StandingDataEncoder wrapAndApplyHeader(
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

    public StandingDataEncoder mDSeqNum(final long value)
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

    public StandingDataEncoder rebroadcastIndicator(final short value)
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

    public StandingDataEncoder symbolIndex(final long value)
    {
        buffer.putInt(offset + 9, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int optiqSegmentId()
    {
        return 4;
    }

    public static int optiqSegmentSinceVersion()
    {
        return 0;
    }

    public static int optiqSegmentEncodingOffset()
    {
        return 13;
    }

    public static int optiqSegmentEncodingLength()
    {
        return 1;
    }

    public static String optiqSegmentMetaAttribute(final MetaAttribute metaAttribute)
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

    public StandingDataEncoder optiqSegment(final OptiqSegment_enum value)
    {
        buffer.putByte(offset + 13, (byte)value.value());
        return this;
    }

    public static int partitionIDId()
    {
        return 5;
    }

    public static int partitionIDSinceVersion()
    {
        return 0;
    }

    public static int partitionIDEncodingOffset()
    {
        return 14;
    }

    public static int partitionIDEncodingLength()
    {
        return 2;
    }

    public static String partitionIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int partitionIDNullValue()
    {
        return 65535;
    }

    public static int partitionIDMinValue()
    {
        return 0;
    }

    public static int partitionIDMaxValue()
    {
        return 65534;
    }

    public StandingDataEncoder partitionID(final int value)
    {
        buffer.putShort(offset + 14, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int fullInstrumentNameId()
    {
        return 6;
    }

    public static int fullInstrumentNameSinceVersion()
    {
        return 0;
    }

    public static int fullInstrumentNameEncodingOffset()
    {
        return 16;
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

    public StandingDataEncoder fullInstrumentName(final int index, final byte value)
    {
        if (index < 0 || index >= 102)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 16 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String fullInstrumentNameCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putFullInstrumentName(final byte[] src, final int srcOffset)
    {
        final int length = 102;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 16, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder fullInstrumentName(final String src)
    {
        final int length = 102;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 16, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 16 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder fullInstrumentName(final CharSequence src)
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
            buffer.putByte(this.offset + 16 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 16 + i, (byte)0);
        }

        return this;
    }

    public static int instrumentNameId()
    {
        return 7;
    }

    public static int instrumentNameSinceVersion()
    {
        return 0;
    }

    public static int instrumentNameEncodingOffset()
    {
        return 118;
    }

    public static int instrumentNameEncodingLength()
    {
        return 18;
    }

    public static String instrumentNameMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte instrumentNameNullValue()
    {
        return (byte)0;
    }

    public static byte instrumentNameMinValue()
    {
        return (byte)32;
    }

    public static byte instrumentNameMaxValue()
    {
        return (byte)126;
    }

    public static int instrumentNameLength()
    {
        return 18;
    }

    public StandingDataEncoder instrumentName(final int index, final byte value)
    {
        if (index < 0 || index >= 18)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 118 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String instrumentNameCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putInstrumentName(final byte[] src, final int srcOffset)
    {
        final int length = 18;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 118, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder instrumentName(final String src)
    {
        final int length = 18;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 118, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 118 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder instrumentName(final CharSequence src)
    {
        final int length = 18;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 118 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 118 + i, (byte)0);
        }

        return this;
    }

    public static int instrumentTradingCodeId()
    {
        return 8;
    }

    public static int instrumentTradingCodeSinceVersion()
    {
        return 0;
    }

    public static int instrumentTradingCodeEncodingOffset()
    {
        return 136;
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
            case PRESENCE: return "optional";
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

    public StandingDataEncoder instrumentTradingCode(final int index, final byte value)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 136 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String instrumentTradingCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putInstrumentTradingCode(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 136, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder instrumentTradingCode(final String src)
    {
        final int length = 15;
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

    public StandingDataEncoder instrumentTradingCode(final CharSequence src)
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
            buffer.putByte(this.offset + 136 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 136 + i, (byte)0);
        }

        return this;
    }

    public static int instrumentGroupCodeId()
    {
        return 9;
    }

    public static int instrumentGroupCodeSinceVersion()
    {
        return 0;
    }

    public static int instrumentGroupCodeEncodingOffset()
    {
        return 151;
    }

    public static int instrumentGroupCodeEncodingLength()
    {
        return 2;
    }

    public static String instrumentGroupCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte instrumentGroupCodeNullValue()
    {
        return (byte)0;
    }

    public static byte instrumentGroupCodeMinValue()
    {
        return (byte)32;
    }

    public static byte instrumentGroupCodeMaxValue()
    {
        return (byte)126;
    }

    public static int instrumentGroupCodeLength()
    {
        return 2;
    }

    public StandingDataEncoder instrumentGroupCode(final int index, final byte value)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 151 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String instrumentGroupCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putInstrumentGroupCode(final byte[] src, final int srcOffset)
    {
        final int length = 2;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 151, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder instrumentGroupCode(final String src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 151, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 151 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder instrumentGroupCode(final CharSequence src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 151 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 151 + i, (byte)0);
        }

        return this;
    }

    public static int iSINCodeId()
    {
        return 10;
    }

    public static int iSINCodeSinceVersion()
    {
        return 0;
    }

    public static int iSINCodeEncodingOffset()
    {
        return 153;
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

    public StandingDataEncoder iSINCode(final int index, final byte value)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 153 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String iSINCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putISINCode(final byte[] src, final int srcOffset)
    {
        final int length = 12;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 153, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder iSINCode(final String src)
    {
        final int length = 12;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 153, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 153 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder iSINCode(final CharSequence src)
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
            buffer.putByte(this.offset + 153 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 153 + i, (byte)0);
        }

        return this;
    }

    public static int priceDecimalsId()
    {
        return 11;
    }

    public static int priceDecimalsSinceVersion()
    {
        return 0;
    }

    public static int priceDecimalsEncodingOffset()
    {
        return 165;
    }

    public static int priceDecimalsEncodingLength()
    {
        return 1;
    }

    public static String priceDecimalsMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short priceDecimalsNullValue()
    {
        return (short)255;
    }

    public static short priceDecimalsMinValue()
    {
        return (short)0;
    }

    public static short priceDecimalsMaxValue()
    {
        return (short)254;
    }

    public StandingDataEncoder priceDecimals(final short value)
    {
        buffer.putByte(offset + 165, (byte)value);
        return this;
    }


    public static int quantityDecimalsId()
    {
        return 12;
    }

    public static int quantityDecimalsSinceVersion()
    {
        return 0;
    }

    public static int quantityDecimalsEncodingOffset()
    {
        return 166;
    }

    public static int quantityDecimalsEncodingLength()
    {
        return 1;
    }

    public static String quantityDecimalsMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short quantityDecimalsNullValue()
    {
        return (short)255;
    }

    public static short quantityDecimalsMinValue()
    {
        return (short)0;
    }

    public static short quantityDecimalsMaxValue()
    {
        return (short)254;
    }

    public StandingDataEncoder quantityDecimals(final short value)
    {
        buffer.putByte(offset + 166, (byte)value);
        return this;
    }


    public static int amountDecimalsId()
    {
        return 13;
    }

    public static int amountDecimalsSinceVersion()
    {
        return 0;
    }

    public static int amountDecimalsEncodingOffset()
    {
        return 167;
    }

    public static int amountDecimalsEncodingLength()
    {
        return 1;
    }

    public static String amountDecimalsMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short amountDecimalsNullValue()
    {
        return (short)255;
    }

    public static short amountDecimalsMinValue()
    {
        return (short)0;
    }

    public static short amountDecimalsMaxValue()
    {
        return (short)254;
    }

    public StandingDataEncoder amountDecimals(final short value)
    {
        buffer.putByte(offset + 167, (byte)value);
        return this;
    }


    public static int ratioDecimalsId()
    {
        return 14;
    }

    public static int ratioDecimalsSinceVersion()
    {
        return 0;
    }

    public static int ratioDecimalsEncodingOffset()
    {
        return 168;
    }

    public static int ratioDecimalsEncodingLength()
    {
        return 1;
    }

    public static String ratioDecimalsMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short ratioDecimalsNullValue()
    {
        return (short)255;
    }

    public static short ratioDecimalsMinValue()
    {
        return (short)0;
    }

    public static short ratioDecimalsMaxValue()
    {
        return (short)254;
    }

    public StandingDataEncoder ratioDecimals(final short value)
    {
        buffer.putByte(offset + 168, (byte)value);
        return this;
    }


    public static int cFIId()
    {
        return 15;
    }

    public static int cFISinceVersion()
    {
        return 0;
    }

    public static int cFIEncodingOffset()
    {
        return 169;
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
            case PRESENCE: return "required";
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

    public StandingDataEncoder cFI(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 169 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String cFICharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putCFI(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 169, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder cFI(final String src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 169, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 169 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder cFI(final CharSequence src)
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
            buffer.putByte(this.offset + 169 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 169 + i, (byte)0);
        }

        return this;
    }

    public static int instrumentEventDateId()
    {
        return 16;
    }

    public static int instrumentEventDateSinceVersion()
    {
        return 0;
    }

    public static int instrumentEventDateEncodingOffset()
    {
        return 175;
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

    public StandingDataEncoder instrumentEventDate(final int value)
    {
        buffer.putShort(offset + 175, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int strikePriceId()
    {
        return 17;
    }

    public static int strikePriceSinceVersion()
    {
        return 0;
    }

    public static int strikePriceEncodingOffset()
    {
        return 177;
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

    public StandingDataEncoder strikePrice(final long value)
    {
        buffer.putLong(offset + 177, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int darkEligibilityId()
    {
        return 18;
    }

    public static int darkEligibilitySinceVersion()
    {
        return 0;
    }

    public static int darkEligibilityEncodingOffset()
    {
        return 185;
    }

    public static int darkEligibilityEncodingLength()
    {
        return 1;
    }

    public static String darkEligibilityMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short darkEligibilityNullValue()
    {
        return (short)255;
    }

    public static short darkEligibilityMinValue()
    {
        return (short)0;
    }

    public static short darkEligibilityMaxValue()
    {
        return (short)254;
    }

    public StandingDataEncoder darkEligibility(final short value)
    {
        buffer.putByte(offset + 185, (byte)value);
        return this;
    }


    public static int darkLISThresholdId()
    {
        return 19;
    }

    public static int darkLISThresholdSinceVersion()
    {
        return 0;
    }

    public static int darkLISThresholdEncodingOffset()
    {
        return 186;
    }

    public static int darkLISThresholdEncodingLength()
    {
        return 8;
    }

    public static String darkLISThresholdMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long darkLISThresholdNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long darkLISThresholdMinValue()
    {
        return 0x0L;
    }

    public static long darkLISThresholdMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public StandingDataEncoder darkLISThreshold(final long value)
    {
        buffer.putLong(offset + 186, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int darkMinQuantityId()
    {
        return 20;
    }

    public static int darkMinQuantitySinceVersion()
    {
        return 0;
    }

    public static int darkMinQuantityEncodingOffset()
    {
        return 194;
    }

    public static int darkMinQuantityEncodingLength()
    {
        return 4;
    }

    public static String darkMinQuantityMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long darkMinQuantityNullValue()
    {
        return 4294967295L;
    }

    public static long darkMinQuantityMinValue()
    {
        return 0L;
    }

    public static long darkMinQuantityMaxValue()
    {
        return 4294967294L;
    }

    public StandingDataEncoder darkMinQuantity(final long value)
    {
        buffer.putInt(offset + 194, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int dateOfLastTradeId()
    {
        return 21;
    }

    public static int dateOfLastTradeSinceVersion()
    {
        return 0;
    }

    public static int dateOfLastTradeEncodingOffset()
    {
        return 198;
    }

    public static int dateOfLastTradeEncodingLength()
    {
        return 2;
    }

    public static String dateOfLastTradeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int dateOfLastTradeNullValue()
    {
        return 65535;
    }

    public static int dateOfLastTradeMinValue()
    {
        return 0;
    }

    public static int dateOfLastTradeMaxValue()
    {
        return 65534;
    }

    public StandingDataEncoder dateOfLastTrade(final int value)
    {
        buffer.putShort(offset + 198, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int depositaryListId()
    {
        return 22;
    }

    public static int depositaryListSinceVersion()
    {
        return 0;
    }

    public static int depositaryListEncodingOffset()
    {
        return 200;
    }

    public static int depositaryListEncodingLength()
    {
        return 20;
    }

    public static String depositaryListMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte depositaryListNullValue()
    {
        return (byte)0;
    }

    public static byte depositaryListMinValue()
    {
        return (byte)32;
    }

    public static byte depositaryListMaxValue()
    {
        return (byte)126;
    }

    public static int depositaryListLength()
    {
        return 20;
    }

    public StandingDataEncoder depositaryList(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 200 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String depositaryListCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putDepositaryList(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 200, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder depositaryList(final String src)
    {
        final int length = 20;
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

    public StandingDataEncoder depositaryList(final CharSequence src)
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
            buffer.putByte(this.offset + 200 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 200 + i, (byte)0);
        }

        return this;
    }

    public static int mainDepositaryId()
    {
        return 23;
    }

    public static int mainDepositarySinceVersion()
    {
        return 0;
    }

    public static int mainDepositaryEncodingOffset()
    {
        return 220;
    }

    public static int mainDepositaryEncodingLength()
    {
        return 5;
    }

    public static String mainDepositaryMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mainDepositaryNullValue()
    {
        return (byte)0;
    }

    public static byte mainDepositaryMinValue()
    {
        return (byte)32;
    }

    public static byte mainDepositaryMaxValue()
    {
        return (byte)126;
    }

    public static int mainDepositaryLength()
    {
        return 5;
    }

    public StandingDataEncoder mainDepositary(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 220 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mainDepositaryCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putMainDepositary(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 220, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder mainDepositary(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 220, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 220 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder mainDepositary(final CharSequence src)
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
            buffer.putByte(this.offset + 220 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 220 + i, (byte)0);
        }

        return this;
    }

    public static int firstSettlementDateId()
    {
        return 24;
    }

    public static int firstSettlementDateSinceVersion()
    {
        return 0;
    }

    public static int firstSettlementDateEncodingOffset()
    {
        return 225;
    }

    public static int firstSettlementDateEncodingLength()
    {
        return 2;
    }

    public static String firstSettlementDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int firstSettlementDateNullValue()
    {
        return 65535;
    }

    public static int firstSettlementDateMinValue()
    {
        return 0;
    }

    public static int firstSettlementDateMaxValue()
    {
        return 65534;
    }

    public StandingDataEncoder firstSettlementDate(final int value)
    {
        buffer.putShort(offset + 225, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int guaranteeIndicatorId()
    {
        return 25;
    }

    public static int guaranteeIndicatorSinceVersion()
    {
        return 0;
    }

    public static int guaranteeIndicatorEncodingOffset()
    {
        return 227;
    }

    public static int guaranteeIndicatorEncodingLength()
    {
        return 1;
    }

    public static String guaranteeIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public StandingDataEncoder guaranteeIndicator(final GuaranteeIndicator_enum value)
    {
        buffer.putByte(offset + 227, (byte)value.value());
        return this;
    }

    public static int iCBId()
    {
        return 26;
    }

    public static int iCBSinceVersion()
    {
        return 0;
    }

    public static int iCBEncodingOffset()
    {
        return 228;
    }

    public static int iCBEncodingLength()
    {
        return 16;
    }

    public static String iCBMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte iCBNullValue()
    {
        return (byte)0;
    }

    public static byte iCBMinValue()
    {
        return (byte)32;
    }

    public static byte iCBMaxValue()
    {
        return (byte)126;
    }

    public static int iCBLength()
    {
        return 16;
    }

    public StandingDataEncoder iCB(final int index, final byte value)
    {
        if (index < 0 || index >= 16)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 228 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String iCBCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putICB(final byte[] src, final int srcOffset)
    {
        final int length = 16;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 228, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder iCB(final String src)
    {
        final int length = 16;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 228, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 228 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder iCB(final CharSequence src)
    {
        final int length = 16;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 228 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 228 + i, (byte)0);
        }

        return this;
    }

    public static int issuingCountryId()
    {
        return 27;
    }

    public static int issuingCountrySinceVersion()
    {
        return 0;
    }

    public static int issuingCountryEncodingOffset()
    {
        return 244;
    }

    public static int issuingCountryEncodingLength()
    {
        return 3;
    }

    public static String issuingCountryMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte issuingCountryNullValue()
    {
        return (byte)0;
    }

    public static byte issuingCountryMinValue()
    {
        return (byte)32;
    }

    public static byte issuingCountryMaxValue()
    {
        return (byte)126;
    }

    public static int issuingCountryLength()
    {
        return 3;
    }

    public StandingDataEncoder issuingCountry(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 244 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String issuingCountryCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putIssuingCountry(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 244, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder issuingCountry(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 244, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 244 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder issuingCountry(final CharSequence src)
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
            buffer.putByte(this.offset + 244 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 244 + i, (byte)0);
        }

        return this;
    }

    public static int lastAdjustedClosingPriceId()
    {
        return 28;
    }

    public static int lastAdjustedClosingPriceSinceVersion()
    {
        return 0;
    }

    public static int lastAdjustedClosingPriceEncodingOffset()
    {
        return 247;
    }

    public static int lastAdjustedClosingPriceEncodingLength()
    {
        return 8;
    }

    public static String lastAdjustedClosingPriceMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long lastAdjustedClosingPriceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long lastAdjustedClosingPriceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long lastAdjustedClosingPriceMaxValue()
    {
        return 9223372036854775807L;
    }

    public StandingDataEncoder lastAdjustedClosingPrice(final long value)
    {
        buffer.putLong(offset + 247, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int lotSizeId()
    {
        return 29;
    }

    public static int lotSizeSinceVersion()
    {
        return 0;
    }

    public static int lotSizeEncodingOffset()
    {
        return 255;
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

    public StandingDataEncoder lotSize(final long value)
    {
        buffer.putLong(offset + 255, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int maturityDateId()
    {
        return 30;
    }

    public static int maturityDateSinceVersion()
    {
        return 0;
    }

    public static int maturityDateEncodingOffset()
    {
        return 263;
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

    public StandingDataEncoder maturityDate(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 263 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String maturityDateCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putMaturityDate(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 263, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder maturityDate(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 263, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 263 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder maturityDate(final CharSequence src)
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
            buffer.putByte(this.offset + 263 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 263 + i, (byte)0);
        }

        return this;
    }

    public static int maximumDecimalsInQuantityId()
    {
        return 31;
    }

    public static int maximumDecimalsInQuantitySinceVersion()
    {
        return 0;
    }

    public static int maximumDecimalsInQuantityEncodingOffset()
    {
        return 271;
    }

    public static int maximumDecimalsInQuantityEncodingLength()
    {
        return 1;
    }

    public static String maximumDecimalsInQuantityMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short maximumDecimalsInQuantityNullValue()
    {
        return (short)255;
    }

    public static short maximumDecimalsInQuantityMinValue()
    {
        return (short)0;
    }

    public static short maximumDecimalsInQuantityMaxValue()
    {
        return (short)254;
    }

    public StandingDataEncoder maximumDecimalsInQuantity(final short value)
    {
        buffer.putByte(offset + 271, (byte)value);
        return this;
    }


    public static int mICId()
    {
        return 32;
    }

    public static int mICSinceVersion()
    {
        return 0;
    }

    public static int mICEncodingOffset()
    {
        return 272;
    }

    public static int mICEncodingLength()
    {
        return 4;
    }

    public static String mICMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mICNullValue()
    {
        return (byte)0;
    }

    public static byte mICMinValue()
    {
        return (byte)32;
    }

    public static byte mICMaxValue()
    {
        return (byte)126;
    }

    public static int mICLength()
    {
        return 4;
    }

    public StandingDataEncoder mIC(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 272 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mICCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putMIC(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 272, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder mIC(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 272, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 272 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder mIC(final CharSequence src)
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
            buffer.putByte(this.offset + 272 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 272 + i, (byte)0);
        }

        return this;
    }

    public static int mICListId()
    {
        return 33;
    }

    public static int mICListSinceVersion()
    {
        return 0;
    }

    public static int mICListEncodingOffset()
    {
        return 276;
    }

    public static int mICListEncodingLength()
    {
        return 20;
    }

    public static String mICListMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mICListNullValue()
    {
        return (byte)0;
    }

    public static byte mICListMinValue()
    {
        return (byte)32;
    }

    public static byte mICListMaxValue()
    {
        return (byte)126;
    }

    public static int mICListLength()
    {
        return 20;
    }

    public StandingDataEncoder mICList(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 276 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mICListCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putMICList(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 276, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder mICList(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 276, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 276 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder mICList(final CharSequence src)
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
            buffer.putByte(this.offset + 276 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 276 + i, (byte)0);
        }

        return this;
    }

    public static int countryOfExchangeId()
    {
        return 34;
    }

    public static int countryOfExchangeSinceVersion()
    {
        return 0;
    }

    public static int countryOfExchangeEncodingOffset()
    {
        return 296;
    }

    public static int countryOfExchangeEncodingLength()
    {
        return 3;
    }

    public static String countryOfExchangeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte countryOfExchangeNullValue()
    {
        return (byte)0;
    }

    public static byte countryOfExchangeMinValue()
    {
        return (byte)32;
    }

    public static byte countryOfExchangeMaxValue()
    {
        return (byte)126;
    }

    public static int countryOfExchangeLength()
    {
        return 3;
    }

    public StandingDataEncoder countryOfExchange(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 296 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String countryOfExchangeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putCountryOfExchange(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 296, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder countryOfExchange(final String src)
    {
        final int length = 3;
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

    public StandingDataEncoder countryOfExchange(final CharSequence src)
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
            buffer.putByte(this.offset + 296 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 296 + i, (byte)0);
        }

        return this;
    }

    public static int mnemonicId()
    {
        return 35;
    }

    public static int mnemonicSinceVersion()
    {
        return 0;
    }

    public static int mnemonicEncodingOffset()
    {
        return 299;
    }

    public static int mnemonicEncodingLength()
    {
        return 5;
    }

    public static String mnemonicMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte mnemonicNullValue()
    {
        return (byte)0;
    }

    public static byte mnemonicMinValue()
    {
        return (byte)32;
    }

    public static byte mnemonicMaxValue()
    {
        return (byte)126;
    }

    public static int mnemonicLength()
    {
        return 5;
    }

    public StandingDataEncoder mnemonic(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 299 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mnemonicCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putMnemonic(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 299, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder mnemonic(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 299, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 299 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder mnemonic(final CharSequence src)
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
            buffer.putByte(this.offset + 299 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 299 + i, (byte)0);
        }

        return this;
    }

    public static int underlyingMICId()
    {
        return 36;
    }

    public static int underlyingMICSinceVersion()
    {
        return 0;
    }

    public static int underlyingMICEncodingOffset()
    {
        return 304;
    }

    public static int underlyingMICEncodingLength()
    {
        return 4;
    }

    public static String underlyingMICMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte underlyingMICNullValue()
    {
        return (byte)0;
    }

    public static byte underlyingMICMinValue()
    {
        return (byte)32;
    }

    public static byte underlyingMICMaxValue()
    {
        return (byte)126;
    }

    public static int underlyingMICLength()
    {
        return 4;
    }

    public StandingDataEncoder underlyingMIC(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 304 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String underlyingMICCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putUnderlyingMIC(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 304, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder underlyingMIC(final String src)
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

    public StandingDataEncoder underlyingMIC(final CharSequence src)
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

    public static int underlyingISINCodeId()
    {
        return 37;
    }

    public static int underlyingISINCodeSinceVersion()
    {
        return 0;
    }

    public static int underlyingISINCodeEncodingOffset()
    {
        return 308;
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

    public StandingDataEncoder underlyingISINCode(final int index, final byte value)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 308 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String underlyingISINCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putUnderlyingISINCode(final byte[] src, final int srcOffset)
    {
        final int length = 12;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 308, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder underlyingISINCode(final String src)
    {
        final int length = 12;
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

    public StandingDataEncoder underlyingISINCode(final CharSequence src)
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
            buffer.putByte(this.offset + 308 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 308 + i, (byte)0);
        }

        return this;
    }

    public static int tradingCurrencyId()
    {
        return 38;
    }

    public static int tradingCurrencySinceVersion()
    {
        return 0;
    }

    public static int tradingCurrencyEncodingOffset()
    {
        return 320;
    }

    public static int tradingCurrencyEncodingLength()
    {
        return 3;
    }

    public static String tradingCurrencyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte tradingCurrencyNullValue()
    {
        return (byte)0;
    }

    public static byte tradingCurrencyMinValue()
    {
        return (byte)32;
    }

    public static byte tradingCurrencyMaxValue()
    {
        return (byte)126;
    }

    public static int tradingCurrencyLength()
    {
        return 3;
    }

    public StandingDataEncoder tradingCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 320 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tradingCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putTradingCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 320, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder tradingCurrency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 320, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 320 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder tradingCurrency(final CharSequence src)
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
            buffer.putByte(this.offset + 320 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 320 + i, (byte)0);
        }

        return this;
    }

    public static int currencyCoefficientId()
    {
        return 39;
    }

    public static int currencyCoefficientSinceVersion()
    {
        return 0;
    }

    public static int currencyCoefficientEncodingOffset()
    {
        return 323;
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

    public StandingDataEncoder currencyCoefficient(final long value)
    {
        buffer.putInt(offset + 323, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradingCurrencyIndicatorId()
    {
        return 40;
    }

    public static int tradingCurrencyIndicatorSinceVersion()
    {
        return 0;
    }

    public static int tradingCurrencyIndicatorEncodingOffset()
    {
        return 327;
    }

    public static int tradingCurrencyIndicatorEncodingLength()
    {
        return 1;
    }

    public static String tradingCurrencyIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public StandingDataEncoder tradingCurrencyIndicator(final TradingCurrencyIndicator_enum value)
    {
        buffer.putByte(offset + 327, (byte)value.value());
        return this;
    }

    public static int strikeCurrencyIndicatorId()
    {
        return 41;
    }

    public static int strikeCurrencyIndicatorSinceVersion()
    {
        return 0;
    }

    public static int strikeCurrencyIndicatorEncodingOffset()
    {
        return 328;
    }

    public static int strikeCurrencyIndicatorEncodingLength()
    {
        return 1;
    }

    public static String strikeCurrencyIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public StandingDataEncoder strikeCurrencyIndicator(final StrikeCurrencyIndicator_enum value)
    {
        buffer.putByte(offset + 328, (byte)value.value());
        return this;
    }

    public static int numberInstrumentCirculatingId()
    {
        return 42;
    }

    public static int numberInstrumentCirculatingSinceVersion()
    {
        return 0;
    }

    public static int numberInstrumentCirculatingEncodingOffset()
    {
        return 329;
    }

    public static int numberInstrumentCirculatingEncodingLength()
    {
        return 8;
    }

    public static String numberInstrumentCirculatingMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long numberInstrumentCirculatingNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long numberInstrumentCirculatingMinValue()
    {
        return 0x0L;
    }

    public static long numberInstrumentCirculatingMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public StandingDataEncoder numberInstrumentCirculating(final long value)
    {
        buffer.putLong(offset + 329, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int parValueId()
    {
        return 43;
    }

    public static int parValueSinceVersion()
    {
        return 0;
    }

    public static int parValueEncodingOffset()
    {
        return 337;
    }

    public static int parValueEncodingLength()
    {
        return 8;
    }

    public static String parValueMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long parValueNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long parValueMinValue()
    {
        return 0x0L;
    }

    public static long parValueMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public StandingDataEncoder parValue(final long value)
    {
        buffer.putLong(offset + 337, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int quantityNotationId()
    {
        return 44;
    }

    public static int quantityNotationSinceVersion()
    {
        return 0;
    }

    public static int quantityNotationEncodingOffset()
    {
        return 345;
    }

    public static int quantityNotationEncodingLength()
    {
        return 3;
    }

    public static String quantityNotationMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte quantityNotationNullValue()
    {
        return (byte)0;
    }

    public static byte quantityNotationMinValue()
    {
        return (byte)32;
    }

    public static byte quantityNotationMaxValue()
    {
        return (byte)126;
    }

    public static int quantityNotationLength()
    {
        return 3;
    }

    public StandingDataEncoder quantityNotation(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 345 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String quantityNotationCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putQuantityNotation(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 345, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder quantityNotation(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 345, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 345 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder quantityNotation(final CharSequence src)
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
            buffer.putByte(this.offset + 345 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 345 + i, (byte)0);
        }

        return this;
    }

    public static int instUnitExpId()
    {
        return 45;
    }

    public static int instUnitExpSinceVersion()
    {
        return 0;
    }

    public static int instUnitExpEncodingOffset()
    {
        return 348;
    }

    public static int instUnitExpEncodingLength()
    {
        return 1;
    }

    public static String instUnitExpMetaAttribute(final MetaAttribute metaAttribute)
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

    public StandingDataEncoder instUnitExp(final InstrumentUnitExpression_enum value)
    {
        buffer.putByte(offset + 348, (byte)value.value());
        return this;
    }

    public static int settlementDelayId()
    {
        return 46;
    }

    public static int settlementDelaySinceVersion()
    {
        return 0;
    }

    public static int settlementDelayEncodingOffset()
    {
        return 349;
    }

    public static int settlementDelayEncodingLength()
    {
        return 2;
    }

    public static String settlementDelayMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte settlementDelayNullValue()
    {
        return (byte)0;
    }

    public static byte settlementDelayMinValue()
    {
        return (byte)32;
    }

    public static byte settlementDelayMaxValue()
    {
        return (byte)126;
    }

    public static int settlementDelayLength()
    {
        return 2;
    }

    public StandingDataEncoder settlementDelay(final int index, final byte value)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 349 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String settlementDelayCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putSettlementDelay(final byte[] src, final int srcOffset)
    {
        final int length = 2;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 349, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder settlementDelay(final String src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 349, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 349 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder settlementDelay(final CharSequence src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 349 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 349 + i, (byte)0);
        }

        return this;
    }

    public static int strikeCurrencyId()
    {
        return 47;
    }

    public static int strikeCurrencySinceVersion()
    {
        return 0;
    }

    public static int strikeCurrencyEncodingOffset()
    {
        return 351;
    }

    public static int strikeCurrencyEncodingLength()
    {
        return 3;
    }

    public static String strikeCurrencyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte strikeCurrencyNullValue()
    {
        return (byte)0;
    }

    public static byte strikeCurrencyMinValue()
    {
        return (byte)32;
    }

    public static byte strikeCurrencyMaxValue()
    {
        return (byte)126;
    }

    public static int strikeCurrencyLength()
    {
        return 3;
    }

    public StandingDataEncoder strikeCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 351 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String strikeCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putStrikeCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 351, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder strikeCurrency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 351, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 351 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder strikeCurrency(final CharSequence src)
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
            buffer.putByte(this.offset + 351 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 351 + i, (byte)0);
        }

        return this;
    }

    public static int taxCodeId()
    {
        return 48;
    }

    public static int taxCodeSinceVersion()
    {
        return 0;
    }

    public static int taxCodeEncodingOffset()
    {
        return 354;
    }

    public static int taxCodeEncodingLength()
    {
        return 1;
    }

    public static String taxCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public StandingDataEncoder taxCode(final TaxCode_enum value)
    {
        buffer.putByte(offset + 354, (byte)value.value());
        return this;
    }

    public static int typeOfCorporateEventId()
    {
        return 49;
    }

    public static int typeOfCorporateEventSinceVersion()
    {
        return 0;
    }

    public static int typeOfCorporateEventEncodingOffset()
    {
        return 355;
    }

    public static int typeOfCorporateEventEncodingLength()
    {
        return 2;
    }

    public static String typeOfCorporateEventMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte typeOfCorporateEventNullValue()
    {
        return (byte)0;
    }

    public static byte typeOfCorporateEventMinValue()
    {
        return (byte)32;
    }

    public static byte typeOfCorporateEventMaxValue()
    {
        return (byte)126;
    }

    public static int typeOfCorporateEventLength()
    {
        return 2;
    }

    public StandingDataEncoder typeOfCorporateEvent(final int index, final byte value)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 355 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String typeOfCorporateEventCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putTypeOfCorporateEvent(final byte[] src, final int srcOffset)
    {
        final int length = 2;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 355, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder typeOfCorporateEvent(final String src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 355, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 355 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder typeOfCorporateEvent(final CharSequence src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 355 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 355 + i, (byte)0);
        }

        return this;
    }

    public static int typeOfMarketAdmissionId()
    {
        return 50;
    }

    public static int typeOfMarketAdmissionSinceVersion()
    {
        return 0;
    }

    public static int typeOfMarketAdmissionEncodingOffset()
    {
        return 357;
    }

    public static int typeOfMarketAdmissionEncodingLength()
    {
        return 1;
    }

    public static String typeOfMarketAdmissionMetaAttribute(final MetaAttribute metaAttribute)
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

    public StandingDataEncoder typeOfMarketAdmission(final TypeOfMarketAdmission_enum value)
    {
        buffer.putByte(offset + 357, value.value());
        return this;
    }

    public static int repoIndicatorId()
    {
        return 51;
    }

    public static int repoIndicatorSinceVersion()
    {
        return 0;
    }

    public static int repoIndicatorEncodingOffset()
    {
        return 358;
    }

    public static int repoIndicatorEncodingLength()
    {
        return 1;
    }

    public static String repoIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public StandingDataEncoder repoIndicator(final RepoIndicator_enum value)
    {
        buffer.putByte(offset + 358, (byte)value.value());
        return this;
    }

    public static int issuePriceId()
    {
        return 52;
    }

    public static int issuePriceSinceVersion()
    {
        return 0;
    }

    public static int issuePriceEncodingOffset()
    {
        return 359;
    }

    public static int issuePriceEncodingLength()
    {
        return 8;
    }

    public static String issuePriceMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long issuePriceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long issuePriceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long issuePriceMaxValue()
    {
        return 9223372036854775807L;
    }

    public StandingDataEncoder issuePrice(final long value)
    {
        buffer.putLong(offset + 359, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int nominalCurrencyId()
    {
        return 53;
    }

    public static int nominalCurrencySinceVersion()
    {
        return 0;
    }

    public static int nominalCurrencyEncodingOffset()
    {
        return 367;
    }

    public static int nominalCurrencyEncodingLength()
    {
        return 3;
    }

    public static String nominalCurrencyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte nominalCurrencyNullValue()
    {
        return (byte)0;
    }

    public static byte nominalCurrencyMinValue()
    {
        return (byte)32;
    }

    public static byte nominalCurrencyMaxValue()
    {
        return (byte)126;
    }

    public static int nominalCurrencyLength()
    {
        return 3;
    }

    public StandingDataEncoder nominalCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 367 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String nominalCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putNominalCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 367, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder nominalCurrency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 367, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 367 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder nominalCurrency(final CharSequence src)
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
            buffer.putByte(this.offset + 367 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 367 + i, (byte)0);
        }

        return this;
    }

    public static int issuePriceDecimalsId()
    {
        return 54;
    }

    public static int issuePriceDecimalsSinceVersion()
    {
        return 0;
    }

    public static int issuePriceDecimalsEncodingOffset()
    {
        return 370;
    }

    public static int issuePriceDecimalsEncodingLength()
    {
        return 1;
    }

    public static String issuePriceDecimalsMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short issuePriceDecimalsNullValue()
    {
        return (short)255;
    }

    public static short issuePriceDecimalsMinValue()
    {
        return (short)0;
    }

    public static short issuePriceDecimalsMaxValue()
    {
        return (short)254;
    }

    public StandingDataEncoder issuePriceDecimals(final short value)
    {
        buffer.putByte(offset + 370, (byte)value);
        return this;
    }


    public static int strikePriceDecimalsId()
    {
        return 55;
    }

    public static int strikePriceDecimalsSinceVersion()
    {
        return 0;
    }

    public static int strikePriceDecimalsEncodingOffset()
    {
        return 371;
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

    public StandingDataEncoder strikePriceDecimals(final short value)
    {
        buffer.putByte(offset + 371, (byte)value);
        return this;
    }


    public static int liquidInstrumentIndicatorId()
    {
        return 56;
    }

    public static int liquidInstrumentIndicatorSinceVersion()
    {
        return 0;
    }

    public static int liquidInstrumentIndicatorEncodingOffset()
    {
        return 372;
    }

    public static int liquidInstrumentIndicatorEncodingLength()
    {
        return 1;
    }

    public static String liquidInstrumentIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short liquidInstrumentIndicatorNullValue()
    {
        return (short)255;
    }

    public static short liquidInstrumentIndicatorMinValue()
    {
        return (short)0;
    }

    public static short liquidInstrumentIndicatorMaxValue()
    {
        return (short)254;
    }

    public StandingDataEncoder liquidInstrumentIndicator(final short value)
    {
        buffer.putByte(offset + 372, (byte)value);
        return this;
    }


    public static int marketOfReferenceMICId()
    {
        return 57;
    }

    public static int marketOfReferenceMICSinceVersion()
    {
        return 0;
    }

    public static int marketOfReferenceMICEncodingOffset()
    {
        return 373;
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

    public StandingDataEncoder marketOfReferenceMIC(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 373 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String marketOfReferenceMICCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putMarketOfReferenceMIC(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 373, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder marketOfReferenceMIC(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 373, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 373 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder marketOfReferenceMIC(final CharSequence src)
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
            buffer.putByte(this.offset + 373 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 373 + i, (byte)0);
        }

        return this;
    }

    public static int iCBCodeId()
    {
        return 58;
    }

    public static int iCBCodeSinceVersion()
    {
        return 104;
    }

    public static int iCBCodeEncodingOffset()
    {
        return 377;
    }

    public static int iCBCodeEncodingLength()
    {
        return 8;
    }

    public static String iCBCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte iCBCodeNullValue()
    {
        return (byte)0;
    }

    public static byte iCBCodeMinValue()
    {
        return (byte)32;
    }

    public static byte iCBCodeMaxValue()
    {
        return (byte)126;
    }

    public static int iCBCodeLength()
    {
        return 8;
    }

    public StandingDataEncoder iCBCode(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 377 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String iCBCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StandingDataEncoder putICBCode(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 377, src, srcOffset, length);

        return this;
    }

    public StandingDataEncoder iCBCode(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 377, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 377 + start, (byte)0);
        }

        return this;
    }

    public StandingDataEncoder iCBCode(final CharSequence src)
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
            buffer.putByte(this.offset + 377 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 377 + i, (byte)0);
        }

        return this;
    }

    private final EMMPatternRepEncoder eMMPatternRep = new EMMPatternRepEncoder(this);

    public static long eMMPatternRepId()
    {
        return 59;
    }

    public EMMPatternRepEncoder eMMPatternRepCount(final int count)
    {
        eMMPatternRep.wrap(buffer, count);
        return eMMPatternRep;
    }

    public static class EMMPatternRepEncoder
    {
        public static final int HEADER_SIZE = 2;
        private final StandingDataEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;

        EMMPatternRepEncoder(final StandingDataEncoder parentMessage)
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
            buffer.putByte(limit + 0, (byte)(short)6);
            buffer.putByte(limit + 1, (byte)(short)count);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 6;
        }

        public EMMPatternRepEncoder next()
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

        public EMMPatternRepEncoder eMM(final EMM_enum value)
        {
            buffer.putByte(offset + 0, (byte)value.value());
            return this;
        }

        public static int patternIDId()
        {
            return 2;
        }

        public static int patternIDSinceVersion()
        {
            return 0;
        }

        public static int patternIDEncodingOffset()
        {
            return 1;
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

        public EMMPatternRepEncoder patternID(final int value)
        {
            buffer.putShort(offset + 1, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int tickSizeIndexIDId()
        {
            return 3;
        }

        public static int tickSizeIndexIDSinceVersion()
        {
            return 0;
        }

        public static int tickSizeIndexIDEncodingOffset()
        {
            return 3;
        }

        public static int tickSizeIndexIDEncodingLength()
        {
            return 2;
        }

        public static String tickSizeIndexIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int tickSizeIndexIDNullValue()
        {
            return 65535;
        }

        public static int tickSizeIndexIDMinValue()
        {
            return 0;
        }

        public static int tickSizeIndexIDMaxValue()
        {
            return 65534;
        }

        public EMMPatternRepEncoder tickSizeIndexID(final int value)
        {
            buffer.putShort(offset + 3, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int marketModelId()
        {
            return 4;
        }

        public static int marketModelSinceVersion()
        {
            return 0;
        }

        public static int marketModelEncodingOffset()
        {
            return 5;
        }

        public static int marketModelEncodingLength()
        {
            return 1;
        }

        public static String marketModelMetaAttribute(final MetaAttribute metaAttribute)
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

        public EMMPatternRepEncoder marketModel(final MarketModel_enum value)
        {
            buffer.putByte(offset + 5, (byte)value.value());
            return this;
        }
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        StandingDataDecoder writer = new StandingDataDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

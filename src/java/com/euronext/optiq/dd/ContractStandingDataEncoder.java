/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class ContractStandingDataEncoder
{
    public static final int BLOCK_LENGTH = 239;
    public static final int TEMPLATE_ID = 1013;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ContractStandingDataEncoder parentMessage = this;
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

    public ContractStandingDataEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public ContractStandingDataEncoder wrapAndApplyHeader(
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

    public ContractStandingDataEncoder mDSeqNum(final long value)
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

    public ContractStandingDataEncoder rebroadcastIndicator(final short value)
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

    public ContractStandingDataEncoder symbolIndex(final long value)
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

    public ContractStandingDataEncoder optiqSegment(final OptiqSegment_enum value)
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

    public ContractStandingDataEncoder partitionID(final int value)
    {
        buffer.putShort(offset + 14, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int contractEventDateId()
    {
        return 6;
    }

    public static int contractEventDateSinceVersion()
    {
        return 0;
    }

    public static int contractEventDateEncodingOffset()
    {
        return 16;
    }

    public static int contractEventDateEncodingLength()
    {
        return 2;
    }

    public static String contractEventDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static int contractEventDateNullValue()
    {
        return 65535;
    }

    public static int contractEventDateMinValue()
    {
        return 0;
    }

    public static int contractEventDateMaxValue()
    {
        return 65534;
    }

    public ContractStandingDataEncoder contractEventDate(final int value)
    {
        buffer.putShort(offset + 16, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int exchangeCodeId()
    {
        return 7;
    }

    public static int exchangeCodeSinceVersion()
    {
        return 0;
    }

    public static int exchangeCodeEncodingOffset()
    {
        return 18;
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

    public ContractStandingDataEncoder exchangeCode(final ExchangeCode_enum value)
    {
        buffer.putByte(offset + 18, value.value());
        return this;
    }

    public static int exerStyleId()
    {
        return 8;
    }

    public static int exerStyleSinceVersion()
    {
        return 0;
    }

    public static int exerStyleEncodingOffset()
    {
        return 19;
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

    public ContractStandingDataEncoder exerStyle(final ExerciseStyle_enum value)
    {
        buffer.putByte(offset + 19, (byte)value.value());
        return this;
    }

    public static int flexIndId()
    {
        return 9;
    }

    public static int flexIndSinceVersion()
    {
        return 0;
    }

    public static int flexIndEncodingOffset()
    {
        return 20;
    }

    public static int flexIndEncodingLength()
    {
        return 1;
    }

    public static String flexIndMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short flexIndNullValue()
    {
        return (short)255;
    }

    public static short flexIndMinValue()
    {
        return (short)0;
    }

    public static short flexIndMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder flexInd(final short value)
    {
        buffer.putByte(offset + 20, (byte)value);
        return this;
    }


    public static int contractNameId()
    {
        return 10;
    }

    public static int contractNameSinceVersion()
    {
        return 0;
    }

    public static int contractNameEncodingOffset()
    {
        return 21;
    }

    public static int contractNameEncodingLength()
    {
        return 60;
    }

    public static String contractNameMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte contractNameNullValue()
    {
        return (byte)0;
    }

    public static byte contractNameMinValue()
    {
        return (byte)32;
    }

    public static byte contractNameMaxValue()
    {
        return (byte)126;
    }

    public static int contractNameLength()
    {
        return 60;
    }

    public ContractStandingDataEncoder contractName(final int index, final byte value)
    {
        if (index < 0 || index >= 60)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 21 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String contractNameCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putContractName(final byte[] src, final int srcOffset)
    {
        final int length = 60;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 21, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder contractName(final String src)
    {
        final int length = 60;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 21, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 21 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder contractName(final CharSequence src)
    {
        final int length = 60;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        for (int i = 0; i < srcLength; ++i)
        {
            final char charValue = src.charAt(i);
            final byte byteValue = charValue > 127 ? (byte)'?' : (byte)charValue;
            buffer.putByte(this.offset + 21 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 21 + i, (byte)0);
        }

        return this;
    }

    public static int contractTypeId()
    {
        return 11;
    }

    public static int contractTypeSinceVersion()
    {
        return 0;
    }

    public static int contractTypeEncodingOffset()
    {
        return 81;
    }

    public static int contractTypeEncodingLength()
    {
        return 1;
    }

    public static String contractTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public ContractStandingDataEncoder contractType(final ContractType_enum value)
    {
        buffer.putByte(offset + 81, value.value());
        return this;
    }

    public static int underlyingTypeId()
    {
        return 12;
    }

    public static int underlyingTypeSinceVersion()
    {
        return 0;
    }

    public static int underlyingTypeEncodingOffset()
    {
        return 82;
    }

    public static int underlyingTypeEncodingLength()
    {
        return 1;
    }

    public static String underlyingTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public ContractStandingDataEncoder underlyingType(final UnderlyingType_enum value)
    {
        buffer.putByte(offset + 82, value.value());
        return this;
    }

    public static int priceDecimalsId()
    {
        return 13;
    }

    public static int priceDecimalsSinceVersion()
    {
        return 0;
    }

    public static int priceDecimalsEncodingOffset()
    {
        return 83;
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

    public ContractStandingDataEncoder priceDecimals(final short value)
    {
        buffer.putByte(offset + 83, (byte)value);
        return this;
    }


    public static int quantityDecimalsId()
    {
        return 14;
    }

    public static int quantityDecimalsSinceVersion()
    {
        return 0;
    }

    public static int quantityDecimalsEncodingOffset()
    {
        return 84;
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

    public ContractStandingDataEncoder quantityDecimals(final short value)
    {
        buffer.putByte(offset + 84, (byte)value);
        return this;
    }


    public static int amountDecimalsId()
    {
        return 15;
    }

    public static int amountDecimalsSinceVersion()
    {
        return 0;
    }

    public static int amountDecimalsEncodingOffset()
    {
        return 85;
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

    public ContractStandingDataEncoder amountDecimals(final short value)
    {
        buffer.putByte(offset + 85, (byte)value);
        return this;
    }


    public static int ratioDecimalsId()
    {
        return 16;
    }

    public static int ratioDecimalsSinceVersion()
    {
        return 0;
    }

    public static int ratioDecimalsEncodingOffset()
    {
        return 86;
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

    public ContractStandingDataEncoder ratioDecimals(final short value)
    {
        buffer.putByte(offset + 86, (byte)value);
        return this;
    }


    public static int mainDepositaryId()
    {
        return 17;
    }

    public static int mainDepositarySinceVersion()
    {
        return 0;
    }

    public static int mainDepositaryEncodingOffset()
    {
        return 87;
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

    public ContractStandingDataEncoder mainDepositary(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 87 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mainDepositaryCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putMainDepositary(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 87, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder mainDepositary(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 87, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 87 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder mainDepositary(final CharSequence src)
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
            buffer.putByte(this.offset + 87 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 87 + i, (byte)0);
        }

        return this;
    }

    public static int mICId()
    {
        return 18;
    }

    public static int mICSinceVersion()
    {
        return 0;
    }

    public static int mICEncodingOffset()
    {
        return 92;
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

    public ContractStandingDataEncoder mIC(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 92 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String mICCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putMIC(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 92, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder mIC(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 92, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 92 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder mIC(final CharSequence src)
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
            buffer.putByte(this.offset + 92 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 92 + i, (byte)0);
        }

        return this;
    }

    public static int countryOfExchangeId()
    {
        return 19;
    }

    public static int countryOfExchangeSinceVersion()
    {
        return 0;
    }

    public static int countryOfExchangeEncodingOffset()
    {
        return 96;
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
            case PRESENCE: return "required";
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

    public ContractStandingDataEncoder countryOfExchange(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 96 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String countryOfExchangeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putCountryOfExchange(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 96, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder countryOfExchange(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 96, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 96 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder countryOfExchange(final CharSequence src)
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
            buffer.putByte(this.offset + 96 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 96 + i, (byte)0);
        }

        return this;
    }

    public static int productCodeId()
    {
        return 20;
    }

    public static int productCodeSinceVersion()
    {
        return 0;
    }

    public static int productCodeEncodingOffset()
    {
        return 99;
    }

    public static int productCodeEncodingLength()
    {
        return 3;
    }

    public static String productCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte productCodeNullValue()
    {
        return (byte)0;
    }

    public static byte productCodeMinValue()
    {
        return (byte)32;
    }

    public static byte productCodeMaxValue()
    {
        return (byte)126;
    }

    public static int productCodeLength()
    {
        return 3;
    }

    public ContractStandingDataEncoder productCode(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 99 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String productCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putProductCode(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 99, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder productCode(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 99, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 99 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder productCode(final CharSequence src)
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
            buffer.putByte(this.offset + 99 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 99 + i, (byte)0);
        }

        return this;
    }

    public static int underlyingMICId()
    {
        return 21;
    }

    public static int underlyingMICSinceVersion()
    {
        return 0;
    }

    public static int underlyingMICEncodingOffset()
    {
        return 102;
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

    public ContractStandingDataEncoder underlyingMIC(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 102 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String underlyingMICCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putUnderlyingMIC(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 102, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder underlyingMIC(final String src)
    {
        final int length = 4;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 102, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 102 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder underlyingMIC(final CharSequence src)
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
            buffer.putByte(this.offset + 102 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 102 + i, (byte)0);
        }

        return this;
    }

    public static int underlyingISINCodeId()
    {
        return 22;
    }

    public static int underlyingISINCodeSinceVersion()
    {
        return 0;
    }

    public static int underlyingISINCodeEncodingOffset()
    {
        return 106;
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

    public ContractStandingDataEncoder underlyingISINCode(final int index, final byte value)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 106 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String underlyingISINCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putUnderlyingISINCode(final byte[] src, final int srcOffset)
    {
        final int length = 12;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 106, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder underlyingISINCode(final String src)
    {
        final int length = 12;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 106, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 106 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder underlyingISINCode(final CharSequence src)
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
            buffer.putByte(this.offset + 106 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 106 + i, (byte)0);
        }

        return this;
    }

    public static int underlyingExpiryId()
    {
        return 23;
    }

    public static int underlyingExpirySinceVersion()
    {
        return 0;
    }

    public static int underlyingExpiryEncodingOffset()
    {
        return 118;
    }

    public static int underlyingExpiryEncodingLength()
    {
        return 4;
    }

    public static String underlyingExpiryMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long underlyingExpiryNullValue()
    {
        return 4294967295L;
    }

    public static long underlyingExpiryMinValue()
    {
        return 0L;
    }

    public static long underlyingExpiryMaxValue()
    {
        return 4294967294L;
    }

    public ContractStandingDataEncoder underlyingExpiry(final long value)
    {
        buffer.putInt(offset + 118, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int orderTypeRulesId()
    {
        return 24;
    }

    public static int orderTypeRulesSinceVersion()
    {
        return 0;
    }

    public static int orderTypeRulesEncodingOffset()
    {
        return 122;
    }

    public static int orderTypeRulesEncodingLength()
    {
        return 2;
    }

    public static String orderTypeRulesMetaAttribute(final MetaAttribute metaAttribute)
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

    private final OrderTypeRules_setEncoder orderTypeRules = new OrderTypeRules_setEncoder();

    public OrderTypeRules_setEncoder orderTypeRules()
    {
        orderTypeRules.wrap(buffer, offset + 122);
        return orderTypeRules;
    }

    public static int settlementMethodId()
    {
        return 25;
    }

    public static int settlementMethodSinceVersion()
    {
        return 0;
    }

    public static int settlementMethodEncodingOffset()
    {
        return 124;
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

    public ContractStandingDataEncoder settlementMethod(final byte value)
    {
        buffer.putByte(offset + 124, value);
        return this;
    }


    public static int tradingCurrencyId()
    {
        return 26;
    }

    public static int tradingCurrencySinceVersion()
    {
        return 0;
    }

    public static int tradingCurrencyEncodingOffset()
    {
        return 125;
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
            case PRESENCE: return "required";
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

    public ContractStandingDataEncoder tradingCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 125 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tradingCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putTradingCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 125, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder tradingCurrency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 125, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 125 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder tradingCurrency(final CharSequence src)
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
            buffer.putByte(this.offset + 125 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 125 + i, (byte)0);
        }

        return this;
    }

    public static int whRFCDaysBeforeExpiryId()
    {
        return 27;
    }

    public static int whRFCDaysBeforeExpirySinceVersion()
    {
        return 0;
    }

    public static int whRFCDaysBeforeExpiryEncodingOffset()
    {
        return 128;
    }

    public static int whRFCDaysBeforeExpiryEncodingLength()
    {
        return 1;
    }

    public static String whRFCDaysBeforeExpiryMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short whRFCDaysBeforeExpiryNullValue()
    {
        return (short)255;
    }

    public static short whRFCDaysBeforeExpiryMinValue()
    {
        return (short)0;
    }

    public static short whRFCDaysBeforeExpiryMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder whRFCDaysBeforeExpiry(final short value)
    {
        buffer.putByte(offset + 128, (byte)value);
        return this;
    }


    public static int whRFCMinutesBeforeClosingId()
    {
        return 28;
    }

    public static int whRFCMinutesBeforeClosingSinceVersion()
    {
        return 0;
    }

    public static int whRFCMinutesBeforeClosingEncodingOffset()
    {
        return 129;
    }

    public static int whRFCMinutesBeforeClosingEncodingLength()
    {
        return 1;
    }

    public static String whRFCMinutesBeforeClosingMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short whRFCMinutesBeforeClosingNullValue()
    {
        return (short)255;
    }

    public static short whRFCMinutesBeforeClosingMinValue()
    {
        return (short)0;
    }

    public static short whRFCMinutesBeforeClosingMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder whRFCMinutesBeforeClosing(final short value)
    {
        buffer.putByte(offset + 129, (byte)value);
        return this;
    }


    public static int minimumQuantityForInitiatorId()
    {
        return 29;
    }

    public static int minimumQuantityForInitiatorSinceVersion()
    {
        return 0;
    }

    public static int minimumQuantityForInitiatorEncodingOffset()
    {
        return 130;
    }

    public static int minimumQuantityForInitiatorEncodingLength()
    {
        return 4;
    }

    public static String minimumQuantityForInitiatorMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long minimumQuantityForInitiatorNullValue()
    {
        return 4294967295L;
    }

    public static long minimumQuantityForInitiatorMinValue()
    {
        return 0L;
    }

    public static long minimumQuantityForInitiatorMaxValue()
    {
        return 4294967294L;
    }

    public ContractStandingDataEncoder minimumQuantityForInitiator(final long value)
    {
        buffer.putInt(offset + 130, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int minimumQuantityForReactorId()
    {
        return 30;
    }

    public static int minimumQuantityForReactorSinceVersion()
    {
        return 0;
    }

    public static int minimumQuantityForReactorEncodingOffset()
    {
        return 134;
    }

    public static int minimumQuantityForReactorEncodingLength()
    {
        return 4;
    }

    public static String minimumQuantityForReactorMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long minimumQuantityForReactorNullValue()
    {
        return 4294967295L;
    }

    public static long minimumQuantityForReactorMinValue()
    {
        return 0L;
    }

    public static long minimumQuantityForReactorMaxValue()
    {
        return 4294967294L;
    }

    public ContractStandingDataEncoder minimumQuantityForReactor(final long value)
    {
        buffer.putInt(offset + 134, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int whRFCPickUpPercId()
    {
        return 31;
    }

    public static int whRFCPickUpPercSinceVersion()
    {
        return 0;
    }

    public static int whRFCPickUpPercEncodingOffset()
    {
        return 138;
    }

    public static int whRFCPickUpPercEncodingLength()
    {
        return 1;
    }

    public static String whRFCPickUpPercMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short whRFCPickUpPercNullValue()
    {
        return (short)255;
    }

    public static short whRFCPickUpPercMinValue()
    {
        return (short)0;
    }

    public static short whRFCPickUpPercMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder whRFCPickUpPerc(final short value)
    {
        buffer.putByte(offset + 138, (byte)value);
        return this;
    }


    public static int whRFCImprovementPeriodId()
    {
        return 32;
    }

    public static int whRFCImprovementPeriodSinceVersion()
    {
        return 0;
    }

    public static int whRFCImprovementPeriodEncodingOffset()
    {
        return 139;
    }

    public static int whRFCImprovementPeriodEncodingLength()
    {
        return 1;
    }

    public static String whRFCImprovementPeriodMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short whRFCImprovementPeriodNullValue()
    {
        return (short)255;
    }

    public static short whRFCImprovementPeriodMinValue()
    {
        return (short)0;
    }

    public static short whRFCImprovementPeriodMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder whRFCImprovementPeriod(final short value)
    {
        buffer.putByte(offset + 139, (byte)value);
        return this;
    }


    public static int availableWholesaleTradeTypeId()
    {
        return 33;
    }

    public static int availableWholesaleTradeTypeSinceVersion()
    {
        return 0;
    }

    public static int availableWholesaleTradeTypeEncodingOffset()
    {
        return 140;
    }

    public static int availableWholesaleTradeTypeEncodingLength()
    {
        return 4;
    }

    public static String availableWholesaleTradeTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    private final AvailableWholesaleTradeType_setEncoder availableWholesaleTradeType = new AvailableWholesaleTradeType_setEncoder();

    public AvailableWholesaleTradeType_setEncoder availableWholesaleTradeType()
    {
        availableWholesaleTradeType.wrap(buffer, offset + 140);
        return availableWholesaleTradeType;
    }

    public static int instrumentDecimalsRatioId()
    {
        return 34;
    }

    public static int instrumentDecimalsRatioSinceVersion()
    {
        return 0;
    }

    public static int instrumentDecimalsRatioEncodingOffset()
    {
        return 144;
    }

    public static int instrumentDecimalsRatioEncodingLength()
    {
        return 1;
    }

    public static String instrumentDecimalsRatioMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short instrumentDecimalsRatioNullValue()
    {
        return (short)255;
    }

    public static short instrumentDecimalsRatioMinValue()
    {
        return (short)0;
    }

    public static short instrumentDecimalsRatioMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder instrumentDecimalsRatio(final short value)
    {
        buffer.putByte(offset + 144, (byte)value);
        return this;
    }


    public static int instrumentTickSizeId()
    {
        return 35;
    }

    public static int instrumentTickSizeSinceVersion()
    {
        return 0;
    }

    public static int instrumentTickSizeEncodingOffset()
    {
        return 145;
    }

    public static int instrumentTickSizeEncodingLength()
    {
        return 1;
    }

    public static String instrumentTickSizeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short instrumentTickSizeNullValue()
    {
        return (short)255;
    }

    public static short instrumentTickSizeMinValue()
    {
        return (short)0;
    }

    public static short instrumentTickSizeMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder instrumentTickSize(final short value)
    {
        buffer.putByte(offset + 145, (byte)value);
        return this;
    }


    public static int instrumentSettlementTickSizeId()
    {
        return 36;
    }

    public static int instrumentSettlementTickSizeSinceVersion()
    {
        return 0;
    }

    public static int instrumentSettlementTickSizeEncodingOffset()
    {
        return 146;
    }

    public static int instrumentSettlementTickSizeEncodingLength()
    {
        return 1;
    }

    public static String instrumentSettlementTickSizeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short instrumentSettlementTickSizeNullValue()
    {
        return (short)255;
    }

    public static short instrumentSettlementTickSizeMinValue()
    {
        return (short)0;
    }

    public static short instrumentSettlementTickSizeMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder instrumentSettlementTickSize(final short value)
    {
        buffer.putByte(offset + 146, (byte)value);
        return this;
    }


    public static int instrumentEDSPTickSizeId()
    {
        return 37;
    }

    public static int instrumentEDSPTickSizeSinceVersion()
    {
        return 0;
    }

    public static int instrumentEDSPTickSizeEncodingOffset()
    {
        return 147;
    }

    public static int instrumentEDSPTickSizeEncodingLength()
    {
        return 1;
    }

    public static String instrumentEDSPTickSizeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short instrumentEDSPTickSizeNullValue()
    {
        return (short)255;
    }

    public static short instrumentEDSPTickSizeMinValue()
    {
        return (short)0;
    }

    public static short instrumentEDSPTickSizeMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder instrumentEDSPTickSize(final short value)
    {
        buffer.putByte(offset + 147, (byte)value);
        return this;
    }


    public static int strikePriceDecimalsRatioId()
    {
        return 38;
    }

    public static int strikePriceDecimalsRatioSinceVersion()
    {
        return 0;
    }

    public static int strikePriceDecimalsRatioEncodingOffset()
    {
        return 148;
    }

    public static int strikePriceDecimalsRatioEncodingLength()
    {
        return 1;
    }

    public static String strikePriceDecimalsRatioMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short strikePriceDecimalsRatioNullValue()
    {
        return (short)255;
    }

    public static short strikePriceDecimalsRatioMinValue()
    {
        return (short)0;
    }

    public static short strikePriceDecimalsRatioMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder strikePriceDecimalsRatio(final short value)
    {
        buffer.putByte(offset + 148, (byte)value);
        return this;
    }


    public static int deltaProtectforMMId()
    {
        return 39;
    }

    public static int deltaProtectforMMSinceVersion()
    {
        return 0;
    }

    public static int deltaProtectforMMEncodingOffset()
    {
        return 149;
    }

    public static int deltaProtectforMMEncodingLength()
    {
        return 1;
    }

    public static String deltaProtectforMMMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public ContractStandingDataEncoder deltaProtectforMM(final DeltaProtectforMM_enum value)
    {
        buffer.putByte(offset + 149, (byte)value.value());
        return this;
    }

    public static int vegaProtectforMMId()
    {
        return 40;
    }

    public static int vegaProtectforMMSinceVersion()
    {
        return 0;
    }

    public static int vegaProtectforMMEncodingOffset()
    {
        return 150;
    }

    public static int vegaProtectforMMEncodingLength()
    {
        return 1;
    }

    public static String vegaProtectforMMMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public ContractStandingDataEncoder vegaProtectforMM(final VegaProtectforMM_enum value)
    {
        buffer.putByte(offset + 150, (byte)value.value());
        return this;
    }

    public static int volumeProtectforMMId()
    {
        return 41;
    }

    public static int volumeProtectforMMSinceVersion()
    {
        return 0;
    }

    public static int volumeProtectforMMEncodingOffset()
    {
        return 151;
    }

    public static int volumeProtectforMMEncodingLength()
    {
        return 1;
    }

    public static String volumeProtectforMMMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public ContractStandingDataEncoder volumeProtectforMM(final VolumeProtectforMM_enum value)
    {
        buffer.putByte(offset + 151, (byte)value.value());
        return this;
    }

    public static int contractTradingTypeId()
    {
        return 42;
    }

    public static int contractTradingTypeSinceVersion()
    {
        return 0;
    }

    public static int contractTradingTypeEncodingOffset()
    {
        return 152;
    }

    public static int contractTradingTypeEncodingLength()
    {
        return 1;
    }

    public static String contractTradingTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public ContractStandingDataEncoder contractTradingType(final ContractTradingType_enum value)
    {
        buffer.putByte(offset + 152, (byte)value.value());
        return this;
    }

    public static int throttleforIncomingOrdersId()
    {
        return 43;
    }

    public static int throttleforIncomingOrdersSinceVersion()
    {
        return 0;
    }

    public static int throttleforIncomingOrdersEncodingOffset()
    {
        return 153;
    }

    public static int throttleforIncomingOrdersEncodingLength()
    {
        return 2;
    }

    public static String throttleforIncomingOrdersMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static int throttleforIncomingOrdersNullValue()
    {
        return 65535;
    }

    public static int throttleforIncomingOrdersMinValue()
    {
        return 0;
    }

    public static int throttleforIncomingOrdersMaxValue()
    {
        return 65534;
    }

    public ContractStandingDataEncoder throttleforIncomingOrders(final int value)
    {
        buffer.putShort(offset + 153, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int strikePriceFlexIncrementId()
    {
        return 44;
    }

    public static int strikePriceFlexIncrementSinceVersion()
    {
        return 0;
    }

    public static int strikePriceFlexIncrementEncodingOffset()
    {
        return 155;
    }

    public static int strikePriceFlexIncrementEncodingLength()
    {
        return 4;
    }

    public static String strikePriceFlexIncrementMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long strikePriceFlexIncrementNullValue()
    {
        return 4294967295L;
    }

    public static long strikePriceFlexIncrementMinValue()
    {
        return 0L;
    }

    public static long strikePriceFlexIncrementMaxValue()
    {
        return 4294967294L;
    }

    public ContractStandingDataEncoder strikePriceFlexIncrement(final long value)
    {
        buffer.putInt(offset + 155, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int premiumPricingTickSizeId()
    {
        return 45;
    }

    public static int premiumPricingTickSizeSinceVersion()
    {
        return 0;
    }

    public static int premiumPricingTickSizeEncodingOffset()
    {
        return 159;
    }

    public static int premiumPricingTickSizeEncodingLength()
    {
        return 1;
    }

    public static String premiumPricingTickSizeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short premiumPricingTickSizeNullValue()
    {
        return (short)255;
    }

    public static short premiumPricingTickSizeMinValue()
    {
        return (short)0;
    }

    public static short premiumPricingTickSizeMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder premiumPricingTickSize(final short value)
    {
        buffer.putByte(offset + 159, (byte)value);
        return this;
    }


    public static int premiumPricingThresholdId()
    {
        return 46;
    }

    public static int premiumPricingThresholdSinceVersion()
    {
        return 0;
    }

    public static int premiumPricingThresholdEncodingOffset()
    {
        return 160;
    }

    public static int premiumPricingThresholdEncodingLength()
    {
        return 8;
    }

    public static String premiumPricingThresholdMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long premiumPricingThresholdNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long premiumPricingThresholdMinValue()
    {
        return 0x0L;
    }

    public static long premiumPricingThresholdMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ContractStandingDataEncoder premiumPricingThreshold(final long value)
    {
        buffer.putLong(offset + 160, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tickValueId()
    {
        return 47;
    }

    public static int tickValueSinceVersion()
    {
        return 0;
    }

    public static int tickValueEncodingOffset()
    {
        return 168;
    }

    public static int tickValueEncodingLength()
    {
        return 8;
    }

    public static String tickValueMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long tickValueNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long tickValueMinValue()
    {
        return 0x0L;
    }

    public static long tickValueMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ContractStandingDataEncoder tickValue(final long value)
    {
        buffer.putLong(offset + 168, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int outrightLISTradeThresholdId()
    {
        return 48;
    }

    public static int outrightLISTradeThresholdSinceVersion()
    {
        return 0;
    }

    public static int outrightLISTradeThresholdEncodingOffset()
    {
        return 176;
    }

    public static int outrightLISTradeThresholdEncodingLength()
    {
        return 8;
    }

    public static String outrightLISTradeThresholdMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long outrightLISTradeThresholdNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long outrightLISTradeThresholdMinValue()
    {
        return 0x0L;
    }

    public static long outrightLISTradeThresholdMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ContractStandingDataEncoder outrightLISTradeThreshold(final long value)
    {
        buffer.putLong(offset + 176, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int strategyLISTradeThresholdId()
    {
        return 49;
    }

    public static int strategyLISTradeThresholdSinceVersion()
    {
        return 0;
    }

    public static int strategyLISTradeThresholdEncodingOffset()
    {
        return 184;
    }

    public static int strategyLISTradeThresholdEncodingLength()
    {
        return 8;
    }

    public static String strategyLISTradeThresholdMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long strategyLISTradeThresholdNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long strategyLISTradeThresholdMinValue()
    {
        return 0x0L;
    }

    public static long strategyLISTradeThresholdMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ContractStandingDataEncoder strategyLISTradeThreshold(final long value)
    {
        buffer.putLong(offset + 184, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int outrightGCrossTradeThresholdId()
    {
        return 50;
    }

    public static int outrightGCrossTradeThresholdSinceVersion()
    {
        return 0;
    }

    public static int outrightGCrossTradeThresholdEncodingOffset()
    {
        return 192;
    }

    public static int outrightGCrossTradeThresholdEncodingLength()
    {
        return 8;
    }

    public static String outrightGCrossTradeThresholdMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long outrightGCrossTradeThresholdNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long outrightGCrossTradeThresholdMinValue()
    {
        return 0x0L;
    }

    public static long outrightGCrossTradeThresholdMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ContractStandingDataEncoder outrightGCrossTradeThreshold(final long value)
    {
        buffer.putLong(offset + 192, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int strategyGCrossTradeThresholdId()
    {
        return 51;
    }

    public static int strategyGCrossTradeThresholdSinceVersion()
    {
        return 0;
    }

    public static int strategyGCrossTradeThresholdEncodingOffset()
    {
        return 200;
    }

    public static int strategyGCrossTradeThresholdEncodingLength()
    {
        return 8;
    }

    public static String strategyGCrossTradeThresholdMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long strategyGCrossTradeThresholdNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long strategyGCrossTradeThresholdMinValue()
    {
        return 0x0L;
    }

    public static long strategyGCrossTradeThresholdMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ContractStandingDataEncoder strategyGCrossTradeThreshold(final long value)
    {
        buffer.putLong(offset + 200, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int lotSizeId()
    {
        return 52;
    }

    public static int lotSizeSinceVersion()
    {
        return 0;
    }

    public static int lotSizeEncodingOffset()
    {
        return 208;
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

    public ContractStandingDataEncoder lotSize(final long value)
    {
        buffer.putLong(offset + 208, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int instUnitExpId()
    {
        return 53;
    }

    public static int instUnitExpSinceVersion()
    {
        return 0;
    }

    public static int instUnitExpEncodingOffset()
    {
        return 216;
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

    public ContractStandingDataEncoder instUnitExp(final InstrumentUnitExpression_enum value)
    {
        buffer.putByte(offset + 216, (byte)value.value());
        return this;
    }

    public static int tickValueDecimalsId()
    {
        return 54;
    }

    public static int tickValueDecimalsSinceVersion()
    {
        return 0;
    }

    public static int tickValueDecimalsEncodingOffset()
    {
        return 217;
    }

    public static int tickValueDecimalsEncodingLength()
    {
        return 1;
    }

    public static String tickValueDecimalsMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short tickValueDecimalsNullValue()
    {
        return (short)255;
    }

    public static short tickValueDecimalsMinValue()
    {
        return (short)0;
    }

    public static short tickValueDecimalsMaxValue()
    {
        return (short)254;
    }

    public ContractStandingDataEncoder tickValueDecimals(final short value)
    {
        buffer.putByte(offset + 217, (byte)value);
        return this;
    }


    public static int pricingAlgorithmId()
    {
        return 55;
    }

    public static int pricingAlgorithmSinceVersion()
    {
        return 0;
    }

    public static int pricingAlgorithmEncodingOffset()
    {
        return 218;
    }

    public static int pricingAlgorithmEncodingLength()
    {
        return 3;
    }

    public static String pricingAlgorithmMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static byte pricingAlgorithmNullValue()
    {
        return (byte)0;
    }

    public static byte pricingAlgorithmMinValue()
    {
        return (byte)32;
    }

    public static byte pricingAlgorithmMaxValue()
    {
        return (byte)126;
    }

    public static int pricingAlgorithmLength()
    {
        return 3;
    }

    public ContractStandingDataEncoder pricingAlgorithm(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 218 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String pricingAlgorithmCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putPricingAlgorithm(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 218, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder pricingAlgorithm(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 218, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 218 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder pricingAlgorithm(final CharSequence src)
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
            buffer.putByte(this.offset + 218 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 218 + i, (byte)0);
        }

        return this;
    }

    public static int underlyingSubtypeId()
    {
        return 56;
    }

    public static int underlyingSubtypeSinceVersion()
    {
        return 0;
    }

    public static int underlyingSubtypeEncodingOffset()
    {
        return 221;
    }

    public static int underlyingSubtypeEncodingLength()
    {
        return 1;
    }

    public static String underlyingSubtypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public ContractStandingDataEncoder underlyingSubtype(final UnderlyingSubtype_enum value)
    {
        buffer.putByte(offset + 221, (byte)value.value());
        return this;
    }

    public static int motherStockISINId()
    {
        return 57;
    }

    public static int motherStockISINSinceVersion()
    {
        return 0;
    }

    public static int motherStockISINEncodingOffset()
    {
        return 222;
    }

    public static int motherStockISINEncodingLength()
    {
        return 12;
    }

    public static String motherStockISINMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static byte motherStockISINNullValue()
    {
        return (byte)0;
    }

    public static byte motherStockISINMinValue()
    {
        return (byte)32;
    }

    public static byte motherStockISINMaxValue()
    {
        return (byte)126;
    }

    public static int motherStockISINLength()
    {
        return 12;
    }

    public ContractStandingDataEncoder motherStockISIN(final int index, final byte value)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 222 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String motherStockISINCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putMotherStockISIN(final byte[] src, final int srcOffset)
    {
        final int length = 12;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 222, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder motherStockISIN(final String src)
    {
        final int length = 12;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 222, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 222 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder motherStockISIN(final CharSequence src)
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
            buffer.putByte(this.offset + 222 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 222 + i, (byte)0);
        }

        return this;
    }

    public static int referenceFutureContractSecGrpId()
    {
        return 58;
    }

    public static int referenceFutureContractSecGrpSinceVersion()
    {
        return 0;
    }

    public static int referenceFutureContractSecGrpEncodingOffset()
    {
        return 234;
    }

    public static int referenceFutureContractSecGrpEncodingLength()
    {
        return 5;
    }

    public static String referenceFutureContractSecGrpMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static byte referenceFutureContractSecGrpNullValue()
    {
        return (byte)0;
    }

    public static byte referenceFutureContractSecGrpMinValue()
    {
        return (byte)32;
    }

    public static byte referenceFutureContractSecGrpMaxValue()
    {
        return (byte)126;
    }

    public static int referenceFutureContractSecGrpLength()
    {
        return 5;
    }

    public ContractStandingDataEncoder referenceFutureContractSecGrp(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 234 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String referenceFutureContractSecGrpCharacterEncoding()
    {
        return "US-ASCII";
    }

    public ContractStandingDataEncoder putReferenceFutureContractSecGrp(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 234, src, srcOffset, length);

        return this;
    }

    public ContractStandingDataEncoder referenceFutureContractSecGrp(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 234, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 234 + start, (byte)0);
        }

        return this;
    }

    public ContractStandingDataEncoder referenceFutureContractSecGrp(final CharSequence src)
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
            buffer.putByte(this.offset + 234 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 234 + i, (byte)0);
        }

        return this;
    }

    private final StrategyCodesEncoder strategyCodes = new StrategyCodesEncoder(this);

    public static long strategyCodesId()
    {
        return 59;
    }

    public StrategyCodesEncoder strategyCodesCount(final int count)
    {
        strategyCodes.wrap(buffer, count);
        return strategyCodes;
    }

    public static class StrategyCodesEncoder
    {
        public static final int HEADER_SIZE = 2;
        private final ContractStandingDataEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;

        StrategyCodesEncoder(final ContractStandingDataEncoder parentMessage)
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

        public StrategyCodesEncoder next()
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

        public static int strategyCodeId()
        {
            return 1;
        }

        public static int strategyCodeSinceVersion()
        {
            return 0;
        }

        public static int strategyCodeEncodingOffset()
        {
            return 0;
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
                case PRESENCE: return "optional";
            }

            return "";
        }

        public StrategyCodesEncoder strategyCode(final StrategyCode_enum value)
        {
            buffer.putByte(offset + 0, value.value());
            return this;
        }
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        ContractStandingDataDecoder writer = new ContractStandingDataDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class ContractStandingDataDecoder
{
    public static final int BLOCK_LENGTH = 239;
    public static final int TEMPLATE_ID = 1013;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ContractStandingDataDecoder parentMessage = this;
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

    public ContractStandingDataDecoder wrap(
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

    public OptiqSegment_enum optiqSegment()
    {
        return OptiqSegment_enum.get(((short)(buffer.getByte(offset + 13) & 0xFF)));
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

    public int partitionID()
    {
        return (buffer.getShort(offset + 14, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

    public int contractEventDate()
    {
        return (buffer.getShort(offset + 16, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

    public ExchangeCode_enum exchangeCode()
    {
        return ExchangeCode_enum.get(buffer.getByte(offset + 18));
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

    public ExerciseStyle_enum exerStyle()
    {
        return ExerciseStyle_enum.get(((short)(buffer.getByte(offset + 19) & 0xFF)));
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

    public short flexInd()
    {
        return ((short)(buffer.getByte(offset + 20) & 0xFF));
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

    public byte contractName(final int index)
    {
        if (index < 0 || index >= 60)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 21 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String contractNameCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getContractName(final byte[] dst, final int dstOffset)
    {
        final int length = 60;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 21, dst, dstOffset, length);

        return length;
    }

    public String contractName()
    {
        final byte[] dst = new byte[60];
        buffer.getBytes(this.offset + 21, dst, 0, 60);

        int end = 0;
        for (; end < 60 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getContractName(final Appendable value)
    {
        for (int i = 0; i < 60 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 21 + i) & 0xFF;
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

    public ContractType_enum contractType()
    {
        return ContractType_enum.get(buffer.getByte(offset + 81));
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

    public UnderlyingType_enum underlyingType()
    {
        return UnderlyingType_enum.get(buffer.getByte(offset + 82));
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

    public short priceDecimals()
    {
        return ((short)(buffer.getByte(offset + 83) & 0xFF));
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

    public short quantityDecimals()
    {
        return ((short)(buffer.getByte(offset + 84) & 0xFF));
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

    public short amountDecimals()
    {
        return ((short)(buffer.getByte(offset + 85) & 0xFF));
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

    public short ratioDecimals()
    {
        return ((short)(buffer.getByte(offset + 86) & 0xFF));
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

    public byte mainDepositary(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 87 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mainDepositaryCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMainDepositary(final byte[] dst, final int dstOffset)
    {
        final int length = 5;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 87, dst, dstOffset, length);

        return length;
    }

    public String mainDepositary()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 87, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMainDepositary(final Appendable value)
    {
        for (int i = 0; i < 5 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 87 + i) & 0xFF;
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

    public byte mIC(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 92 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mICCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMIC(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 92, dst, dstOffset, length);

        return length;
    }

    public String mIC()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 92, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMIC(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 92 + i) & 0xFF;
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

    public byte countryOfExchange(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 96 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String countryOfExchangeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getCountryOfExchange(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 96, dst, dstOffset, length);

        return length;
    }

    public String countryOfExchange()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 96, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCountryOfExchange(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 96 + i) & 0xFF;
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

    public byte productCode(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 99 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String productCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getProductCode(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 99, dst, dstOffset, length);

        return length;
    }

    public String productCode()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 99, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getProductCode(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 99 + i) & 0xFF;
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

    public byte underlyingMIC(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 102 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String underlyingMICCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getUnderlyingMIC(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 102, dst, dstOffset, length);

        return length;
    }

    public String underlyingMIC()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 102, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnderlyingMIC(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 102 + i) & 0xFF;
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

    public byte underlyingISINCode(final int index)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 106 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String underlyingISINCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getUnderlyingISINCode(final byte[] dst, final int dstOffset)
    {
        final int length = 12;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 106, dst, dstOffset, length);

        return length;
    }

    public String underlyingISINCode()
    {
        final byte[] dst = new byte[12];
        buffer.getBytes(this.offset + 106, dst, 0, 12);

        int end = 0;
        for (; end < 12 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnderlyingISINCode(final Appendable value)
    {
        for (int i = 0; i < 12 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 106 + i) & 0xFF;
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

    public long underlyingExpiry()
    {
        return (buffer.getInt(offset + 118, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

    private final OrderTypeRules_setDecoder orderTypeRules = new OrderTypeRules_setDecoder();

    public OrderTypeRules_setDecoder orderTypeRules()
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

    public byte settlementMethod()
    {
        return buffer.getByte(offset + 124);
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

    public byte tradingCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 125 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradingCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getTradingCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 125, dst, dstOffset, length);

        return length;
    }

    public String tradingCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 125, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getTradingCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 125 + i) & 0xFF;
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

    public short whRFCDaysBeforeExpiry()
    {
        return ((short)(buffer.getByte(offset + 128) & 0xFF));
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

    public short whRFCMinutesBeforeClosing()
    {
        return ((short)(buffer.getByte(offset + 129) & 0xFF));
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

    public long minimumQuantityForInitiator()
    {
        return (buffer.getInt(offset + 130, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

    public long minimumQuantityForReactor()
    {
        return (buffer.getInt(offset + 134, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

    public short whRFCPickUpPerc()
    {
        return ((short)(buffer.getByte(offset + 138) & 0xFF));
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

    public short whRFCImprovementPeriod()
    {
        return ((short)(buffer.getByte(offset + 139) & 0xFF));
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

    private final AvailableWholesaleTradeType_setDecoder availableWholesaleTradeType = new AvailableWholesaleTradeType_setDecoder();

    public AvailableWholesaleTradeType_setDecoder availableWholesaleTradeType()
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

    public short instrumentDecimalsRatio()
    {
        return ((short)(buffer.getByte(offset + 144) & 0xFF));
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

    public short instrumentTickSize()
    {
        return ((short)(buffer.getByte(offset + 145) & 0xFF));
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

    public short instrumentSettlementTickSize()
    {
        return ((short)(buffer.getByte(offset + 146) & 0xFF));
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

    public short instrumentEDSPTickSize()
    {
        return ((short)(buffer.getByte(offset + 147) & 0xFF));
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

    public short strikePriceDecimalsRatio()
    {
        return ((short)(buffer.getByte(offset + 148) & 0xFF));
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

    public DeltaProtectforMM_enum deltaProtectforMM()
    {
        return DeltaProtectforMM_enum.get(((short)(buffer.getByte(offset + 149) & 0xFF)));
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

    public VegaProtectforMM_enum vegaProtectforMM()
    {
        return VegaProtectforMM_enum.get(((short)(buffer.getByte(offset + 150) & 0xFF)));
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

    public VolumeProtectforMM_enum volumeProtectforMM()
    {
        return VolumeProtectforMM_enum.get(((short)(buffer.getByte(offset + 151) & 0xFF)));
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

    public ContractTradingType_enum contractTradingType()
    {
        return ContractTradingType_enum.get(((short)(buffer.getByte(offset + 152) & 0xFF)));
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

    public int throttleforIncomingOrders()
    {
        return (buffer.getShort(offset + 153, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

    public long strikePriceFlexIncrement()
    {
        return (buffer.getInt(offset + 155, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

    public short premiumPricingTickSize()
    {
        return ((short)(buffer.getByte(offset + 159) & 0xFF));
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

    public long premiumPricingThreshold()
    {
        return buffer.getLong(offset + 160, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long tickValue()
    {
        return buffer.getLong(offset + 168, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long outrightLISTradeThreshold()
    {
        return buffer.getLong(offset + 176, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long strategyLISTradeThreshold()
    {
        return buffer.getLong(offset + 184, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long outrightGCrossTradeThreshold()
    {
        return buffer.getLong(offset + 192, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long strategyGCrossTradeThreshold()
    {
        return buffer.getLong(offset + 200, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long lotSize()
    {
        return buffer.getLong(offset + 208, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public InstrumentUnitExpression_enum instUnitExp()
    {
        return InstrumentUnitExpression_enum.get(((short)(buffer.getByte(offset + 216) & 0xFF)));
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

    public short tickValueDecimals()
    {
        return ((short)(buffer.getByte(offset + 217) & 0xFF));
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

    public byte pricingAlgorithm(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 218 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String pricingAlgorithmCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getPricingAlgorithm(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 218, dst, dstOffset, length);

        return length;
    }

    public String pricingAlgorithm()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 218, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getPricingAlgorithm(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 218 + i) & 0xFF;
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

    public UnderlyingSubtype_enum underlyingSubtype()
    {
        return UnderlyingSubtype_enum.get(((short)(buffer.getByte(offset + 221) & 0xFF)));
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

    public byte motherStockISIN(final int index)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 222 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String motherStockISINCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMotherStockISIN(final byte[] dst, final int dstOffset)
    {
        final int length = 12;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 222, dst, dstOffset, length);

        return length;
    }

    public String motherStockISIN()
    {
        final byte[] dst = new byte[12];
        buffer.getBytes(this.offset + 222, dst, 0, 12);

        int end = 0;
        for (; end < 12 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMotherStockISIN(final Appendable value)
    {
        for (int i = 0; i < 12 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 222 + i) & 0xFF;
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

    public byte referenceFutureContractSecGrp(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 234 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String referenceFutureContractSecGrpCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getReferenceFutureContractSecGrp(final byte[] dst, final int dstOffset)
    {
        final int length = 5;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 234, dst, dstOffset, length);

        return length;
    }

    public String referenceFutureContractSecGrp()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 234, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getReferenceFutureContractSecGrp(final Appendable value)
    {
        for (int i = 0; i < 5 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 234 + i) & 0xFF;
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


    private final StrategyCodesDecoder strategyCodes = new StrategyCodesDecoder(this);

    public static long strategyCodesDecoderId()
    {
        return 59;
    }

    public static int strategyCodesDecoderSinceVersion()
    {
        return 0;
    }

    public StrategyCodesDecoder strategyCodes()
    {
        strategyCodes.wrap(buffer);
        return strategyCodes;
    }

    public static class StrategyCodesDecoder
        implements Iterable<StrategyCodesDecoder>, java.util.Iterator<StrategyCodesDecoder>
    {
        public static final int HEADER_SIZE = 2;
        private final ContractStandingDataDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        StrategyCodesDecoder(final ContractStandingDataDecoder parentMessage)
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

        public java.util.Iterator<StrategyCodesDecoder> iterator()
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

        public StrategyCodesDecoder next()
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

        public StrategyCode_enum strategyCode()
        {
            return StrategyCode_enum.get(buffer.getByte(offset + 0));
        }



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='strategyCode', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=52, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='StrategyCode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=50, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("strategyCode=");
            builder.append(strategyCode());
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
        builder.append("[ContractStandingData](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='optiqSegment', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=1, offset=13, componentTokenCount=14, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='OptiqSegment_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=13, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("optiqSegment=");
        builder.append(optiqSegment());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='partitionID', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=2, offset=14, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=14, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("partitionID=");
        builder.append(partitionID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='contractEventDate', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=2, offset=16, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=16, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("contractEventDate=");
        builder.append(contractEventDate());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='exchangeCode', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=1, offset=18, componentTokenCount=19, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='ExchangeCode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=18, componentTokenCount=17, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("exchangeCode=");
        builder.append(exchangeCode());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='exerStyle', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=1, offset=19, componentTokenCount=9, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='ExerciseStyle_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=19, componentTokenCount=7, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("exerStyle=");
        builder.append(exerStyle());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='flexInd', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=1, offset=20, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=20, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("flexInd=");
        builder.append(flexInd());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='contractName', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=60, offset=21, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char60', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=60, offset=21, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("contractName=");
        for (int i = 0; i < contractNameLength() && contractName(i) > 0; i++)
        {
            builder.append((char)contractName(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='contractType', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=1, offset=81, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='ContractType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=81, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("contractType=");
        builder.append(contractType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingType', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=1, offset=82, componentTokenCount=9, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='UnderlyingType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=82, componentTokenCount=7, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingType=");
        builder.append(underlyingType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='priceDecimals', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=1, offset=83, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=83, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("priceDecimals=");
        builder.append(priceDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='quantityDecimals', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=1, offset=84, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=84, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("quantityDecimals=");
        builder.append(quantityDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='amountDecimals', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=1, offset=85, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=85, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("amountDecimals=");
        builder.append(amountDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ratioDecimals', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=1, offset=86, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=86, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("ratioDecimals=");
        builder.append(ratioDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mainDepositary', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=5, offset=87, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char5', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=87, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mainDepositary=");
        for (int i = 0; i < mainDepositaryLength() && mainDepositary(i) > 0; i++)
        {
            builder.append((char)mainDepositary(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mIC', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=4, offset=92, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=92, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mIC=");
        for (int i = 0; i < mICLength() && mIC(i) > 0; i++)
        {
            builder.append((char)mIC(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='countryOfExchange', referencedName='null', description='null', id=19, version=0, deprecated=0, encodedLength=3, offset=96, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=96, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("countryOfExchange=");
        for (int i = 0; i < countryOfExchangeLength() && countryOfExchange(i) > 0; i++)
        {
            builder.append((char)countryOfExchange(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='productCode', referencedName='null', description='null', id=20, version=0, deprecated=0, encodedLength=3, offset=99, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=99, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("productCode=");
        for (int i = 0; i < productCodeLength() && productCode(i) > 0; i++)
        {
            builder.append((char)productCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingMIC', referencedName='null', description='null', id=21, version=0, deprecated=0, encodedLength=4, offset=102, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=102, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingMIC=");
        for (int i = 0; i < underlyingMICLength() && underlyingMIC(i) > 0; i++)
        {
            builder.append((char)underlyingMIC(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingISINCode', referencedName='null', description='null', id=22, version=0, deprecated=0, encodedLength=12, offset=106, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char12', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=12, offset=106, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingISINCode=");
        for (int i = 0; i < underlyingISINCodeLength() && underlyingISINCode(i) > 0; i++)
        {
            builder.append((char)underlyingISINCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingExpiry', referencedName='null', description='null', id=23, version=0, deprecated=0, encodedLength=4, offset=118, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=118, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingExpiry=");
        builder.append(underlyingExpiry());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='orderTypeRules', referencedName='null', description='null', id=24, version=0, deprecated=0, encodedLength=2, offset=122, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_SET, name='OrderTypeRules_set', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=122, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("orderTypeRules=");
        builder.append(orderTypeRules());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='settlementMethod', referencedName='null', description='null', id=25, version=0, deprecated=0, encodedLength=1, offset=124, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=124, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("settlementMethod=");
        builder.append(settlementMethod());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tradingCurrency', referencedName='null', description='null', id=26, version=0, deprecated=0, encodedLength=3, offset=125, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=125, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradingCurrency=");
        for (int i = 0; i < tradingCurrencyLength() && tradingCurrency(i) > 0; i++)
        {
            builder.append((char)tradingCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='whRFCDaysBeforeExpiry', referencedName='null', description='null', id=27, version=0, deprecated=0, encodedLength=1, offset=128, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=128, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("whRFCDaysBeforeExpiry=");
        builder.append(whRFCDaysBeforeExpiry());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='whRFCMinutesBeforeClosing', referencedName='null', description='null', id=28, version=0, deprecated=0, encodedLength=1, offset=129, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=129, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("whRFCMinutesBeforeClosing=");
        builder.append(whRFCMinutesBeforeClosing());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='minimumQuantityForInitiator', referencedName='null', description='null', id=29, version=0, deprecated=0, encodedLength=4, offset=130, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=130, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("minimumQuantityForInitiator=");
        builder.append(minimumQuantityForInitiator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='minimumQuantityForReactor', referencedName='null', description='null', id=30, version=0, deprecated=0, encodedLength=4, offset=134, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=134, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("minimumQuantityForReactor=");
        builder.append(minimumQuantityForReactor());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='whRFCPickUpPerc', referencedName='null', description='null', id=31, version=0, deprecated=0, encodedLength=1, offset=138, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=138, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("whRFCPickUpPerc=");
        builder.append(whRFCPickUpPerc());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='whRFCImprovementPeriod', referencedName='null', description='null', id=32, version=0, deprecated=0, encodedLength=1, offset=139, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=139, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("whRFCImprovementPeriod=");
        builder.append(whRFCImprovementPeriod());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='availableWholesaleTradeType', referencedName='null', description='null', id=33, version=0, deprecated=0, encodedLength=4, offset=140, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_SET, name='AvailableWholesaleTradeType_set', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=140, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("availableWholesaleTradeType=");
        builder.append(availableWholesaleTradeType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentDecimalsRatio', referencedName='null', description='null', id=34, version=0, deprecated=0, encodedLength=1, offset=144, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=144, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentDecimalsRatio=");
        builder.append(instrumentDecimalsRatio());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentTickSize', referencedName='null', description='null', id=35, version=0, deprecated=0, encodedLength=1, offset=145, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=145, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentTickSize=");
        builder.append(instrumentTickSize());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentSettlementTickSize', referencedName='null', description='null', id=36, version=0, deprecated=0, encodedLength=1, offset=146, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=146, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentSettlementTickSize=");
        builder.append(instrumentSettlementTickSize());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentEDSPTickSize', referencedName='null', description='null', id=37, version=0, deprecated=0, encodedLength=1, offset=147, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=147, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentEDSPTickSize=");
        builder.append(instrumentEDSPTickSize());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strikePriceDecimalsRatio', referencedName='null', description='null', id=38, version=0, deprecated=0, encodedLength=1, offset=148, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=148, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strikePriceDecimalsRatio=");
        builder.append(strikePriceDecimalsRatio());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='deltaProtectforMM', referencedName='null', description='null', id=39, version=0, deprecated=0, encodedLength=1, offset=149, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='DeltaProtectforMM_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=149, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("deltaProtectforMM=");
        builder.append(deltaProtectforMM());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='vegaProtectforMM', referencedName='null', description='null', id=40, version=0, deprecated=0, encodedLength=1, offset=150, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='VegaProtectforMM_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=150, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("vegaProtectforMM=");
        builder.append(vegaProtectforMM());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='volumeProtectforMM', referencedName='null', description='null', id=41, version=0, deprecated=0, encodedLength=1, offset=151, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='VolumeProtectforMM_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=151, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("volumeProtectforMM=");
        builder.append(volumeProtectforMM());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='contractTradingType', referencedName='null', description='null', id=42, version=0, deprecated=0, encodedLength=1, offset=152, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='ContractTradingType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=152, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("contractTradingType=");
        builder.append(contractTradingType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='throttleforIncomingOrders', referencedName='null', description='null', id=43, version=0, deprecated=0, encodedLength=2, offset=153, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=153, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("throttleforIncomingOrders=");
        builder.append(throttleforIncomingOrders());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strikePriceFlexIncrement', referencedName='null', description='null', id=44, version=0, deprecated=0, encodedLength=4, offset=155, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=155, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strikePriceFlexIncrement=");
        builder.append(strikePriceFlexIncrement());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='premiumPricingTickSize', referencedName='null', description='null', id=45, version=0, deprecated=0, encodedLength=1, offset=159, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=159, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("premiumPricingTickSize=");
        builder.append(premiumPricingTickSize());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='premiumPricingThreshold', referencedName='null', description='null', id=46, version=0, deprecated=0, encodedLength=8, offset=160, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=160, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("premiumPricingThreshold=");
        builder.append(premiumPricingThreshold());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tickValue', referencedName='null', description='null', id=47, version=0, deprecated=0, encodedLength=8, offset=168, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=168, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tickValue=");
        builder.append(tickValue());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='outrightLISTradeThreshold', referencedName='null', description='null', id=48, version=0, deprecated=0, encodedLength=8, offset=176, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=176, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("outrightLISTradeThreshold=");
        builder.append(outrightLISTradeThreshold());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strategyLISTradeThreshold', referencedName='null', description='null', id=49, version=0, deprecated=0, encodedLength=8, offset=184, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=184, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strategyLISTradeThreshold=");
        builder.append(strategyLISTradeThreshold());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='outrightGCrossTradeThreshold', referencedName='null', description='null', id=50, version=0, deprecated=0, encodedLength=8, offset=192, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=192, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("outrightGCrossTradeThreshold=");
        builder.append(outrightGCrossTradeThreshold());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strategyGCrossTradeThreshold', referencedName='null', description='null', id=51, version=0, deprecated=0, encodedLength=8, offset=200, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=200, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strategyGCrossTradeThreshold=");
        builder.append(strategyGCrossTradeThreshold());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='lotSize', referencedName='null', description='null', id=52, version=0, deprecated=0, encodedLength=8, offset=208, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=208, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("lotSize=");
        builder.append(lotSize());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instUnitExp', referencedName='null', description='null', id=53, version=0, deprecated=0, encodedLength=1, offset=216, componentTokenCount=10, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='InstrumentUnitExpression_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=216, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instUnitExp=");
        builder.append(instUnitExp());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tickValueDecimals', referencedName='null', description='null', id=54, version=0, deprecated=0, encodedLength=1, offset=217, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=217, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tickValueDecimals=");
        builder.append(tickValueDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='pricingAlgorithm', referencedName='null', description='null', id=55, version=0, deprecated=0, encodedLength=3, offset=218, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=218, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("pricingAlgorithm=");
        for (int i = 0; i < pricingAlgorithmLength() && pricingAlgorithm(i) > 0; i++)
        {
            builder.append((char)pricingAlgorithm(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingSubtype', referencedName='null', description='null', id=56, version=0, deprecated=0, encodedLength=1, offset=221, componentTokenCount=30, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='UnderlyingSubtype_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=221, componentTokenCount=28, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingSubtype=");
        builder.append(underlyingSubtype());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='motherStockISIN', referencedName='null', description='null', id=57, version=0, deprecated=0, encodedLength=12, offset=222, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char12', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=12, offset=222, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("motherStockISIN=");
        for (int i = 0; i < motherStockISINLength() && motherStockISIN(i) > 0; i++)
        {
            builder.append((char)motherStockISIN(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='referenceFutureContractSecGrp', referencedName='null', description='null', id=58, version=0, deprecated=0, encodedLength=5, offset=234, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char5', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=234, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("referenceFutureContractSecGrp=");
        for (int i = 0; i < referenceFutureContractSecGrpLength() && referenceFutureContractSecGrp(i) > 0; i++)
        {
            builder.append((char)referenceFutureContractSecGrp(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='StrategyCodes', referencedName='null', description='null', id=59, version=0, deprecated=0, encodedLength=1, offset=239, componentTokenCount=58, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strategyCodes=[");
        StrategyCodesDecoder strategyCodes = strategyCodes();
        if (strategyCodes.count() > 0)
        {
            while (strategyCodes.hasNext())
            {
                strategyCodes.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}

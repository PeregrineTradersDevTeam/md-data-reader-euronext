/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class APAStandingDataDecoder
{
    public static final int BLOCK_LENGTH = 217;
    public static final int TEMPLATE_ID = 1027;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final APAStandingDataDecoder parentMessage = this;
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

    public APAStandingDataDecoder wrap(
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

    public byte mifidInstrumentIdType(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 9 + (index * 1);

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

        buffer.getBytes(this.offset + 9, dst, dstOffset, length);

        return length;
    }

    public String mifidInstrumentIdType()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 9, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidInstrumentIdType(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 9 + i) & 0xFF;
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

    public byte mifidInstrumentID(final int index)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 13 + (index * 1);

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

        buffer.getBytes(this.offset + 13, dst, dstOffset, length);

        return length;
    }

    public String mifidInstrumentID()
    {
        final byte[] dst = new byte[12];
        buffer.getBytes(this.offset + 13, dst, 0, 12);

        int end = 0;
        for (; end < 12 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidInstrumentID(final Appendable value)
    {
        for (int i = 0; i < 12 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 13 + i) & 0xFF;
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

    public byte fullInstrumentName(final int index)
    {
        if (index < 0 || index >= 102)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 25 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String fullInstrumentNameCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getFullInstrumentName(final byte[] dst, final int dstOffset)
    {
        final int length = 102;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 25, dst, dstOffset, length);

        return length;
    }

    public String fullInstrumentName()
    {
        final byte[] dst = new byte[102];
        buffer.getBytes(this.offset + 25, dst, 0, 102);

        int end = 0;
        for (; end < 102 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getFullInstrumentName(final Appendable value)
    {
        for (int i = 0; i < 102 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 25 + i) & 0xFF;
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

    public byte cFI(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 127 + (index * 1);

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

        buffer.getBytes(this.offset + 127, dst, dstOffset, length);

        return length;
    }

    public String cFI()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 127, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCFI(final Appendable value)
    {
        for (int i = 0; i < 6 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 127 + i) & 0xFF;
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

    public byte notionalCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 133 + (index * 1);

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

        buffer.getBytes(this.offset + 133, dst, dstOffset, length);

        return length;
    }

    public String notionalCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 133, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getNotionalCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 133 + i) & 0xFF;
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

    public byte secondNotionalCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 136 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String secondNotionalCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getSecondNotionalCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 136, dst, dstOffset, length);

        return length;
    }

    public String secondNotionalCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 136, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getSecondNotionalCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 136 + i) & 0xFF;
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

    public long priceMultiplier()
    {
        return (buffer.getInt(offset + 139, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

    public short priceMultiplierDecimals()
    {
        return ((short)(buffer.getByte(offset + 143) & 0xFF));
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

    public byte underlyingISINCode(final int index)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 144 + (index * 1);

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

        buffer.getBytes(this.offset + 144, dst, dstOffset, length);

        return length;
    }

    public String underlyingISINCode()
    {
        final byte[] dst = new byte[12];
        buffer.getBytes(this.offset + 144, dst, 0, 12);

        int end = 0;
        for (; end < 12 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnderlyingISINCode(final Appendable value)
    {
        for (int i = 0; i < 12 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 144 + i) & 0xFF;
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

    public byte underlyingIndexName(final int index)
    {
        if (index < 0 || index >= 25)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 156 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String underlyingIndexNameCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getUnderlyingIndexName(final byte[] dst, final int dstOffset)
    {
        final int length = 25;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 156, dst, dstOffset, length);

        return length;
    }

    public String underlyingIndexName()
    {
        final byte[] dst = new byte[25];
        buffer.getBytes(this.offset + 156, dst, 0, 25);

        int end = 0;
        for (; end < 25 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnderlyingIndexName(final Appendable value)
    {
        for (int i = 0; i < 25 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 156 + i) & 0xFF;
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

    public byte underlyingIndexTerm(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 181 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String underlyingIndexTermCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getUnderlyingIndexTerm(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 181, dst, dstOffset, length);

        return length;
    }

    public String underlyingIndexTerm()
    {
        final byte[] dst = new byte[8];
        buffer.getBytes(this.offset + 181, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnderlyingIndexTerm(final Appendable value)
    {
        for (int i = 0; i < 8 ; ++i)
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

    public OptionType_enum optionType()
    {
        return OptionType_enum.get(((short)(buffer.getByte(offset + 189) & 0xFF)));
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

    public long strikePrice()
    {
        return buffer.getLong(offset + 190, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public short strikePriceDecimals()
    {
        return ((short)(buffer.getByte(offset + 198) & 0xFF));
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

    public ExerciseStyle_enum exerStyle()
    {
        return ExerciseStyle_enum.get(((short)(buffer.getByte(offset + 199) & 0xFF)));
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

    public byte maturityDate(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 200 + (index * 1);

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

        buffer.getBytes(this.offset + 200, dst, dstOffset, length);

        return length;
    }

    public String maturityDate()
    {
        final byte[] dst = new byte[8];
        buffer.getBytes(this.offset + 200, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMaturityDate(final Appendable value)
    {
        for (int i = 0; i < 8 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 200 + i) & 0xFF;
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

    public byte expiryDate(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 208 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String expiryDateCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getExpiryDate(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 208, dst, dstOffset, length);

        return length;
    }

    public String expiryDate()
    {
        final byte[] dst = new byte[8];
        buffer.getBytes(this.offset + 208, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getExpiryDate(final Appendable value)
    {
        for (int i = 0; i < 8 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 208 + i) & 0xFF;
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

    public byte settlementMethod()
    {
        return buffer.getByte(offset + 216);
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[APAStandingData](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='mifidInstrumentIdType', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=4, offset=9, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=9, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidInstrumentIdType=");
        for (int i = 0; i < mifidInstrumentIdTypeLength() && mifidInstrumentIdType(i) > 0; i++)
        {
            builder.append((char)mifidInstrumentIdType(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidInstrumentID', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=12, offset=13, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char12', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=12, offset=13, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidInstrumentID=");
        for (int i = 0; i < mifidInstrumentIDLength() && mifidInstrumentID(i) > 0; i++)
        {
            builder.append((char)mifidInstrumentID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='fullInstrumentName', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=102, offset=25, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char102', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=102, offset=25, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("fullInstrumentName=");
        for (int i = 0; i < fullInstrumentNameLength() && fullInstrumentName(i) > 0; i++)
        {
            builder.append((char)fullInstrumentName(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='cFI', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=6, offset=127, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char6', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=6, offset=127, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("cFI=");
        for (int i = 0; i < cFILength() && cFI(i) > 0; i++)
        {
            builder.append((char)cFI(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='notionalCurrency', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=3, offset=133, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=133, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("notionalCurrency=");
        for (int i = 0; i < notionalCurrencyLength() && notionalCurrency(i) > 0; i++)
        {
            builder.append((char)notionalCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='secondNotionalCurrency', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=3, offset=136, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=136, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("secondNotionalCurrency=");
        for (int i = 0; i < secondNotionalCurrencyLength() && secondNotionalCurrency(i) > 0; i++)
        {
            builder.append((char)secondNotionalCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='priceMultiplier', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=4, offset=139, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=139, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("priceMultiplier=");
        builder.append(priceMultiplier());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='priceMultiplierDecimals', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=1, offset=143, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=143, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("priceMultiplierDecimals=");
        builder.append(priceMultiplierDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingISINCode', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=12, offset=144, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char12', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=12, offset=144, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingISINCode=");
        for (int i = 0; i < underlyingISINCodeLength() && underlyingISINCode(i) > 0; i++)
        {
            builder.append((char)underlyingISINCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingIndexName', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=25, offset=156, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char25', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=25, offset=156, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingIndexName=");
        for (int i = 0; i < underlyingIndexNameLength() && underlyingIndexName(i) > 0; i++)
        {
            builder.append((char)underlyingIndexName(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingIndexTerm', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=8, offset=181, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char8', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=181, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingIndexTerm=");
        for (int i = 0; i < underlyingIndexTermLength() && underlyingIndexTerm(i) > 0; i++)
        {
            builder.append((char)underlyingIndexTerm(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='optionType', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=1, offset=189, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='OptionType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=189, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("optionType=");
        builder.append(optionType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strikePrice', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=8, offset=190, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=190, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strikePrice=");
        builder.append(strikePrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strikePriceDecimals', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=1, offset=198, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=198, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strikePriceDecimals=");
        builder.append(strikePriceDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='exerStyle', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=1, offset=199, componentTokenCount=9, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='ExerciseStyle_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=199, componentTokenCount=7, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("exerStyle=");
        builder.append(exerStyle());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='maturityDate', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=8, offset=200, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char8', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=200, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("maturityDate=");
        for (int i = 0; i < maturityDateLength() && maturityDate(i) > 0; i++)
        {
            builder.append((char)maturityDate(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='expiryDate', referencedName='null', description='null', id=19, version=0, deprecated=0, encodedLength=8, offset=208, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char8', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=208, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("expiryDate=");
        for (int i = 0; i < expiryDateLength() && expiryDate(i) > 0; i++)
        {
            builder.append((char)expiryDate(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='settlementMethod', referencedName='null', description='null', id=20, version=0, deprecated=0, encodedLength=1, offset=216, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=216, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("settlementMethod=");
        builder.append(settlementMethod());

        limit(originalLimit);

        return builder;
    }
}

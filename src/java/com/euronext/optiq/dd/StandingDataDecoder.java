/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class StandingDataDecoder
{
    public static final int BLOCK_LENGTH = 385;
    public static final int TEMPLATE_ID = 1007;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final StandingDataDecoder parentMessage = this;
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

    public StandingDataDecoder wrap(
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

    public byte fullInstrumentName(final int index)
    {
        if (index < 0 || index >= 102)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 16 + (index * 1);

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

        buffer.getBytes(this.offset + 16, dst, dstOffset, length);

        return length;
    }

    public String fullInstrumentName()
    {
        final byte[] dst = new byte[102];
        buffer.getBytes(this.offset + 16, dst, 0, 102);

        int end = 0;
        for (; end < 102 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getFullInstrumentName(final Appendable value)
    {
        for (int i = 0; i < 102 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 16 + i) & 0xFF;
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

    public byte instrumentName(final int index)
    {
        if (index < 0 || index >= 18)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 118 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String instrumentNameCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getInstrumentName(final byte[] dst, final int dstOffset)
    {
        final int length = 18;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 118, dst, dstOffset, length);

        return length;
    }

    public String instrumentName()
    {
        final byte[] dst = new byte[18];
        buffer.getBytes(this.offset + 118, dst, 0, 18);

        int end = 0;
        for (; end < 18 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getInstrumentName(final Appendable value)
    {
        for (int i = 0; i < 18 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 118 + i) & 0xFF;
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

    public byte instrumentTradingCode(final int index)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 136 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String instrumentTradingCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getInstrumentTradingCode(final byte[] dst, final int dstOffset)
    {
        final int length = 15;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 136, dst, dstOffset, length);

        return length;
    }

    public String instrumentTradingCode()
    {
        final byte[] dst = new byte[15];
        buffer.getBytes(this.offset + 136, dst, 0, 15);

        int end = 0;
        for (; end < 15 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getInstrumentTradingCode(final Appendable value)
    {
        for (int i = 0; i < 15 ; ++i)
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

    public byte instrumentGroupCode(final int index)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 151 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String instrumentGroupCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getInstrumentGroupCode(final byte[] dst, final int dstOffset)
    {
        final int length = 2;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 151, dst, dstOffset, length);

        return length;
    }

    public String instrumentGroupCode()
    {
        final byte[] dst = new byte[2];
        buffer.getBytes(this.offset + 151, dst, 0, 2);

        int end = 0;
        for (; end < 2 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getInstrumentGroupCode(final Appendable value)
    {
        for (int i = 0; i < 2 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 151 + i) & 0xFF;
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

    public byte iSINCode(final int index)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 153 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String iSINCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getISINCode(final byte[] dst, final int dstOffset)
    {
        final int length = 12;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 153, dst, dstOffset, length);

        return length;
    }

    public String iSINCode()
    {
        final byte[] dst = new byte[12];
        buffer.getBytes(this.offset + 153, dst, 0, 12);

        int end = 0;
        for (; end < 12 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getISINCode(final Appendable value)
    {
        for (int i = 0; i < 12 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 153 + i) & 0xFF;
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

    public short priceDecimals()
    {
        return ((short)(buffer.getByte(offset + 165) & 0xFF));
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

    public short quantityDecimals()
    {
        return ((short)(buffer.getByte(offset + 166) & 0xFF));
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

    public short amountDecimals()
    {
        return ((short)(buffer.getByte(offset + 167) & 0xFF));
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

    public short ratioDecimals()
    {
        return ((short)(buffer.getByte(offset + 168) & 0xFF));
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

    public byte cFI(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 169 + (index * 1);

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

        buffer.getBytes(this.offset + 169, dst, dstOffset, length);

        return length;
    }

    public String cFI()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 169, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCFI(final Appendable value)
    {
        for (int i = 0; i < 6 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 169 + i) & 0xFF;
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

    public int instrumentEventDate()
    {
        return (buffer.getShort(offset + 175, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

    public long strikePrice()
    {
        return buffer.getLong(offset + 177, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public short darkEligibility()
    {
        return ((short)(buffer.getByte(offset + 185) & 0xFF));
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

    public long darkLISThreshold()
    {
        return buffer.getLong(offset + 186, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long darkMinQuantity()
    {
        return (buffer.getInt(offset + 194, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

    public int dateOfLastTrade()
    {
        return (buffer.getShort(offset + 198, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

    public byte depositaryList(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 200 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String depositaryListCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getDepositaryList(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 200, dst, dstOffset, length);

        return length;
    }

    public String depositaryList()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 200, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getDepositaryList(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
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

    public byte mainDepositary(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 220 + (index * 1);

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

        buffer.getBytes(this.offset + 220, dst, dstOffset, length);

        return length;
    }

    public String mainDepositary()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 220, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMainDepositary(final Appendable value)
    {
        for (int i = 0; i < 5 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 220 + i) & 0xFF;
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

    public int firstSettlementDate()
    {
        return (buffer.getShort(offset + 225, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

    public GuaranteeIndicator_enum guaranteeIndicator()
    {
        return GuaranteeIndicator_enum.get(((short)(buffer.getByte(offset + 227) & 0xFF)));
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

    public byte iCB(final int index)
    {
        if (index < 0 || index >= 16)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 228 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String iCBCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getICB(final byte[] dst, final int dstOffset)
    {
        final int length = 16;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 228, dst, dstOffset, length);

        return length;
    }

    public String iCB()
    {
        final byte[] dst = new byte[16];
        buffer.getBytes(this.offset + 228, dst, 0, 16);

        int end = 0;
        for (; end < 16 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getICB(final Appendable value)
    {
        for (int i = 0; i < 16 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 228 + i) & 0xFF;
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

    public byte issuingCountry(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 244 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String issuingCountryCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getIssuingCountry(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 244, dst, dstOffset, length);

        return length;
    }

    public String issuingCountry()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 244, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getIssuingCountry(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 244 + i) & 0xFF;
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

    public long lastAdjustedClosingPrice()
    {
        return buffer.getLong(offset + 247, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long lotSize()
    {
        return buffer.getLong(offset + 255, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public byte maturityDate(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 263 + (index * 1);

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

        buffer.getBytes(this.offset + 263, dst, dstOffset, length);

        return length;
    }

    public String maturityDate()
    {
        final byte[] dst = new byte[8];
        buffer.getBytes(this.offset + 263, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMaturityDate(final Appendable value)
    {
        for (int i = 0; i < 8 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 263 + i) & 0xFF;
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

    public short maximumDecimalsInQuantity()
    {
        return ((short)(buffer.getByte(offset + 271) & 0xFF));
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

    public byte mIC(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 272 + (index * 1);

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

        buffer.getBytes(this.offset + 272, dst, dstOffset, length);

        return length;
    }

    public String mIC()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 272, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMIC(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 272 + i) & 0xFF;
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

    public byte mICList(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 276 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mICListCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMICList(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 276, dst, dstOffset, length);

        return length;
    }

    public String mICList()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 276, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMICList(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 276 + i) & 0xFF;
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

    public byte countryOfExchange(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 296 + (index * 1);

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

        buffer.getBytes(this.offset + 296, dst, dstOffset, length);

        return length;
    }

    public String countryOfExchange()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 296, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCountryOfExchange(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
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

    public byte mnemonic(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 299 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String mnemonicCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getMnemonic(final byte[] dst, final int dstOffset)
    {
        final int length = 5;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 299, dst, dstOffset, length);

        return length;
    }

    public String mnemonic()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 299, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMnemonic(final Appendable value)
    {
        for (int i = 0; i < 5 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 299 + i) & 0xFF;
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

    public byte underlyingMIC(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 304 + (index * 1);

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

        buffer.getBytes(this.offset + 304, dst, dstOffset, length);

        return length;
    }

    public String underlyingMIC()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 304, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnderlyingMIC(final Appendable value)
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

    public byte underlyingISINCode(final int index)
    {
        if (index < 0 || index >= 12)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 308 + (index * 1);

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

        buffer.getBytes(this.offset + 308, dst, dstOffset, length);

        return length;
    }

    public String underlyingISINCode()
    {
        final byte[] dst = new byte[12];
        buffer.getBytes(this.offset + 308, dst, 0, 12);

        int end = 0;
        for (; end < 12 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnderlyingISINCode(final Appendable value)
    {
        for (int i = 0; i < 12 ; ++i)
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

    public byte tradingCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 320 + (index * 1);

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

        buffer.getBytes(this.offset + 320, dst, dstOffset, length);

        return length;
    }

    public String tradingCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 320, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getTradingCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 320 + i) & 0xFF;
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

    public long currencyCoefficient()
    {
        return (buffer.getInt(offset + 323, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

    public TradingCurrencyIndicator_enum tradingCurrencyIndicator()
    {
        return TradingCurrencyIndicator_enum.get(((short)(buffer.getByte(offset + 327) & 0xFF)));
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

    public StrikeCurrencyIndicator_enum strikeCurrencyIndicator()
    {
        return StrikeCurrencyIndicator_enum.get(((short)(buffer.getByte(offset + 328) & 0xFF)));
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

    public long numberInstrumentCirculating()
    {
        return buffer.getLong(offset + 329, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public long parValue()
    {
        return buffer.getLong(offset + 337, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public byte quantityNotation(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 345 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String quantityNotationCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getQuantityNotation(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 345, dst, dstOffset, length);

        return length;
    }

    public String quantityNotation()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 345, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getQuantityNotation(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 345 + i) & 0xFF;
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

    public InstrumentUnitExpression_enum instUnitExp()
    {
        return InstrumentUnitExpression_enum.get(((short)(buffer.getByte(offset + 348) & 0xFF)));
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

    public byte settlementDelay(final int index)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 349 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String settlementDelayCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getSettlementDelay(final byte[] dst, final int dstOffset)
    {
        final int length = 2;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 349, dst, dstOffset, length);

        return length;
    }

    public String settlementDelay()
    {
        final byte[] dst = new byte[2];
        buffer.getBytes(this.offset + 349, dst, 0, 2);

        int end = 0;
        for (; end < 2 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getSettlementDelay(final Appendable value)
    {
        for (int i = 0; i < 2 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 349 + i) & 0xFF;
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

    public byte strikeCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 351 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String strikeCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getStrikeCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 351, dst, dstOffset, length);

        return length;
    }

    public String strikeCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 351, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getStrikeCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 351 + i) & 0xFF;
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

    public TaxCode_enum taxCode()
    {
        return TaxCode_enum.get(((short)(buffer.getByte(offset + 354) & 0xFF)));
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

    public byte typeOfCorporateEvent(final int index)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 355 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String typeOfCorporateEventCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getTypeOfCorporateEvent(final byte[] dst, final int dstOffset)
    {
        final int length = 2;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 355, dst, dstOffset, length);

        return length;
    }

    public String typeOfCorporateEvent()
    {
        final byte[] dst = new byte[2];
        buffer.getBytes(this.offset + 355, dst, 0, 2);

        int end = 0;
        for (; end < 2 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getTypeOfCorporateEvent(final Appendable value)
    {
        for (int i = 0; i < 2 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 355 + i) & 0xFF;
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

    public TypeOfMarketAdmission_enum typeOfMarketAdmission()
    {
        return TypeOfMarketAdmission_enum.get(buffer.getByte(offset + 357));
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

    public RepoIndicator_enum repoIndicator()
    {
        return RepoIndicator_enum.get(((short)(buffer.getByte(offset + 358) & 0xFF)));
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

    public long issuePrice()
    {
        return buffer.getLong(offset + 359, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public byte nominalCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 367 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String nominalCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getNominalCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 367, dst, dstOffset, length);

        return length;
    }

    public String nominalCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 367, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getNominalCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 367 + i) & 0xFF;
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

    public short issuePriceDecimals()
    {
        return ((short)(buffer.getByte(offset + 370) & 0xFF));
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

    public short strikePriceDecimals()
    {
        return ((short)(buffer.getByte(offset + 371) & 0xFF));
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

    public short liquidInstrumentIndicator()
    {
        return ((short)(buffer.getByte(offset + 372) & 0xFF));
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

    public byte marketOfReferenceMIC(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 373 + (index * 1);

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

        buffer.getBytes(this.offset + 373, dst, dstOffset, length);

        return length;
    }

    public String marketOfReferenceMIC()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 373, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMarketOfReferenceMIC(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 373 + i) & 0xFF;
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

    public byte iCBCode(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        if (parentMessage.actingVersion < 104)
        {
            return (byte)0;
        }

        final int pos = this.offset + 377 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String iCBCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getICBCode(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        if (parentMessage.actingVersion < 104)
        {
            return 0;
        }

        buffer.getBytes(this.offset + 377, dst, dstOffset, length);

        return length;
    }

    public String iCBCode()
    {
        if (parentMessage.actingVersion < 104)
        {
            return "";
        }

        final byte[] dst = new byte[8];
        buffer.getBytes(this.offset + 377, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getICBCode(final Appendable value)
    {
        if (parentMessage.actingVersion < 104)
        {
            return;
        }

        for (int i = 0; i < 8 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 377 + i) & 0xFF;
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


    private final EMMPatternRepDecoder eMMPatternRep = new EMMPatternRepDecoder(this);

    public static long eMMPatternRepDecoderId()
    {
        return 59;
    }

    public static int eMMPatternRepDecoderSinceVersion()
    {
        return 0;
    }

    public EMMPatternRepDecoder eMMPatternRep()
    {
        eMMPatternRep.wrap(buffer);
        return eMMPatternRep;
    }

    public static class EMMPatternRepDecoder
        implements Iterable<EMMPatternRepDecoder>, java.util.Iterator<EMMPatternRepDecoder>
    {
        public static final int HEADER_SIZE = 2;
        private final StandingDataDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        EMMPatternRepDecoder(final StandingDataDecoder parentMessage)
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
            return 6;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<EMMPatternRepDecoder> iterator()
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

        public EMMPatternRepDecoder next()
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

        public EMM_enum eMM()
        {
            return EMM_enum.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
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

        public int patternID()
        {
            return (buffer.getShort(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

        public int tickSizeIndexID()
        {
            return (buffer.getShort(offset + 3, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

        public MarketModel_enum marketModel()
        {
            return MarketModel_enum.get(((short)(buffer.getByte(offset + 5) & 0xFF)));
        }



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='eMM', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='EMM_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("eMM=");
            builder.append(eMM());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='patternID', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=2, offset=1, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=1, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("patternID=");
            builder.append(patternID());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='tickSizeIndexID', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=2, offset=3, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=3, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("tickSizeIndexID=");
            builder.append(tickSizeIndexID());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='marketModel', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=1, offset=5, componentTokenCount=9, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='MarketModel_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=5, componentTokenCount=7, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("marketModel=");
            builder.append(marketModel());
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
        builder.append("[StandingData](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='fullInstrumentName', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=102, offset=16, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char102', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=102, offset=16, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("fullInstrumentName=");
        for (int i = 0; i < fullInstrumentNameLength() && fullInstrumentName(i) > 0; i++)
        {
            builder.append((char)fullInstrumentName(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentName', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=18, offset=118, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char18', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=18, offset=118, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentName=");
        for (int i = 0; i < instrumentNameLength() && instrumentName(i) > 0; i++)
        {
            builder.append((char)instrumentName(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentTradingCode', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=15, offset=136, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char15', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=15, offset=136, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentTradingCode=");
        for (int i = 0; i < instrumentTradingCodeLength() && instrumentTradingCode(i) > 0; i++)
        {
            builder.append((char)instrumentTradingCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentGroupCode', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=2, offset=151, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char2', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=151, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentGroupCode=");
        for (int i = 0; i < instrumentGroupCodeLength() && instrumentGroupCode(i) > 0; i++)
        {
            builder.append((char)instrumentGroupCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='iSINCode', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=12, offset=153, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char12', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=12, offset=153, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("iSINCode=");
        for (int i = 0; i < iSINCodeLength() && iSINCode(i) > 0; i++)
        {
            builder.append((char)iSINCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='priceDecimals', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=1, offset=165, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=165, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("priceDecimals=");
        builder.append(priceDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='quantityDecimals', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=1, offset=166, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=166, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("quantityDecimals=");
        builder.append(quantityDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='amountDecimals', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=1, offset=167, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=167, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("amountDecimals=");
        builder.append(amountDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ratioDecimals', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=1, offset=168, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=168, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("ratioDecimals=");
        builder.append(ratioDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='cFI', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=6, offset=169, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char6', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=6, offset=169, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("cFI=");
        for (int i = 0; i < cFILength() && cFI(i) > 0; i++)
        {
            builder.append((char)cFI(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instrumentEventDate', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=2, offset=175, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=175, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instrumentEventDate=");
        builder.append(instrumentEventDate());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strikePrice', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=8, offset=177, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=177, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strikePrice=");
        builder.append(strikePrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='darkEligibility', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=1, offset=185, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=185, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("darkEligibility=");
        builder.append(darkEligibility());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='darkLISThreshold', referencedName='null', description='null', id=19, version=0, deprecated=0, encodedLength=8, offset=186, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=186, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("darkLISThreshold=");
        builder.append(darkLISThreshold());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='darkMinQuantity', referencedName='null', description='null', id=20, version=0, deprecated=0, encodedLength=4, offset=194, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=194, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("darkMinQuantity=");
        builder.append(darkMinQuantity());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='dateOfLastTrade', referencedName='null', description='null', id=21, version=0, deprecated=0, encodedLength=2, offset=198, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=198, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("dateOfLastTrade=");
        builder.append(dateOfLastTrade());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='depositaryList', referencedName='null', description='null', id=22, version=0, deprecated=0, encodedLength=20, offset=200, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=200, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("depositaryList=");
        for (int i = 0; i < depositaryListLength() && depositaryList(i) > 0; i++)
        {
            builder.append((char)depositaryList(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mainDepositary', referencedName='null', description='null', id=23, version=0, deprecated=0, encodedLength=5, offset=220, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char5', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=220, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mainDepositary=");
        for (int i = 0; i < mainDepositaryLength() && mainDepositary(i) > 0; i++)
        {
            builder.append((char)mainDepositary(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='firstSettlementDate', referencedName='null', description='null', id=24, version=0, deprecated=0, encodedLength=2, offset=225, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint16_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=225, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=65534, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("firstSettlementDate=");
        builder.append(firstSettlementDate());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='guaranteeIndicator', referencedName='null', description='null', id=25, version=0, deprecated=0, encodedLength=1, offset=227, componentTokenCount=8, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='GuaranteeIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=227, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("guaranteeIndicator=");
        builder.append(guaranteeIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='iCB', referencedName='null', description='null', id=26, version=0, deprecated=0, encodedLength=16, offset=228, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char16', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=16, offset=228, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("iCB=");
        for (int i = 0; i < iCBLength() && iCB(i) > 0; i++)
        {
            builder.append((char)iCB(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='issuingCountry', referencedName='null', description='null', id=27, version=0, deprecated=0, encodedLength=3, offset=244, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=244, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("issuingCountry=");
        for (int i = 0; i < issuingCountryLength() && issuingCountry(i) > 0; i++)
        {
            builder.append((char)issuingCountry(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='lastAdjustedClosingPrice', referencedName='null', description='null', id=28, version=0, deprecated=0, encodedLength=8, offset=247, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=247, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("lastAdjustedClosingPrice=");
        builder.append(lastAdjustedClosingPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='lotSize', referencedName='null', description='null', id=29, version=0, deprecated=0, encodedLength=8, offset=255, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=255, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("lotSize=");
        builder.append(lotSize());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='maturityDate', referencedName='null', description='null', id=30, version=0, deprecated=0, encodedLength=8, offset=263, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char8', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=263, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("maturityDate=");
        for (int i = 0; i < maturityDateLength() && maturityDate(i) > 0; i++)
        {
            builder.append((char)maturityDate(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='maximumDecimalsInQuantity', referencedName='null', description='null', id=31, version=0, deprecated=0, encodedLength=1, offset=271, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=271, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("maximumDecimalsInQuantity=");
        builder.append(maximumDecimalsInQuantity());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mIC', referencedName='null', description='null', id=32, version=0, deprecated=0, encodedLength=4, offset=272, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=272, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mIC=");
        for (int i = 0; i < mICLength() && mIC(i) > 0; i++)
        {
            builder.append((char)mIC(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mICList', referencedName='null', description='null', id=33, version=0, deprecated=0, encodedLength=20, offset=276, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=276, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mICList=");
        for (int i = 0; i < mICListLength() && mICList(i) > 0; i++)
        {
            builder.append((char)mICList(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='countryOfExchange', referencedName='null', description='null', id=34, version=0, deprecated=0, encodedLength=3, offset=296, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=296, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("countryOfExchange=");
        for (int i = 0; i < countryOfExchangeLength() && countryOfExchange(i) > 0; i++)
        {
            builder.append((char)countryOfExchange(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mnemonic', referencedName='null', description='null', id=35, version=0, deprecated=0, encodedLength=5, offset=299, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char5', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=299, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mnemonic=");
        for (int i = 0; i < mnemonicLength() && mnemonic(i) > 0; i++)
        {
            builder.append((char)mnemonic(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingMIC', referencedName='null', description='null', id=36, version=0, deprecated=0, encodedLength=4, offset=304, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=304, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingMIC=");
        for (int i = 0; i < underlyingMICLength() && underlyingMIC(i) > 0; i++)
        {
            builder.append((char)underlyingMIC(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='underlyingISINCode', referencedName='null', description='null', id=37, version=0, deprecated=0, encodedLength=12, offset=308, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char12', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=12, offset=308, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("underlyingISINCode=");
        for (int i = 0; i < underlyingISINCodeLength() && underlyingISINCode(i) > 0; i++)
        {
            builder.append((char)underlyingISINCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tradingCurrency', referencedName='null', description='null', id=38, version=0, deprecated=0, encodedLength=3, offset=320, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=320, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradingCurrency=");
        for (int i = 0; i < tradingCurrencyLength() && tradingCurrency(i) > 0; i++)
        {
            builder.append((char)tradingCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='currencyCoefficient', referencedName='null', description='null', id=39, version=0, deprecated=0, encodedLength=4, offset=323, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=323, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=4294967294, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("currencyCoefficient=");
        builder.append(currencyCoefficient());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='tradingCurrencyIndicator', referencedName='null', description='null', id=40, version=0, deprecated=0, encodedLength=1, offset=327, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='TradingCurrencyIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=327, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("tradingCurrencyIndicator=");
        builder.append(tradingCurrencyIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strikeCurrencyIndicator', referencedName='null', description='null', id=41, version=0, deprecated=0, encodedLength=1, offset=328, componentTokenCount=6, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='StrikeCurrencyIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=328, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strikeCurrencyIndicator=");
        builder.append(strikeCurrencyIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='numberInstrumentCirculating', referencedName='null', description='null', id=42, version=0, deprecated=0, encodedLength=8, offset=329, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=329, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("numberInstrumentCirculating=");
        builder.append(numberInstrumentCirculating());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='parValue', referencedName='null', description='null', id=43, version=0, deprecated=0, encodedLength=8, offset=337, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=337, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("parValue=");
        builder.append(parValue());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='quantityNotation', referencedName='null', description='null', id=44, version=0, deprecated=0, encodedLength=3, offset=345, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=345, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("quantityNotation=");
        for (int i = 0; i < quantityNotationLength() && quantityNotation(i) > 0; i++)
        {
            builder.append((char)quantityNotation(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='instUnitExp', referencedName='null', description='null', id=45, version=0, deprecated=0, encodedLength=1, offset=348, componentTokenCount=10, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='InstrumentUnitExpression_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=348, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("instUnitExp=");
        builder.append(instUnitExp());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='settlementDelay', referencedName='null', description='null', id=46, version=0, deprecated=0, encodedLength=2, offset=349, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char2', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=349, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("settlementDelay=");
        for (int i = 0; i < settlementDelayLength() && settlementDelay(i) > 0; i++)
        {
            builder.append((char)settlementDelay(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strikeCurrency', referencedName='null', description='null', id=47, version=0, deprecated=0, encodedLength=3, offset=351, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=351, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strikeCurrency=");
        for (int i = 0; i < strikeCurrencyLength() && strikeCurrency(i) > 0; i++)
        {
            builder.append((char)strikeCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='taxCode', referencedName='null', description='null', id=48, version=0, deprecated=0, encodedLength=1, offset=354, componentTokenCount=7, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='TaxCode_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=354, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("taxCode=");
        builder.append(taxCode());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='typeOfCorporateEvent', referencedName='null', description='null', id=49, version=0, deprecated=0, encodedLength=2, offset=355, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char2', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=355, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("typeOfCorporateEvent=");
        for (int i = 0; i < typeOfCorporateEventLength() && typeOfCorporateEvent(i) > 0; i++)
        {
            builder.append((char)typeOfCorporateEvent(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='typeOfMarketAdmission', referencedName='null', description='null', id=50, version=0, deprecated=0, encodedLength=1, offset=357, componentTokenCount=20, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='TypeOfMarketAdmission_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=357, componentTokenCount=18, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("typeOfMarketAdmission=");
        builder.append(typeOfMarketAdmission());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='repoIndicator', referencedName='null', description='null', id=51, version=0, deprecated=0, encodedLength=1, offset=358, componentTokenCount=11, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='RepoIndicator_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=358, componentTokenCount=9, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("repoIndicator=");
        builder.append(repoIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='issuePrice', referencedName='null', description='null', id=52, version=0, deprecated=0, encodedLength=8, offset=359, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='int64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=359, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=-9223372036854775807, maxValue=9223372036854775807, nullValue=-9223372036854775808, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("issuePrice=");
        builder.append(issuePrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='nominalCurrency', referencedName='null', description='null', id=53, version=0, deprecated=0, encodedLength=3, offset=367, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=367, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("nominalCurrency=");
        for (int i = 0; i < nominalCurrencyLength() && nominalCurrency(i) > 0; i++)
        {
            builder.append((char)nominalCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='issuePriceDecimals', referencedName='null', description='null', id=54, version=0, deprecated=0, encodedLength=1, offset=370, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=370, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("issuePriceDecimals=");
        builder.append(issuePriceDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='strikePriceDecimals', referencedName='null', description='null', id=55, version=0, deprecated=0, encodedLength=1, offset=371, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=371, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("strikePriceDecimals=");
        builder.append(strikePriceDecimals());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='liquidInstrumentIndicator', referencedName='null', description='null', id=56, version=0, deprecated=0, encodedLength=1, offset=372, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='unsigned_char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=372, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=254, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("liquidInstrumentIndicator=");
        builder.append(liquidInstrumentIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='marketOfReferenceMIC', referencedName='null', description='null', id=57, version=0, deprecated=0, encodedLength=4, offset=373, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=373, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("marketOfReferenceMIC=");
        for (int i = 0; i < marketOfReferenceMICLength() && marketOfReferenceMIC(i) > 0; i++)
        {
            builder.append((char)marketOfReferenceMIC(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='iCBCode', referencedName='null', description='null', id=58, version=104, deprecated=0, encodedLength=8, offset=377, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char8', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=377, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("iCBCode=");
        for (int i = 0; i < iCBCodeLength() && iCBCode(i) > 0; i++)
        {
            builder.append((char)iCBCode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='EMMPatternRep', referencedName='null', description='null', id=59, version=0, deprecated=0, encodedLength=6, offset=385, componentTokenCount=33, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("eMMPatternRep=[");
        EMMPatternRepDecoder eMMPatternRep = eMMPatternRep();
        if (eMMPatternRep.count() > 0)
        {
            while (eMMPatternRep.hasNext())
            {
                eMMPatternRep.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}

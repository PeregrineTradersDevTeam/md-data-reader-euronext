/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class APAQuotesDecoder
{
    public static final int BLOCK_LENGTH = 101;
    public static final int TEMPLATE_ID = 1026;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final APAQuotesDecoder parentMessage = this;
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

    public APAQuotesDecoder wrap(
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


    public static int mICId()
    {
        return 5;
    }

    public static int mICSinceVersion()
    {
        return 0;
    }

    public static int mICEncodingOffset()
    {
        return 25;
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

        final int pos = this.offset + 25 + (index * 1);

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

        buffer.getBytes(this.offset + 25, dst, dstOffset, length);

        return length;
    }

    public String mIC()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 25, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMIC(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
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


    public static int currencyId()
    {
        return 6;
    }

    public static int currencySinceVersion()
    {
        return 0;
    }

    public static int currencyEncodingOffset()
    {
        return 29;
    }

    public static int currencyEncodingLength()
    {
        return 3;
    }

    public static String currencyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte currencyNullValue()
    {
        return (byte)0;
    }

    public static byte currencyMinValue()
    {
        return (byte)32;
    }

    public static byte currencyMaxValue()
    {
        return (byte)126;
    }

    public static int currencyLength()
    {
        return 3;
    }

    public byte currency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 29 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String currencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 29, dst, dstOffset, length);

        return length;
    }

    public String currency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 29, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 29 + i) & 0xFF;
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


    public static int lEICodeId()
    {
        return 7;
    }

    public static int lEICodeSinceVersion()
    {
        return 0;
    }

    public static int lEICodeEncodingOffset()
    {
        return 32;
    }

    public static int lEICodeEncodingLength()
    {
        return 20;
    }

    public static String lEICodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte lEICodeNullValue()
    {
        return (byte)0;
    }

    public static byte lEICodeMinValue()
    {
        return (byte)32;
    }

    public static byte lEICodeMaxValue()
    {
        return (byte)126;
    }

    public static int lEICodeLength()
    {
        return 20;
    }

    public byte lEICode(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 32 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String lEICodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getLEICode(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 32, dst, dstOffset, length);

        return length;
    }

    public String lEICode()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 32, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getLEICode(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 32 + i) & 0xFF;
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


    public static int eventTimeId()
    {
        return 8;
    }

    public static int eventTimeSinceVersion()
    {
        return 0;
    }

    public static int eventTimeEncodingOffset()
    {
        return 52;
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
        return buffer.getLong(offset + 52, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int quoteUpdateTypeId()
    {
        return 9;
    }

    public static int quoteUpdateTypeSinceVersion()
    {
        return 0;
    }

    public static int quoteUpdateTypeEncodingOffset()
    {
        return 60;
    }

    public static int quoteUpdateTypeEncodingLength()
    {
        return 1;
    }

    public static String quoteUpdateTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public QuoteUpdateType_enum quoteUpdateType()
    {
        return QuoteUpdateType_enum.get(((short)(buffer.getByte(offset + 60) & 0xFF)));
    }


    public static int mifidPriceId()
    {
        return 10;
    }

    public static int mifidPriceSinceVersion()
    {
        return 0;
    }

    public static int mifidPriceEncodingOffset()
    {
        return 61;
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
            case PRESENCE: return "required";
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

        final int pos = this.offset + 61 + (index * 1);

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

        buffer.getBytes(this.offset + 61, dst, dstOffset, length);

        return length;
    }

    public String mifidPrice()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 61, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidPrice(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 61 + i) & 0xFF;
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
        return 11;
    }

    public static int mifidQuantitySinceVersion()
    {
        return 0;
    }

    public static int mifidQuantityEncodingOffset()
    {
        return 81;
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

        final int pos = this.offset + 81 + (index * 1);

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

        buffer.getBytes(this.offset + 81, dst, dstOffset, length);

        return length;
    }

    public String mifidQuantity()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 81, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getMifidQuantity(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 81 + i) & 0xFF;
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
        builder.append("[APAQuotes](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='mIC', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=4, offset=25, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char4', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=25, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mIC=");
        for (int i = 0; i < mICLength() && mIC(i) > 0; i++)
        {
            builder.append((char)mIC(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='currency', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=3, offset=29, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char3', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=29, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("currency=");
        for (int i = 0; i < currencyLength() && currency(i) > 0; i++)
        {
            builder.append((char)currency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='lEICode', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=20, offset=32, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=32, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("lEICode=");
        for (int i = 0; i < lEICodeLength() && lEICode(i) > 0; i++)
        {
            builder.append((char)lEICode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='eventTime', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=8, offset=52, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='uint64_t', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=52, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=0, maxValue=-2, nullValue=-1, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("eventTime=");
        builder.append(eventTime());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='quoteUpdateType', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=1, offset=60, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=BEGIN_ENUM, name='QuoteUpdateType_enum', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=60, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("quoteUpdateType=");
        builder.append(quoteUpdateType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidPrice', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=20, offset=61, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=61, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidPrice=");
        for (int i = 0; i < mifidPriceLength() && mifidPrice(i) > 0; i++)
        {
            builder.append((char)mifidPrice(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='mifidQuantity', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=20, offset=81, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        //Token{signal=ENCODING, name='char20', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=81, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mifidQuantity=");
        for (int i = 0; i < mifidQuantityLength() && mifidQuantity(i) > 0; i++)
        {
            builder.append((char)mifidQuantity(i));
        }

        limit(originalLimit);

        return builder;
    }
}

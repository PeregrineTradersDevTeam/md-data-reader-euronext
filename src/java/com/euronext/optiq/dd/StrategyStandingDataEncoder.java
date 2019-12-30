/* Generated SBE (Simple Binary Encoding) message codec */
package com.euronext.optiq.dd;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class StrategyStandingDataEncoder
{
    public static final int BLOCK_LENGTH = 49;
    public static final int TEMPLATE_ID = 1012;
    public static final int SCHEMA_ID = 0;
    public static final int SCHEMA_VERSION = 105;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final StrategyStandingDataEncoder parentMessage = this;
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

    public StrategyStandingDataEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public StrategyStandingDataEncoder wrapAndApplyHeader(
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

    public StrategyStandingDataEncoder mDSeqNum(final long value)
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

    public StrategyStandingDataEncoder rebroadcastIndicator(final short value)
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

    public StrategyStandingDataEncoder eMM(final EMM_enum value)
    {
        buffer.putByte(offset + 9, (byte)value.value());
        return this;
    }

    public static int symbolIndexId()
    {
        return 4;
    }

    public static int symbolIndexSinceVersion()
    {
        return 0;
    }

    public static int symbolIndexEncodingOffset()
    {
        return 10;
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

    public StrategyStandingDataEncoder symbolIndex(final long value)
    {
        buffer.putInt(offset + 10, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int instrumentTradingCodeId()
    {
        return 5;
    }

    public static int instrumentTradingCodeSinceVersion()
    {
        return 0;
    }

    public static int instrumentTradingCodeEncodingOffset()
    {
        return 14;
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

    public StrategyStandingDataEncoder instrumentTradingCode(final int index, final byte value)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 14 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String instrumentTradingCodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StrategyStandingDataEncoder putInstrumentTradingCode(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 14, src, srcOffset, length);

        return this;
    }

    public StrategyStandingDataEncoder instrumentTradingCode(final String src)
    {
        final int length = 15;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 14, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 14 + start, (byte)0);
        }

        return this;
    }

    public StrategyStandingDataEncoder instrumentTradingCode(final CharSequence src)
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
            buffer.putByte(this.offset + 14 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 14 + i, (byte)0);
        }

        return this;
    }

    public static int exchangeCodeId()
    {
        return 6;
    }

    public static int exchangeCodeSinceVersion()
    {
        return 0;
    }

    public static int exchangeCodeEncodingOffset()
    {
        return 29;
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

    public StrategyStandingDataEncoder exchangeCode(final ExchangeCode_enum value)
    {
        buffer.putByte(offset + 29, value.value());
        return this;
    }

    public static int maturityDateId()
    {
        return 7;
    }

    public static int maturityDateSinceVersion()
    {
        return 0;
    }

    public static int maturityDateEncodingOffset()
    {
        return 30;
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

    public StrategyStandingDataEncoder maturityDate(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 30 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String maturityDateCharacterEncoding()
    {
        return "US-ASCII";
    }

    public StrategyStandingDataEncoder putMaturityDate(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 30, src, srcOffset, length);

        return this;
    }

    public StrategyStandingDataEncoder maturityDate(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 30, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 30 + start, (byte)0);
        }

        return this;
    }

    public StrategyStandingDataEncoder maturityDate(final CharSequence src)
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
            buffer.putByte(this.offset + 30 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 30 + i, (byte)0);
        }

        return this;
    }

    public static int strategyCodeId()
    {
        return 8;
    }

    public static int strategyCodeSinceVersion()
    {
        return 0;
    }

    public static int strategyCodeEncodingOffset()
    {
        return 38;
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
            case PRESENCE: return "required";
        }

        return "";
    }

    public StrategyStandingDataEncoder strategyCode(final StrategyCode_enum value)
    {
        buffer.putByte(offset + 38, value.value());
        return this;
    }

    public static int contractSymbolIndexId()
    {
        return 9;
    }

    public static int contractSymbolIndexSinceVersion()
    {
        return 0;
    }

    public static int contractSymbolIndexEncodingOffset()
    {
        return 39;
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

    public StrategyStandingDataEncoder contractSymbolIndex(final long value)
    {
        buffer.putInt(offset + 39, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int cFIId()
    {
        return 10;
    }

    public static int cFISinceVersion()
    {
        return 0;
    }

    public static int cFIEncodingOffset()
    {
        return 43;
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

    public StrategyStandingDataEncoder cFI(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 43 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String cFICharacterEncoding()
    {
        return "US-ASCII";
    }

    public StrategyStandingDataEncoder putCFI(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 43, src, srcOffset, length);

        return this;
    }

    public StrategyStandingDataEncoder cFI(final String src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(this.offset + 43, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(this.offset + 43 + start, (byte)0);
        }

        return this;
    }

    public StrategyStandingDataEncoder cFI(final CharSequence src)
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
            buffer.putByte(this.offset + 43 + i, byteValue);
        }

        for (int i = srcLength; i < length; ++i)
        {
            buffer.putByte(this.offset + 43 + i, (byte)0);
        }

        return this;
    }

    private final StrategyStandingDatarep1Encoder strategyStandingDatarep1 = new StrategyStandingDatarep1Encoder(this);

    public static long strategyStandingDatarep1Id()
    {
        return 11;
    }

    public StrategyStandingDatarep1Encoder strategyStandingDatarep1Count(final int count)
    {
        strategyStandingDatarep1.wrap(buffer, count);
        return strategyStandingDatarep1;
    }

    public static class StrategyStandingDatarep1Encoder
    {
        public static final int HEADER_SIZE = 2;
        private final StrategyStandingDataEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;

        StrategyStandingDatarep1Encoder(final StrategyStandingDataEncoder parentMessage)
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
            buffer.putByte(limit + 0, (byte)(short)17);
            buffer.putByte(limit + 1, (byte)(short)count);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 17;
        }

        public StrategyStandingDatarep1Encoder next()
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

        public static int legSymbolIndexId()
        {
            return 1;
        }

        public static int legSymbolIndexSinceVersion()
        {
            return 0;
        }

        public static int legSymbolIndexEncodingOffset()
        {
            return 0;
        }

        public static int legSymbolIndexEncodingLength()
        {
            return 4;
        }

        public static String legSymbolIndexMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public static long legSymbolIndexNullValue()
        {
            return 4294967295L;
        }

        public static long legSymbolIndexMinValue()
        {
            return 0L;
        }

        public static long legSymbolIndexMaxValue()
        {
            return 4294967294L;
        }

        public StrategyStandingDatarep1Encoder legSymbolIndex(final long value)
        {
            buffer.putInt(offset + 0, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int legPriceId()
        {
            return 2;
        }

        public static int legPriceSinceVersion()
        {
            return 0;
        }

        public static int legPriceEncodingOffset()
        {
            return 4;
        }

        public static int legPriceEncodingLength()
        {
            return 8;
        }

        public static String legPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public static long legPriceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long legPriceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long legPriceMaxValue()
        {
            return 9223372036854775807L;
        }

        public StrategyStandingDatarep1Encoder legPrice(final long value)
        {
            buffer.putLong(offset + 4, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int legRatioId()
        {
            return 3;
        }

        public static int legRatioSinceVersion()
        {
            return 0;
        }

        public static int legRatioEncodingOffset()
        {
            return 12;
        }

        public static int legRatioEncodingLength()
        {
            return 4;
        }

        public static String legRatioMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "";
                case PRESENCE: return "optional";
            }

            return "";
        }

        public static long legRatioNullValue()
        {
            return 4294967295L;
        }

        public static long legRatioMinValue()
        {
            return 0L;
        }

        public static long legRatioMaxValue()
        {
            return 4294967294L;
        }

        public StrategyStandingDatarep1Encoder legRatio(final long value)
        {
            buffer.putInt(offset + 12, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int legBuySellId()
        {
            return 4;
        }

        public static int legBuySellSinceVersion()
        {
            return 0;
        }

        public static int legBuySellEncodingOffset()
        {
            return 16;
        }

        public static int legBuySellEncodingLength()
        {
            return 1;
        }

        public static String legBuySellMetaAttribute(final MetaAttribute metaAttribute)
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

        public StrategyStandingDatarep1Encoder legBuySell(final LegBuyorSell_enum value)
        {
            buffer.putByte(offset + 16, value.value());
            return this;
        }
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        StrategyStandingDataDecoder writer = new StrategyStandingDataDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

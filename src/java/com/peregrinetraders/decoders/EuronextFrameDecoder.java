package com.peregrinetraders.decoders;

import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import org.agrona.concurrent.UnsafeBuffer;

import com.peregrinetraders.beans.BufferAndOffset;
import com.peregrinetraders.beans.PacketBuffer;

import net.jpountz.lz4.LZ4Factory;
import net.jpountz.lz4.LZ4SafeDecompressor;

public class EuronextFrameDecoder implements Function<PacketBuffer, Stream<BufferAndOffset>> {

	private short extractShort(UnsafeBuffer buffer, int offset) {
		return buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
	}

	private int extractInt(UnsafeBuffer buffer, int offset) {
		return buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
	}

	private long extractLong(UnsafeBuffer buffer, int offset) {
		return buffer.getLong(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
	}
	
	private Stream<BufferAndOffset> decodeFrames(UnsafeBuffer buffer, int beginOffset, long marketTime, long packetTime) {
		int totalLength = buffer.capacity();
		int offset = beginOffset;
		Builder<BufferAndOffset> builder = Stream.builder();
		while (offset < totalLength) {
			short frameSize = extractShort(buffer, offset);
			if (frameSize <= 0) {
				throw new RuntimeException("Invalid frame size detected: either parsing code bug or file corruption");
			}
			if (offset + frameSize > totalLength) {
				Builder<BufferAndOffset> emptyBuilder = Stream.builder();
				return emptyBuilder.build(); // corrupted packet detected, discard everything
			}
			builder.add(new BufferAndOffset(buffer, offset + 2, packetTime, marketTime));
			offset += frameSize;
		}
		return builder.build();
	}

	@Override
	public Stream<BufferAndOffset> apply(PacketBuffer packetBuffer) {
		UnsafeBuffer buffer = packetBuffer.getBuffer();
		long marketTime = extractLong(buffer, 0);
		@SuppressWarnings("unused")
		long psn = extractInt(buffer, 8);
		short packetFlags = extractShort(buffer, 12);
		@SuppressWarnings("unused")
		short channelId = extractShort(buffer, 14);

		if ((packetFlags & 0x01) == 1) {
			UnsafeBuffer decompressedBuffer = decompressBuffer(buffer);
			return decodeFrames(decompressedBuffer, 0, marketTime, packetBuffer.getPacketTime());
		} else {
			return decodeFrames(buffer, 16, marketTime, packetBuffer.getPacketTime());
		}
	}

	private UnsafeBuffer decompressBuffer(UnsafeBuffer buffer) {
		LZ4SafeDecompressor decompressor = LZ4Factory.fastestInstance().safeDecompressor();
		byte[] temporaryBuffer = new byte[buffer.capacity() * 64];
		int decompressedBytes = decompressor.decompress(
				buffer.byteArray(),
				16,
				(buffer.capacity() - 16),
				temporaryBuffer,
				0,
				temporaryBuffer.length);
		return new UnsafeBuffer(temporaryBuffer, 0, decompressedBytes);
	}

}

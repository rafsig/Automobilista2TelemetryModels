package com.sigwalt.automobilista2Telemetry.models;

import lombok.Data;

@Data
public class PacketBase {
	
	private long packetNumber;
	private long categoryPacketNumber;
	private short partialPacketIndex;
	private short partialPacketNumber;
	private PacketType packetType;
	private short packetVersion;
}

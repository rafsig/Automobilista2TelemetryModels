package com.sigwalt.automobilista2Telemetry.models;

import java.util.HashMap;
import java.util.Map;

public enum PacketType {

	CAR_PHYSICS(0),
	RACE_DEFINITION(1),
	PARTICIPANTS(2),
	TIMINGS(3),
	GAME_STATE(4),
	WEATHER_STATE(5),
	VEHICLE_NAMES(6),
	TIME_STATS(7),
	PARTICIPANT_VEHICLE_NAMES(8);
	
	private int value;
	private static Map<Integer, PacketType> valueMap = new HashMap<Integer, PacketType>();
	
	static {
		for(PacketType packetType: PacketType.values()){
			valueMap.put(packetType.getValue(), packetType);
		}
	}
	
	private PacketType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static PacketType valueOf(int value) {
		return valueMap.get(value);
	}
}

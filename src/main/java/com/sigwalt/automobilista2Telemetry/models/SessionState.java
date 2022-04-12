package com.sigwalt.automobilista2Telemetry.models;

import java.util.HashMap;
import java.util.Map;

public enum SessionState {
	SESSION_INVALID(0),
	SESSION_PRACTICE(1),
	SESSION_TEST(2),
	SESSION_QUALIFY(3),
	SESSION_FORMATION_LAP(4),
	SESSION_RACE(5),
	SESSION_TIME_ATTACK(6);
	
	private int value;
	private static Map<Integer, SessionState> valueMap = new HashMap<Integer, SessionState>();
	
	static {
		for(SessionState sessionState: SessionState.values()){
			valueMap.put(sessionState.getValue(), sessionState);
		}
	}
	
	private SessionState(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static SessionState valueOf(int value) {
		return valueMap.get(value);
	}
}


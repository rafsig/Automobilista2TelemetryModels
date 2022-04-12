package com.sigwalt.automobilista2Telemetry.models;

import java.util.HashMap;
import java.util.Map;

public enum GameState {
	GAME_EXITED(0),
	GAME_FRONT_END(1),
	GAME_INGAME_PLAYING(2),
	GAME_INGAME_PAUSED(3),
	GAME_INGAME_INMENU_TIME_TICKING(4),
	GAME_INGAME_RESTARTING(5),
	GAME_INGAME_REPLAY(6),
	GAME_FRONT_END_REPLAY(7);
	
	private int value;
	private static Map<Integer, GameState> valueMap = new HashMap<Integer, GameState>();
	
	static {
		for(GameState gameState: GameState.values()){
			valueMap.put(gameState.getValue(), gameState);
		}
	}
	
	private GameState(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static GameState valueOf(int value) {
		return valueMap.get(value);
	}
}

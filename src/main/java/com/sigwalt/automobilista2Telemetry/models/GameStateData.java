package com.sigwalt.automobilista2Telemetry.models;

import lombok.Data;

@Data
public class GameStateData {
	
	private int buildVersionNumber;
	private GameState gameState;
	private SessionState sessionState;
	
	

}

package com.sigwalt.automobilista2Telemetry.models;

import lombok.Data;

@Data
public class RaceData {
	
	private double worldFastestLap;
	private double worldFastestSector1;
	private double worldFastestSector2;
	private double worldFastestSector3;
	private double personalFastestLap;
	private double personalFastestSector1;
	private double personalFastestSector2;
	private double personalFastestSector3;
	private double trackLength;
	private String trackLocation;
	private String trackVariation;
	private String translatedTrackLocation;
	private String translatedTRackVariation;
	private int eventDuration;
	private short enforcedPitStop;

}

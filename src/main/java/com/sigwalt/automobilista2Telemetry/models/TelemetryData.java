package com.sigwalt.automobilista2Telemetry.models;

import lombok.Data;

@Data
public class TelemetryData {

	private short viwedParticipantIndex;
	private short unfilteredThrottle;
	private short unfilteredBrake;
	private short unfilteredSteering;
	private short unfilteredClutch;
	private short carFlags;
	private int oilTemperature;
	private int oilPressure;
	private int waterTemperature;
	private int waterPressure;
	private int fuelPressure;
	private short fuelCapacity;
	private short brake;
	private short throttle;
	private short clutch;
	private double fuelLevel;
	private double speed;
	private int rpm;
	private int maxRpm;
	private short steering;
	private short numGears;
	private short currentGear;
	private short boostAmount;
	private short crashState;
	private double odomeder;
	private double[] orientation;
	private double[] localVelocity;
	private double[] worldVelocity;
	private double[] angularVelocity;
	private double[] localAcceleration;
	private double[] worldAcceleration;
	private double[] extentsCentre;
	private short[] tyreFlags;
	private short[] terrain;
	private double[] tyreY;
	private double[] tyreRps;
	private short[] tyreTemp;
	private double[] tyreHeightAboveGround;
	private short[] tyreWear;
	private short[] brakeDamage;
	private short[] suspensionDamage;
	private short[] brakeTemperature;
	private int[] tyreTreadTemperature;
	private int[] tyreLayerTemperature;
	private int[] tyreCarcassTemperature;
	private int[] wheelRimTemperature;
	private int[] wheelInternalAirTemperature;
	private int[] tyreTemperatureLeft;
	private int[] tyreTemperatureCenter;
	private int[] tyreTemperatureRight;
	private double[] wheelLocalPositionY;
	private double[] rideHeight;
	private double[] suspensionTravel;
	private double[] suspensionVelocity;
	private int[] suspensionRideHeight;
	private int[] airPressure;
	private double engineSpeed;
	private double engineTorque;
	private short[] wings;
	private short handbrake;
	private short aeroDamage;
	private short engineDamage;
	
}

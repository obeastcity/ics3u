package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class CircleDrive implements Behavior { //drive in a circle

	private boolean suppressed = false;
	private LightSensor light;

	public CircleDrive(LightSensor ls){
		this.light = ls;
	}

	@Override
	public boolean takeControl() {
		//take control when black circle is found

		if (light.getLightValue() <= 40){
			return true; //give control to CircleDrive
		}

		return false;
	}

	@Override
	public void action() {     //travel in a circle
		int sensorReading;
		while(!suppressed){
			Motor.B.setSpeed(360);
			Motor.A.setSpeed(360);
			Motor.B.forward();
			Motor.A.forward();
			sensorReading = light.getLightValue();
//			if (sensorReading > 50 ){
//				Motor.B.stop();
//				Delay.msDelay(500);
//				Motor.B.forward();
//			}
			Thread.yield();
		}
		Motor.B.stop();
		Motor.A.stop();

	}

	@Override
	public void suppress() {
		suppressed = true;

	}


}



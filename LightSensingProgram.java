package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;

public class LightSensingProgram {
	/***
	 * 05/29/17
	 * Sonam Datok & Yusuf Khokhar
	 * @param lightsensor
	 */
	public static void main(String[] args) {
		System.out.println("Light sensing program!");
		Button.waitForAnyPress();
		LightSensor light = new LightSensor(SensorPort.S1);
		while (!Button.ENTER.isDown()) {
			
			if (light.getLightValue() < 50){
				Motor.A.rotate(360, true);
				Motor.B.stop();
			}else{
				Motor.A.stop();
				Motor.B.rotate(360, true);
			}
			
			
			
		}
		
		
	}

}

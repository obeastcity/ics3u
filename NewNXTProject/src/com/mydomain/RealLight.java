package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.util.Delay;

public class RealLight {
	/***
	 * 05/29/17
	 * Sonam Datok & Yusuf Khokhar
	 * @param lightsensor
	 */
	public static void main(String[] args) {
		System.out.println("Light sensing program!");
		
		LightSensor light = new LightSensor(SensorPort.S1);
		while (!Button.ENTER.isDown()) {
			
			Motor.A.forward();
			Motor.B.forward();
			
			if (light.getLightValue() < 50){
				Motor.A.rotate(45, true);
				Motor.B.stop();
			}//else if(light.getLightValue() > 50){
				//Motor.A.stop();
				
				
			//}
			
			
			
		}
		
		
	}

}
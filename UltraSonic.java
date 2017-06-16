package com.mydomain;

import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;
import lejos.nxt.Motor;

public class UltraSonic {
/***
 * Sonam & Yusuf
 * Ultrasound Program
 * @param  
 */
	public static void main(String[] args) {
	UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	while (sonar.continuous() < 10){
		Motor.A.stop();
		Motor.B.stop();
		Delay.msDelay(2000);
		Motor.A.rotate(720); 
		Delay.msDelay(2000);
		Motor.A.forward();
		Motor.B.forward();
		Delay.msDelay(5000);
		
		
	}

	}

}

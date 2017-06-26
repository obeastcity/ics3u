package com.mydomain;

import lejos.nxt.SoundSensor;
import lejos.util.Delay;
import lejos.nxt.SensorPort;
import lejos.nxt.Motor;
import lejos.nxt.Button;

public class SoundProgram {
/***
 * Sound Program that makes the robot move forward on a clap
 *  * Sonam & Yusuf
 * @param NA
 */
	public static void main(String[] args) {
		SoundSensor sound = new SoundSensor(SensorPort.S4, true);
		
			
		
		Button.waitForAnyPress();
		
		
		
		
		
		
		//Delay.msDelay(9000);
		if (sound.readValue() > 20){
			Motor.A.setSpeed(4000);
			Motor.B.setSpeed(4000);
			Motor.A.forward();
			Motor.B.forward();
			Delay.msDelay(100000);
		}
		Motor.A.stop();
		}

	}



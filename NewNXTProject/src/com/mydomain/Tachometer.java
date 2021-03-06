package com.mydomain;

import lejos.nxt.Motor;


import lejos.util.Delay;

public class Tachometer {
	/***
	 * Sonam Datok & Yusuf Khokhar
	 * @param tachometer revolutions
	 */

	public static void main(String[] args) {
		
		Motor.A.setSpeed(720);
		Motor.A.forward();
		Delay.msDelay(2000);
		
		System.out.println(Motor.A.getTachoCount());
	
		Motor.A.stop();
		Motor.A.backward();
		Delay.msDelay(2000);
		System.out.println(Motor.A.getTachoCount());
		Motor.A.stop();
		System.out.println(Motor.A.getTachoCount());
	}
	

}

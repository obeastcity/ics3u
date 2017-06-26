package com.mydomain;

import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.nxt.LCD;

public class HelloWorld {
/***
 * Sonam Datok & Yusuf Coco
 * @param forward and backwards
 */
	public static void main(String[] args) {
		System.out.println("Lebron James!");
		Button.waitForAnyPress();
		Motor.A.forward();
		String fawad = "fawad";
		LCD.drawString(fawad, 0, 0);
		Button.waitForAnyPress();
		Motor.A.backward();
		String backwad = "backwads";
		LCD.drawString(backwad, 0, 0);
		Button.waitForAnyPress();
		Motor.A.stop();
	}


}

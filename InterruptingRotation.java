package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.Motor;
import lejos.nxt.Motor;
import lejos.nxt.Motor;
public class InterruptingRotation {

	public static void main(String[] args) {
		System.out.println("Program 4");
		Motor.A.rotate(-1440);
		System.out.println(Motor.A.getTachoCount());
		Button.waitForAnyPress();
		Motor.A.stop();
		System.out.println(Motor.A.getTachoCount());
		Button.waitForAnyPress();
	}

}

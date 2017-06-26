package com.mydomain;

import lejos.nxt.Motor;
import lejos.nxt.Button;

public class RotationControl {

	public static void main(String[] args) {
		Button.waitForAnyPress();
		Motor.A.rotate(1440);
		System.out.println(Motor.A.getTachoCount());
		Motor.A.rotate(0);
		Button.waitForAnyPress();
	}

}

package com.mydomain;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class Exit implements Behavior {

	//Takes control of robot when Button is pressed down
	@Override
	public boolean takeControl() {
		if (Button.ESCAPE.isDown())
		{
			return true;
		}
		return false;
	}

	//Exits the program
	@Override
	public void action() {
		System.exit(0);
	}

	//Action is never suppressed
	@Override
	public void suppress() {
		
	}

}

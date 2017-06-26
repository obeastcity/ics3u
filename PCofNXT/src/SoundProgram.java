

import lejos.nxt.SoundSensor;
import lejos.nxt.SensorPort;

public class SoundProgram {
/***
 * Sound Program that makes the robot move forward on a clap
 *  * Sonam & Yusuf
 * @param NA
 */
	public static void main(String[] args) {
		SoundSensor sound = new SoundSensor(SensorPort.S4, true);
		int valueSound = sound.readValue();
		
		if (valueSound > 50){
			
		}
		

	}

}

package Actors;

import Controllers.Observer;
import Sensors.LightSensor;

public class WindowController extends Observer {
	
	public WindowController (LightSensor lightSensor) {
		this.lightSensor = lightSensor;
		this.lightSensor.attach(this);
	}

	@Override
	public void updateStatus() {
		// TODO Auto-generated method stub
		if(lightSensor.getLight() > 60) {
			System.out.println("Light: " + lightSensor.getLight() + " , Window is CLOSING DOWN!");
		} else {
			System.out.println("Light: " + lightSensor.getLight() + " , Window is OPEING UP!");
		}
	}

}

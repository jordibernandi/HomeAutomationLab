package Actors;

import Controllers.MainObserver;
import Controllers.Observer;
import Sensors.LightSensor;

public class WindowController extends Observer {
	
	public WindowController (MainObserver mainObserver) {
		this.mainObserver = mainObserver;
		this.mainObserver.attach(this);
	}

	@Override
	public void updateStatus() {
		// TODO Auto-generated method stub
		
		LightSensor lightSensor = new LightSensor(mainObserver.getLight());
		
		if(lightSensor.getLight() > 60) {
			System.out.println("Window is CLOSING DOWN, weil die Light " + lightSensor.getLight() + " ist");
		} else {
			System.out.println("Window is OPENING UP, weil die Light " + lightSensor.getLight() + " ist");
		}
	}

}

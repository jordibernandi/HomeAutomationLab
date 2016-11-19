package Actors;

import Controllers.MainObserver;
import Controllers.Observer;
import Sensors.LightSensor;
import Sensors.TimeSensor;

public class LampController extends Observer {
	
	public LampController(MainObserver mainObserver) {
		this.mainObserver = mainObserver;
		this.mainObserver.attach(this);
	}

	@Override
	public void updateStatus() {
		// TODO Auto-generated method stub
		
		TimeSensor timeSensor = new TimeSensor(mainObserver.getTime());
		LightSensor lightSensor = new LightSensor(mainObserver.getLight());
		
		if(timeSensor.getTime() > 17) {
			System.out.println("Lamp is TURNING ON, weil die Zeit " + timeSensor.getTime() + " ist");
		} else {
			System.out.println("Lamp is TURNING OFF, weil die Zeit " + timeSensor.getTime() + " ist");
		}
		
		if(lightSensor.getLight() < 30) {
			System.out.println("Lamp is TURNING ON, weil die Zeit " + lightSensor.getLight() + " ist");
		} else {
			System.out.println("Lamp is TURNING OFF, weil die Zeit " + lightSensor.getLight() + " ist");
		}
	}

}

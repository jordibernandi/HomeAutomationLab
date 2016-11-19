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
			System.out.println("Time: " + timeSensor.getTime() + " , Lamp is turning ON!");
		} else {
			System.out.println("Time: " + timeSensor.getTime() + " , Lamp is turning OFF!");
		}
		
		if(lightSensor.getLight() < 30) {
			System.out.println("Light: " + lightSensor.getLight() + " , Lamp is turning ON!");
		} else {
			System.out.println("Light: " + lightSensor.getLight() + " , Lamp is turning OFF!");
		}
	}

}

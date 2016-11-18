package Actors;

import Controllers.Observer;
import Sensors.TimeSensor;

public class LampController extends Observer {
	
	public LampController(TimeSensor timeSensor) {
		this.timeSensor = timeSensor;
		this.timeSensor.attach(this);
	}

	@Override
	public void updateStatus() {
		// TODO Auto-generated method stub
		if(timeSensor.getTime() > 17) {
			System.out.println("Time: " + timeSensor.getTime() + " , Lamp is turning ON!");
		} else {
			System.out.println("Time: " + timeSensor.getTime() + " , Lamp is turning OFF!");
		}
	}

}

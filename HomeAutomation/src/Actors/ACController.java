package Actors;

import Controllers.MainObserver;
import Controllers.Observer;
import Sensors.TempSensor;

public class ACController extends Observer{

	public ACController(MainObserver mainObserver) {
		this.mainObserver = mainObserver;
		this.mainObserver.attach(this);
	}

	@Override
	public void updateStatus() {
		// TODO Auto-generated method stub
		
		TempSensor tempSensor = new TempSensor(mainObserver.getTemp());
		
		if(tempSensor.getTemp() > 26) {
			System.out.println("Temp: " + tempSensor.getTemp() + " , AC is turning ON!");
		} else {
			System.out.println("Temp: " + tempSensor.getTemp() + " , AC is turning OFF!");
		}
	}

}

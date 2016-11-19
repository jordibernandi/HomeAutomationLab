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
			System.out.println("AC is TURNING ON, weil die Temperatur " + tempSensor.getTemp() + " ist");
		} else {
			System.out.println("AC is TURNING OFF, weil die Temperatur " + tempSensor.getTemp() + " ist");
		}
	}

}

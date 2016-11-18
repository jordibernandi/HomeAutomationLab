package Actors;

import Controllers.Observer;
import Sensors.TempSensor;

public class ACController extends Observer{

	public ACController(TempSensor tempSensor) {
		this.tempSensor = tempSensor;
		this.tempSensor.attach(this);
	}

	@Override
	public void updateStatus() {
		// TODO Auto-generated method stub
		if(tempSensor.getTemp() > 26) {
			System.out.println("Temp: " + tempSensor.getTemp() + " , AC is turning ON!");
		} else {
			System.out.println("Temp: " + tempSensor.getTemp() + " , AC is turning OFF!");
		}
	}

}

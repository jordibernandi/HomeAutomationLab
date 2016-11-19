package Controllers;

//import Sensors.LightSensor;
//import Sensors.TempSensor;
//import Sensors.TimeSensor;

public abstract class Observer {
	protected MainObserver mainObserver;
//	protected LightSensor lightSensor;
//	protected TempSensor tempSensor;
//	protected TimeSensor timeSensor;
	
	public abstract void updateStatus();
}

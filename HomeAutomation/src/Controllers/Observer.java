package Controllers;

import Sensors.LightSensor;
import Sensors.TempSensor;
import Sensors.TimeSensor;

public abstract class Observer {
	protected LightSensor lightSensor;
	protected TempSensor tempSensor;
	protected TimeSensor timeSensor;
	
	public abstract void updateStatus();
}

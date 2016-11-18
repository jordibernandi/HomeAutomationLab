package Views;

import java.util.Random;

import Actors.ACController;
import Actors.LampController;
import Actors.WindowController;
import Sensors.LightSensor;
import Sensors.TempSensor;
import Sensors.TimeSensor;

public class ViewDisplay {

	public static void main (String[] args) {
		LightSensor lightSensor = new LightSensor();
		TempSensor tempSensor = new TempSensor();
		TimeSensor timeSensor = new TimeSensor();
		
		Random randLight = new Random();
		Random randTemp = new Random();
		Random randTime = new Random();
		
		int light = randLight.nextInt(100) + 0;
		int temp = randTemp.nextInt(40) + 10;
		int time = randTime.nextInt(24) + 0;
		
		new ACController(tempSensor);
		new LampController(timeSensor);
		new WindowController(lightSensor);
		
		System.out.println("Light: " + light + " %");
		System.out.println("Temp: " + temp + " celcius");
		System.out.println("Time: " + time + " 'clock");
		
		lightSensor.setLight(light);
		tempSensor.setTemp(temp);
		timeSensor.setTime(time);
	}
}

package Views;

import java.util.Random;

import Actors.ACController;
import Actors.LampController;
import Actors.WindowController;
import Controllers.MainObserver;

public class ViewDisplay {

	public static void main (String[] args) {
		MainObserver mainObserver = new MainObserver();
				
		Random randLight = new Random();
		Random randTemp = new Random();
		Random randTime = new Random();
		
		int light = randLight.nextInt(100) + 0;
		int temp = randTemp.nextInt(40) + 10;
		int time = randTime.nextInt(24) + 0;
		
		new ACController(mainObserver);
		new LampController(mainObserver);
		new WindowController(mainObserver);
				
		System.out.println("Light: " + light + " %");
		System.out.println("Temp: " + temp + " celcius");
		System.out.println("Time: " + time + " 'clock");
		
		System.out.println();
		
		mainObserver.setSensors(time, light, temp);

	}
}

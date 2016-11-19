package Sensors;

//import java.util.ArrayList;
//import java.util.List;
//
//import Controllers.Observer;

public class LightSensor {

//	private List<Observer> observers = new ArrayList<Observer>();
	private int light;
	
	public LightSensor(int light) {
		super();
		this.light = light;
	}

	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
//		notifyAllObservers();
	}

//	public void attach(Observer observer) {
//		observers.add(observer);
//	}
//	
//	public void notifyAllObservers() {
//		for(Observer observer : observers) {
//			observer.updateStatus();
//		}
//	}
}

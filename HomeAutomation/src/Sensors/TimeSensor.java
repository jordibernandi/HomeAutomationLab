package Sensors;

//import java.util.ArrayList;
//import java.util.List;
//
//import Controllers.Observer;

public class TimeSensor {

//	private List<Observer> observers = new ArrayList<Observer>();
	private int time;
	
	public TimeSensor(int time) {
		super();
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
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

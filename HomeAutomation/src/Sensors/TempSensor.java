package Sensors;

import java.util.ArrayList;
import java.util.List;

import Controllers.Observer;

public class TempSensor {

	private List<Observer> observers = new ArrayList<Observer>();
	private int temp;
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
		notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(Observer observer : observers) {
			observer.updateStatus();
		}
	}
}

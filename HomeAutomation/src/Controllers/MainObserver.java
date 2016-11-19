package Controllers;

import java.util.ArrayList;
import java.util.List;

public class MainObserver {
	private List<Observer> observers = new ArrayList<Observer>();
	
//	private int state;
	private int time;
	private int light;
	private int temp;

//	public int getState() {
//		return state;
//	}
//	
//	public void setState(int state) {
//		this.state = state;
//		notifyAllObservers();
//	}
	
	

	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public void notifyAllObservers() {
		for(Observer observer : observers) {
			observer.updateStatus();
		}
	}
	
	public void setChanged(int time, int light, int temp) {
		this.time = time;
		this.light = light;
		this.temp = temp;
		notifyAllObservers();
	}
}

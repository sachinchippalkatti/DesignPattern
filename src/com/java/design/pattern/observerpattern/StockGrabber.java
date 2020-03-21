package com.java.design.pattern.observerpattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibm;
	private double goo;
	private double app;
	
	public StockGrabber(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer newOberver) {
		// TODO Auto-generated method stub
		
		observers.add(newOberver);
	}

	@Override
	public void unRegister(Observer deleteObserver) {
		// TODO Auto-generated method stub
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Deleted the Observer" + observerIndex+1);
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(Observer observer : observers) {
			observer.update(app, goo, ibm);
		}
	}
	public double getIbm() {
		return ibm;
	}
	public void setIbm(double ibm) {
		this.ibm = ibm;
		notifyObserver();
	}
	public double getGoo() {
		return goo;
	}
	public void setGoo(double goo) {
		this.goo = goo;
		notifyObserver();
	}
	public double getApp() {
		return app;
	}
	public void setApp(double app) {
		this.app = app;
		notifyObserver();
	}
	
	
	

}

package com.java.design.pattern.observerpattern;

public interface Subject {
	
	public void register(Observer o);
	public void unRegister(Observer o);
	public void notifyObserver();

}

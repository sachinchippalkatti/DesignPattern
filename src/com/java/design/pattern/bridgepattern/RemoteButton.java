package com.java.design.pattern.bridgepattern;

public abstract class RemoteButton {
	private EntertainmentDevice theDevice;
	
	public RemoteButton(EntertainmentDevice device) {
		// TODO Auto-generated constructor stub
		theDevice= device;
	}
	
	public void pressFive() {
		theDevice.pressFive();
	}
	
	public void pressSix() {
		theDevice.pressSix();
	}
	
	public void deviceFeedback() {
		theDevice.deviceFeedback();
	}
	
	public abstract void pressNine();
}

package com.java.design.pattern.bridgepattern;

public abstract class EntertainmentDevice {
	
	public int deviceStatus;
	public int maxSetting;
	public int volumnLevel = 0;
	
	public abstract void pressFive();
	public abstract void pressSix();

	public void pressSeven() {
		volumnLevel++;
		System.out.println("Volume is increased " + volumnLevel);
		
	}
	
	public void pressEight() {
		volumnLevel--;
		System.out.println("volume is decreased " + volumnLevel);
		
	}
	
	public void deviceFeedback() {
		if(deviceStatus > maxSetting || deviceStatus < 0) { deviceStatus =0; }
		System.out.println("On  " + deviceStatus);
	}
}

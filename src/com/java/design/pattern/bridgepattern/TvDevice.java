package com.java.design.pattern.bridgepattern;

public class TvDevice extends EntertainmentDevice {

	public TvDevice(int newDevicesStatus, int newMaxSetting) {
		// TODO Auto-generated constructor stub
		deviceStatus = newDevicesStatus;
		maxSetting = newMaxSetting;
	}
	
	@Override
	public void pressFive() {
		// TODO Auto-generated method stub
		System.out.println("chennal down");
		deviceStatus--;
	}

	@Override
	public void pressSix() {
		// TODO Auto-generated method stub
		System.out.println("chennal up");
		deviceStatus++;
	}

}

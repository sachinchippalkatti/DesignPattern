package com.java.design.pattern.bridgepattern;

public class TvRemotePause extends RemoteButton {

	public TvRemotePause(EntertainmentDevice device) {
		super(device);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pressNine() {
		// TODO Auto-generated method stub
		System.out.println("Tv has been paused");
	}

}

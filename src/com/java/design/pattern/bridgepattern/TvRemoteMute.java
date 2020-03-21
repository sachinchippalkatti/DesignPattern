package com.java.design.pattern.bridgepattern;

public class TvRemoteMute extends RemoteButton {

	public TvRemoteMute(EntertainmentDevice device) {
		super(device);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pressNine() {
		// TODO Auto-generated method stub
		System.out.println("Mute the TV");
	}

}

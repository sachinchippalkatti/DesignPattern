package com.java.design.pattern.bridgepattern;

public class TestRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteButton tv = new TvRemoteMute(new TvDevice(0, 200));
		RemoteButton tv1  = new TvRemotePause(new TvDevice(0, 100));
		
		tv.pressFive();
		tv.pressSix();
		tv.pressNine();
		tv.deviceFeedback();
		
		
		System.out.println("njncjdncdjcndjkcndjkc");
		
		tv1.pressFive();
		tv1.pressFive();
		tv1.pressFive();
		tv1.pressSix();
		tv1.pressNine();
		tv1.deviceFeedback();
	}

}

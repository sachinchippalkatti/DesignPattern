package com.java.design.pattern.statepattern;

public interface AtmState {

	void insertCard();
	void ejectCard();
	void insertPin(int pin);
	void requestCash(int cash);
}

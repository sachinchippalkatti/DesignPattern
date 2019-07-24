package com.java.design.pattern.strategypattern;

public class Birds extends Animal{

	public Birds() {
		super();
		setSound("Twity");
		setFly(new CanFly());
	}
}

package com.java.design.pattern.strategypattern;

public class Dog extends Animal {
	
	public Dog() {
		super();
		setSound("Barks");
		setFly(new CantFly());
	}

}

package com.java.design.pattern.strategypattern;

public interface Fly {

	String flymessage();
}

class CanFly implements Fly{

	@Override
	public String flymessage() {
		// TODO Auto-generated method stub
		return "It can fly";
	}
	
}

class CantFly implements Fly{

	@Override
	public String flymessage() {
		// TODO Auto-generated method stub
		return "It Can't  Fly";
	}
	
}
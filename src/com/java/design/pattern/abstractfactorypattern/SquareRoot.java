package com.java.design.pattern.abstractfactorypattern;

public class SquareRoot implements Calculator {

	@Override
	public void calculate(int a, int b) {
		// TODO Auto-generated method stub
	 System.out.println("Square root of the two number a*a + b*b " + (a*a + b*b));
	}

}

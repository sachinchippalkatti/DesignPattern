package com.java.design.pattern.abstractfactorypattern;

public class Add implements Calculator{
	
	public void calculate(int a, int b) {
		System.out.println("a + b is" + (a+b));
	}

}

package com.java.design.pattern.factorypattern;

public class Sub implements Calculator{

	public void calculate(int a , int b) {
		System.out.println(" a - b is " + (a-b));
	}
}

package com.java.design.pattern.abstractfactorypattern;

public class Divide implements Calculator{

	public void calculate(int a, int b) {
		System.out.println("Dividtion of a and b " + (a/b));
	}
}

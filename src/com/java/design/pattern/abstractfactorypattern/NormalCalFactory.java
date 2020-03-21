package com.java.design.pattern.abstractfactorypattern;

public class NormalCalFactory implements CalFactory {

	@Override
	public Calculator create(String type) {
		// TODO Auto-generated method stub
		switch (type) {
		case "add":
			return new Add();
		case "sub":
			return new Sub();
		case "div":
			return new Divide();
		default:
			return null;
		}
	}

}

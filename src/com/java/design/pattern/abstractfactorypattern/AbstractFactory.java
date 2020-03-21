package com.java.design.pattern.abstractfactorypattern;

public abstract class AbstractFactory {
	//normal calculator 
	//Scientific calculator 
	//return CalFactory
	
	public static CalFactory getFactory(CalType caltype) {
		switch (caltype) {
		case NORMAL:
			return new NormalCalFactory();
		case SCIENTIFIC:
			return new ScientificCalFactory();	
		default:
			return null;
		}
	}
}

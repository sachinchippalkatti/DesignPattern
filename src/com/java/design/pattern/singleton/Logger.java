package com.java.design.pattern.singleton;


//How to create singleton class
//1. make default constructor private
//2. create class variable and create method getInstance()
//3. Make method static so that it can be called using class name and method must be public so that it can be accessed outside the package
//4. As per the rule of static method must return static variable so make logger class variable as static and private to package.

public class Logger {

	private static Logger logger;
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
}

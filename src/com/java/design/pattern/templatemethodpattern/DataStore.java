package com.java.design.pattern.templatemethodpattern;

public abstract class DataStore {
	
	
	public void readProcessAndSave() {
		readData();
		processFile();
		saveFile();
	}
	
	public abstract void readData();
	
	public abstract void processFile();
	
	public void saveFile() {
		System.out.println("Store the file in DB");
	}

}

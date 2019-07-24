package com.java.design.pattern.templatemethodpattern;

public class WordFile extends DataStore {
	
	/*public void readProcessAndSave() {
		readData();
		processFile();
		saveFile();
	}*/

	public void readData() {
		System.out.println("Read the Word file");
	}
	
	public void processFile() {
		System.out.println("Process the Word file");
	}
	
	/*public void saveFile() {
		System.out.println("Store the file in DB");
	}*/
}

package com.java.design.pattern.templatemethodpattern;

public class ExcelFile extends DataStore{

	/*public void readProcessAndSave() {
		readData();
		processFile();
		saveFile();
	}*/
	
	public void readData() {
		System.out.println("Read the Excel file");
	}
	
	public void processFile() {
		System.out.println("Process the excel file");
	}
	
	/*public void saveFile() {
		System.out.println("Store the file in DB");
	}*/
}

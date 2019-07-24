package com.java.design.pattern.templatemethodpattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelFile obj = new ExcelFile();
		/*obj.readData();
		obj.processFile();
		obj.saveFile();*/
		
		obj.readProcessAndSave();
		
		WordFile obj1 = new WordFile();
		/*obj1.readData();
		obj1.processFile();
		obj1.saveFile();*/
		
		obj1.readProcessAndSave();
	}

}

package com.java.design.pattern.compositeDesignPattern;


public class CompositeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee dev1 = new Developer("sachin", 1, 1120L);
		Employee dev2 = new Developer("Anish", 2, 30L);
		Employee dev3 = new Developer("Anand", 3, 320L);
		Employee dev4 = new Developer("crish", 4, 23L);
		Employee dev5 = new Developer("mike", 5, 23L);
		Employee dev6 = new Developer("lee", 6, 220L);
		
		Employee lead1 = new Lead("Raja", 7, 229L);
		Employee lead2 = new Lead("Sekhar", 8, 229L);
		
		lead1.add(dev1);
		lead1.add(dev2);
		lead1.add(dev3);
		lead1.add(dev4);
		
		System.out.println(lead1.toString());
		
		
		lead2.add(dev5);
		lead2.add(dev6);
		
		System.out.println(lead2.toString());
		
		Employee manager = new Manager("Naga", 9, 23833L);
		manager.add(lead1);
		manager.add(lead2);
		
		System.out.println(manager.toString());
		
	}

}

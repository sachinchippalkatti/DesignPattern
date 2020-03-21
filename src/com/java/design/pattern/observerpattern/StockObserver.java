package com.java.design.pattern.observerpattern;

public class StockObserver implements Observer{

	private double ibm;
	private double goo;
	private double app;
	
	private static int observerIDTracker = 0;
	
	private int oberserID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber=stockGrabber;
		oberserID = ++observerIDTracker;
		
		System.out.println("New Observer ID" + this.oberserID);
		
		stockGrabber.register(this);
		
	}
	@Override
	public void update(double app, double goo, double ibm) {
		// TODO Auto-generated method stub
		this.app = app;
		this.goo = goo;
		this.ibm = ibm;
		
		printThePrice();
		
	}
	
	private void printThePrice() {
		// TODO Auto-generated method stub
		System.out.println(oberserID + "\n IBM :" + ibm +"\n GOOGLE :" + goo + "\nApple :" + app);
	}
	
	

}

package com.java.design.pattern.observerpattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{
	
	private int startTime;
	private double price;
	private String stock;
	
	private Subject stockGrabber;
	
	

	public GetTheStock(int startTime, double price, String stock, Subject stockGrabber) {
		super();
		this.startTime = startTime;
		this.price = price;
		this.stock = stock;
		this.stockGrabber = stockGrabber;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			try {
				Thread.sleep(2000);
			}catch(Exception ex) {
				
			}
			double randNam = (Math.random()*(.06)) - .03;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format((price + randNam)));
			
			if(stock == "ibm") ((StockGrabber)stockGrabber).setIbm(price);
			if(stock == "app") ((StockGrabber)stockGrabber).setApp(price);
			if(stock == "goo") ((StockGrabber)stockGrabber).setGoo(price);
			
			System.out.println("stock" + df.format((price + randNam)) + "   " + df.format(randNam));
			System.out.println();
		}
	}

}

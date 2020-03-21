package com.java.design.pattern.observerpattern;

public class GrapStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setApp(1234);
		stockGrabber.setGoo(23333);
		stockGrabber.setIbm(676);

		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setApp(1234);
		stockGrabber.setGoo(23333);
		stockGrabber.setIbm(676);
		
		Runnable thread1 = new GetTheStock(2, 1233, "app", stockGrabber);
		Runnable thread2 = new GetTheStock(2, 23333, "goo", stockGrabber);
		Runnable thread3 = new GetTheStock(2, 3435, "ibm", stockGrabber);
		
		new Thread(thread1).start();
		new Thread(thread2).start();
		new Thread(thread3).start();
	}

}

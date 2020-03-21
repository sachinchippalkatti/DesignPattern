package com.java.design.pattern.facadepattern;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacadeBankDetails bank = new FacadeBankDetails(112123,123);
		
		bank.cashDeposite(100);
		bank.cashWithdraw(500);
		bank.cashDeposite(1000);

	}

}

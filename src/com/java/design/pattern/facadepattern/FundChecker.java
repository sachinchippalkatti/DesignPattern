package com.java.design.pattern.facadepattern;

public class FundChecker {
	
	public int amount = 500;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void increaseFund(int fund) {
		this.amount =+ fund;
	}
	
	public void decreaseFund(int fund) {
		this.amount =- fund;
	}
	
	public boolean enoughFund(int amt) {
		if(getAmount() > amt) {
			decreaseFund(amt);
			return true;
		}else {
			return false;
		}
	}

}

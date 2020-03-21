package com.java.design.pattern.facadepattern;

public class AccountNumberChecker {
	
	private double accoutNamber = 112123;

	public double getAccoutNamber() {
		return accoutNamber;
	}

	public void setAccoutNamber(double accoutNamber) {
		this.accoutNamber = accoutNamber;
	}
	
	public boolean checkAccoutNumber(double accNumber) {
		if(accNumber == getAccoutNamber()) {
			return true;
		}else {
			return false;
		}
	}

}

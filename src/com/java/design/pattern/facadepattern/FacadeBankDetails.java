package com.java.design.pattern.facadepattern;

public class FacadeBankDetails {
	
	private int accoutname;
	private int pin;
	
	private AccountNumberChecker accNumber;
	private SecurityCodeChecker accPin;
	private FundChecker accFund;
	
	public FacadeBankDetails(int accnumber , int pin) {
		this.accoutname=accnumber;
		this.pin = pin;
		
		this.accNumber = new AccountNumberChecker();
		this.accPin = new SecurityCodeChecker();
		this.accFund = new FundChecker();
	}
	
	
	
	public int getAccoutname() {
		return accoutname;
	}



	public void setAccoutname(int accoutname) {
		this.accoutname = accoutname;
	}



	public int getPin() {
		return pin;
	}



	public void setPin(int pin) {
		this.pin = pin;
	}



	public void cashDeposite(int amt) {
		if(accNumber.checkAccoutNumber(getAccoutname()) && accPin.checkSecurityCode(getPin())) {
			accFund.increaseFund(amt);
			System.out.println("Transaction is Successfull : Balance is "+ accFund.getAmount());
		}else {
			System.out.println("Transcation failed");
		}
	}
	
	public void cashWithdraw(int amt) {
		if(accNumber.checkAccoutNumber(getAccoutname()) && accPin.checkSecurityCode(getPin()) && accFund.enoughFund(amt)) {
			System.out.println("Transaction is Successfull : Balance is "+ accFund.getAmount());
		}else {
			System.out.println("Transcation failed");
		}
	}

}

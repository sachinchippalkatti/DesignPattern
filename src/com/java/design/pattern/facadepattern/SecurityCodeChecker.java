package com.java.design.pattern.facadepattern;

public class SecurityCodeChecker {
	
	private int secCode = 123;

	public int getSecCode() {
		return secCode;
	}

	public void setSecCode(int secCode) {
		this.secCode = secCode;
	}
	
	public boolean checkSecurityCode(int code) {
		if(code == getSecCode()) {
			return true;
		}else {
			return false;
		}
	}

}

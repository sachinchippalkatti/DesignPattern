package com.java.design.pattern.facadepattern;

public class FacadeClass {
	IPhone iphone;
	OnePluse oneplus;
	NokiaPhone nokiaPhone;
	
	FacadeClass(){
		iphone = new IPhone();
		oneplus = new OnePluse();
		nokiaPhone = new NokiaPhone();
	}
	
	String BuildIphone() {
		return iphone.build();
	}
	
	String BuildAndriodPhonce() {
		return oneplus.build();
	}
	
	String BuildWindowsPhone() {
		return nokiaPhone.build();
	}
}

package com.java.inheritance;

public class A {
	
	public String name;
	public String methodA() {
		return "Class A -- A Method";
	}

	public String toString() {
		if (this instanceof B) {
			return "name :" + name + "phone" + ((B)this).phone;	
		}else {
			return "name :" + name + "Email" + ((Work)this).email;
		}
		
	}
}

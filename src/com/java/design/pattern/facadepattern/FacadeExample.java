package com.java.design.pattern.facadepattern;

public class FacadeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeClass facadeClass=new FacadeClass();
		
		System.out.println(facadeClass.BuildIphone());
		System.out.println(facadeClass.BuildAndriodPhonce());
		System.out.println(facadeClass.BuildWindowsPhone());
	}

}

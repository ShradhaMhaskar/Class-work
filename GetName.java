package com.test;

public class GetName {
	public String getName() {
		String name="Shradha";
		return name;
		
	}
	public static void main(String[] args) {
		GetName n=new GetName();
		String result=n.getName();
		System.out.println("My name is : " +result);
	}

}

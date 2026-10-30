package com.test;

public class Multiplication {
	public int multiply(int a,int b) {
		int result=a*b;
		return result;
		
		
	}
public static void main(String[] args) {
	Multiplication m=new Multiplication();
	int ans=m.multiply(5, 15);
	System.out.println("Multiplication = " +ans);
}
}

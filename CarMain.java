package com.test;

public class CarMain {
	public static void main(String[] args) {
		Car c=new Car();
		c.setBrand("Mahindra Thar");
		c.setPrice(1500000.0);
		System.out.println("Car brand is : " +c.getBrand());
		System.out.println("Car price is : " +c.getPrice());
	}

}

package com.test;

public class Product {
	private String productName;
	private double price;
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public String getProductName() {
		return productName;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public double calculateDiscount(double discountRate) {
		return (price*discountRate)/100;
		
	}
	public double calculateFinalPrice(double discountRate) {
		double discount=calculateDiscount(discountRate);
		return price-discount;
	}

}

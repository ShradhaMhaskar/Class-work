package com.test;
import java.util.*;
public class ProductMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		System.out.println("Enter product name :");
		p.setProductName(sc.nextLine());
		System.out.println("Enter product price :");
		p.setPrice(sc.nextDouble());
		System.out.println("Enter discount percentage :");
		double rate=sc.nextDouble();
		
		System.out.println("Product name : " +p.getProductName());
		System.out.println("Product price : " +p.getPrice());
		System.out.println("Discount Amount :" +p.calculateDiscount(10));
		System.out.println("Final price : " +p.calculateFinalPrice(10));
		sc.close();
	}

}

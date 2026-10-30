package com.test;

public class Book {
	String title;
	double price;
	Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public void display() {
		System.out.println("Book title : " +title);
		System.out.println("Book Price : " +price);
	}
	public static void main(String[] args) {
		Book b=new Book("Java Programing" ,500);
		b.display();
		
	}

}

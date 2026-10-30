package com.test;

import Encapsulation.MainClassOfEmp;

public class CheckNumEvenOrOdd {
	public boolean checkNum(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		CheckNumEvenOrOdd c = new CheckNumEvenOrOdd();
		boolean ans = c.checkNum(23);

		System.out.println("Number is : " + ans);

	}

}

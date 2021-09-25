package com.bridgelabz.Day7;

public class PrimeFactor {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Number : ");
		int number = utility.getIntValue();
		utility.primeFactor(number);
	}
}

package com.bridgelabz.Day6;

public class RangePrimeNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter End Number");
		int end = utility.getIntValue();
		utility.primeNumberRange(end);
	}

}

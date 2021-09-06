package com.bridgelabz.Day4;

public class HarmonicNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the Number to Check Harmonic Number");
		int Number = utility.getIntValue();
		utility.getHarmonicNumber(Number);
	}

}

package com.bridgelabz.Day5;

public class FlipCoin {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Number of Filp you want");
		int flip1 = utility.getIntValue();
		utility.flipcoin(flip1);
		

	}

}

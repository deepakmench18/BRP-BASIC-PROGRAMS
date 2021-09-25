package com.bridgelabz.Day8;

public class PalindromeString {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter your String:");
		String str = utility.getStringValue();
		if(utility.palindromeString(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

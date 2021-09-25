package com.bridgelabz.internal.review;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your String:");
		String word = input.nextLine();
		char[] c = word.toCharArray();
		String rev= "";
		for(int i = word.length()-1;i>=0;i--) {
			rev = rev + c[i]; 
		}
		System.out.println(rev);
	}

}



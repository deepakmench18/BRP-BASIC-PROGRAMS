package com.bridgelabz.internal.review;

import java.util.Scanner;

public class ShortestDistanceFirstChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String");
		String word = input.nextLine();
		System.out.println("Enter Char");
		char c = input.next().charAt(0);
		int firstindex = word.indexOf(c);

		System.out.println(firstindex);
	}

}

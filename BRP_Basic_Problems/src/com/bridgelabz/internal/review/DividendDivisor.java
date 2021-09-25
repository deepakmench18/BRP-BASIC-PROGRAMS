package com.bridgelabz.internal.review;

import java.util.Scanner;

public class DividendDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dividend = input.nextInt();
		int divisor = input.nextInt();
		int reminder = dividend % divisor;
		int quotient = dividend/divisor;
		if(3>divisor/2) {
			reminder=0;
			quotient = quotient+1;
		}
		System.out.println(quotient);
	}

}

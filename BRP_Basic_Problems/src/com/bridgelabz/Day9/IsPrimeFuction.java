package com.bridgelabz.Day9;

import java.util.Scanner;

public class IsPrimeFuction {
	
	static boolean getPrime(int N) {
	         if (N <= 1) {
	              return false;
	         }
	         for (int i = 2; i <= Math.sqrt(N); i++) {
	              if (N % i == 0) {
	                 return false;
	              }
	         }
	         return true;
	    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = input.nextInt();
		getPrime(number);
	}

}

package com.bridgelabz.Day9;

import java.util.Scanner;


public class MathFuction {
	
	public static double getharmonicnumber(int N) {
		double HarmonicNumber = 0;
		for(double i=1;i<=N;i++) {
			HarmonicNumber += 1/i;
		}
		return HarmonicNumber;
	}
	public static double getsquareroot(double x) {  
	        // Input positive value, Output square root of x  
	        double result = Math.sqrt(x);
			return result;  
	}
	public static void getBinaryNumber (int N) {
		System.out.println(Integer.toBinaryString(N));
	}
	
	public static double getSine(int a) {  
	        // converting values to radians  
	        double b = Math.toRadians(a);  
	        Math.sin(b);
			return b;  
	}
	public static double getCosine(int a) {  
        // converting values to radians  
        double b = Math.toRadians(a);
        Math.cos(b);
		return b;  
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number to Check Harmonic Number");
		int Number = input.nextInt();
		System.out.println(getharmonicnumber(Number));
		
		System.out.println("Enter the Number to Square Root");
		double c = input.nextDouble();
		System.out.println(getsquareroot(c));
		
		System.out.println("Enter Number to Get Binary");
		int number=input.nextInt();
		getBinaryNumber(number);
		
		
		System.out.println("Enter Number to Get Sine of Number");
		int a=input.nextInt();
		System.out.println(getSine(a));
		
		System.out.println("Enter Number to Get Sine of Number");
		int b=input.nextInt();
		System.out.println(getCosine(b));
		
	}

}

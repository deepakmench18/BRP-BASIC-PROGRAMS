package com.bridgelabz.Day4;

import java.util.Scanner;

public class Utility {
		Scanner scanner;
		public Utility() {
			scanner = new Scanner(System.in);
		}
		public int getIntValue() {
			return scanner.nextInt();
		}
		public void getHarmonicNumber(int N) {
			double HarmonicNumber = 0;
			for(double i=1;i<=N;i++) {
				HarmonicNumber += 1/i;
			}
			System.out.println("Nth Harmonic Number of "+ N + ".=" + HarmonicNumber);
		}
		public static void sqrt(int c) {
	        double epsilon = 1e-15;
	        float t = c;
	        while(Math.abs(t-c/t) > epsilon * t) {
	            t = (float) ((c/t + t)/2);     
	            }
	        System.out.println("Square root of " + c + " = " + t);
		}
		public void tempConversion(int select) {
			
			switch(select) {
			case 1:
				int F = 0;
				System.out.println("**Celsius to Fahrenheit***");
				System.out.println("Enter Celsius");
				int C = getIntValue();
				F = (C * 9/5) + 32;
				System.out.println(F + "   Degree Fehrenheit");
				break;
			case 2:
				int Celsius = 0;
				System.out.println("**Fahrenheit to Celsius***");
				System.out.println("Enter Fahrenheit");
				int Fahrenheit = getIntValue();
				Celsius = (Fahrenheit - 32) * 5/9;
				System.out.println(Celsius + "   Degree Celsius");
				break;
			}
		}
}

package com.bridgelabz.Day4;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Utility utility = new Utility();
		
		System.out.println("1 for Celsius to Fahrenheit");
		System.out.println("2 for Fahrenheit to Celsius");
		int number = utility.getIntValue();
		utility.tempConversion(number);
	}

}

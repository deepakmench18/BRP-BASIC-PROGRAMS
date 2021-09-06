package com.bridgelabz.Day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		int year = sc.nextInt();
		if(year >= 1582) {
			if((year%4 == 0)&& (year%400 == 0) || (year%100 != 0)) {
				System.out.println(year + " is Leap Year");
			}
			else {
				System.out.println(year + " Not Leap Year");
			}
	}
}
}
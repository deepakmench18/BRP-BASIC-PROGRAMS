package com.bridgelabz.Day12;

import java.util.Scanner;

public class BLStdIn {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num = 0;
		System.out.println("Enter an integer followed by a String");
		if (sc.hasNextInt())
			num = sc.nextInt();
		else {
			System.out.println("Input error, program terminating");
			sc.close(); 
			return;
		}
		String str = sc.nextLine();
		System.out.println("integer = " + num + "string = " + "'" + str + "'");
		sc.close(); 
	}

	public static String readAll() {
		return null;
	}

	public static boolean isEmpty() {
		return false;
	}

	public static String readString() {
		return null;
	}

	public static String[] readAllStrings() {
		return null;
	}
}

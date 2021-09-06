package com.bridgelabz.Day2;

import java.util.Scanner;

public class RunTimeError {

	public static void main(String[] args) {
		//Example 1
		int a = 15;
		int b = 0;
		int sum = 0;
		sum = a/b;
		System.out.println(sum);  
		
		//Example 2
		int arr[] = new int [5];
		arr[9] = 250;
		System.out.println("Value is Assigned...!");
	}

}

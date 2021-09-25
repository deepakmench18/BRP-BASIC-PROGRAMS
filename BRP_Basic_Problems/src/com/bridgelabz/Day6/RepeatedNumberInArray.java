package com.bridgelabz.Day6;

import java.util.Scanner;

public class RepeatedNumberInArray {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int[] arr = new int[6];
		System.out.println("Enter the Number");
		for(int i=0;i<arr.length;i++) {
			arr[i]=utility.getIntValue();
		}
		utility.repeatedNumber(arr);
		

	}
}
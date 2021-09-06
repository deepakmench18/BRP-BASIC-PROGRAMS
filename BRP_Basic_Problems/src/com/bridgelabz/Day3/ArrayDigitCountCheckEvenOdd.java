package com.bridgelabz.Day3;

import java.util.Scanner;

public class ArrayDigitCountCheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter Number ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int n = 0, cnt =0;
	    while(arr.length != n){
	        String b = ""+arr[n];
	        cnt = (b.length() % 2 == 0) ? cnt+1:cnt;
	         n+=1;
	    }
	       System.out.println(cnt);
	}
}

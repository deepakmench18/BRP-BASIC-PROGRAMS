package com.bridgelabz.Day2;

import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int large,small,i;
		int arr[] = new int[10]; 
		System.out.println("Enter Element in Array");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		large =small=arr[0];
		for(i=1;i<n;++i)
		{
			if(arr[i]>large) {
				large=arr[i]; 
			}
			if(arr[i]<small) {
				small=arr[i]; 
			}
		}
		System.out.println(large);
		System.out.println(small);
	}
}

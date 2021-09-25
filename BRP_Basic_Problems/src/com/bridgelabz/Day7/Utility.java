package com.bridgelabz.Day7;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
	}
	public void secondLargestSmallestNumberUsingSort() {
		int n=5;
		int[] arr = new int[n];
		int temp=0;
		System.out.println("Enter Number:");
		for(int i=0;i<n;i++) {
			arr[i]= getIntValue();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]);
		}
		System.out.println(arr[1] + " second smallest element ");
		System.out.println(arr[n-2] + " second largest element ");
	}
	
	public void secondLargestSmallestWithoutSort() {
		int n=5;
		int[] arr = new int[n];
		int temp=0;
		System.out.println("Enter Number:");
		for(int i=0;i<n;i++) {
			arr[i]= getIntValue();
		}
		int max1,max2;
		max1=max2=0;
		for(int i=0;i<n;i++) {
			if(max1<arr[i]) {
				max2=max1;
				max1=arr[i];
				//System.out.println(max1 + "   max1  ");
			}
			if(max2<arr[i] && arr[i]<max1) {
				max2=arr[i];
				//System.out.println(max2 + "   max2");
			}
		}
		System.out.println("Max1" + max1);
		System.out.println("Max2" + max2);
	}
	
	public void primeFactor(int number) {
		for(int i=2;i<number;i++) {
			while(number%i==0) {
				System.out.println(i + " ");
				number = number/i;
			}
		}
		
		if(number>2) {
			System.out.println(number);
		}
	}

	public void integerToBinary(int number) {
		int[] arr = new int[30];
		int i=0;

		while(number>0) {
			arr[i++]=number%2;
			number=number/2;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]);
		}
	}
	
}

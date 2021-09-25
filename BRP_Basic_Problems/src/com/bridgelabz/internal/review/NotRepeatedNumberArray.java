package com.bridgelabz.internal.review;

import java.util.Scanner;

public class NotRepeatedNumberArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = input.nextInt();
		int sum=0;
		System.out.println("Enter your Number");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}

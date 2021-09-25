package com.bridgelabz.internal.review;

import java.util.Scanner;

public class DegreeOfArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = input.nextInt();
		int count=0;;
		System.out.println("Enter your Number");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]>arr[j]) {
					max=arr[i];
					break;
				}
			}
			if(max==arr[i]) {
				count++;
			} 
		}
		System.out.println(count);
	}

	}



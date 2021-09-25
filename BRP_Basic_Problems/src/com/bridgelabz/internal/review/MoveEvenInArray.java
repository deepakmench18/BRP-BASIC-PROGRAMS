package com.bridgelabz.internal.review;

import java.util.Scanner;

public class MoveEvenInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length of array");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Number in Array");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		
		int temp=0;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[j]%2==0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}		
		
	}
}

package com.bridgelabz.program;

import java.util.Scanner;

public class SortArrayDecending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20]; 
		int temp=0;
		System.out.println("Enter Your Array Length");
		int n = sc.nextInt();
		System.out.println("Enter your Number : ");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + " ");
		}

	}

}

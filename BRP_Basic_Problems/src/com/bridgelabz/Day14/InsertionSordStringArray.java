package com.bridgelabz.Day14;

import java.util.Scanner;

public class InsertionSordStringArray {

	public static void insertionSort(String[] str) {
		for(int i=0;i<str.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(str[j].compareTo(str[j-1])<0) {
					String temp = str[j];
					str[j]=str[j-1];
					str[j-1]=temp;
				}
			}
		}
		
		for(String c: str) {
			System.out.println(c);
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = input.nextInt();
		String[] str = new String[n];
		System.out.println("Enter your String elements");
		for(int i=0;i<n;i++) {
			str[i]=input.nextLine();
		}
		insertionSort(str);

	}

}

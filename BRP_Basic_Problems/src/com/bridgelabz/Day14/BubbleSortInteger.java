package com.bridgelabz.Day14;

import java.util.Scanner;

public class BubbleSortInteger {

	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = {88,5,41,45,8,61};
		bubbleSort(arr);
		for(int n : arr) {
			System.out.println(n);
		}

	}

}

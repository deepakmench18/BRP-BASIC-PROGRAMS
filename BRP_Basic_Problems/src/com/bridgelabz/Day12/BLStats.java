package com.bridgelabz.Day12;

import java.util.Arrays;
import java.util.Scanner;

public class BLStats {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of an array you want to store: ");
		int n  = sc.nextInt();		
		int[] arr = new int[10];
		System.out.println("Enter the elements of an array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			int left = 0;
			int right = arr.length - 1;
			int even = 0;
			Arrays.sort(arr);
			while(left < right)
			{
				left++;
			}
			System.out.println(Arrays.toString(arr));
		}
	}		
}

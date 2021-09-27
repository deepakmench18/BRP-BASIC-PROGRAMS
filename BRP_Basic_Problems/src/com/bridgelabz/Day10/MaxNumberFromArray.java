package com.bridgelabz.Day10;

import java.util.Scanner;

public class MaxNumberFromArray {
	
	public static double arrayMax(double[] arr) {
	    double max = Double.NEGATIVE_INFINITY;

	    for(double cur: arr)
	        max = Math.max(max, cur);

	    return max;
	}
	public static double arrayMin(double[] arr) {
		double min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] arr = new double[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = input.nextDouble();
		}
		System.out.println(arrayMax(arr));
		System.out.println(arrayMin(arr));
	}

}

package com.bridgelabz.internal.review;
import java.util.Scanner;
import java.util.*;
public class SortArraySquare {
	
	static int[] sortArray(int[] arr) {
		int temp=0;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	static int[] sortArraySquare(int[] arr) {
		int[] arr1 = new int[5];
		for(int i=0;i<5;i++) {
			arr1[i] = arr[i]*arr[i];
		}
		return arr1;
	}

	public static void main(String[] args) {
		
		int[] arr = {-4,-1,0,3,10};
		arr = SortArraySquare.sortArray(arr);
		arr =  SortArraySquare.sortArraySquare(arr);
		arr = SortArraySquare.sortArray(arr);
     	for(int i=0;i<5;i++) {
     		System.out.println(arr[i]);
		}
     	
	}

}
package com.bridgelab.program.Day13;

import java.util.Scanner;

public class Utility {
	Scanner input;
	
	public Utility() {
		input = new Scanner(System.in);
	}
	
	public int getIntInput() {
		return input.nextInt();
	}
	
	public String getStringInput() {
		return input.nextLine();
	}
	
	public int[] getInputArray(int size) {
		System.out.println("Enter Number in array");
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		return arr;
	}
	
	public String[] getStringArray(int size) {
		System.out.println("Enter String in array");
		String[] word = new String[size];
		for(int i=0;i<word.length;i++) {
			word[i]=input.nextLine();
		}
		return word;
	}
	
	public int binarysearchInt(int[] arr,int key) {
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				end=mid-1;
			} else {
				start = mid+1;
			}
		}
	    return -1;
	}
	
	public int binarysearchString (String[] word,String key) {
		int first =0;
		int last = word.length;
		
		while(first<last) {
			int mid = (first+last)/2;
			if(key.compareTo(word[mid]) < 0) {
				last = mid;
			} else if (key.compareTo(word[mid]) > 0) {
				first = mid+1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
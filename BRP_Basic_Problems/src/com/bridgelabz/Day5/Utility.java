package com.bridgelabz.Day5;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
	}
	
	public void notRepeateableNumber(int arr[]) {
		System.out.println("Enter the Number");
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=getIntValue();
		}
		for(int i=0;i<arr.length;i++) {
			count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i] + "is Not  repeated");
			} 
		}
	}
	
	public void flipcoin(int flip) {
		int count=0,count1=0,coin=0,temp=0;
		temp=flip;
		while(flip!=0) {
			coin = (int) Math.floor(Math.random()*2);
			if(coin == 1) {
				count++;
			}else {
				count1++;
			}
			flip--;
		}
		
		System.out.println(count);
		System.out.println(count1);
		
	}
	
	public void powerOfTwo(int n) {
		int x=1;
		for(int i=0;i<n;i++) {
			x= 2*x;
			System.out.println(x);
		}
	}

}

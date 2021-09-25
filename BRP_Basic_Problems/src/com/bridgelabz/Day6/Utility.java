package com.bridgelabz.Day6;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
	}
	public void repeatedNumber(int arr[]) {
		int n =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					 System.out.println(arr[i] + "Repeated Number");
				}
			}
		}
		
	}
	public void rolldie() {
		int cnt=0,count=0;
		int n=10;
		while(n>0) {
			int dice = (int) Math.floor(Math.random()*6);
			if(dice==1) {
				count++;
			}
			if(dice==6) {
				cnt++;
			}
			n--;
		}
		if(count>cnt) {
			System.out.println("1 is Maximum");
		} else {
			System.out.println("6 is Maximum");
		}
	}
	
	public void primeNumberRange(int end) {
		int flag=0;
		for(int i=2;i<=end;i++) {
			flag=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					flag=flag+1;
				}
			}
			if(flag==2) {
				System.out.println(i);
			}
		}
	}
}

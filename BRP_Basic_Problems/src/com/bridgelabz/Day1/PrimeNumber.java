package com.bridgelabz.Day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int n = sc.nextInt();
		int flag=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				System.out.println(n + "is not Prime Number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(n + "is Prime Number");
		}
		
	}

}

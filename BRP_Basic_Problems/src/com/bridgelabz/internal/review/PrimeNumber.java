package com.bridgelabz.internal.review;

import java.util.Scanner;

interface Prime {
	void prime(int number);
}

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		Prime p;
		p= (x) -> {
			for(int j=1;j<number;j++) {
				int flag=0;
				for(int i=2;i<j;i++) {
					if(j%i==0) {
						flag=1;
						break;
					}
				}
				
				if(flag==0) {
					System.out.println("Number is prime :" + j );
				}
			};
		};
		p.prime(number);
	}

}

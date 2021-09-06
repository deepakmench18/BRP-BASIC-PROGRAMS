package com.bridgelabz.Day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 =0 ,n2=1,n3=0;
		int number= sc.nextInt();
		for(int i=0;i<number;i++) {
			n3=n2+n1;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}
}
}

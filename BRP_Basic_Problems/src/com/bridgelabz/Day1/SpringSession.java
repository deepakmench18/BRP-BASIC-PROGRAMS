package com.bridgelabz.Day1;

import java.util.Scanner;

public class SpringSession {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month in Number :");
		int m = sc.nextInt();
		System.out.println("Enter Day in Number :");
		int d = sc.nextInt();
		if( (d>=20 && d<=31 && m==3) || ( d<=30 && m==4) || (d<=31 && m==5) || (d<=20 && m==6) && d!=0 && m!=0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}

package com.bridgelabz.internal.review;

import java.util.Scanner;

public class CricketMatchRun {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=0,sum=0;
		while(n<=6) {
			int run = (int) Math.floor(Math.random()*6+1);
			if(run==5) {
				continue;
			}
			System.out.print(run+"  ");
			sum=sum+run;
			System.out.println(sum);
			n++;
		}
		System.out.println(sum);	
	}
}
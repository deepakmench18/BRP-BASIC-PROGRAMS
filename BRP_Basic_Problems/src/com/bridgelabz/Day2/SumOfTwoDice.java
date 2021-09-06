package com.bridgelabz.Day2;

public class SumOfTwoDice {

	public static void main(String[] args) {
		int a = (int) Math.floor(Math.random()*(6-1+1)+1);
		int b = (int) Math.floor(Math.random()*(6-1+1)+1);
		int sum = 0;
		sum = a+b;
		System.out.println(sum);
	}

}

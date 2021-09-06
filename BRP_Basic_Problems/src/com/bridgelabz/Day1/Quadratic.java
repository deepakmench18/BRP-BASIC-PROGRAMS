package com.bridgelabz.Day1;

import java.util.Scanner;
import java.lang.Math;
public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b = sc.nextInt();
		System.out.println("Enter c value :");
		int c = sc.nextInt();
		int delta = 0;
		double x1 = 0;
		double x2 = 0;
		delta = (b*b - 4*a*c);
		System.out.println(delta);
		double d = Math.sqrt(delta);
		x1 = ((-b + d)/(2*a));
		x2 = ((-b - d)/(2*a));
		System.out.println(x1);
		System.out.println(x2);
	}

}

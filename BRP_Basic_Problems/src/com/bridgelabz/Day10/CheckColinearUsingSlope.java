package com.bridgelabz.Day10;

import java.util.Scanner;

public class CheckColinearUsingSlope {
	
		static boolean checkColinear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 :");
		int x1 = input.nextInt();
		System.out.println("Enter y1 :");
		int y1 = input.nextInt();
		System.out.println("Enter x2 :");
		int x2 = input.nextInt();
		System.out.println("Enter y2 :");
		int y2 = input.nextInt();
		System.out.println("Enter x3 :");
		int x3 = input.nextInt();
		System.out.println("Enter y3 :");
		int y3 = input.nextInt();
		
		int AB = (y2-y1)/(x2-x1);
		int BC = (y3-y2)/(x3-x2);
		int AC=0;
		if(AB==BC)
			return true;
		else
			return false;
			
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(checkColinear());
		
	}

}

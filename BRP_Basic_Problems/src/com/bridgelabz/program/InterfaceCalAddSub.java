package com.bridgelabz.program;

import java.util.Scanner;

//Create an interface for calculator method add,subtract,multiply,divide and try to
// create a practical calculator it should take user input to stop operations.
interface Operations {
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
	public void square(int a);
	public void squareroot(int a);
	public void cube(int a);
}
class A implements Operations {
	@Override
	public void add(int a,int b) {
		System.out.println("Add of  "+a+" and "+b+" is  "+ (a+b));
		
	}
	@Override
	public void sub(int a,int b) {
		System.out.println("Sub of "+a+" and "+b+" is  "+ (a-b));
	}
	@Override
	public void mul(int a,int b) {
		System.out.println("Mul of "+a+" and "+b+" is  "+ (a*b));
	}
	@Override
	public void div(int a,int b) {
		System.out.println("Div of "+a+" and "+b+" is  "+ (a/b));
	}
	@Override
	public void square(int a) {
		System.out.println("Square of "+ a + " is" + (a*a));
	}
	@Override
	public void squareroot(int a) {
		System.out.println("Square of "+ a + " is" + Math.sqrt(a));
	}
	@Override
	public void cube(int a) {
		System.out.println("Square of "+ a + " is" + (a*a*a));
	}
}

public class InterfaceCalAddSub {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		A obj = new A();
		int selection = 0;
		while(selection !=8) {
			System.out.println("      ");
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Substraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			System.out.println("Enter 5 for Square");
			System.out.println("Enter 6 for Square Root");
			System.out.println("Enter 7 for Cube");
			System.out.println("Enter 8 for exit");
			System.out.println("      ");
			selection = input.nextInt();
			
			switch(selection) {
			
				case 1:
					System.out.println("Enter First Number:");
					int a = input.nextInt();
					System.out.println("Enter Second Number:");
					int b = input.nextInt();
					obj.add(a, b);
					break;
				case 2:
					System.out.println("Enter First Number:");
					int x = input.nextInt();
					System.out.println("Enter First Number:");
					int y = input.nextInt();
					obj.sub(x, y);
					break;
				case 3:
					System.out.println("Enter First Number:");
					int l = input.nextInt();
					System.out.println("Enter First Number:");
					int m = input.nextInt();
					obj.mul(l, m);
					break;
				case 4:
					System.out.println("Enter First Number:");
					int s = input.nextInt();
					System.out.println("Enter Second Number:");
					int t = input.nextInt();
					obj.div(s, t);
					break;
				case 5:
					System.out.println("Enter Number:");
					int c = input.nextInt();
					obj.square(c);
					break;
				case 6:
					System.out.println("Enter Number:");
					int d = input.nextInt();
					obj.squareroot(d);
					break;
				case 7:
					System.out.println("Enter Number:");
					int z = input.nextInt();
					obj.cube(z);
					break;
			}
		}
	}

}

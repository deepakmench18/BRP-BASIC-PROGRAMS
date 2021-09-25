package com.bridgelabz.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@FunctionalInterface
interface MyInterface {
	double getPiValue();
}
*/
@FunctionalInterface 
interface MyInterface {
	String reverse(String n);
}
public class LambdaExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		MyInterface ref;
		ref= () -> 3.1415;
		System.out.println(ref.getPiValue());
		*/
		MyInterface ref = (str) -> {
			String result = "";
			for(int i =str.length()-1;i>=0;i--) 
				result +=str.charAt(i);
				return result;
		};
		System.out.println(ref.reverse("Lambda"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

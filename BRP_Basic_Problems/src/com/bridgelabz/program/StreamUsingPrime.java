package com.bridgelabz.program;

import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamUsingPrime {
	/*
	public static boolean isPrime(int number) {
		for(int i=2;i<number/2;i++) {
			if(number % i ==0) {
				return false;
			}
		}
		return true;
	}
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List list = new ArrayList();
		//1,2,4,5,7,11,13,17,19,23,29,31,37
		int n = 8;
		for(int i=0;i<n;i++) {
			int x = input.nextInt();
			list.add(x);
		}
		System.out.println(
		list.stream().filter(i->i%2==0).collect(Collectors.toList()));
	
	}
		

}

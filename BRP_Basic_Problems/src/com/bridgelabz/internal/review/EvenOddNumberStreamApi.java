package com.bridgelabz.internal.review;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EvenOddNumberStreamApi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first = input.nextInt();
		int end = input.nextInt();
		IntStream.range(first,end+1).filter(i -> i%2==0).forEach(System.out::println);
		IntStream.range(first, end+1).filter(i -> i%2 !=0).forEach(System.out::println);
		Stream.iterate(first,i -> i+1).filter(i -> i%2==0).limit(end/2).forEach(System.out::println);
		
	}

}

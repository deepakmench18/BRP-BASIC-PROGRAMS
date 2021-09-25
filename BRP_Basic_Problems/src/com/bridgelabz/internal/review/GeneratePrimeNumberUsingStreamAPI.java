package com.bridgelabz.internal.review;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.IntStream;

public class GeneratePrimeNumberUsingStreamAPI {

	public static boolean isPrime(int number) {
		return number>1 && IntStream.rangeClosed(2, number).noneMatch(i -> number%i == 0);
	}
	public static List<Integer> primeNumberInRange(int start,int end) {
		return IntStream.rangeClosed(start, end).filter(i -> isPrime(i)).boxed().collect(Collectors.toList());
	}
	public static List<Integer> primeNumber(int num) {
		return IntStream.rangeClosed(2, num).filter(i -> isPrime(i)).boxed().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(primeNumberInRange(10,100));
		System.out.println(primeNumber(100));

	}
}

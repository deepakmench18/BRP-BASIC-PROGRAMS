package com.bridgelabz.Day15;

public class Exception {

	public static void main(String[] args) {
		int a=0;
		try {
			a=7/0;
		} finally {
			System.out.println("Finally executed");
		}

	}

}

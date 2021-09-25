package com.bridgelabz.Day8;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public String getStringValue() {
		return scanner.next();
	}
	public void isAnagram(String str1,String str2) {
		String s1 = str1.replace("\\s","");
		String s2 = str2.replace("\\s","");
		boolean status = true;
		if(s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1,ArrayS2);
		}
		if(status) {
			System.out.println(s1 + " and " + s2 + "are anagrams");
		}
		else {
			System.out.println(s1 + " and " + s2 + "are not anagrams");
		}
	}
	
	public boolean palindromeString(String str) {
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}

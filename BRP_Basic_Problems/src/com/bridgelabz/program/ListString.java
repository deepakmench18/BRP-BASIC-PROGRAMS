package com.bridgelabz.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		List list = new ArrayList();
		int n = 5;
		
		for(int i=0;i<n;i++) {
			String a = input.next();
			list.add(a);
		}
		//System.out.println(list);
		 
		 */
		int x = 5;
		String arr[] = new String[x];
		
		for(int i=0;i<x;i++) {
			arr[i] = input.nextLine();
		}
		
		/*
		String temp="";
		for(int i=0;i<x;i++) {
			for(int j=i+1;j<x;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp=arr[i];
					arr[i]= arr[j];
					arr[i]=temp;
				}
			}
		}
		*/
		//for(String a:arr) {
			//System.out.println(a);
		//}
		Arrays.stream(arr).sorted().forEach(System.out::println);
		//Arrays.stream(arr).forEach(System.out::println);
	
	// list.stream().sorted().forEach(System.out::println);
	 
	// list.stream().
	
}
}

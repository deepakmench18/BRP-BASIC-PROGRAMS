package com.bridgelabz.program;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class SumOfNumberUsingStream {

	public static void main(String[] args) {
		//Using Stream
		List<Integer> list = new ArrayList<Integer>();
	
		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		Integer sum = list.stream().collect(Collectors.summingInt(Integer:: intValue));
		System.out.println(sum);
		//Without using Stream 
		int result=0;
		for(int i=1;i<=100;i++) {
			result = result + i;
		}
		System.out.println(result);

	}

}

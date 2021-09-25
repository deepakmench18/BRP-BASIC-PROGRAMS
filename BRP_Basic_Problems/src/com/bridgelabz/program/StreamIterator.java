package com.bridgelabz.program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i =1;i<=100;i++) {
			list.add(i);
		}
		Iterator<Integer> it = list.iterator();
		int sum=0;
		while(it.hasNext()) {
			int num = it.next();
			if(num > 10) {
				sum += num;
			}
		}
		System.out.println(sum);
	}

}

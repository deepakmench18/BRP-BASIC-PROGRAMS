package com.bridgelab.program.Day13;

public class BinarySearch {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Int Array Size");
		int size = utility.getIntInput();
		int[] arr = utility.getInputArray(size);
		System.out.println("Enter your Search element");
		int target = utility.getIntInput();
		int p = utility.binarysearchInt(arr,target);
		if(p==-1)
		{
			System.out.println();
			System.out.println("Not Found");
		}
		else
		{
			System.out.println();
			System.out.println("Found at "+p+" position");
		}

	}

}

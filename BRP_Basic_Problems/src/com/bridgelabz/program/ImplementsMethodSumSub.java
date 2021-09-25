package com.bridgelabz.program;


interface Operation {
	
	public void add(int a,int b);

}
/*
class TwoOperation implements Operation {
	public void add(int a,int b) {
		System.out.println("a" + "b" + (a+b));
	}
//	public void sub(int a,int b) {
//		System.out.println("a" + "b" + (a-b));
//	}
}
*/
public class ImplementsMethodSumSub {

	public static void main(String[] args) {
		//Operation operation = new TwoOperation();
	//	operation.add(20, 30);
	//	operation.sub(50,20);
		Operation ops;
		ops = (a,b) -> System.out.println(a+b);
		ops.add(50,60);
		ops = (a,b) -> System.out.println(a-b);
		ops.add(50,60);
	}

}

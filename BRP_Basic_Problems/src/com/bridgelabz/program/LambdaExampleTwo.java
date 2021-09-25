package com.bridgelabz.program;
@FunctionalInterface
interface Cab1 {
	//public void bookcab(String source,String destination);
	public String bookcab(String source,String destination);
}

//class Uber implements Cab1 {
//	public void bookcab(String source,String destination) {
//		System.out.println("Cab is Booked From   "+source + "   to  "+destination);
//	}
//}


public class LambdaExampleTwo {

	public static void main(String[] args) {
		//Cab1 drive = new Uber();
		 
		//Cab1 drive = (source,destination) -> System.out.println("Cab is Booked From   "+source + "   to  "+destination);
		Cab1 drive = (source,destination) -> {
			return source + " "+ destination;
		};
		System.out.println(drive.bookcab("Solapur","Pune"));
		//drive.bookcab("Solapur","Pune");
	}

}

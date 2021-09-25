package com.bridgelabz.program;

@FunctionalInterface
interface Cab 
{
	public void bookcab();
}

class Ola implements Cab {
	public void bookcab() {
		System.out.println("Ola is booked........");
	}
}
public class LambdaExample {

	public static void main(String[] args) {
		Cab ola = new Ola();
		//This is Lambda Expression
		//Cab ola;
		//ola = () -> System.out.println("Ola is Booked...");
		ola.bookcab();
	}

}

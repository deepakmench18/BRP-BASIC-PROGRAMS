package com.bridgelabz.program;

public class SumofPrime {

	
	public static void main(String[] args) {
			int flag=0,sum=0;
			for(int i=2;i<=100;i++) {
				flag=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						flag=flag+1;
					}
				}
				if(flag==2) {
					System.out.println(i);
					sum=sum+i;
				}	
			}
			System.out.println(sum);
	}
}

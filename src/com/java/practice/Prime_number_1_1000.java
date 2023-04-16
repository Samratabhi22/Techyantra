package com.java.practice;

public class Prime_number_1_1000 {
public static void main(String [] args) {
	int num=1000;
	boolean flag=false;
	for(int i=2;i<=1000;i++) {
		if(num%i!=0) {
			System.out.println("prime number"+i);
		}
	}
	
		}

}

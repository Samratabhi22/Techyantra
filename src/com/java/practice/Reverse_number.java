package com.java.practice;

public class Reverse_number {
public static void main(String[] args) {
	int num=785;
	
	int sum=0;
	while(num>0) {
		int r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	System.out.println(sum);
}
}

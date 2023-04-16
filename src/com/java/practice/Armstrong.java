package com.java.practice;

public class Armstrong {
public static void main(String [] args) {
	int num =370;
	int r=0;
	int sum=0;
	int temp=num;
	while(num>0) {
		r=num%10;// remainder
		sum =sum+r*r*r;//here temp =no .of digit in a number
		num=num/10;//quitent
	}
	if(sum==temp) {
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("Not Armstrong number");
	}
}
}

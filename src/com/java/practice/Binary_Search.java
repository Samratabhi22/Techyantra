package com.java.practice;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {10,18,20,30,80,90,100};
int num=18;
int l=0,h=a.length-1;
boolean flag=false;
while(l<h) {
	int m=(l+h)/2;
	if(num==a[m]) {
		flag=true;
		System.out.println("your number found at a["+m+"]");
		break;
	}
	else if(num>a[m]) {
		l=m+1;
	}
	else {
		h=m-1;
	}
	}
if(flag==false) {
	System.out.println("your number not found");
}
	}
}

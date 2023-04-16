package com.java.practice;

public class Reverse_sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome to geeksforgeeks";
String [] str1=str.split(" ");
for(int i=str1.length-1;i>=0;i--) {
	System.out.print(str1[i]+" ");
}
	}

}

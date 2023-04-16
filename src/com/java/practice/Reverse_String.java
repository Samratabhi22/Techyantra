package com.java.practice;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="anjali";//0,1,2,3,4

		String rev="";

		for(int i=str.length()-1;i>=0;i--) {
		rev=rev + str.charAt(i);
		}
	
		System.out.println(rev);
	}

}

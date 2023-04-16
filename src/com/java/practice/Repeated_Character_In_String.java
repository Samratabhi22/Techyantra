package com.java.practice;

import java.util.Scanner;

public class Repeated_Character_In_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
String [] str1=str.split("");
for(int i=0;i<str1.length;i++) {
	for(int j=i+1;j<str1.length;j++) {
		if(str1[i].equalsIgnoreCase(str1[j])) {
			System.out.println(str1[j]);
		}
	}
}

	}

}

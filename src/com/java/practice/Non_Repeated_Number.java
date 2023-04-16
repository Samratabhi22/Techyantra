package com.java.practice;

import java.util.Scanner;

public class Non_Repeated_Number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="Bhaiyabsingh";
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		
		String [] str1=str.split("");
		for(int i=0;i<str1.length;i++) {
			int count=0;
			for(int j=i+1;j<str1.length;j++) {
				count=0;
				if(str1[i].equalsIgnoreCase(str1[j])) {
					//System.out.println(str1[j]);
					
				count++;
				break;
				}
				
			}
				
				if(count==0) {
					System.out.println(str1[i]);
				}
				}
				
			}
			
			
		
	}



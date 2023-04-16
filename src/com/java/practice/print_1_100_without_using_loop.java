package com.java.practice;

public class print_1_100_without_using_loop {
	public static void fun(int n){
		
		if (n >0) {
		   fun(n-1);
		    System.out.println(n); 
		  
		  }
		
	}


	public static void main(String [] args) {
		fun(100);
		
}}
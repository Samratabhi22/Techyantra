package com.java.practice;

public class Dublicate_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {45,20,45,656,452,75,75};

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}

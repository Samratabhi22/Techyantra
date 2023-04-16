package com.java.practice;

public class Array_element_least_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {20,45,78,656,452,75,96};
int max=arr[0];
int min=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
	if(arr[i]<min) {
		min=arr[i];
	}
}
System.out.println(max);
System.out.println(min);
	}

}

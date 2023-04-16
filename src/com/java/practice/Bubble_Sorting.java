package com.java.practice;

public class Bubble_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {10,8,12,18,5,3};
System.out.println("before sorting");
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
//bubble sorting
for(int i=0;i<a.length;i++ ){
for(int j=i+1;j<a.length;j++) {
//for(int i=0;i<a.length-1;i++) {
//	for(int j=0;j<a.length-1-i;j++) {
//		if(a[j]>a[j+1]) {
//			int temp=a[j];
//			a[j]=a[j+1];
//			a[j+1]=temp;
	
	if(a[i]>a[j])
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	
	
	
		}
	}
}

System.out.println("After sorting");
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}

}

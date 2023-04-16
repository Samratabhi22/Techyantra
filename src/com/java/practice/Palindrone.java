package com.java.practice;

import java.util.Arrays;

public class Palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="a";//0,1,2,3,4

String rev="";

for(int i=str.length()-1;i>=0;i--) {
rev=rev + str.charAt(i);
}
System.out.println(str);
System.out.println(rev);




if(rev.equals(str)) {//equals check the content
	System.out.println(" string is palindrone");
}
else {
	System.out.println(" string is not  palindrone");
}

	}

}

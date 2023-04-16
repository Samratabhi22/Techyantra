package com.java.practice;

import java.util.Scanner;

public class Prime_number_or_not {
	
	public static void sumprime(int k) {
		int count=0;  
		//the loop executes 100 time and increments the variable number by 1 after each iteration  
		//for(int number = 7; number <= k; number++)  
		//{  
		//count = 0;  
		for (int i = 2; i <= k/2; i++)  
		{  
		//find the remainder and check if it is equal to 0 or not      
		if(k % i == 0)  
		{  
		//increments the count variable by 1 if the above condition returns true  
		count++;  
		break;  
		} //end of if statement   
		} //end of for loop  
		//returns true if both conditions are true  
		if(count == 0 && k != 1 )  
		{  
		//calculates the sum of prime numbers  
			System.out.println("prime number "+k);
	//	sum = sum + number;  
		}
		else {System.out.println("Not a prime number "+k);
		//end of if statement   
		}  //end of for loop  
		//prints the sum 
		
	}
		public static void  main(String [] args) {
			Scanner sc =new Scanner (System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			sumprime(n);
		//System.out.println("The Sum of Prime Numbers from 1 to 200 is: " + sum);  
		
	}




	


}

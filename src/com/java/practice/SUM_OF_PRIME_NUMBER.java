package com.java.practice;

public class SUM_OF_PRIME_NUMBER {
	
	
	public static int sumprime(int k) {
		int count, sum=0;
		//the loop executes 100 time and increments the variable number by 1 after each iteration  
		for(int number = 1; number <= k; number++)  
		{  
		  count=0;
		for (int i = 2; i <= number/2; i++)  
		{  
		//find the remainder and check if it is equal to 0 or not      
		if(number % i == 0)  
		{  
		//increments the count variable by 1 if the above condition returns true  
		count++;
			break;
		}
		}//end of if statement  
if(count==0&&number!=1) {
			sum=sum+number;
		}
		
		//returns true if both conditions are true  
		
		}  //end of for loop  
		//prints the sum 
		return sum;
	}
		public static void  main(String [] args) {
			System.out.println(sumprime(5));
		//System.out.println("The Sum of Prime Numbers from 1 to 200 is: " + sum);  
		
	}

}

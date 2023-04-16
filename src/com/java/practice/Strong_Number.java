package com.java.practice;

public class Strong_Number {

	public static void main(String[] args) {
		int num=14;
		int originalNum=num;
		int sum=0;
		int rem=0;
		// TODO Auto-generated method stub
		while (num>0)//145>0  14>0 1>0
        {
            rem=num%10;
            //System.out.println("Reminder : "+rem);
        int    fact=1;
            for(int i=2;i<=rem;i++){
                fact=fact*i;
            }
            //System.out.println("fact : "+fact);
          sum=sum+fact;
            num=num/10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is STRONG NUMBER");
        } else {
            System.out.println(originalNum + " is not a STRONG NUMBER");
        }
    
	}

}

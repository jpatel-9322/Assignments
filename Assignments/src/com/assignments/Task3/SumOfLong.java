package com.assignments.Task3;

import java.util.Scanner;

public class SumOfLong {
		
		public static int countDigit(long n) 
	    { 
	        return (int)Math.floor(Math.log10(n) + 1); 
	    } 
		public static long digitSum(long n) 
		{
			if (n == 0)
			{
				return 0;
			}
			return n%10 + digitSum(n/10);
		}
		
		public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the value of long: ");
			long val=input.nextLong();
			
	        System.out.println("Number Of digits: "+countDigit(val)); 
	        System.out.println("Sum Of all digits: "+digitSum(val));
		}
	}



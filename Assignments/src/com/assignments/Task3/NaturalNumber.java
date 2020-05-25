package com.assignments.Task3;

import java.util.Scanner;

public class NaturalNumber {
	
		public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			System.out.print("Enter how many numbers you want to add : ");
			int no=input.nextInt();
			int sum=0;
			for(int i=1;i<=no;i++)
			{
				int number=input.nextInt();
				if(number>=0)
				{
				sum+=number;
				}
			}
			System.out.println("sum:"+sum);
		}


}

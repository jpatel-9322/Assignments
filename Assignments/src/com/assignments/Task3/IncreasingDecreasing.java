package com.assignments.Task3;

import java.util.Scanner;

public class IncreasingDecreasing {

		public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			System.out.print("Input first number:");
			int no1=input.nextInt();
			
			System.out.print("Input second number:");
			int no2=input.nextInt();
			
			System.out.print("Input third number:");
			int no3=input.nextInt();
			
			if(no1<no2 && no2<no3)
			{
				System.out.println("Incresing");
			}
			else if(no1>no2 && no2>no3)
			{
				System.out.println("Decreasing");
			}
			else
			{
				System.out.println("Neigther Incresing or decreasing order");
			}
			
		}

}

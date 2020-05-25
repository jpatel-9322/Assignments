package com.assignments.Task3;

import java.util.Scanner;

public class OperationLoop {
	 
		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);
			int sum = 0;
			for (int i = 1; i <= 10; i += 1)
			{
				System.out.println("Enter the  "+ i + " number :");
				sum += input.nextInt();
			}
			System.out.println("The total sum is: " + sum );
			System.out.println(" The Average ");
		}
	}



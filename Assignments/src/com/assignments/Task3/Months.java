package com.assignments.Task3;

import java.util.Scanner;

public class Months {
	
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the value:");
			int month=input.nextInt();
			if((month%2 == 0 || month == 9 || month==11) && month<=12)
			{
				if(month == 2)
				{
					System.out.println(28 +" OR "+ 29);
				}
				else if(month == 8 || month == 10 || month ==12)
				{
					System.out.println(31);
				}
				else
				{
					System.out.println(30);
				}
			}
			else if(month >12)
			{
					System.out.println("Invalid details");
				}
			else
			{
					System.out.println(31);
				}
			
		}


}

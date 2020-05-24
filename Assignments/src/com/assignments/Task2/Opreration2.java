package com.assignments.Task2;

import java.util.Scanner;

public class Opreration2 {
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the value of number: ");
			int num=input.nextInt();
			
			if((num%3) == 0 && (num%5) == 0)
			{
				System.out.println("\nConsultadd JAVA Training");
			}
			else if(num%3 == 0)
			{
				System.out.println("\nConsultadd");
			}
	
			else if(num%5 == 0)
				{
					System.out.println("\nJAVA Training");
				}
		}
	}



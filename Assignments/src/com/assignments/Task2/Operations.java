package com.assignments.Task2;

import java.util.Scanner;

public class Operations {
 
		public static void main (String [] args)
		{
			Scanner input = new Scanner (System.in);
			System.out.print("Enter the value of number 1: ");
			int first=input. nextInt();
			
			System.out.print("Enter the value of number 2:");
			int second = input. nextInt();	
			int choice;
			
			do {
				
				System.out.println("\n1 - Addition");
				System.out.println("2 - Subtraction");
				System.out.println("3 - Division");
				System.out.println("4 - Multiplication");
				System.out.println("5 - Average");
				System.out.print("Enter your choice:");
				choice=input. nextInt();
				switch(choice)
				{
					case 1:
					int sum=first+second;
					System.out.println("Addition: "+sum);
					if(sum<0){
						System.out.println("Oops option X(Adtion) is returning the negative number");
					}
					break;
					
					case 2:
					int subtract=first-second;
					System.out.println("Subtraction: "+subtract);
					if(subtract<0){
						System.out.println("Oops option X(Subtraction) is returning the negative number");
					}
					break;
					
					case 3:
					float division=first/second;
					System.out.println("Division: "+division);
					if(division<0){
						System.out.println("Oops option X(Division) is returning the negative number");
					}
					break;
					
					case 4:
					int multiplication=first*second;
					System.out.println("Multiplication: "+multiplication);
					if(multiplication<0){
						System.out.println("Oops option X(Multiplication) is returning the negative number");
					}
					break;
					
					case 5:
					float ave=((first+second)/2);
					System.out.println("Average: "+ave);
					if(ave<0){
						System.out.println("Oops option X(Average) is returning the negative number");
					}
					break;
					
					default:
					break;
				}
			}while(choice<0);
		}
		
	}



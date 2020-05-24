package com.assignments.Task2;

import java.util.Scanner;

public class ConditionalAction {

		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the value of number: ");
			int num=input.nextInt();
			if(num%2!=0)
			{
				System.out.println("NEW");
			}
			else{
				if(num>=2 && num<=5){
					System.out.println("OLD");
				}
				else if(num>=6 && num<=30){
					System.out.println("NEW");
				}
				else{
					System.out.println("OLD");
				}
			}
		}
	}



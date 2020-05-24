package com.assignments.Task2;

import java.util.Scanner;

public class BreakAndContinue {

		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int no;
			do{
				System.out.println("Enter the Number:");
				no=input.nextInt();
				if(no>0){
					System.out.println("Good Going");
				}
				else{
					System.out.println("It's Over");
					break;
					
				}
				
			}while(true);
		}
	}



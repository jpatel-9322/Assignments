package com.assignments.Task2;

import java.util.Scanner;

public class FloatingPoint {
	
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Floating point number: ");
			float a=input.nextFloat();
			
			if(a == 0)
			{
				System.out.print("zero");
			}
			else if(a>0)
			{
				if(a<1)
				{
					System.out.print("small");
				}
				else if(a>1000000)
				{
					System.out.print("large");
				}
				System.out.print("positive");
				
			}
			else if(a<0)
			{
				
				System.out.print("negative");
			}
		}

}

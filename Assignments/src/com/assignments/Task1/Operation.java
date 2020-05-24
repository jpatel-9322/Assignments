package com.assignments.Task1;

import java.util.Scanner;

public class Operation {

	 public static void main(String[] args) 
	    { 
	  
	        int x,y,z; 

	        
	        do 
	        {
	        	 System.out.println("Enter first integer: ");
	 	        Scanner s1 = new Scanner(System.in); 
	 	        x = s1.nextInt();
	        }
	        while(x>10);
	        
	        do 
	        {
	        	 System.out.println("Enter second integer: ");
	 	        Scanner s2 = new Scanner(System.in); 
	 	        y = s2.nextInt();
	        }
	        while(y>10);
   
	        z=30+x+y;
	        System.out.println("Final Result = "+z);

	    }
}

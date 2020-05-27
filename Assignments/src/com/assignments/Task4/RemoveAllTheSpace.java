package com.assignments.Task4;

import java.util.Scanner;

public class RemoveAllTheSpace {

	public static void main(String[] args) {
		String str; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string"); 
		str = sc.nextLine();  
          // Call the replaceAll() method 
        str = str.replaceAll("\\s", ""); 
       
        System.out.println(str); 
		}
	}


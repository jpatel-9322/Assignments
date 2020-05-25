package com.assignments.Task3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int i,x,result;
		
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println("Multiplication Table of Number  "+x +" : ");
		
		for(i=1;i<=10;i++)
		{
			result = x * i;
			System.out.println(+ x + "*" + i+ " = " + result);
		}

	}

}

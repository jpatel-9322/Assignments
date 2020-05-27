package com.assignments.Task4;

import java.util.Scanner;

public class SumOfArray {
	
	public static int getMaxValue(int[] numbers){
		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
		      maxValue = numbers[i];
		    }
		  }
		  return maxValue;
		}

		public static int getMinValue(int[] numbers){
		  int minValue = numbers[0];
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){
		      minValue = numbers[i];
		    }
		  }
		  return minValue;
		}
	
	 public static void main(String args[]){
		 
	      Scanner scanner = new Scanner(System.in);
	      int[] array = new int[5];
	      int sum = 0;
	      System.out.println("Enter the elements:");
	      for (int i=0; i<5; i++)
	      {
	    	  array[i] = scanner.nextInt();
	      }
	      for( int num : array)
	      {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array elements is:"+sum);
	      int MaxValue = getMaxValue(array);
	      int MinValue = getMinValue(array);
	      System.out.println("MaxValue = " +MaxValue);
	      System.out.println("MinValue = " +MinValue);
	      int x= sum-MinValue-MaxValue;
	      System.out.println("sum of all the values of array except the\r\n" + 
	      		"highest and lowest values :  "+ x);
	   }

}

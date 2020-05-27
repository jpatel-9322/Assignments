package com.assignments.Task4;

import java.util.Scanner;

public class ShortestWord {
	
	 static void SmallestWord(String str)
	 {
	        String[] arr=str.split(" ");
	        int i=0;
	        int minlength;
	        
	        minlength=Integer.MAX_VALUE;
	        
	        String smallest;
	        smallest = "";
	        
	        for(i=0;i<arr.length;i++)
	        {
	            if(arr[i].length() < minlength)
	            {
	                smallest=arr[i];
	                minlength=arr[i].length();
	            } 
	           // if(arr[i].length() > maxlength) {
	           //     largest=arr[i];
	           //     maxlength=arr[i].length();
	            //}
	        }
	        System.out.println("smallest word is \"" + smallest + "\"");
	    }
	    
	    public static void main(String[] args) {
	    	String s; 
			Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter a string"); 
	 		s = sc.nextLine();  
	        
	        String str;
	        try
	        {
	            str=s;
	        }
	        catch(Exception e)
	        {
	            System.out.println("Error reading input");
	            return;
	        }
	        SmallestWord(str);
	    }
	}



package com.assignments.Task4;

import java.util.Arrays;

public class Isogram {
	static boolean is_isogram(String str) 
    { 
        str = str.toLowerCase(); 
        int len = str.length(); 
  
        char arr[] = str.toCharArray(); 
  
        Arrays.sort(arr); 
        for (int i = 0; i < len - 1; i++)
        { 
            if (arr[i] == arr[i + 1]) 
                return false; 
        } 
        return true; 
    } 
	
	public static void main(String[] args) 
    { 
        String str1 = "APple"; 
        System.out.println(is_isogram(str1)); 
  
        String str2 = "Jay"; 
        System.out.println(is_isogram(str2)); 
  
        String str3 = "Progam"; 
        System.out.println(is_isogram(str3)); 
  
        String str4 = "Java"; 
        System.out.println(is_isogram(str4)); 
    } 

}

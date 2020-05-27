package com.assignments.Task4;

public class CaseSwapping {
	
	 public void Swapping(String str) 
	 {      
	        char[] charArray = str.toCharArray();
	        
	        for(int i=0; i < charArray.length; i++)
	        {  
	            if( Character.isUpperCase(charArray[i]) )
	            	{
	            		charArray[i] = Character.toLowerCase( charArray[i] );  
	            	}
	            	else if(Character.isLowerCase(charArray[i]) )
	            		{
	                          charArray[i] = Character.toUpperCase( charArray[i] );
	            		}    
	            
	        }
	        	str = new String(charArray);
	        	System.out.println(str);
	    }
	 
	 public static void main(String[] args) {
	        
	        String str = "heLLo WOrLd";
	        CaseSwapping s = new CaseSwapping();
	        s.Swapping(str);
	 }

}

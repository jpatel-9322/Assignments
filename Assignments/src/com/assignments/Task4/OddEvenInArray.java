package com.assignments.Task4;

public class OddEvenInArray {
	
	public void Even(int a[]) 
	{
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++)
		{  
				if(a[i]%2==0)
				{  
				System.out.println(a[i]);  
				}  
		}  
		
	}
	
	public void odd(int a[])
	{
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2!=0)
				{  
					System.out.println(a[i]);  
				}  
		}  
	}

	public static void main(String args[]){  
		int a[]={23,25,75,87,47,1,91,51, 2}; 
		OddEvenInArray x = new OddEvenInArray();
		x.Even(a);
		
		
		
	}
}

package com.prac.model;

public class Rectangle {
	int len;
	int bred;
	
	public static int myStatic;
	
	{
		 System.out.println("instance level block");
		 len = 10;
		 bred = 10;
		 System.out.println("Object initialized");
		}
		
		//class level
		static{
			System.out.println("static block called");
			myStatic = 1;
		}
		
	public Rectangle() {
		this.len = 10;
		this.bred = 20;
	}
	public Rectangle(int l, int b) {
		this.len = l;
		this.bred = b;
		
	}
	public void calculateArea(){
	System.out.println("Area is " + len*bred);
	}
	

	
	

	
}

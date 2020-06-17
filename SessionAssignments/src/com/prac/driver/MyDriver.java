package com.prac.driver;

import com.prac.model.Rectangle;

public class MyDriver {

	public static void main(String[] args) {
			
		int temp = Rectangle.myStatic;
		System.out.println("myStatic =" +temp);
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(4,5);
		
		r1.myStatic = 50;
		r1.calculateArea();
		r2.calculateArea();
		
		System.out.println(Rectangle.myStatic);
		
		
		

	}

}

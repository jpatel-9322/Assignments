package com.prac.driver;

import com.java.Assignments.SingleTon;

public class DriverSingleTon {

	public static void main(String[] args) {
	
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();
		
		s3.setName("jay");
		s2.setName("amogh");
		s3.getName();
		s2.getName();
		
		
		
		SingleTon.displayOBjectCount();
		
		if(s1 == s2){
			System.out.println("Same object");
		}else{
			System.out.println("Not Equal");
		}

	}

}

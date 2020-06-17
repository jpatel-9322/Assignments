package com.java.Assignments;

public class Rectangle {

		int len;
		int bred;
		
		public Rectangle() {
		System.out.println("Constructor called");
		this.len = 100;
		this.bred = 20;
		}
		
		public void calArea(){
		System.out.println("Area is " + len*bred);
		}
		
		public int getLength(){
		return this.len;
		}

		public int getBredth(){
		return this.len;
		}
		
		public void setLength(int len){
		this.len = len;
		}
		
		public void setBredth(int bred){
		this.bred = bred;
		}
		
	
	public static void main(String[] args) {
		//output:a
		Rectangle rec = new Rectangle();
		rec.calArea();
		//output:b
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		if(rec1 == rec2)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		//output :c
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		if(r1.getLength() == r2.getLength())
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		// output:d
		rec1.setLength(12);

		if(rec1.getLength() == rec2.getLength())
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		//output :e
		rec1= rec2;

				if(rec1 == rec2)
				{
					System.out.println("Equal");
				}
				else
				{
					System.out.println("Not Equal");
				}
	}

}

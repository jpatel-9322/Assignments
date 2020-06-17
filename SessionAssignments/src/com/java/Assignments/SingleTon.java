package com.java.Assignments;

public class SingleTon {
	
	private static String name;
	private static int count;
	private static SingleTon _instance;
	
	private SingleTon(){
		System.out.println("Constructor called Object created");
		count++;
	}
	
	
	public static SingleTon getInstance(){
		
		if(_instance == null){
			_instance = new SingleTon();
		}
		return _instance;
	}
	
	public static void displayOBjectCount(){
		System.out.println("Object created count " + count);
	}


	public static String getName() {
		System.out.println(name);
		return name;
	}


	public static void setName(String name) {
		SingleTon.name = name;
	}
	

	
}

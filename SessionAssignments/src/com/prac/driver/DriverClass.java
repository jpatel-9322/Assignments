package com.prac.driver;

import com.java.Assignments.Email;

public class DriverClass {

	public static void main(String[] args) {
		
		Email em = Email.getInstance();
		Email em2 = Email.getInstance();
		Email em3 = Email.getInstance();
		
		em.setFromEmail("Jp@123");
		em2.setFromEmail("ap@654");
		em3.setFromEmail("th@3435");
		em.setFromEmail("sj@12345");
		
		em.getFromEmail();
		em2.getFromEmail();
		em3.getFromEmail();
		
		
		
		
		
		if(em == em2){
			System.out.println("Same object");
		}else{
			System.out.println("Not Equal");
		}
	}

}

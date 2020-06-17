package com.java.Assignments;

public class Email {
	
	private static String fromEmail;
	private static String toEmail;
	private static String subject;
	private static String body;
	
	private static Email _instance;
	
	private Email() {
		System.out.println("Constructor called Object created");
		
	}
	
	public static Email getInstance(){
		
		if(_instance == null)
		{
			_instance = new Email();
						
		}
		else
		{
			System.out.println("Cannot create instance"+_instance );
		}		
		return _instance;
	}

	public static String getFromEmail() {
	System.out.println(fromEmail);
	return fromEmail;
}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;	
}

	public static String getToEmail() {
	
	return toEmail;
}

	public static void setToEmail(String toEmail) {
	Email.toEmail = toEmail;
}

	public static String getSubject() {
	return subject;
}

	public static void setSubject(String subject) {
	Email.subject = subject;
}

	public static String getBody() {
	System.out.println(body);
	return body;
}

	public static void setBody(String body) {
	Email.body = body;
}
	
	
}

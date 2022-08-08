package com.ExceptionHandlingExample;

public class throwskeyword {
static void validate(int age) throws InvalidAgeException  {
	if(age<18) 
		throw new InvalidAgeException("not valid");
		else 
			System.out.println("welcome to vote");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(7);
			
		}catch(Exception e) {
			System.out.println("exception occured:"+e);

		System.out.println("rest the code");
		}

	}

}
//u can call static method in another class by using class.methodname()

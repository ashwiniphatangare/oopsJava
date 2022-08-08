package com.ExceptionHandlingExample;

public class arithmeticExceptioneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int data=50/0;
		}catch(Exception e) {///catch(ArithmetException e)
			System.out.println("exception is"+e);
		}
		finally {
		System.out.println("rest of code");
		}

	}

}

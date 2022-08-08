package com.ExceptionHandlingExample;

public class multipleCatch {

	public static void main(String[] args) {
		try {
			int u[]=new int [5];
			u[7]=60; //arrayIndexoutofbounds
			//u[7]=60/0;   / by zero

			System.out.println("array is"+u[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);

		}
		finally {
			System.out.println("end......");

		}
	}

}

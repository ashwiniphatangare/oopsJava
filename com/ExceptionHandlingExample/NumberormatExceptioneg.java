package com.ExceptionHandlingExample;

public class NumberormatExceptioneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s="abc";
			int i=Integer.parseInt(s);
			System.out.println(i);

			}catch(Exception e){
			System.out.println(e);
			}
	}

}

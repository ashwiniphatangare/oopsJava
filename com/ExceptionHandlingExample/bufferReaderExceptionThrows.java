package com.ExceptionHandlingExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReaderExceptionThrows {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter Your name");
String name=br.readLine();
System.out.println(" name"+name);

System.out.println("enter Your rollno");
int roll=Integer.parseInt(br.readLine());
System.out.println(" rollno"+roll);

	}

}


//diff bet bufferedreader and scanner is that we have to throws exception in buffered reader
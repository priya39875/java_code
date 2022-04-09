package com.priya.exceptions;

public class PipeOperator {
public static void main(String[] args) {
	String [] s= {"abc","123",null,"xyz"};
	for(int i=0;i<6;i++)
	{
		try {
			int a=s[i].length()+Integer.parseInt(s[i]);
		//the above statement may throw numberformat exception,
			//arayindexoutofbound exception,nullpointer exception	
		} 
		//pipe operator handles multiple exception using a single catch block
		catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException ex ) {
			System.out.println("this pipe operator will handle all the exceptions thrown");
		}
	}
}
}

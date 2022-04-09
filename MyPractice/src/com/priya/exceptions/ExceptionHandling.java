package com.priya.exceptions;

public class ExceptionHandling {
	//exception: abnormal condition that occurs during runtime and disrupts the normal flow of the program
	public static void main(String[] args) {
		//handling those exceptions is exception handling
		//and exception handling is done by using try, catch & finally block
		//Integer I=new Integer("abc"); //this will throw NumberFormatException
		try //in try block we write code that we expect the exception
		{
			Integer I=new Integer("abc");
			System.out.println(I);
		}
		//without try block we can't write catch and vice versa
		//System.out.println("nothing should be written in between try and catch and finally blocks");
		//this catch(exception e) will handle all types of exceptions
		catch(Exception e) //catch block handles the exceptions raised in try block
		{
			System.out.println("Exception Caught");
		}
		//we can't write anything in btwn catch,try and finally
		finally
		{
			System.out.println("This finally block always execute irrespective of exception");
		}
		System.out.println("this line will be excuted as the exception is caught");

	}

}

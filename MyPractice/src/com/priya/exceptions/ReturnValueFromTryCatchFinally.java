package com.priya.exceptions;

public class ReturnValueFromTryCatchFinally {

	public static void main(String[] args) {
		
		System.out.println(methodReturningValue());

	}

	static int methodReturningValue() {
	try {
		return 10;
	}
	catch(Exception e)
	{
		return 20;
	}
	finally
	{
	return 30;
	}
	//System.out.println("s");

}
}

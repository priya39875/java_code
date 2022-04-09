package com.priya.exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		String [] s= {"abc","123",null,"xyz"};
		for(int i=0;i<6;i++)
		{
			try {
				int a=s[i].length()+Integer.parseInt(s[i]);
			//the above statement may throw numberformat exception,
				//arayindexoutofbound exception,nullpointer exception	
			}
			//if we are not particular with exception that occur then we jst use exception e
			catch(Exception e)
			{
				System.out.println("this will handle all type of exceptions");
			}
}
	}
}

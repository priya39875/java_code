package com.priya.exceptions;
//To display the description of an exception thrown using Exception object in the catch block
public class PrintStackTrace {

	public static void main(String[] args) {
		 try
	        {
	            String s = null;
	            System.out.println(s.length());   //This statement throws NullPointerException
	            System.out.println("This statement will not be executed");
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);    //Output : java.lang.NullPointerException
	            e.printStackTrace();     //This prints stack trace of exception
	        }
	        finally
	        {
	            System.out.println("This block is always executed");
	        }
		 System.out.println("always executed");
	}
}

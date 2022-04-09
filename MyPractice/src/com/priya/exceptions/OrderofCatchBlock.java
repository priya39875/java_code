package com.priya.exceptions;

public class OrderofCatchBlock {
	//when we have multiple catch blocks then order must be followed
	//sub classes must come first
	//super classes comes later
	//if we write super class first and then sub class later--
	//--then we get unreachable catch block error
	public static void main(String[] args) {
		try
		{
		    int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }
		catch(NumberFormatException ex)
      {
          //Compile time error
          //This block will be excute as we folow the order
			System.out.println("will be executed as we followed the order");
      }
        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }
//		catch(NumberFormatException ex)
//        {
//            //Compile time error
//            //This block becomes unreachable as
//            //exception is already handled by above catch block
//        }
    }
}


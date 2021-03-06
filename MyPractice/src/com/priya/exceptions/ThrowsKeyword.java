package com.priya.exceptions;

public class ThrowsKeyword
{
    static void methodWithThrows() throws NumberFormatException, NullPointerException
    {
        int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
 
        String s = null;
 
        System.out.println(s.length());    //This statement throws NullPointerException
    }
 
    public static void main(String[] args)
    {
        try
        {
            methodWithThrows();
        }
        catch(Exception ex)
        {
            System.out.println("This block can handle all types of exceptions");
        }
    }
}
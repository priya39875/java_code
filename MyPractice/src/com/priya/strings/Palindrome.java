package com.priya.strings;

public class Palindrome {
	
	public static boolean isPalindrome(String s)
	{
		s=s.toLowerCase(); //converts the letter to lower case
		int len=s.length(); //s=5;
		for(int i=0;i<len/2;i++)//i=0;
		{
			if(s.charAt(i)!=s.charAt(len-1-i))//p!=a so it will return false for s=priya
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("priya"));
		System.out.println(isPalindrome("Madam"));

	}

}

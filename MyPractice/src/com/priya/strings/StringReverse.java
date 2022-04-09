package com.priya.strings;

public class StringReverse {
	public static String Reverse(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)//4
		{
			s1+=s.charAt(i);//a
		}
		
		return s1;
	}
	public static void main(String[] args) {
		System.out.println(Reverse("priya"));

	}

}

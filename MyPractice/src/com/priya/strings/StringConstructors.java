package com.priya.strings;

public class StringConstructors {

	public static void main(String[] args) {
		//String with no argument
		String s1=new String();
		System.out.println("string with no argument "+s1);
		//String with argument
		String s2="[PRIYA]";
		System.out.println("string with argument "+s2);
		//character array as an argument
		char[] chars= {'[','J','A','V','A',']'};
		String s3= new String(chars);
		System.out.println("character array as an argument "+s3);
		//StringBuffer type as an argument
		StringBuffer strbuff=new StringBuffer("[abc]");
		String s4=new String(strbuff);
		System.out.println("StringBuffer type as an argument "+s4);
		//Creating String objects without using new operator
		String s5 = "abc";          
        String s6 = "abc"+"def";
        String s7 = "123"+"A"+"B";
        System.out.println(s5);     //Output : abc
        System.out.println("length of the string "+s5.length());//finding string length
        System.out.println(s6);     //Output : abcdef
        System.out.println(s7);     //Output : 123AB
	}

}

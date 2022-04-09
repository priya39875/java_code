package com.priya.strings;

public class ImmutableTest {

	public static void main(String[] args) {
		String s1=new String("priya");// string stored in both heap & scp as new keyword used
		System.out.println(s1); //output will be priya
		System.out.println(s1.hashCode());
		s1+="krishna";//s1=s1+"krishna" // as string is immutable s1 value cant be changed instead new instance is created
		System.out.println(s1);// output will be priya krishna
		System.out.println(s1.hashCode()); //diff bcoz new instance is created
		

	}

}

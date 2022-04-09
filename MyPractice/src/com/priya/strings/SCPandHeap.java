package com.priya.strings;

public class SCPandHeap {

	public static void main(String[] args) {
		String s1="priya"; // string instance created in scp with ref s1
		System.out.println(s1);
		System.out.println(s1.hashCode());
		String s2=new String("papi"); // String instance created in both heap and scp
		System.out.println(s2);
		System.out.println(s2.hashCode());
		String s3=new String("priya");// instance created only in heap as scp has same value
		System.out.println(s3);
		System.out.println("s3 has same value as of s1 so same hashcode"+s3.hashCode());
	}

}

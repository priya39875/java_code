package com.priya.arraylist.methods;
import java.util.ArrayList;

public class BooleanAdd {
//boolean add(Object o):It adds an element of Specific Object type at the end of Arraylist as no index is mentioned in the method.

	public static void main(String[] args) {
		//It will print the integer list as we mentioned generic type as integer
		ArrayList<Integer> IList=new ArrayList<Integer>();
		IList.add(2);
		IList.add(3);
		IList.add(4);
		IList.add(5);
		System.out.println("THE SIZE OF THE INTEGER LIST IS "+ IList.size());
		System.out.println("THE ELEMENTS IN THIS INTEGER LIST IS "+IList);
		//It will print the string list as we mentioned generic type as string
		ArrayList<String> SList= new ArrayList<String>();
		SList.add("PRIYA");
		SList.add("KANNA");
		System.out.println("THE SIZE OF THE STRING LIST IS "+ SList.size());
		System.out.println("THE ELEMENTS IN THIS STRING LIST IS "+SList);
	}

}

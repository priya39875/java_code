package com.priya.arraylist.methods;

import java.util.ArrayList;
import java.util.List;

public class Retriving {

	public static void main(String[] args) {
	List<String> list	=new ArrayList<>();
	list.add("priya");
	list.add("vamshi");
	list.add("pig");
	list.add("maa");
	list.add("daddy");
	list.add("Husky");
	list.add("ammani");
	//System.out.println(list);
	//If we know the element then we can retrieve the index of that element using indexOf menthod
	System.out.println(list.indexOf("Husky"));
	//System.out.println(list);
	}

}

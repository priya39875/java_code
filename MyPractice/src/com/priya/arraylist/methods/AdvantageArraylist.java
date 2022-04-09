package com.priya.arraylist.methods;
import java.util.ArrayList;
//array size can be re-sized
public class AdvantageArraylist {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		System.out.println("------arraylist sized can be resizable as we add or remove elements----");
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
//        System.out.println(list);
        System.out.println("size of array is "+list.size()); // size is 3 and default size of an arraylist is 10
        list.add("FOUR");
        list.add("FIVE");
        list.get(3);
        System.out.println("size of array is "+list.size());// SIZE IS 5
//        System.out.println(list);
        list.remove(2);
        System.out.println("size of array is "+list.size()); // size is 4
//        System.out.println(list);
		//Elements can be inserted at or deleted from a particular position
        list.add(2, "replaced three");
        System.out.println("size of array is "+list.size()); // size is 5
//        System.out.println(list);
 //can have any no.of null elements.
        System.out.println("----------arraylist can have any no.of null elements--------");
        ArrayList<Integer> nlist=new ArrayList<Integer>();
        nlist.add(null);
        nlist.add(5);
        nlist.add(null);
        System.out.println(nlist);
        System.out.println("-------arraylist allows n no of duplicates-------------");
        ArrayList<Integer> dlist=new ArrayList<Integer>();
        dlist.add(5);
        dlist.add(5);
        dlist.add(5);
        System.out.println(dlist);
        System.out.println("-------arraylist implements random access, so we can get,set,insert,remove elements form any orbitary position---------------");
        ArrayList<String> rlist=new ArrayList<String>(5);
        rlist.add("PRIYA"); //insert element at index 1
        System.out.println("after inserting element at index 1 "+rlist);
        rlist.add("kanna"); //insert element at index 2
        System.out.println("after inserting element at index 2 "+rlist);
        //retrieving element from index2
        System.out.println("retrievied element from index0 = "+rlist.get(0));
        rlist.set(0,"papi"); //set value of element at index 2
        System.out.println("setting value of element at index 2"+rlist);
	}

}

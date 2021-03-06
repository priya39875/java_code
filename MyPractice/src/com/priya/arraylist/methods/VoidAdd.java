package com.priya.arraylist.methods;
/*void add(int index, Object element):It adds an element of Specific Object type 
 * at the specified index of the Arraylist as  given in the argument of the method.
 */
import java.util.ArrayList;
public class VoidAdd {

	public static void main(String[] args) {
		 //Integer ArrayList
        ArrayList<Integer> aList = new ArrayList<Integer>();

        aList.add(1);
        aList.add(5);
        aList.add(9);
        System.out.println(aList);
        // adding element 25 at 3rd position which is index 2
        aList.add(2,25);
        //If incase index is not in range then it throws IndexOutOfBoundsException
        System.out.println("Integer List After 25 added at index 2 = " + aList);

        //String ArrayList

        ArrayList<String> sList = new ArrayList<String>();

        sList.add("JAVA");
        sList.add("At");
        sList.add("AbhiAndroid");
        System.out.println(sList);
        //Adding Learning String at index 0 i.e. 1st position
        sList.add(0, "Learning");

        System.out.println("String After Learning Added at index 0 = " + sList);

	}

}

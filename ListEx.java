package com.hp.collections;

import java.util.ArrayList;
import java.util.Iterator;

//1)collections are not fixed in size 
//2)collections can hold both homogeneous  and heterogeneous data 
//3)lots of utility methods
//List:
//1)duplicates are allowed 
//2)insertion order is preserved 

public class ListEx { // java.util

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();// 10,16 (cc*3/2)+1

		names.add("suresh");
		names.add("naresh");
		names.add("rajesh");
		names.add("akash");
		names.add("mahesh");
		names.add("chetan");
		names.add("naresh");
		names.add(1, "lenovo");
		System.out.println(names);
		
				Iterator<String> itr=names.iterator();		
		
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
		
		
		
		
		
		
		
		
		

//		ArrayList<String> al = new ArrayList<String>();
//
//		al.add("sandeep");
//		al.add("kiran");
//		System.out.println(al);
//		al.addAll(names);
//		// al.remove("sandeep");
//		System.out.println(al);
//		// al.removeAll(names);
//		// al.retainAll(names);
//
//		System.out.println(al.contains("sandeep"));
	}

}

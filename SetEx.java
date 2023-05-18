package com.hp.collections;

import java.util.Comparator;
import java.util.TreeSet;

//1)collections are not fixed in size 
//2)collections can hold both homogeneous  and heterogeneous data 
//3)lots of utility methods
//Set:
//1)duplicates are Not allowed 
//2)insertion order is not  preserved 

public class SetEx {

	public static void main(String[] args) {

		// java.lang.Comparable -->FI-->SAM -->compareTo()-->NSO
		// java.util.Comparator -->FI-->SAM -->compare() -->CSO

		System.out.println("a".compareTo("b"));
		System.out.println("suresh".compareTo("naresh"));
		// returns -ve if obj1 has to come before obj2;
		// returns +ve if obj1 has to come after obj2;
		// returns 0 if both are same

		TreeSet<String> names = new TreeSet<String>(new MyOrder());// -->hashmap-->key,value
		names.add("suresh");
		names.add("naresh");
		names.add("rajesh");
		names.add("akash");
		names.add("mahesh");
		names.add("chetan");
		names.add("naresh");
		System.out.println(names);// naresh,rajesh.....

	}

}

class MyOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

//		return -o1.compareTo(o2);
		return o2.compareTo(o1);
	}
}
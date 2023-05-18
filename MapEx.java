package com.hp.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(123, "mahesh");
		map.put(5697, "naresh");
		map.put(2354, "rajesh");
		map.put(9654, "somesh");
		map.put(22, "hitesh");
		map.put(123, "sandeep");
		map.put(4512, "chakri");
		System.out.println(map);

		Set<Entry<Integer, String>> entries = map.entrySet();

		Iterator<Entry<Integer, String>> itr = entries.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

//		Set<Integer> set = map.keySet();
//
//		Iterator<Integer> keys = set.iterator();
//
//		while (keys.hasNext()) {
//			int key = keys.next();
//			System.out.println(key + " " + map.get(key));
//		}

	}

}

package com.test.hello;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCount {
	
	//we need to use two for loop key is second for loop start i+1 element of first 
	//for loop
	//comapaire both using if == 
	//print arr
//using Hash map comapire element as null if element is null put the element else alrady exist get the elemet and increase by 1
	//if getvalue is greateater then 1 print the elememt
	public static void main(String[] args) {
		
		
		int[] number=new int[] {111, 333, 555, 777, 333, 444, 555};
		//findDuplicatesUsingHashMap(number);
		
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
					count++;
					System.out.println(number[i]);
				}

		}

		}
		System.out.println("Duplicate count" + count);
		
	}
	
	
	


	/*
	 * private static void findDuplicatesUsingHashMap(int[] inputArray) {
	 * HashMap<Integer, Integer> map = new HashMap<>();
	 * 
	 * for (int element : inputArray) { if(map.containsKey(element)) {
	 * map.put(element, map.get(element)+1); }
	 * 
	 * 
	 * else { map.put(element, 1); } }
	 * 
	 * Set<Entry<Integer, Integer>> entrySet = map.entrySet();
	 * 
	 * for (Entry<Integer, Integer> entry : entrySet) { if(entry.getValue() > 1) {
	 * System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.
	 * getValue()+" times."); } } }
	 */
}

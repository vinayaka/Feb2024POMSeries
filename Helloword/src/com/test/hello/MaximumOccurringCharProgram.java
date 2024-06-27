package com.test.hello;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Convert input string to charArray and replace space with no space
 * Declare HaspMap with Character and integet and loop through inputs string
 * if it contains increament by 1 else put in map
 * declare two varible maxcount as int and maxchar as char
 * comapire using if loop map.getvalue>maxcount
 * the assing magetvalue to maxcount and maxgetkey to maxchar
 * print them
 * 
 * 
 * 
 * 
 */
public class MaximumOccurringCharProgram {
	public static void main(String[] args) {
		printMaxOccurringChar("Java Concept Of The Day");

		System.out.println("========================");

		printMaxOccurringChar("Java J2ee Android Hibernate JSP");

		System.out.println("========================");

		printMaxOccurringChar("abbcccddddeeeeeffffff");

		System.out.println("=========================");

		printMaxOccurringChar("122333444455555666666");
	}

	private static void printMaxOccurringChar(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();

		int maxCount = 0;

		char maxChar = 0;

		for (Map.Entry<Character, Integer> entry1 : charCountMap.entrySet()) {
			if (entry1.getValue() > maxCount) {
				maxCount = entry1.getValue();
				maxChar = entry1.getKey();
			}
		}
//        for (Entry<Character, Integer> entry : entrySet) 
//        {
//            if (entry.getValue() > maxCount)
//            {
//                maxCount = entry.getValue();
//                 
//                maxChar = entry.getKey();
//            }
//        }

		// System.out.println("Input String : "+inputString);

		System.out.println("Maximum Occurring char and its count :");

		System.out.println(maxChar + " : " + maxCount);
	}

}

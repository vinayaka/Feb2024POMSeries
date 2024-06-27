package com.test.hello;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s1 = "RACE";
		String s2 = "CARE";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() == s2.length()) {// first compaire length are same or not then convert to tochararray
			char[] ch = s1.toCharArray();
			char[] ch2 = s2.toCharArray();

			Arrays.sort(ch); // sort array function
			Arrays.sort(ch2); // sort array function

			boolean result = Arrays.equals(ch, ch2); // comapaire using Arrays.eqal

			if (result) {
				System.out.println("string is anagram");
			}

		}
	}

}

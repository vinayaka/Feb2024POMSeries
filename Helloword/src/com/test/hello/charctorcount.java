package com.test.hello;

import java.util.HashMap;
import java.util.Map;

public class charctorcount {
//To get accurance of character
	// step 1: convert string to array of character
	// Step 2: Use Hasp Map to get and put character
	// Step 3: Using Entry entry set print getkey and get value
	public static void main(String[] args) {
		String str = "vinayaka";
		charactorcount(str);

	}

	private static void charactorcount(String str) {

		// create Haspmap to put and get charactor
		HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
		// convert string to array
		char[] ch = str.toCharArray();
		// loop through array character
		for (char c : ch) {
			if (charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c) + 1);
			} else {
				charcount.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

		}
	}

}

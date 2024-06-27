package com.test.hello;

import java.util.regex.*;

class StringOnlyDigit {

	public static void main(String args[]) {
		// Given string str
		String str = "1234";
	boolean numberonly =onlyDigits(str);
	

		// Function Call
		System.out.println(numberonly);
	}
	// Function to validate URL
	// using regular expression
	public static boolean onlyDigits(String str) {
		// Regex to check string
		// contains only digits
		String regex = "[0-9]+";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// return false
		if (str == null) {
			return false;
		}

		// Find match between given string
		// and regular expression
		// using Pattern.matcher()
		Matcher m = p.matcher(str);

		// Return if the string
		// matched the ReGex
		return m.matches();
	}

	// Driver Code
	
}

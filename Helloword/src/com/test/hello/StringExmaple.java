package com.test.hello;

public class StringExmaple {

	public static void main(String[] args) {
		
		/*
		 * 
		 * The == operator checks if two string references point to the same memory location (i.e., if they are the same object).
When used with strings, == compares the memory addresses of the string objects, not their actual contents.
The equals() method is used to compare the actual contents (values) of two string objects.
It returns true if the strings have the same characters in the same order, and false otherwise.
		 */
		//
		String s1 = "Hello World";
		String s2 = new String("Hello World");
//		if (s1 == s2) {
//			System.out.println("Both are true");
//		} else {
//			System.out.println("Both are not true");
//		}
		
		if(s1.equals(s2)) { 
			System.out.println("Both are true");
		} else {
			System.out.println("Both are not true");
		
		}
	}

}

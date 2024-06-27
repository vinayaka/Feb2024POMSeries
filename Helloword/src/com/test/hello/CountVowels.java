package com.test.hello;

public class CountVowels {

	public static void main(String[] args) {
		String str = "Today is Sunday"; //o/p =5 2a, 1o, 1i 1u

		
		int count = 0;
		char[] c = str.toCharArray();

		for (char ch : c) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;

			}

		}

		System.out.println(count);

	}

}

package com.demo;

public class ReverseSpecificWords {

	public static void main(String[] args) {
		String s = "Welcome to Automation Testing";
//
        // Split the string into words
        String[] words = s.split(" ");

        // Check if there are at least 4 words
        if (words.length >= 4) {
            // Reverse the third and fourth words
            words[2] = new StringBuilder(words[2]).reverse().toString();
            words[3] = new StringBuilder(words[3]).reverse().toString();
        }

        // Reconstruct the string
        String result = String.join(" ", words);

        // Print the result
        System.out.println(result);
	}

}

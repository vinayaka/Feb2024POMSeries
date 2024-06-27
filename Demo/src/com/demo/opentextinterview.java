package com.demo;

import java.util.HashMap;
import java.util.Map;

public class opentextinterview {

	public static void main(String[] args) {
		/*
		 * Reverse the string and count number of words
		 */
		String s="My name is vinayaka My name";
		String[] words=s.split(" ");
		Map<String,Integer> wordcnt=new HashMap<String,Integer>();
		for(String word:words) {
			wordcnt.put(word,wordcnt.getOrDefault(word, 0)+1);
		}
		for(Map.Entry<String, Integer> entry:wordcnt.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		StringBuffer sb=new StringBuffer();
		for(String word:words) {

sb.append(new StringBuffer(word).reverse()).append(" ");
}
	System.out.println("Reverse==>"+sb.toString());
//		
		  // Reverse each word in the string
        StringBuilder reversedWordsbf = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedWordsbf.append(reversedWord).append(" ");
        }

        // Print the reversed words
        System.out.println("Reversed words:");
        System.out.println(reversedWordsbf.toString().trim());
		
	}
	
	

}

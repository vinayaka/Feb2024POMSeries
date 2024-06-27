package com.test.hello;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demo {
//computers share interview 	questions
	public static void main(String[] args) {
		String str="I AM IN AN INTERVIEW";
		//I=4
		//A=2
		//M=1
		//N
		charchactecount(str);
		
	}

	private static void charchactecount(String str) {
		HashMap<Character, Integer> charcount=new HashMap<Character, Integer> ();
		char[] ch=str.replaceAll("\\s", "").toCharArray();
		
		
		//int count=0;
		for(char c:ch) {
			if(charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c)+1);
				//count++;
			}else
			{
				charcount.put(c,1);
			}
		}

		Set<Entry<Character,Integer>> entrySet=charcount.entrySet();
		int maxCount=0;
		
		 char maxChar = 0;
		 for(Map.Entry<Character, Integer> entry1:charcount.entrySet()){
	        	if(entry1.getValue() > maxCount) {
	        		maxCount=entry1.getValue();
	        		maxChar=entry1.getKey();
	        	}
	        }
		
			/*
			 * for(Entry<Character,Integer> entry:entrySet) {
			 * 
			 * if (entry.getValue() > maxCount) {
			 * 
			 * maxCount=entry.getValue(); maxChar=entry.getKey();
			 * 
			 * }
			 * 
			 * 
			 * 
			 * }
			 */
		System.out.println("Maximun occurance of character is:"+  maxChar +"count is"+maxCount);
	}

}

package com.test.hello;

import java.util.HashMap;
import java.util.Map;

public class CountWordInString {

	public static void main(String[] args) {
		String s="Java-Prgram-Java-Prgram-selenum";
		countword(s);

	}

	private static void countword(String s) {
		String[] input=s.split("-");
		HashMap<String,Integer> stringcount=new HashMap<String,Integer>();
		
		for(String ss:input) {
			if(stringcount.containsKey(ss)) {
				stringcount.put(ss, stringcount.get(ss)+1);
			}else {
				stringcount.put(ss, 1);
			}
		}
		
		for(Map.Entry<String,Integer> entry:stringcount.entrySet()) {
			System.out.println("value"+entry.getValue()+"key"+entry.getKey());
		}
	}

}

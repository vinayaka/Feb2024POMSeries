package com.test.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HackthonString {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>(Arrays.asList("aba", "baba", "aba", "xzxb"));
		List<String> queries = new ArrayList<>(Arrays.asList("aba", "xzxb", "ab"));
		List<Integer> result = matchingStrings(stringList, queries);
		System.out.println(result.toString());

	}

	public static List<Integer> matchingStrings(List<String> input, List<String> queriesstringList) {

		HashMap<String, Integer> frequencymap = new HashMap<String, Integer>();
		for (String str : input) {
			if (frequencymap.containsKey(str)) {
				
				//frequencymap.put(str,frequencymap.getOrDefault(str, 0)+1);
				
				frequencymap.put(str, frequencymap.get(str) + 1);
		} 
			else {
			frequencymap.put(str, 1);
		}
		}
		List<Integer> result = new ArrayList<Integer>();
		for (String query : queriesstringList) {
			if (frequencymap.containsKey(query)) {
				result.add(frequencymap.get(query));
			} else {
				result.add(0);
			}
		}
		return result;

	}
}



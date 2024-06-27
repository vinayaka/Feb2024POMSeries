package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Paranthisis {

	public static void main(String[] args) {
		int n = 3;  // Example: Generate combinations for 3 pairs of parentheses
        List<String> result = generateParenthesis(n);
        System.out.println("All combinations of well-formed parentheses:");
        for (String combination : result) {
            System.out.println(combination);
        }
	}
	 public static List<String> generateParenthesis(int n) {
	        List<String> result = new ArrayList<>();
	        generateParenthesisRecursive(result, "", 0, 0, n);
	        return result;
	    }
	 private static void generateParenthesisRecursive(List<String> result, String current, int open, int close, int max) {
	        if (current.length() == max * 2) {
	            result.add(current);
	            return;
	        }

	        if (open < max) {
	            generateParenthesisRecursive(result, current + "(", open + 1, close, max);
	        }
	        if (close < open) {
	            generateParenthesisRecursive(result, current + ")", open, close + 1, max);
	        }
	    }
}

package com.test.demo;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abbd";
        String longestPalindrome = findLongestPalindrome(s);
        System.out.println("Longest Palindrome: " + longestPalindrome);
    }
/*
 * we are combining two logic here 
 * 1. Find the number of substring usig s.substring(i,j) and send as longest polydrom
 * 2.compaire length of sunstr with original string
 * 
 * 
 * 
 */
    public static String findLongestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if (isPalindrome(substr) && substr.length() > longestPalindrome.length()) {
                    longestPalindrome = substr;
                }
            }
        }
        return longestPalindrome;
    }

	private static boolean isPalindrome(String substr) {
		for(int i=0;i<substr.length()/2;i++) {
			if(substr.charAt(i)!=substr.charAt(substr.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

//    public static boolean isPalindrome(String s) {
//        int left = 0;
//        int right = s.length() - 1;
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
}

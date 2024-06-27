package com.test.hello;

public class Palindrome {
//Step 1: Take string as input
	// Step2 : Declare 2nd string to store reverse string
	//Step 3:loop through input string end to fist
	//use charAt(i) to apped sting
	//use boolean varible to restun
	//step 3:compaire both string
	//if 
	public static void main(String[] args) {
		String s="adda";
		boolean result=isPalydomr(s);
		
System.out.println(result);
	}

	private static boolean isPalydomr(String s) {
		String rev="";
		   boolean ans = false;
		   
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			ans=true;
		}
	return ans;
	}

}

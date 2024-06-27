package com.test.hello;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String str="vinayaka";
		
	
	System.out.println(recursion(str));
	}

	private static String recursion(String str) {
		if(str==null || str.length()<=1)
		{
			return str;
		}
		
		return recursion(str.substring(1))+str.charAt(0);
		
	}

}

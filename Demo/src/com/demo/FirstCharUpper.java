package com.demo;

public class FirstCharUpper {

	public static void main(String[] args) {
		//Make first charcter upper case
		String str = "hello world";
		
		String[] strarray=str.split(" ");
		String out="";
		for(String s: strarray) {
			System.out.print(s.substring(0,1).toUpperCase()+s.substring(1, s.length())+" ");
			//System.out.println(s.replace(s.valueOf(s.charAt(0)),s.valueOf(s.charAt(0)).toUpperCase()));
			//same is implemeted using value of and replace 
out=out+s.replace(s.valueOf(s.charAt(0)),s.valueOf(s.charAt(0)).toUpperCase())+" ";
	
			
		}
	}
		
}

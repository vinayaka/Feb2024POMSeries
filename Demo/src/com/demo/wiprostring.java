package com.demo;

public class wiprostring {

	public static void main(String[] args) {
		String s="Welcom to Automation Testing";
		String[] sarry=s.split(" ");
		String output="";
		String rev1="";
		String rev2="";
		String first=sarry[0];
		String second=sarry[1];
		String third=sarry[2];
		String fourth=sarry[3];
		System.out.println(first+" "+second+" "+third+" "+fourth);
		for(int i=third.length()-1;i>=0;i--) {
			 rev1=rev1+third.charAt(i);
		}
		//System.out.println(rev1.toUpperCase()+" ");
		
		for(int i=fourth.length()-1;i>=0;i--) {
			 rev2=rev2+fourth.charAt(i);
		}
		//System.out.println(rev2.toUpperCase()+" ");
		
		
		output=first+" "+second+" "+rev1+" "+rev2;
		System.out.println(output);
	}
	
}

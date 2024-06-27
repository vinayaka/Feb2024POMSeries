package com.test.demo;

public class RemoveTrailingspace {

	public static void main(String[] args) {
		String s=" vina yaka  Joshi ";
		System.out.println(s);
		String wihtoutspace1=s.trim();
		//System.out.println(wihtoutspace1);
		String wihtoutspace=s.replaceAll(" ", "");
		//System.out.println(wihtoutspace);
		String nospace="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && s.charAt(i)!='\t') {
				continue;
			}else {
				 nospace=String.valueOf(s.charAt(i));
				 System.out.print(nospace);
			}
		}
		
	}

}

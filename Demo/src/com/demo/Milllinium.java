package com.demo;

public class Milllinium {

	public static void main(String[] args) {
		
		//find the diffrence right and left paranthsisi
		String str="(()))";
		int leftcount=0,rightcount=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				leftcount++;
			}
			else if(str.charAt(i)==')') {
				rightcount++;
			}
		}
if(rightcount>leftcount) {
	System.out.println(rightcount-leftcount);
}else {
	System.out.println(leftcount-rightcount);
}
	}

}

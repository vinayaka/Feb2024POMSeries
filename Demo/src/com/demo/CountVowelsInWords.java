package com.demo;

public class CountVowelsInWords {

	public static void main(String[] args) {
String str = "hello world";
		
		String[] strarray=str.split(" ");
		String out="";
		
		char[] chr=str.trim().toCharArray();
		int count=0;
//System.out.println(str.valueOf(str.charAt(0)).toUpperCase());

		  for(char ch = 'a'; ch <= 'z'; ch++) {

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            
            	for(int i=0;i<chr.length;i++) {
            		System.out.println("Length"+chr.length);
            		System.out.println("===ch==="+ch);
            		System.out.println("===ch[i]==="+chr[i]);
            	if(ch==chr[i]) {
            		count++;
            	}
            }
		
	}

	}
		  
		  System.out.println("Number of ovewls"+count);
}
	}



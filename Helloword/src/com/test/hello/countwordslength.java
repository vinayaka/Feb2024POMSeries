package com.test.hello;

public class countwordslength {

	public static void main(String[] args) {
		String str="Hello word";
		
		//Convert string to char array
		char[] ch=str.toCharArray();
		
		//loop through char array
		for(int i=0;i<ch.length;i++) {
			String s=""; //deaclare string varible to concatine and print
			while(i<ch.length && ch[i]!= ' ') {  //use while loop to check condition string has space and index is less then lenght
				
				s=s+ch[i]; //concate string
				i++; //importen increment index else it got infinote loop
			}
			System.out.println(s +"Legnth is"+ s.length());
		}
		
		

	}

}

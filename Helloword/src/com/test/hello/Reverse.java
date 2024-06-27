package com.test.hello;

public class Reverse {
// Step 1:Take the input string
	// step 2: convert to array using tocharArray()
	//step 3:traverse array back to beginning
	//stop 4: print
	public static void main(String[] args) {
	String str1="vinayaka";
	
	
	char[] ch=str1.toCharArray();
	for(int i=str1.length()-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
		//Reverse Statement
	
	String str="Welcom to Java";
	
	String[] sarry=str.split(" ");
	for(int i=sarry.length-1;i>=0;i--) {
		
			System.out.println(sarry[i]);
		
	
		
	}
		

	}

}

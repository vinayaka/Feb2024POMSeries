package com.test.hello;

public class CountuppercaeLowercase {

	public static void main(String[] args) {
		String str = "Dhanvi";
		int uppercase = 0;
		int lowercase = 0;
		char[] ch = str.toCharArray();
		
		for(char c:ch) {
			if(Character.isUpperCase(c)) {
			uppercase++;
			}
			else {
				lowercase++;
			}
		}

//		for (char c : ch) {
//			if (c >= 'A' && c <= 'Z') {
//				uppercase++;
//				Character.isUpperCase(c);
//			} else if (c >= 'a' && c <= 'z') {
//				lowercase++;
//
//			} else {
//				continue;
//
//			}
//		}

		System.out.println("Uppcase:=>" + uppercase + "=<lowercase:" + lowercase);

	}

}

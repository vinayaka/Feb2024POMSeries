package com.demo;

public class RemoveRepatedWordsorDuplicateWord {

	public static void main(String[] args) {
		//Input ABCABCABC
		//Output  ABC
		String str="ABCABCABC";
		String output="";
		for(int i=0;i<str.length();i++) {
			String ch=""+str.charAt(i);
				if(output.contains(ch)) {
					continue;
				}else {
					output=output+ch;
				}
			}
		System.out.println(output);
		}

	}



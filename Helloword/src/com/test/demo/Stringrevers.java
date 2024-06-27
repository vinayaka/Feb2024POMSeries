package com.test.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Stringrevers {

	public static void main(String[] args) {
		String str="Vinayaka"; //reverse
		
		String str2="abba"; //palindrom
		
		String Str3="Keep"; //anagram
		String str4="Peek";
		boolean input=IsAnagram("KEEP","PEEK");
		System.out.println(input+"Anagra");
		String reverse="";
		char[] ch=str2.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			reverse=reverse+ch[i];
			
		}
		if(str2.equals(reverse)) {
			System.out.println(str2+": equal: "+ reverse+":Palidrom");
		}else {
			System.out.println("Not palidrom");
		}

		//Find the occurance character
		
		char[] charry=str.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer> ();
		for(char c:charry) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		int  maxvlaue=0;
		char maxkey=0;
		for(Map.Entry<Character,Integer> entry:map.entrySet()){
			 if(entry.getValue()>1) {
				System.out.println("Duplicate entry:"+entry.getKey()+""+entry.getValue());
			 }
			 if(entry.getValue()>maxvlaue) {
				 maxvlaue=entry.getValue();
				 maxkey=entry.getKey();
				 
				 System.out.println("Maximun occurance"+maxvlaue+"key"+maxkey);
			 }
		}
		
	}

	private static boolean IsAnagram(String input1, String input2) {
		boolean anagram=false;
		String str1=input1.toUpperCase();
		String str2=input2.toUpperCase();
		char[] arr1=input1.toCharArray();
		char[] arr2=input2.toCharArray();
		
		if(str1.length()!=str2.length()) {
			anagram=false;
			
		}else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			anagram=Arrays.equals(arr1, arr2);
		}
		
		return anagram;
	}

}

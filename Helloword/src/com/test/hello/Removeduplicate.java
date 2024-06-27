package com.test.hello;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Removeduplicate {

	public static void main(String[] args) {
		// decalre tree set  array of integer
		
		  int[] arr1= new int[] {1,2,3,4,5,6,6,8,9,1}; 
		  int[] arr2=new int[] {5,6,7,8}; // declare tree set of type integer 
		  
			TreeSet<Integer> set = new TreeSet<Integer>(); // traverse array and add to set
			for (int i : arr1) {
				set.add(i);
			}
			for (int j : arr2) {
				set.add(j);
			}
			// print the set

			System.out.println("After remove duplicate"+set);
		 

			//using Array 
			 int index=0;
			 int[] arr3= new int[arr1.length];
			
			 try {
			 for(int i=0;i<arr1.length;i++) {
				 
					
						if(arr1[i]!=arr1[i+1]) {
							arr3[index]=arr1[i];
							index++;
						}
					
				 
			 }
			 }
			 catch(Exception ex) {
				 
			 }
//			 for(int j=0;j<arr2.length;j++) {
//				 if(arr2[j]!=arr2[j+1]) {
//					 arr3[index]=arr2[j];
//					 index++;
//				 }
//			 }
			arr3=new int[index];
			System.out.println("index"+index);
			 System.out.println("original Array"+Arrays.toString(arr1));
			 System.out.println("Uniqure elelemt"+Arrays.toString(arr3));
		/// using string

		String s = "preaveeen12";
		String removedup = "";
		
		String aftterreplace=s.replaceAll("[0-9]", ""); 
		System.out.println("After remove number =>"+aftterreplace);
		char[] ch = s.toCharArray();
		TreeSet<Character> set1 = new TreeSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			if (set1.add(ch[i])) {
				removedup = removedup + ch[i];
			}
		}
		System.out.println("Unique chareacter:" + removedup);

		// using Hashset and string buffer and charat
		// String s="preaveeen";
		// String removedup="";
		Set characterSet = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);

			if (!characterSet.contains(c)) {
				characterSet.add(c);
				removedup = removedup + s.charAt(i);
			}

		}
		System.out.println("Unique chareacter:" + removedup);

	}

}

package com.test.hello;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Uncommonelement {
	/* 
	 * create 2 HashSet commom and Uncomman of type string
	 *  create two varriable arra1 Arrays.asList for array1 and array2
	 *  First cast comman Hashset as array1 and using retainAll.add array2//Retains only the elements which are common in array1 i.e c and d
	 *  Next uncomman Hashset addall array2 which meger both array1 and array2
	 *  remove all cooman will reomve c and d
	 *  finally print uncomman element using for loop
	 *  
	 *  
	 * 
	 * 
	 */

	public static void main(String[] args) {
	String[] arr1= {"a","b","c","d"};
	String[] arr2= {"aa","bb","c","d"};
	
	List<String> array1=Arrays.asList(arr1);
	List<String> array2=Arrays.asList(arr2);
	
	Set<String> comman=new HashSet<>(array1); //o/p= a,b,c,d
	comman.retainAll(array2);//o/p: c,d  retain element only in set1 i.e c and d
	
	
	 Set<String> uncomman=new HashSet<>(array1);
	 uncomman.addAll(array2); //o/p : aa,bb,a,b,c,d
	 uncomman.removeAll(comman); // remove d ,d
	 
	 for(String s:uncomman) {
		 System.out.println(s);
	 }
	 
	}

}

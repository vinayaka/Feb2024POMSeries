package com.test.hello;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		/*
		 * Create new array to store element 
		 * sort the two array with arrays.sort
		 * Use count varible to get size of array and increment 
		 * finally again itrate all and sort finall array and print
		 */
		int[] a= {2,1,4,6,5};
		int[] b= {3,5,6};
		int[] c=new int[a.length+b.length]; //new array to store elemenet 
		
		Arrays.sort(a);
		Arrays.sort(b);
		int count=0;

		for(int i=0;i<a.length;i++) {
			c[count]=a[i];
			count++;
			
		}
		for(int j=0;j<b.length;j++) {
			c[count]=b[j];
			count++;
		}
		Arrays.sort(c);
		System.out.println("Count"+count);
		System.out.println(Arrays.toString(c));
		
		
		
	}

}

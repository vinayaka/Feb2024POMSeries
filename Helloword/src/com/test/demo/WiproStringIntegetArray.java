package com.test.demo;

import java.util.Arrays;
import java.util.OptionalInt;

public class WiproStringIntegetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 10, 3, 5, 5 ,5,9};
		int highest = Integer.MIN_VALUE;
		int secondhighest = Integer.MIN_VALUE;
		
		Arrays.sort(a);
//		  OptionalInt secondHighest = Arrays.stream(a)
//                  .distinct() // Remove duplicates
//                  .boxed()    // Box the ints to Integers to sort in reverse order
//                  .sorted((x, y) -> y - x) // Sort in descending order
//                  .skip(1)    // Skip the first element (highest)
//                  .mapToInt(Integer::intValue) // Convert back to int stream
//                  .findFirst(); // Get the first element in the stream
//
//if (secondHighest.isPresent()) {
//System.out.println("The second highest number is: " + secondHighest.getAsInt());
//} else {
//System.out.println("The second highest number is not found.");
//}

		System.out.println("Sort"+Arrays.);
		System.out.println("Secod highrs"+a[1]);
     int uniquecount=1;
     for(int i=1;i<a.length;i++) {
    	 if(a[i]!=a[i-1]) {
    		 uniquecount++;
    	 }
     }
     
     //sort array
     int[] b=new int[uniquecount];
     for(int i=0;i<a.length;i++) {
    	 for(int j=i+1;j<a.length;j++) {
    		 if(a[i]>a[j]) {
    			 int temp=a[i];
    			 a[i]=a[j];
    			 a[j]=temp;
    		 }
    	 }
     }
     b[0]=a[0];
     int count=1;
     for(int i=1;i<a.length;i++) {
    	 if(a[i]!=a[i-1]) {
    		 b[count++]=a[i];
    	 }
     }
     
     for(int j=0;j<b.length;j++) {
    	 System.out.println("uniqye count"+b[j]);
     }
    // System.out.println(uniquecount);
		for (int num : a) {
			if (num > highest) {
				secondhighest=highest;
				 highest=num;
				

			} else if (num > secondhighest && num != highest) {
				secondhighest = num;
			}
		}
		System.out.println(secondhighest);
	}

}

package com.test.hello;

import java.util.Arrays;

public class Secondlarget {

	
	    public static void main(String[] args) {
	    	int[] arr = { 5, 2, 9, 1, 7 };
	    	  Arrays.des
	    	  // Using lambda expression with streams to find the second highest element
        int secondHighest = Arrays.stream(arr)
                .distinct() // Remove duplicates
                .sorted()   // Sort in ascending order
                .skip(arr.length - 2) // Skip to the second highest element
                .findFirst()  // Get the second highest element
                .orElse(-1); // Default value if array is empty or has less than 2 elements
	    	 
	        C# code
	        int secondHighest = (from number in numbers
                    orderby number descending
                    select number).Skip(1).First();

	        int max = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;
	     int secondlargrst=   Arrays.stream(arr).distinct().sorted().skip(arr.length-2).findFirst().orElse(-1);
	     System.out.println(secondlargrst);
//	        for (int num : arr) {
//	            if (num > max) {
//	                secondMax = max;
//	                max = num;
//	            } else if (num > secondMax && num != max) {
//	                secondMax = num;
//	            }
//	        }
//	        
	     //   System.out.println("Second largest element: " + secondMax);
	    }
	}




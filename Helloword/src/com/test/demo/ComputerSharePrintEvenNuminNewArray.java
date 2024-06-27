package com.test.demo;

import java.util.Arrays;

public class ComputerSharePrintEvenNuminNewArray {
/*
 * 
 * Computer share interview question remove odd number and print even number
 * Make first letter of string capital
 */
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };// 2,4,6

//		String str = "today is tuesday";
//
//		String[] capital = str.split(" ");
//
//		for (String s : capital) {
//			System.out.println(s = s.substring(0, 1).toUpperCase() + s.substring(1, s.length()));
//
//		}
		int b[] = new int[a.length-1];
		int even = 0;
		
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 2) == 0) {

				even++; // first count even number
			}
		}
		
		//System.out.println("Even number"+Arrays.toString(b));
		b = new int[even]; // declare array to store even and print even number
		int i = 0;
		for (int num : a) { //itrated original array to get even number separete
			if ((num % 2) == 0) {
				b[i++] = num;// assign even number to array
			}
		}
		System.out.println("Array after removing odd numbers are: ");
		System.out.println(Arrays.toString(b));
	}
}

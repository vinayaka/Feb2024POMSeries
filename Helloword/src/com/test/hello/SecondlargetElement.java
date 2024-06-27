package com.test.hello;

import java.util.Arrays;

public class SecondlargetElement {
	/*
	 * Take array of integer as input and declare two varible firstlarget and
	 * secondlarget fist make assume zero array index > first largest the assing
	 * firstlargest to input[0] remaning else part assing second index to second
	 * larget element loop remaning element start for loop from i=2 we left with two
	 * case one next number may be greater then firstlargest index[i]>firstlargest
	 * swap secondlargest with firstlasrgest and assing index[i] to second largest
	 * else indext[i]<firstlargest and index[i]>secondlargest assigng only second
	 * largest to index [i] return second largest
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] input = new int[] { 10, 20, 30, 40, 50, 60, 70 };
		int second = secondlargetnumer(input);
		System.out.println("Second larget is" + second);
		
Arrays.sort(input);
System.out.println("Second highest"+input[1]);
	}

	private static int secondlargetnumer(int[] input) {
		int firstlargest = 0;
		int secondlarget = 0;

		if (input[0] > firstlargest) {
			firstlargest = input[0];
		} else {
			firstlargest = input[1];
			secondlarget = input[0];
		}
		for (int i = 2; i < input.length; i++) {
			if (input[i] > firstlargest) {
				// note first assign first largest to secondlarget then input[i] to first
				// largest
				secondlarget = firstlargest;
				firstlargest = input[i];
			} else if (input[i] < firstlargest && input[i] > secondlarget) {
				secondlarget = input[i];
			}
		}
		return secondlarget;

	}

}

package com.test.hello;

public class commaonelementtwoarray {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 5, 6 };
		int[] arr2 = { 2, 3, 6, 7, 8 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {// compaire and print comman element in array
					System.out.println(arr1[i]);
				}
			}
		}

		// when they ask remov first and last element in arrray
		for (int k = 1; k < arr1.length - 1; k++) {
			System.out.println(arr1[k]);
		}
	}

}

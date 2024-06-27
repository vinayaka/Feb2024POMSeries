package com.test.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
        int temp;
        
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
//        //second method
//        List<Integer> a=new ArrayList();
//    	List<Integer> reversedList = Arrays.asList(arr);// Create a copy of the input list
//        int size = reversedList.size();
//        
//        for (int i = 0; i < size / 2; i++) {
//            int temp = reversedList.get(i);
//            reversedList.set(i, reversedList.get(size - 1 - i));
//            reversedList.set(size - 1 - i, temp);
//        }
//        
//        return reversedList;
   // }
	}
	
	

}

package com.test.demo;

import java.util.Arrays;

public class ArrayFindElement {
///Reomve or delete element from array
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};//create an array from whcih we need to remove element
		int findElement=5; //create varible that holds value to remove
       int[] a=find(arr,findElement);
       
       System.out.println("Original Array"+Arrays.toString(arr));
       System.out.println("New Array"+Arrays.toString(a));
	}

	
	
	public static int[] find(int[] array,int element)
	{
		int index=0;
		int[] newarray= new int [array.length-1];
		for(int i=0;i<array.length;i++) { //itrate 
			if(array[i]!=element) {
				newarray[index]=array[i]; //add element if not match the element
				index++;
			}
		}
		
		return newarray;
	}
}

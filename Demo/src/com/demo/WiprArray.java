package com.demo;

import java.util.Arrays;
import java.util.TreeSet;

public class WiprArray {

	public static void main(String[] args) {
		int[] arr= {2,3,15,19,32,14,102,2,3};
	TreeSet<Integer> unitree=new TreeSet<Integer>();
	
		//Arrays.sort(arr);
		//remove duplicate
		//find the second highest
		//Step 1 sort array
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
//		for(int k=0;k<arr.length;k++) {
//			System.out.println(arr[k]);
//		}
		//Step 2 find the unique element using uniqcount=1 and i=1
		int uniqcount=1;
		
		//Start the loop with index =1 
		for(int i=1;i<arr.length;i++) {
			//Compaire first index with previosus one as not equal and if not equal increment count
			if(arr[i]!=arr[i-1]) { //note we are comparing a[i] with a[i-1]
				uniqcount++;
			}
	}
	System.out.println(uniqcount);
	//Step 3 create new Array without duplicate and first index[0] to witho
		int index=1;
		
		int[] withoutdup=new int[uniqcount];
		//Assign first element to index 0 of arrray and start with length 1
		withoutdup[0]=arr[0];
		for(int j=1;j<arr.length;j++) {
			if(arr[j]!=arr[j-1]) {
				withoutdup[index++]=arr[j];
			}
		}
		
	for(int k=0;k<withoutdup.length;k++) {
	System.out.println(withoutdup[k]);
	}
	
	
	//Step 4 getting second highest
	int highest=Integer.MIN_VALUE;
	int secondhighest=Integer.MIN_VALUE;
	for(int num:arr) {
		//Compaire num with highest and second hightst 
		if(num>highest) {
		///if num id greared the second highrst re-assign num to highest and now secondhightst willl change highst
			secondhighest=highest;
			highest=num;
			
		}else if(num >secondhighest && num !=highest) {
			secondhighest=num;
		}
		
		
	}
	System.out.println("Second highest is"+secondhighest);
}
}
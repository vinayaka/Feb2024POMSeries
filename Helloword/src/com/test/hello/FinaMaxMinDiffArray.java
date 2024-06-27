package com.test.hello;

public class FinaMaxMinDiffArray {

	public static void main(String[] args) {
		int[] arr= {10,90,2,40,1,25,1};
		//take any one element in array assing to max and mi for comaring in for loop
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
System.out.println(max+"Minium"+min+"Diffrence"+(max-min));
	}

}

package com.test.demo;

import java.util.Arrays;

public class segregrate0and1 {

	public static void main(String[] args) {
		int a[]= {0,1,0,1,0,0,1};
		
		
	for (int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
	
				if(a[i]!=a[j] & a[i]!=0) {
				int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		}
		System.out.println("After re-arrange"+Arrays.toString(a));
		
		
	}

}

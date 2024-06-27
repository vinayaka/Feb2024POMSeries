package com.demo;

import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr= {2,3,15,19,32,14,102,2,3};
		//List<int[]> intarr=List.of(arr);
		TreeSet<Integer> uniqtree=new TreeSet<Integer>();
		
for(int num:arr) {
	uniqtree.add(num);
}
		System.out.println("unitree"+uniqtree);
		}

	}



package com.test.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		 int a[]= {1,1,1,1,1} ;
		 int b[]= {1,2,3,4,5,7};
		     /*   int count=0;
		        
		for(int i=0;i<a.length;i++){
		    if(a[i]==1){
		         count++;
		    }
		 
		}
		   System.out.println(count);
		    }*/
		

			 int totalelement=b.length;
		 ArrayList al=new ArrayList();
		 for(int i=0;i<b.length;i++) {
			 al.add(b[i]);
		 }
		 System.out.println(al);
			
			  while(totalelement>=1)
			  { 
				  if(!al.contains(totalelement>1)) 
				  {
			  System.out.println("Missing element is"+totalelement);
			  } totalelement--; }
			 
	}

	}


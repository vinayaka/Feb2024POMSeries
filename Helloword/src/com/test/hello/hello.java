package com.test.hello;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hello {

	public static void main(String[] args) {
		String str="vinayaka";
		HashMap<Character,Integer> cmap=new HashMap<Character,Integer>();
		char[] c=str.toCharArray();
		for(char ch:c) {
			
			if(cmap.containsKey(ch)) {
				cmap.put(ch, cmap.get(ch)+1);
			}else {
				cmap.put(ch, 1);
			}
		}
		
int maxcount=0;
char maxchar=0;

for(Entry<Character, Integer> entry:cmap.entrySet()) {
	if(entry.getValue()>maxcount) {
		maxcount=entry.getValue();
		maxchar=entry.getKey();
	}
	
		
	
		
	
	
}
System.out.println(maxcount+"--char--"+maxchar);
	}

}

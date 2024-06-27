package com.test.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class countcharacter {

	public static void main(String[] args) {
	String str="It is tuesday";
	
	str=str.replaceAll(" ", "");
	char[] ch=str.toCharArray();
	HashMap<Character,Integer> hpmap=new HashMap<Character,Integer>();
	for(char c :ch) {
		if(hpmap.containsKey(c)) {
			hpmap.put(c, hpmap.get(c)+1);
		}else {
			hpmap.put(c, 1);
		}
		
	}
	
	int maxvalue=0;
	char maxkey=0;
	for(Entry<Character,Integer> entry:hpmap.entrySet()) {
		if(entry.getValue()>maxvalue) {
			maxvalue=entry.getValue();
			maxkey=entry.getKey();
			
		}
		
	}
	System.out.println(maxvalue+":"+maxkey);
	}

}

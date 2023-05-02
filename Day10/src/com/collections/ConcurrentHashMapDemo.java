package com.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> myMap=new ConcurrentHashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
	
		System.out.println("HashMap before iteration: "+myMap);
		Iterator<String> it1=myMap.keySet().iterator();
		
		while(it1.hasNext()) {
			String key=it1.next();
			if(key.equals("3"))
				myMap.put(key+"new", "new3");//"3new", "new3"
		}
		System.out.println("HashMap after iteration: "+myMap);
	
	}

}

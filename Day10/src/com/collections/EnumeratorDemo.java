package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector=new Vector<String>();
		vector.add("keep");
		vector.add("kalm");
		vector.add("and");
		vector.add("learn");
		vector.add("java");
		
		System.out.println(vector);

		Enumeration<String> enumeration=vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
	}

}

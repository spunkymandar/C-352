package com.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> numbers=new PriorityQueue<Integer>();
		
		numbers.add(3);
		numbers.add(10);
		numbers.add(15);
		System.out.println(numbers);
		
		numbers.offer(20);
		System.out.println(numbers);
		numbers.add(30);
		System.out.println(numbers);
		//Collection: 10 capacity 
		// 5 elements : 50% if scale factor is 0.5 
		//capacity is incrdasd to 20
	
		/*
		 * ArrayList : default capacity is 10, and scale is 0.5
		 * Arraylist: initial capacity of 50 : 
		 * 51th element 
		 * 
		 */
	}

}

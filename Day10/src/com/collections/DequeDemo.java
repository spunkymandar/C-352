package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> numbers=new ArrayDeque<Integer>();
		numbers.add(10);
		numbers.add(5);
		
		System.out.println(numbers);
		numbers.offer(100);
		System.out.println(numbers);
		numbers.offerFirst(200);
		System.out.println(numbers);
		
		System.out.println(numbers.peekFirst());
		System.out.println(numbers);
		
		System.out.println(numbers.pollFirst());
		System.out.println(numbers);

	}

}

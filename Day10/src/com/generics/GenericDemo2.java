package com.generics;
//Object-->Number-->Integer,Double, Float
class GenericClassNumber<T extends Number>{//super //method template
	private T data;
	public GenericClassNumber(T data) {
		this.data=data;
	}
	public T getData() {
		return data;
	}
}

public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClassNumber<Integer> number1=new GenericClassNumber<Integer>(10);
		System.out.println(number1.getData());
		
//		GenericClassNumber<String> number2=new GenericClassNumber<String>("Wiley");
//		System.out.println(number2.getData());
		
		GenericClassNumber<Double> number2=new GenericClassNumber<Double>(10.20);
		System.out.println(number2.getData());
		
	}

}

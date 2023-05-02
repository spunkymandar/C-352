package com.generics;

class GenericClass<T,V>{
	private T data;
	private V data2;
	public GenericClass(T data, V data2) {
		this.data=data;
		this.data2=data2;
	}
	public T getData() {
		return data;
	}
	public V getData2() {
		return data2;
	}
	
}


public class GenericDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String,Integer> class1=new GenericClass<String,Integer>("Wiley",200);
		System.out.println("String  Data: "+class1.getData());
		
		GenericClass<Integer,Double> class2=new GenericClass<Integer,Double>(20,34.12);
		System.out.println("Integet Data: "+class2.getData());
		
		

	}

}

package com.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Date d1=new Date(28,4,2023);
		Employee employee1=new Employee(101,"John Doe",d1);
		
		FileOutputStream fos=new FileOutputStream("emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(employee1);//object 24 4 2023
		
		
		System.out.println("Object is serialized");
		fos.close();
		
		FileInputStream fis=new FileInputStream("emp.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e=(Employee)ois.readObject();
		
		System.out.println(e);
		
		
		
	}

}

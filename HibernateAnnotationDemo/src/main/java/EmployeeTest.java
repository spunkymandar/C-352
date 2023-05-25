//package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1=new Employee("Alex","Carey",12000);
		session.save(e1);
		
//		Employee e=session.load(Employee.class, 101);
//		System.out.println(e);
		
		transaction.commit();
		session.close();
		factory.close();

	}

}

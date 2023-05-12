package com.anno.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDAOImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer c=new Customer(101,"John Doe");
		
		CustomerDAO customerDAO=(CustomerDAO)context.getBean("customerDAOImpl");
		int row=customerDAO.addCustomer(c);
		if(row>0)
			System.out.println("Record added!!");
	
		CustomerDAO customerDAO1=(CustomerDAO)context.getBean("customerDAOImplNamedParameter");
		int row1=customerDAO1.addCustomer(c);
		if(row1>0)
			System.out.println("Record added");
	
	}

}

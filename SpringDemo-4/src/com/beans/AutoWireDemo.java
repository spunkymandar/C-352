package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean employee1=(EmployeeBean)context.getBean("employee1");
		System.out.println(employee1.getFullName()+" , "+employee1.getDepartmentBean().getName());

	}

}

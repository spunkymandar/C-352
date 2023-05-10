package com.beans;
/*
 * Eagerly loaded object : ApplicationContext
 * Lazily loaded object: BeanFactory 
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using application contenxt ");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Employee e1=(Employee)applicationContext.getBean("emp4");
		System.out.println(e1);
		
		
		//ApplicationContext applicationContext1=new ClassPathXmlApplicationContext(new String[] {"bean1.xml","beans2.xml"});
		

	}

}

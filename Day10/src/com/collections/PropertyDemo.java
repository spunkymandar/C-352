package com.collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws SQLException {//PropertyDemo.main
		// TODO Auto-generated method stub
		Properties prop1=new Properties();

		prop1.setProperty("name", "Mandar");
		prop1.setProperty("email", "mandarmjog@gmail.com");
		
		System.out.println(prop1);
		System.out.println(prop1.getProperty("name"));
		
		System.out.println(System.getProperties());
		
		Properties prop2=new Properties();
		prop2.put("username", "root");
		prop2.put("password", "root123");
		
		
		Connection con=DriverManager.getConnection("", prop2);
		
		Connection con1=DriverManager.getConnection("", "root","root123");
		
		//Connection con1=DriverManager.getConnection(String url, Properties prop);
		
		
		
	}

}

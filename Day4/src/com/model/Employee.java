package com.model;
public class Employee {
	// attribute
	int empId;// identity //Default access specifier
	protected String empName;
	private double empSalary;
	private static int counter;
	/*
	 * class variable
	 * shared across all the object. Single copy is created which can be modified by all the objects 
	 * static variables has default value 0 (int) similar to instance variables 
	 */
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

		
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public static int getCounter() {//method for class to access. Used to access the static variables
		//static methods cannot access the instance variables.
		//you cannot use any keywords which are dedicated to objects inside such methods. Like: this(), super()
		//static variables can be modified within the non-static methods. 
		return counter;
	}
	
	
	

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		counter++;
	}
	
	
}
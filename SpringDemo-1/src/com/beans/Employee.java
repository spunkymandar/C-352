package com.beans;

public class Employee {
	private int empId;
	
	private String empName;
	private String deptName;
	
	
	public Employee(String empName, int empId, String deptName) {
		super();
		System.out.println("String, int, int invoked");
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
	}
	
	public Employee(int empId, String empName, String deptName) {
		super();
		System.out.println(" int,String, String invoked!!");
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
	}
	
	
	
	
	public Employee(int empId, String empName ) {
		super();
		this.empId = empId;
		this.empName = empName;
		//this.deptName = deptName;
	}
	
	public Employee() {
//		System.out.println("Constructor invoked");
	}
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + "]";
	}
	
	

}

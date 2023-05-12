package com.beans;

public class EmployeeBean {
	private String fullName;
	private DepartmentBean departmentBean;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	public EmployeeBean(DepartmentBean departmentBean) {
		super();
		//this.fullName = fullName;
		this.departmentBean = departmentBean;
	}
	
	

}

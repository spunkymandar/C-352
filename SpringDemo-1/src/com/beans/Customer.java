package com.beans;

public class Customer {
	private int customerId;
	private String custName;
	private Address custAddress;
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", custName=" + custName + ", custAddress=" + custAddress + "]";
	}
	
	
	public Customer() {
		
	}


	public Customer(int customerId, String custName, Address custAddress) {
		super();
		this.customerId = customerId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	
	

}

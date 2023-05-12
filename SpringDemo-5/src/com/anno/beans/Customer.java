package com.anno.beans;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int customerId;
	private String customerName;

	CompletableFuture<Integer> t;
	private Address address;
	
//	@Autowired
//	public Customer(Address address) {
//		this.address=address;
//	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Autowired
	public Customer(Address address) {
		customerId=101;
		customerName="John Doe";
		this.address=address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

}

package com.anno.beans;

public interface CustomerDAO {
	public int addCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	public boolean deleteCustomer(int customerId);

}

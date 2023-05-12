package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Repository(value="customerDAOImpl")
public class CustomerDAOJdbcTemplateImpl implements CustomerDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int rows=0;
		String insertQuery="insert into customer values(?,?)";
		rows=jdbcTemplate.update(insertQuery, customer.getCustomerId(), customer.getCustomerName());
		
		return rows;
	}

	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

}

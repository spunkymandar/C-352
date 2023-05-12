package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository(value="")
public class CustomerDAOJDBCSupportImpl extends JdbcDaoSupport implements CustomerDAO{

	@Autowired
	public CustomerDAOJDBCSupportImpl(JdbcTemplate  jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("");
		return 0;
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

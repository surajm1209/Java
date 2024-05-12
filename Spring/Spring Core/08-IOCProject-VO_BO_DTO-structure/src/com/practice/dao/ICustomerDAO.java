package com.practice.dao;

import com.practice.bo.CustomerBO;

public interface ICustomerDAO {
	public int save(CustomerBO bo) throws Exception;
}	

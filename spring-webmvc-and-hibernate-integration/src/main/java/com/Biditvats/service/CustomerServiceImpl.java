package com.Biditvats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Biditvats.dao.CustomerDao;
import com.Biditvats.domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerDao customerDao;

	@Override
	public Long saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	@Override
	public Customer findCustomerById(Long id) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(id);
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(Long id) {
		// TODO Auto-generated method stub

	}

}

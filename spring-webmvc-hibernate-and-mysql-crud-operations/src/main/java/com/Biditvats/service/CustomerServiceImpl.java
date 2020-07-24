package com.Biditvats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Biditvats.dao.CustomerDao;
import com.Biditvats.domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer findCustomerById(Long customerId) {
		return customerDao.findCustomerById(customerId);
	}

	@Override
	@Transactional
	public List<Customer> findAllCustomers() {
		return customerDao.findAllCustomers();
	}

	@Override
	@Transactional
	public void deleteCustomer(Long customerId) {
		customerDao.deleteCustomer(customerId);
	}
	
}

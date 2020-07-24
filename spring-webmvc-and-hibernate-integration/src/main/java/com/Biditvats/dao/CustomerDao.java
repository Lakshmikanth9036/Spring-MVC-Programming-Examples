package com.Biditvats.dao;

import java.util.List;

import com.Biditvats.domain.Customer;

public interface CustomerDao {
	public Long saveCustomer(Customer customer);
	public Customer findCustomerById(Long id);
	public List<Customer> findAllCustomers();
	public void deleteCustomer(Long id);
}

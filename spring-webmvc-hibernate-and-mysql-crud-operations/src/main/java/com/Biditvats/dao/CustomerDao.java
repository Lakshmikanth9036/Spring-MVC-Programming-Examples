package com.Biditvats.dao;

import java.util.List;

import com.Biditvats.domain.Customer;

public interface CustomerDao {
	public void saveCustomer(Customer customer);
	public Customer findCustomerById(Long customerId);
	public List<Customer> findAllCustomers();
	public void deleteCustomer(Long customerId);
}

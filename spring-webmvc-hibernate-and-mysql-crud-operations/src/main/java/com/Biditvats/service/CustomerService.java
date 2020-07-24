package com.Biditvats.service;

import java.util.List;

import com.Biditvats.domain.Customer;


public interface CustomerService {
	public void saveCustomer(Customer customer);
	public Customer findCustomerById(Long customerId);
	public List<Customer> findAllCustomers();
	public void deleteCustomer(Long customerId);
}

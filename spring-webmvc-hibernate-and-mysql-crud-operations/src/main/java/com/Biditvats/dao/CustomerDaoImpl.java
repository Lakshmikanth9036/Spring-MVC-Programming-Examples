package com.Biditvats.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Biditvats.domain.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	@Override
	public Customer findCustomerById(Long customerId) {
		return sessionFactory.getCurrentSession().get(Customer.class, customerId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAllCustomers() {
		return sessionFactory.getCurrentSession()
				.createCriteria(Customer.class)
				.list();
	}

	@Override
	public void deleteCustomer(Long customerId) {
		Customer customer = sessionFactory.getCurrentSession()
							 .get(Customer.class, customerId);
		sessionFactory.getCurrentSession().delete(customer);
				
	}
	
}

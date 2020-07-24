package com.Biditvats.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Biditvats.domain.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Long saveCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long) session.save(customer);
		session.getTransaction().commit();
		session.close();
		return id;
	}

	@Override
	public Customer findCustomerById(Long id) {
		Session session = sessionFactory.openSession();
		Customer customer = session.get(Customer.class, id);
		session.close();
		return customer;
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

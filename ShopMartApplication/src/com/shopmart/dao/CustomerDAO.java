package com.shopmart.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopmart.entity.Customer;
import com.shopmart.entity.CustomerRole;

@Repository
public class CustomerDAO {

	@Autowired
    private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		return this.sessionFactory.getCurrentSession().createQuery("from Customer").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> getCustomerById(int customerId) {
		return this.sessionFactory.getCurrentSession().createQuery("from Customer WHERE CUSTOMER_ID = "
				+ customerId).list();
	}


	public void addCustomer(Customer customer) {
		this.sessionFactory.getCurrentSession().save(customer);
	}
	

	public void addCustomerRole(CustomerRole customerrole) {
		this.sessionFactory.getCurrentSession().save(customerrole);
	}
	
}

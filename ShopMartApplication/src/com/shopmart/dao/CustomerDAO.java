package com.shopmart.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.shopmart.entity.Customer;
import com.shopmart.entity.CustomerRole;
import com.shopmart.entity.EmployeeEntity;

@Repository
public class CustomerDAO {

	@Autowired
    private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM CUSTOMER").list();
	}
	
	public Customer getCustomerByCustomerId(Integer customerId) {
		Customer customer = (Customer) this.sessionFactory.getCurrentSession().get(
				Customer.class, customerId);
		return customer;
	}
	
	public void addCustomerDetails(Customer customer) {
		this.sessionFactory.getCurrentSession().save(customer);
	}

	public void updateCustomerdetails(Customer customer) {
		this.sessionFactory.getCurrentSession().update(customer);
	}
	
	public void deleteCustomer(Integer customerId) {
		Customer customer = (Customer) sessionFactory.getCurrentSession().get(Customer.class, customerId);
        if (null != customer) {
        	this.sessionFactory.getCurrentSession().delete(customer);
        }
	}
		
	public void addCustomerRole(CustomerRole customerrole) {
		this.sessionFactory.getCurrentSession().save(customerrole);
	}
	
}

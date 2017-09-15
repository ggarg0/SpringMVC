package com.shopmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopmart.dao.CustomerDAO;
import com.shopmart.entity.Customer;
import com.shopmart.entity.CustomerRole;
import com.shopmart.entity.EmployeeEntity;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerdao;
	
	@Autowired
	CustomerRole customerrole;
	
	public List<Customer> getAllCustomers(){
		return customerdao.getAllCustomers();
	}
	
	@Transactional
	public Customer getCustomerByCustomerId(int customerId){
		return customerdao.getCustomerByCustomerId(customerId);
	}	

	@Transactional
	public void addCustomerDetails(Customer customer) {
		customerdao.addCustomerDetails(customer);
	}
	
	@Transactional
	public void updateCustomerdetails(Customer customer) {
		customerdao.updateCustomerdetails(customer);
	}
	
	@Transactional
	public void deleteCustomer(Integer customerId) {
		customerdao.deleteCustomer(customerId);
	}
	
	
	@Transactional
	public void addCustomerRole(Customer customer) {
		customerrole.setCustomerId(customer.getCustomerId());
		customerrole.setUsername(customer.getFirstName());
		customerrole.setPassword("pass");
		customerrole.setRole("user");
		customerrole.setEnabled(1);		
		customerdao.addCustomerRole(customerrole);
	}
	
}

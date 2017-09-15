package com.shopmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopmart.entity.Customer;
import com.shopmart.entity.EmployeeEntity;
import com.shopmart.service.CustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;	
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}		
	
	@RequestMapping(value = "/newCustomerRegistration", method = RequestMethod.GET)
	public String newCustomer(ModelMap model) {
		model.addAttribute("customer", new Customer());
		return "newCustomerRegistration";
	}	

	@RequestMapping(value = "/addCustomerDetails", method = RequestMethod.POST)
	public String addCustomerDetails(@ModelAttribute(value = "customer") Customer customer,
			BindingResult result) {
		customerService.addCustomerDetails(customer);
		customerService.addCustomerRole(customer);
		return "redirect:/login";
	}
	
	@RequestMapping("/editCustomerDetails/{customerId}")
	public String editCustomerDetails(@PathVariable("customerId") Integer customerId, ModelMap model) {
		model.addAttribute("customer", customerService.getCustomerByCustomerId(customerId));
		return "editCustomerDetails";
	}
		
	@RequestMapping(value = "/updateCustomerDetails", method = RequestMethod.POST)
	public String updateCustomerDetails(@ModelAttribute(value = "customer") Customer customer,
			BindingResult result) {
		customerService.updateCustomerdetails(customer);
		return "redirect:/reports";
	}
	
	@RequestMapping("/deleteCustomer/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") Integer customerId) {
		customerService.deleteCustomer(customerId);
		return "redirect:/reports";
	}
	
}

package com.shopmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopmart.dao.ReportDAO;
import com.shopmart.entity.Customer;
import com.shopmart.entity.Orders;

@Service
public class ReportService {

		@Autowired
		private ReportDAO reportDAO;
		
		@Transactional
		public List<Customer> getAllCustomers(){
			return reportDAO.getAllCustomers();
		}
		
		@Transactional
		public List<Orders> getAllOrders(){
			return reportDAO.getAllOrders();
		}
			

		@Transactional
		public List<Orders> getOrdersByCustomerID(int customerId){
			return reportDAO.getOrdersByCustomerID(customerId);
		}
			
			
		@Transactional
		public List<Orders> getProductInventory(){
			return reportDAO.getProductInventory();
		}
		
}

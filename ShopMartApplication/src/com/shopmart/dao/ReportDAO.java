package com.shopmart.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopmart.entity.Customer;
import com.shopmart.entity.Orders;
import com.shopmart.entity.Product;

@Repository
public class ReportDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM PRODUCT").list();
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProductById(int productId) {
		return this.sessionFactory.getCurrentSession().createQuery(" FROM PRODUCT WHERE PRODUCT_ID = " + productId)
				.list();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers(){
		return this.sessionFactory.getCurrentSession().createQuery("FROM CUSTOMER").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Orders> getAllOrders(){
		return this.sessionFactory.getCurrentSession().createQuery("FROM ORDERS").list();
	}
		

	@SuppressWarnings("unchecked")
	public List<Orders> getOrdersByCustomerID(int customerId){
		return this.sessionFactory.getCurrentSession().createQuery(" FROM ORDERS WHERE CUSTOMER_ID = " 
				+ customerId).list();
	}
		
		
	@SuppressWarnings("unchecked")
	public List<Orders> getProductInventory(){
		return this.sessionFactory.getCurrentSession().createQuery(" FROM PRODUCT").list();
	}
	
	
}

package com.shopmart.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopmart.entity.Checkout;

@Repository
public class CheckoutDAO {

	@Autowired
    private SessionFactory sessionFactory;

	public void addProductToCart(Checkout checkout) {
		this.sessionFactory.getCurrentSession().save(checkout);
	}
	
}

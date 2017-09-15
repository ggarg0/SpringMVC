package com.shopmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.shopmart.dao.CheckoutDAO;
import com.shopmart.entity.Checkout;

public class CheckoutService {

	@Autowired
	private CheckoutDAO checkoutDAO;
	
	@Transactional
	public void addProductToCart(Checkout checkout) {
		checkoutDAO.addProductToCart(checkout);
	}	
}

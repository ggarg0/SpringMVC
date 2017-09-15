package com.shopmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopmart.entity.Checkout;
import com.shopmart.entity.Product;
import com.shopmart.service.CheckoutService;

@Controller
public class CheckoutController {

	@Autowired
	private CheckoutService checkoutService;	
	
	@Autowired
	private Checkout checkout;	
	
	public void setCheckoutService(CheckoutService checkoutService) {
		this.checkoutService = checkoutService;
	}		
	
	@RequestMapping(value = "/addProductToCart", method = RequestMethod.POST)
	public String addProductToCart(@ModelAttribute("product") Product product,
			BindingResult result) {
		
		checkout.setCheckoutId("Trans"+"123");
		checkout.setProductId(1000011);
		checkout.setCustomerId(100007);
		checkout.setQuantity(1);
		
		checkoutService.addProductToCart(checkout);
		return "redirect:/getProductDetailsByProductId/" + 1000011;
	}
}

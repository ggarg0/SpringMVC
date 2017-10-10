package com.shopmart.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopmart.entity.Checkout;
import com.shopmart.entity.Customer;
import com.shopmart.entity.Product;
import com.shopmart.service.CheckoutService;
import com.shopmart.service.ProductService;

@Controller
public class CheckoutController {

	@Autowired
	private CheckoutService checkoutService;

	@Autowired
	private ProductService productService;

	@Autowired
	private Customer customer;

	@Autowired
	private Checkout checkout;

	public void setCheckoutService(CheckoutService checkoutService) {
		this.checkoutService = checkoutService;
	}

	@RequestMapping("/addProductToCart/{productId}")
	public String addProductToCart(@PathVariable int productId,
			HttpServletRequest request) {
		
		Product product = productService.getProductById(productId).get(0);
		Integer custId = (Integer) request.getSession().getAttribute("customerId");
		
		checkout.setCheckoutId(getCheckoutId());
		checkout.setProductId(product.getProductId());
		checkout.setCustomerId(custId);
		checkout.setQuantity(1);
		checkoutService.addProductToCart(checkout);
		
		int availableQuantity = product.getAvailableQuantity() - 1;
		int soldQuantity = product.getSoldQuantity() + 1;
		
		product.setAvailableQuantity(availableQuantity);
		product.setSoldQuantity(soldQuantity);
		productService.updateProductDetails(product);
		
		return "redirect:/getProductDetailsByProductId/"
				+ product.getProductId();
	}

	public List<Product> getProductById(@PathVariable int productId) {
		return productService.getProductById(productId);
	}

	public String getCheckoutId() {
		return "checkout"
				+ new SimpleDateFormat("yyMMddHHmmss").format(Calendar
						.getInstance().getTime());

	}
}

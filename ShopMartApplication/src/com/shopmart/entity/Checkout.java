package com.shopmart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "CHECKOUT")
@Table(name="CHECKOUT")
public class Checkout {

	@Id
	@Column(name="CHECKOUT_ID")
	String checkoutId;
	
	@Column(name="CUSTOMER_ID")
	int customerId;
	
	@Column(name="PRODUCT_ID")
	int productId;
	
	@Column(name="QUANTITY")
	int quantity;
	
	public String getCheckoutId() {
		return checkoutId;
	}

	public void setCheckoutId(String checkoutId) {
		this.checkoutId = checkoutId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
}

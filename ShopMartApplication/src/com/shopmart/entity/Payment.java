package com.shopmart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "PAYMENT")
@Table(name = "PAYMENT")
public class Payment {

	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paymentId_generator")
	@SequenceGenerator(name="paymentId_generator", sequenceName = "SHOPMART_PAYMENT_SEQ", allocationSize=1)
	@Column(name = "PAYMENT_ID", updatable = false, nullable = false)
	String paymentId;

	@Column(name = "PAYMENT_TYPE")
	String paymentType;

	@Column(name = "PAYEMENT_AMOUNT")
	Double paymentAmount;

	@Column(name = "PAYMENT_STATUS")
	String paymentStatus;

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}

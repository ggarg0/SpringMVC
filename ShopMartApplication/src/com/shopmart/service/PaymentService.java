package com.shopmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopmart.dao.PaymentDAO;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentDAO paymentdao;
	
}

package com.shopmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shopmart.service.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
}

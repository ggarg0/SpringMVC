package com.shopmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shopmart.service.OrderDetailsService;

@Controller
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService orderDetailsService;
	
}

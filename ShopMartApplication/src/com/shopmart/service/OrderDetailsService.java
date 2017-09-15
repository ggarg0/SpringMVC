package com.shopmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopmart.dao.OrderDetailsDAO;

@Service
public class OrderDetailsService {

	@Autowired
	private OrderDetailsDAO orderDeatilsDAO;
	
}

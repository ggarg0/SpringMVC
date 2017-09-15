package com.shopmart.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shopmart.entity.Orders;
import com.shopmart.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	private ReportService reportService;	
	
	public void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}		
	
	@RequestMapping(value = "/reports", method = RequestMethod.GET)
	public ModelAndView getAllCustomers() {		
		Map<String, Object> model = new HashMap<>();
		model.put("customerList", reportService.getAllCustomers());
			return new ModelAndView("reports", "model", model);
		
	}	
	
	@RequestMapping("/getAllOrders")
	public ModelAndView getAllOrders(){
		Map<String, Object> model = new HashMap<>();
		model.put("orderList", reportService.getAllOrders());
			return new ModelAndView("reports", "model", model);
	}
		
	@RequestMapping("/getOrdersByCustomerID/{customerId}")
	public List<Orders> getOrdersByCustomerID(@PathVariable int customerId){
		return reportService.getOrdersByCustomerID(customerId);
	}
	
	
		
	@RequestMapping("/getProductInventory")
	public ModelAndView getProductInventory(){
		Map<String, Object> model = new HashMap<>();
		model.put("productInventoryList", reportService.getProductInventory());
			return new ModelAndView("reports", "model", model);
	}
		
}

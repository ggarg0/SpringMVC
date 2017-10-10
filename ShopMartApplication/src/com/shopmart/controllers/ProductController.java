package com.shopmart.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shopmart.entity.Customer;
import com.shopmart.entity.Product;
import com.shopmart.service.CategoryService;
import com.shopmart.service.CustomerService;
import com.shopmart.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private CustomerService customerService;
	
	 @Autowired
	 private Customer customer;
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping("/getProductById/{productId}")
	public List<Product> getProductById(@PathVariable int productId){
		return productService.getProductById(productId);
	}
	
	
	@RequestMapping("/getProductByCategory/{categoryId}")
	public ModelAndView getProductByCategory(@PathVariable int categoryId){
		Map<String, Object> model = new HashMap<>();
		model.put("categoryList", categoryService.getAllCategory());
		model.put("productList", productService.getProductByCategory(categoryId));	
		return new ModelAndView("viewProductByCategoryList", "model", model);
	}

	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public ModelAndView getAllProducts() {		
		Map<String, Object> model = new HashMap<>();
		model.put("categoryList", categoryService.getAllCategory());
		model.put("productList", productService.getAllProducts());	
		return new ModelAndView("viewProductList", "model", model);		
	}
	
	@RequestMapping(value = "/getProductsList", method = RequestMethod.GET)
	public ModelAndView getAllProduct(HttpSession session) {		
		Map<String, Object> model = new HashMap<>();		
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String username = auth.getName(); //get logged in username
		customer = customerService.getCustomerByUsername(username);
        model.put("customerList", customer);
        session.setAttribute("username", customer.getFirstName());
        session.setAttribute("customerId", customer.getCustomerId());
		model.put("categoryList", categoryService.getAllCategory());
		model.put("productList", productService.getAllProducts());	
		return new ModelAndView("viewProductList", "model", model);		
	}
	
	
	
	@RequestMapping(value = "/getProductDetailsByProductId/{productId}")
	public String getProductDetailsByProductId(@PathVariable("productId") Integer productId,
			@ModelAttribute(value = "product") Product product,
			BindingResult result, ModelMap model) {
		model.addAttribute("productdetails", productService.getProductDetailsByProductId(productId));
		return "viewProductDetails";
	}
	
}

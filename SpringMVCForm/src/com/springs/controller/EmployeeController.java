package com.springs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springs.model.Employee;
import com.springs.validator.EmployeeValidator;

@Controller
@RequestMapping("/addNew")
public class EmployeeController {

	@Autowired
	private EmployeeValidator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "addEmployee";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("employee") Employee employee,
			BindingResult result) {

		System.out.println(employee); // Verifying if information is same as
										// input by user

		validator.validate(employee, result);
		boolean error = false;
		
		 if(employee.getFirstName().contains("gaurav")){
		        result.rejectValue("firstName", "valid.firstNameContain");
		        error = true;
		    }

		if (result.hasErrors() || error) {
			return new ModelAndView("addEmployee");  
			//return "addEmployee";
		}

	
		List list= new ArrayList();
		list.add(employee);
		// validation code ends

		// Store the employee information in database
		// manager.createNewRecord(employeeVO);

		// Mark Session Complete
		
		  return new ModelAndView("addSuccess","list",list);  
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public ModelAndView success(Model model) {
		return new ModelAndView("addSuccess");
		
	}
}
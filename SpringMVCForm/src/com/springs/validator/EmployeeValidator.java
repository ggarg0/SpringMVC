package com.springs.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springs.model.Employee;

@Component
public class EmployeeValidator implements Validator {

	public boolean supports(Class<?> paramClass) {
		return Employee.class.isAssignableFrom(paramClass);
	}

	public void validate(Object obj, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empId", "valid.empId");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "valid.firstName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "valid.lastName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "valid.email");
	}
}

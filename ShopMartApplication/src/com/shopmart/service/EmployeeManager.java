package com.shopmart.service;

import java.util.List;

import com.shopmart.entity.EmployeeEntity;

public interface EmployeeManager {
	public void addEmployee(EmployeeEntity employee);
	public void editEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
    public EmployeeEntity getEmployee(Integer employeeId);
}

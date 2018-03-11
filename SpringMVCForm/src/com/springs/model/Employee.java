package com.springs.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	 



	private Integer empId;
    private String firstName;
    private String lastName;
    private String email;
	

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

 
    //Getters and Setters
 
    @Override
    public String toString() {
        return "EmployeeVO [empId=" + empId + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + "]";
    }
	
}

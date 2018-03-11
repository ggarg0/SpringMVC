package com.springs.curd.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  

import com.springs.curd.model.Employee;

public class EmployeeDao {

	@Autowired  
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Employee p){  
	    String sql= "insert into employees(employee_id, first_name, last_name,email, phone_number,"
	    		+ "hire_date, job_id, salary, commission_pct, manager_id, department_id) values"
	    		+ "("+p.getEmployeeId() +","
	    				+ "'"+p.getFirstName()+"',"
	    				+ "'"+p.getLastName()+"',"
	    				+ "'"+p.getEmail()+"',"
	    				+ "'"+p.getPhoneNumber()+"',"
	    				+ "'"+p.getHireDate() +"',"
	    				+ "'"+p.getJobId() +"',"
	    				+ ""+p.getSalary() +","
	    				+ "'"+p.getCommissionPct() +"',"
	    				+ p.getManagerId() +","
	    				+ p.getDepartmentId()+")";  
	    return template.update(sql);  
	}  
	
	
	public int update(Employee p){  
	    String sql="update employees set first_name='"+p.getFirstName() +"',"
	    		+ "last_name='"+p.getLastName() +"',"
	    		+ "email='"+p.getEmail() +"',"
	    		+ "phone_number='"+p.getPhoneNumber() +"',"
	    		+ "job_id='"+p.getJobId() +"',"
	    	    + " salary="+p.getSalary()+","
	    	   	+ " manager_id="+p.getManagerId() + ","
	    		+ " department_id="+p.getDepartmentId()
	    		+ " where employee_id="+p.getEmployeeId()+"";  
	    return template.update(sql);  
	}  
	
	
	public int delete(int id){  
	    String sql="delete from employees where employee_id="+id+"";  
	    return template.update(sql);  
	}  
	

	public Employee getEmpById(int id){  
	    String sql="select * from employees where employee_id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));  
	}  
	
	
	public List<Employee> getEmployees(){  
	    return template.query("select * from employees order by employee_id asc",new RowMapper<Employee>(){  
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {  
	        	Employee e=new Employee();  
	            e.setEmployeeId(rs.getInt(1));  
	            e.setFirstName(rs.getString(2));  
	            e.setLastName(rs.getString(3));  
	            e.setEmail(rs.getString(4));  
	            e.setPhoneNumber(rs.getString(5));  
	            e.setHireDate(rs.getString(6));  
	            e.setJobId(rs.getString(7));  
	            e.setSalary(rs.getInt(8));
	            e.setCommissionPct(rs.getString(9));  
	            e.setManagerId(rs.getString(10));  
	            e.setDepartmentId(rs.getString(11));
	            return e;  
	        }  
	    });  
	}  
	
	public List<Employee> getEmployeesByPage(int pageid,int total){  
	    String sql="select * from Emp limit "+(pageid-1)+","+total;  
	    return template.query(sql,new RowMapper<Employee>(){  
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {  
	        	Employee e=new Employee();  
	        	  e.setEmployeeId(rs.getInt(1));  
		            e.setFirstName(rs.getString(2));  
		            e.setLastName(rs.getString(3));  
		            e.setEmail(rs.getString(4));  
		            e.setPhoneNumber(rs.getString(5));  
		            e.setHireDate(rs.getString(6));  
		            e.setJobId(rs.getString(7));  
		            e.setSalary(rs.getInt(8));
		            e.setCommissionPct(rs.getString(9));  
		            e.setManagerId(rs.getString(10));  
		            e.setDepartmentId(rs.getString(11));  
	            return e;  
	        }  
	    });  
	} 
	
}

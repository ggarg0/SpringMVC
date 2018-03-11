<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Success</title>
</head>
<body>
<center><h2><b><u>Employee Details</u></b></h2></center>
<table border="2" width="70%" cellpadding="2" align="center">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td align="center">${emp.empId}</td>  
   <td align="center">${emp.firstName}</td>  
   <td align="center">${emp.lastName}</td>  
   <td align="center">${emp.email}</td>  
   </tr>  
   </c:forEach>  
   </table>  
</body>
</html>
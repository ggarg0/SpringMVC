    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Employees List</h1>
	<%-- <table border="2" width="70%" cellpadding="2">
	<tr><th>SNo.</th><th>EmployeeId</th><th>First Name</th><th>Last Name</th><th>Email</th>
	<th>Phone number</th><th>Hire date</th><th>Job id</th><th>Salary</th>
	<th>Commission pct</th><th>Manager Id</th><th>Department Id</th></tr>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${emp..employeeId}</td>
    <td>${emp.employeeId}</td>
    <td>${emp.firstName}</td>
    <td>${emp.lastName}</td>
    <td>${emp.email}</td>
    <td>${emp.phoneNumber}</td>
    <td>${emp.hireDate}</td>
    <td>${emp.jobId}</td>
    <td>${emp.salary}</td>
    <td>${emp.commissionPct}</td>
    <td>${emp.managerId}</td>
    <td>${emp.departmentId}</td>
 
    <td><a href="editemp/${emp.employeeId}">Edit</a></td>
    <td><a href="deleteemp/${emp.employeeId}">Delete</a></td>
    </tr>
    </c:forEach>
    </table> --%>
    
    
  <display:table id="employee" pagesize="10" requesturi="" name="list">
  <display:column property="employeeId"></display:column>
  <display:column property="firstName"></display:column>
  <display:column property="lastName"></display:column>
  <display:column property="email"></display:column>
  <display:column property="phoneNumber"></display:column>
  <display:column property="hireDate"></display:column>
  <display:column property="jobId"></display:column>
   <display:column property="salary"></display:column>
  <display:column property="commissionPct"></display:column>
  <display:column property="managerId"></display:column>
  <display:column property="departmentId"></display:column>
  
 <display:column ><a href="editemp/${emp.employeeId}">Edit</a></display:column>
 
 </display:table>
    
    
    <br/>
    
    <a href="viewempbypage">Prev Page</a>   
    <a href="viewempbypage">Next Page</a> <br><br>
    <a href="empform">Add New Employee</a>
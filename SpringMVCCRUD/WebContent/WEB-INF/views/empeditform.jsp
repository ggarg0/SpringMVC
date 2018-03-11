<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Edit Employee</h1>
       <form:form method="POST" action="/SpringMVCCRUD/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="employeeId" /></td>
         </tr> 
         <tr>  
          <td>First Name : </td> 
          <td><form:input path="firstName"  /></td>
         </tr>  
         <tr>  
          <td>Last Name :</td>  
          <td><form:input path="lastName" /></td>
         </tr> 
         <tr>  
          <td>Email Id :</td>  
          <td><form:input path="email" /></td>
         </tr> 
         <tr>  
          <td>Phone Number : </td> 
          <td><form:input path="phoneNumber"  /></td>
         </tr>  
         <tr>  
          <td>Job Id :</td>  
          <td><form:input path="jobId" /></td>
         </tr> 
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="salary" /></td>
         </tr> 
        
         <tr>         
         <td>Manager Id :</td>  
          <td><form:input path="managerId" /></td>
         </tr> 
         <tr>  
          <td>Department Id :</td>  
          <td><form:input path="departmentId" /></td>
         </tr>
        
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  

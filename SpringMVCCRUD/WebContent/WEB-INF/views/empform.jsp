<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Add New Employee</h1>
<form:form method="post" action="save">
	<table>
		<tr>
			<td>Employee Id :</td>
			<td><form:input path="employeeId" /></td>
		</tr>
		<tr>
		<tr>
			<td>First Name :</td>
			<td><form:input path="firstName" /></td>
		</tr>
		<tr>
		<tr>
			<td>Last Name :</td>
			<td><form:input path="lastName" /></td>
		</tr>
		<tr>
		<tr>
			<td>Email :</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
		<tr>
			<td>Phone :</td>
			<td><form:input path="phoneNumber" /></td>
		</tr>
		<tr>
		<tr>
			<td>Hire Date :</td>
			<td><form:input path="hireDate" /></td>
		</tr>
		<tr>
		<tr>
			<td>Job Id :</td>
			<td><form:input path="jobId" /></td>
		</tr>
		<tr>
			<td>Salary :</td>
			<td><form:input path="salary" /></td>
		</tr>
		<tr>
			<td>Commission :</td>
			<td><form:input path="commissionPct" /></td>
		</tr>
		<tr>
		<tr>
			<td>Manager Id :</td>
			<td><form:input path="managerId" /></td>
		</tr>
		<tr>
		<tr>
			<td>Department Id :</td>
			<td><form:input path="departmentId" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>
</form:form>

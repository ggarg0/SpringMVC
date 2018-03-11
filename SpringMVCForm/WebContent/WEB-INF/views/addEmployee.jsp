<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Add Employee Form</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<h2>
	<center>	<spring:message code="lbl.page" text="Add New Employee" /></center>
	</h2>
	<br />

	<form:form method="post" modelAttribute="employee">

		<center>
			<table border="2" width="30%" cellpadding="2">
				<tr>
					<td align="center"><spring:message code="lbl.empId" text="Emp ID" /></td>
					<td align="center"><form:input path="empId" /></td>
					<td align="center"><form:errors path="empId" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="center"><spring:message code="lbl.firstName" text="First Name" /></td>
					<td align="center"><form:input path="firstName" /></td>
					<td align="center"><form:errors path="firstName" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="center"><spring:message code="lbl.lastName" text="Last Name" /></td>
					<td align="center"><form:input path="lastName" /></td>
					<td align="center"><form:errors path="lastName" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="center"><spring:message code="lbl.email" text="Email Id" /></td>
					<td align="center"><form:input path="email" /></td>
					<td align="center"><form:errors path="email" cssClass="error" /></td>
				</tr>
			</table>
		</center>
		<br>
		<br>
		<center>
			<input type="submit" value="Add Employee" />
		</center>

	</form:form>
</body>
</html>
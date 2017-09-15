<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="/resources/css/core.css" var="coreCss" />
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
<title>Home Appliances Shop</title>
</head>
<body>
	<jsp:include page="appHeader.jsp" />


	<div class="container">
		<div class="top20">
			<h3 class="text-success text-center">Reports</h3>
		</div>
		<div class="row">

			<div class="button-margin">

				<button type="button" class="btn btn-outline-info"
					onclick="location.href='/ShopMartApplication/reports'">My
					orders</button>

				<button type="button" class="btn btn-outline-info"
					onclick="location.href='/ShopMartApplication/reports'">Customers
					list</button>

				<button type="button" class="btn btn-outline-info"
					onclick="location.href='/ShopMartApplication/getAllOrders'">Orders
					list</button>

				<button type="button" class="btn btn-outline-info"
					onclick="location.href='/ShopMartApplication/getProductInventory'">Product
					inventory</button>
			</div>
		</div>


		<div class="top20">
			<c:if test="${!empty model.customerList}">
				<table class="table-responsive table table-striped">
					<tr>
						<th>Customer Name</th>
						<th>Email Id</th>
						<th>Phone Number</th>
						<th>Address</th>
						<th>City</th>

					</tr>
					<c:forEach items="${model.customerList}" var="customers">
						<tr>
							<td><a
								href="/ShopMartApplication/editCustomerDetails/${customers.customerId}">
									${customers.firstName} ${customers.lastName}</a></td>
							<td>${customers.emailId}</td>
							<td>${customers.phoneNumber}</td>
							<td>${customers.address}</td>
							<td>${customers.city}</td>
						</tr>
					</c:forEach>
				</table>
			</c:if>


			<c:if test="${!empty model.productInventoryList}">
				<table class="table-responsive table table-striped">
					<tr>
						<th>Product Name</th>
						<th>Product Description</th>
						<th>Product Price</th>
						<th>Available Quantity</th>
						<th>Sold Quantity</th>

					</tr>
					<c:forEach items="${model.productInventoryList}"
						var="productInventory">
						<tr>
							<td>${productInventory.productName}</td>
							<td>${productInventory.productDescription}</td>
							<td>${productInventory.productPrice}</td>
							<td>${productInventory.availableQuantity}</td>
							<td>${productInventory.soldQuantity}</td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
			
			<c:if test="${!empty model.orderList}">
				<table class="table-responsive table table-striped">
					<tr>
						<th>Order Id</th>
						<th>Customer Id</th>
						<th>Status Id</th>
						<th>Invoice Id</th>
						<th>Payment Id</th>
						<th>Date Created/th>

					</tr>
					<c:forEach items="${model.orderList}"
						var="orders">
						<tr>
							<td><a
								href="/ShopMartApplication/editCustomerDetails/${orders.orderId}">
									${orders.orderId}</a></td>
							<td>${orders.customerId}</td>
							<td>${orders.statusId}</td>
							<td>${orders.invoiceId}</td>
							<td>${orders.paymentId}</td>
							<td>${orders.dateCreated}</td>
						</tr>
					</c:forEach>
				</table>
			</c:if>


		</div>

	</div>


	<jsp:include page="footer.jsp" />
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<div class="container top50">
		<div class="col left250">
				<img src="/../ShopMartApplication/resources/images/${productdetails.productPicName}.jpg"
					alt="An image to show the text doesn't wrap">
			</div>
			<table class="table table-striped top50">
				<tr>
					<td><label path="productName">
							<spring:message code="label.productName" />
						</label></td>
					<td>${productdetails.productName}</td>
				</tr>
				<tr>
					<td><label path="productDescription">
							<spring:message code="label.productDescription" />
						</label></td>
					<td>${productdetails.productDescription}</td>
				</tr>
				<tr>
					<td><label path="productPrice">
							<spring:message code="label.productPrice" />
						</label></td>
					<td>${productdetails.productPrice}</td>
				</tr>
				<tr>
					<td><label path="availableQuantity">
							<spring:message code="label.availableQuantity" />
						</label></td>
					<td>${productdetails.availableQuantity}</td>
				</tr>

			</table>
			<div class="top50 row">				
				<div class="col left500">
				<button type="button" class="btn btn-success"
						onclick="location.href='/../ShopMartApplication/addProductToCart/${productdetails.productId}'">
						Add to cart</button>
				</div>
				<div class="col-2">
					<button type=button class="btn btn-success"
						onclick="location.href='/../ShopMartApplication/getAllProducts'">Show
						All Products</button>
				</div>
			</div>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>
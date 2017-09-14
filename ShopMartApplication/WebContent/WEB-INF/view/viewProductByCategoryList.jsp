<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<spring:url value="/resources/css/core.css" var="coreCss" />
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />

<title>Home Appliances Shop</title>
</head>
<jsp:include page="productByCategoryHeader.jsp" />
<body>
	<div class="top20">
	<div class="container">
			<div class="row">
				<div class="button-margin">
					
				<c:if test="${!empty model.categoryList}">
					<c:forEach items="${model.categoryList}" var="category">
						<button type="button" class="btn btn-outline-info" 
						onclick="location.href='/../ShopMartApplication/getProductByCategory/${category.categoryId}'">
						${category.categoryName}</button>
					</c:forEach>
				</c:if>
			</div>
</div>

			
			<div class="top20">
				<c:if test="${!empty model.productList}">
					<table class="table table-striped table-responsive">

						<tr>
							<th style="width: 50%">Product Name</th>
							<th>Product Price</th>
							<th style="width: 30%">Product Description</th>
							<th>Available Quantity</th>
						</tr>
						<c:forEach items="${model.productList}" var="product">
							<tr>
								<td><a href="/ShopMartApplication/getProductDetailsByProductId/${product.productId}"> ${product.productName}</a></td>
								<td>${product.productPrice}</td>
								<td>${product.productDescription}</td>
								<td>${product.availableQuantity}</td>
							</tr>
						</c:forEach>
					</table>
				</c:if>
			</div>
		</div>
	</div>	<jsp:include page="footer.jsp" />
</body>
</html>
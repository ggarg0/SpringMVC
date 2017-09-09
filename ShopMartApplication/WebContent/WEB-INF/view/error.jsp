<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="appHeader.jsp" />

<body>

	<div class="container">

		<h1>Error Page</h1>

		<p>Exception</p>
		<!-- Exception: ${exception.message}.
		  	<c:forEach items="${exception.stackTrace}" var="stackTrace"> 
				${stackTrace} 
			</c:forEach>
	  	-->

	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>
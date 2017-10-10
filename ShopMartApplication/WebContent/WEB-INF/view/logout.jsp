<html>
<head>
<title>Home Appliances Shop</title>
</head>
<jsp:include page="loginHeader.jsp" />
<body>

	<%
	
    Cookie[] cookies = request.getCookies();
    if(cookies != null){
    for(Cookie cookie : cookies){
        if(cookie.getName().equals("JSESSIONID")){
            System.out.println("JSESSIONID="+cookie.getValue());
        }
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        System.out.println("JSESSIONID="+cookie.getValue());
    }
    }

    //invalidate the session if exists
    System.out.println("User=" + session.getAttribute("username"));
    System.out.println("User=" + session.getAttribute("customerId"));
    if(session != null){
        session.invalidate();
    }

	%>
	<div class="container">
		<div class="top150">
			<div class="row justify-content-around">

				<div class="col-sm-4">
					<p class="lead">
						<span class="text-success">You are now logged out!!</span>
					</p>
					<p>
						<a href="/ShopMartApplication/login">Login Again</a>
					</p>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>
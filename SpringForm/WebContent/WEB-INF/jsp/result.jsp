<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information</title>
</head>
<body>

<center>
<h2><b><I><u>Submitted Student Information</u></I></b></h2>
   <table>
    <tr>
        <td>Name : </td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Age : </td>
        <td>${age}</td>
    </tr>
    <tr>
        <td>ID : </td>
        <td>${id}</td>
    </tr>
</table>

<table>
<br>
    <tr>
        <td>Redirect : <a href="redirect.html">click</a> </td>
        
    </tr>
   <tr></tr><tr></tr>  <tr></tr><tr></tr>
     <tr>
    <td>Load HTML Page : <a href="staticPage.html">click</a></td></tr>
</table>
 

  

</center> 

</body>
</html>
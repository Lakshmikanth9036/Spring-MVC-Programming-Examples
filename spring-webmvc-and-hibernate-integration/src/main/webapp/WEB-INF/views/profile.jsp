<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Profile Page</title>

</head>
<body>
	<h1>Customer Profile Page</h1>
	<table>
		<tr>
			<td>ID:</td>
			<td>${customer.id}</td>
		</tr>
		<tr>
			<td>First Name:</td>
			<td>${customer.firstName}</td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td>${customer.lastName}</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>${customer.email}</td>
		</tr>
		<tr>
			<td>Mobile:</td>
			<td>${customer.mobile}</td>
		</tr>
	
	</table>
</body>
</html>
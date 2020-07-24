<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration page</title>
</head>
<body>
	<h1>Customer Registration Form</h1>
	<c:url value="/customer/register" var="registerUrl" />
	<form action="${registerUrl}" method="post" />
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="tel" pattern="[789][0-9]{9}" name="mobile" required="required"></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<input type="radio" name="gender" value="Male" checked="checked">Male
					<input type="radio" name="gender" value="Female">Female
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
			
		</table>
</body>
</html>
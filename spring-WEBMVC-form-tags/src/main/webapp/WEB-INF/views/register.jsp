<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/resources/css" var="cssUrl"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration Page</title>
<link rel="stylesheet" href="${cssUrl}/style.css">
</head>
<body>
	<h1>Customer Registration Page</h1>
	<form:form modelAttribute="customer">
		<table>
			<tr>
				<td>First Name: </td>
				<td><form:input path="firstName"/></td>
			</tr>
			<tr>
				<td>Last Name: </td>
				<td><form:input path="lastName"/></td>
			</tr>
			<tr>
				<td>Email: </td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Mobile: </td>
				<td><form:input path="mobile"/></td>
			</tr>
			<tr>
				<td>Gender: </td>
				<td>
					<form:radiobutton path="gender" value="Male"/> Male
					<form:radiobutton path="gender" value="Female"/> Female
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
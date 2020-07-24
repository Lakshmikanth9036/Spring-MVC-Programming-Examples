<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration Page</title>
<style type="text/css">
	.error{color: #F00;}
</style>
</head>
<body>
	<h1>Customer Registration Page</h1>
	<form:form modelAttribute="customer">
		<table>
			<tr>
				<td>First Name: </td>
				<td><form:input path="firstName"/></td>
				<td><form:errors path="firstName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Last Name: </td>
				<td><form:input path="lastName"/></td>
				<td><form:errors path="lastName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email: </td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Mobile: </td>
				<td><form:input path="mobile"/></td>
				<td><form:errors path="mobile" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password: </td>
				<td><form:input path="password"/></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
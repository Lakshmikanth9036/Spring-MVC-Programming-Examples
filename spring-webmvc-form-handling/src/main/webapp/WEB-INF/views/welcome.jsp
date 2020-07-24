<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Profile page</title>
</head>
<body>
	<h1>Customer profile page</h1>
	<table>
		<tr>
			<td>First Name:</td>
			<td>${firstName}</td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td>${lastName}</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>${email}</td>
		</tr>
		<tr>
			<td>Mobile:</td>
			<td>${mobile}</td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>${gender}</td>
		</tr>
	</table>
</body>
</html>
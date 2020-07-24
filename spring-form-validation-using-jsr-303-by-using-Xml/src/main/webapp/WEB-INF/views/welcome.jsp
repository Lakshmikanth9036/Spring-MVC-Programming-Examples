<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring's Form Tags</title>
<style type="text/css">
	.error{ color:#FF0000; font-style:italic; }
</style>
</head>
<body>
	<h1>Spring Form Validation</h1>
	<form:form method="POST" modelAttribute="user" action="register">
		<table>
			<tr>
				<td>User Name:</td>
				<td><form:input path="userName"/></td>
				<td><form:errors path="userName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<form:radiobutton path="gender" value="Male"/>Male
					<form:radiobutton path="gender" value="Female"/>Female
				</td>
				<td><form:errors path="gender" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Hobbies:</td>
				<td>
					<form:checkbox path="hobbies" value="Coding"/>Coding
					<form:checkbox path="hobbies" value="Designing"/>Designing
					<form:checkbox path="hobbies" value="Testing"/>Testing
				</td>
				<td><form:errors path="hobbies" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Skills:</td>
				<td>
					<form:select multiple="true" path="skills">
						<option value="J2EE">J2EE</option>
						<option value="Spring">SPRING</option>
						<option value="Hibernate">HIBERNATE</option>
					</form:select>
				</td>
				<td><form:errors path="skills" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td>
					<form:password path="password"/>
				</td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:textarea path="address" rows="4" cols="40"/></td>
				<td><form:errors path="address" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="submit">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
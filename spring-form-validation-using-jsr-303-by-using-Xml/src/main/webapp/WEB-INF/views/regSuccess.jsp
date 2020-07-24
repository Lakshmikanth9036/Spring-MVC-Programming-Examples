<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show User Details</title>
</head>
<body>
	<h1>User Details</h1>
	<p>User Name: ${user.userName}</p>
	<p>Gender: ${user.gender}</p>
	<p>Hobbies:
			<c:forEach begin="0" items="${user.hobbies}" var="hob">
					<c:out value="${hob}"></c:out>
			</c:forEach>
	</p>
	<p>Skills:
		<c:forEach begin="0" items="${user.skills}" var="skill">
				<c:out value="${skill}"></c:out>
		</c:forEach>
	</p>
	<p>Password: ${user.password}</p>
	<p>Address: ${user.address}</p>
</body>
</html>
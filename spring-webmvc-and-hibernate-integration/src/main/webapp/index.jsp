<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" language="java" %>

<html>
<body>
	<h1>Spring Form Validation Using Hibernate</h1>
	<c:url value="/customer/register" var="registerUrl" />
	<a href="${registerUrl}">Register</a>
</body>
</html>

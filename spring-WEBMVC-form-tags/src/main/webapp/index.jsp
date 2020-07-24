<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/resources/css" var="cssUrl"/>
<html>
<head>
	<link rel="stylesheet" href="${cssUrl}/style.css">
</head>
<body>
	<h1>Spring Form Tags</h1>
	<c:url value="/customer/register" var="registerUrl" />
	<a href="${registerUrl}">Register</a>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url value="/resources" var="resourceUrl" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer CRUD Operations</title>
<link rel="stylesheet" href="${resourceUrl}/css/bootstrap.min.css">
<style type="text/css">
.error {
	color: #F00;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<h3 class="text-center">Customer Registration Form</h3>
			<div class="col-md-6 col-md-offset-3">
				<c:url value="/" var="registerUrl" />
				<form:form action="${registerUrl}" modelAttribute="customer" >
					<c:if test="${customer.id > 0}">
						<div class="form-group">
							<label>ID:</label>
							<form:input path="id" cssClass="form-control" readonly="true"/>
						</div>
					</c:if>
					<div class="form-group">
						<label>First Name: <form:errors path="firstName"
								cssClass="error" /></label>
						<form:input path="firstName" cssClass="form-control" />
					</div>
					<div class="form-group">
						<label>Last Name: <form:errors path="lastName"
								cssClass="error" /></label>
						<form:input path="lastName" cssClass="form-control" />
					</div>
					<div class="form-group">
						<label>Email: <form:errors path="email" cssClass="error" /></label>
						<form:input path="email" cssClass="form-control" />
					</div>
					<div class="form-group">
						<label>Mobile: <form:errors path="mobile" cssClass="error" /></label>
						<form:input path="mobile" cssClass="form-control" />
					</div>
					<div class="form-group">
						<c:if test="${customer.id eq null}">
							<input class="btn btn-success" type="submit" value="Register">
						</c:if>
						<c:if test="${customer.id > 0}">
							<input class="btn btn-primary" type="submit" value="Update">
						</c:if>
					</div>
				</form:form>
			</div>
		</div>
	</div>

	<c:if test="${!empty customerList}">
		<div class="container">
			<div class="row">
				<table class="table table-stripped">
					<tr>
						<th>#ID</th>
						<th>#First Name</th>
						<th>#Last Name</th>
						<th>#Email</th>
						<th>#Mobile</th>
						<th>#Update</th>
						<th>#Delete</th>
					</tr>
					<c:forEach items="${customerList}" var="cust">
						<tr>
							<td>${cust.id}</td>
							<td>${cust.firstName}</td>
							<td>${cust.lastName}</td>
							<td>${cust.email}</td>
							<td>${cust.mobile}</td>
							<td><a class="btn btn-primary btn-sm"
								href="<c:url value="/update" />/${cust.id}">Update</a></td>
							<td><a class="btn btn-danger btn-sm"
								href="<c:url value="/delete" />/${cust.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</c:if>
</body>
</html>
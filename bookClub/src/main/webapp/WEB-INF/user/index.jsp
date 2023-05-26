<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<meta charset="ISO-8859-1">
<title>Read Share</title>
</head>
<body>
	
	
	<div class="container my-5">
	
		<div class="mb-5">
			<h1>Book Club</h1>
			<p>A place for friends to share thoughts on books.</p>
		</div>
		<div class="row">
			<div class="col">
				<h3>Register</h3>
				<form:form action="/users/process/register" method="post" modelAttribute="newUser">
				    <div class="form-group">
				        <label>User Name</label>
				        <form:input path="userName" class="form-control" />
				        <form:errors path="userName" class="text-danger" />
				    </div>
				    <div class="form-group">
				        <label>Email</label>
				        <form:input path="email" class="form-control" />
				        <form:errors path="email" class="text-danger" />
				    </div>
				    <div class="form-group">
				        <label>Password</label>
				        <form:input path="password" class="form-control" />
				        <form:errors path="password" class="text-danger" />
				    </div>
				    <div class="form-group">
				        <label>Confirm Password</label>
				        <form:input path="confirm" class="form-control" />
				        <form:errors path="confirm" class="text-danger" />
				    </div>
				    <input type="submit" value="Register User" class="btn btn-primary" />
				</form:form>
			</div>
			<div class="col">
			<h3>Login</h3>
			<form:form action="/users/process/login" method="post" modelAttribute="loginUser">
				    <div class="form-group">
				        <label>Email <span><form:errors path="email" class="text-danger" /></span></label>
				        <form:input path="email" class="form-control" />
				    </div>
				    <div class="form-group">
				        <label>Password</label>
				        <form:input path="password" class="form-control" />
				        <form:errors path="password" class="text-danger" />
				    </div>

				    <input type="submit" value="Login" class="btn btn-primary" />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
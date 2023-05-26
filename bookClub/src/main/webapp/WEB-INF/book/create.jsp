
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<meta charset="ISO-8859-1">
<title>Book Share</title>
</head>
<body>

	<div class="navbar m-3">
		<h3>Add a Book to Your Shelf!</h3>
		<a href="/" class="btn btn-primary">back to the shelves</a>
	</div>

	<div class="container my-5">

				<form:form action="/books/process/new" modelAttribute="book"  method="post" >
					<form:input type="hidden" path="reader" value="${user_id}"/>
				    <div class="form-group row">
				        <label class="col-3">Title</label>
				        <div class="col-9">
				       	 	<form:input path="title" class="form-control" />
				        	<form:errors path="title" class="text-danger" />
				        </div>	
				    </div>
				    <div class="form-group row">
				        <label class="col-3">Author</label>
				        <div class="col-9">
				        	<form:input path="author" class="form-control" />
				        	<form:errors path="author" class="text-danger" />
				        </div>
				    </div>
				    <div class="form-group row">
				        <label class="col-3">Thoughts</label>
				        <div class="col-9">
				        	<form:textarea path="thoughts" rows="3" class="form-control" />
				        	<form:errors path="thoughts" class="text-danger" />
				        </div>
				    </div>

					<div class="d-flex justify-content-end my-5">
				   		<input type="submit" value="Add a book" class="btn btn-primary" />
					</div>				    
				</form:form>


	
	</div>
</body>
</html>
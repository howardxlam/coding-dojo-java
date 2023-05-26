
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
<title>Read Share</title>
</head>
<body>

	
	

	
	<div class="navbar m-3">
		<h3><c:out value="${book.title }"/></h3>
		<a href="/" class="btn btn-primary">back to the shelves</a>
	</div>


	<div class="container">
		<h5> 
			<span class="text-danger"><c:out value="${book.reader.userName }"/></span>
			read <span class="text-warning"><c:out value="${book.title }"/> </span>
			by <span class="text-success"><c:out value="${book.author }"/></span> 
		</h5>
		<p>Here are <c:out value="${book.reader.userName }"/>'s thoughts: </p>
		
		<hr>
	
		<p><c:out value="${book.thoughts }"/></p>
		
		<hr>
		
		
		<div class="d-flex justify-content-end">
			<c:if test="${user_id == book.reader.id }">
				<a class="btn btn-primary mx-5" href="/books/${book.id}/edit">Edit</a> 
					<form action="/books/${book.id}/delete" method="post">
						<input type="hidden" value="delete" name="_method"/>
						<input class="btn btn-danger" type="submit" value="Delete"/>
					</form>
			</c:if>
		</div>
							
				

		</div>			


</body>
</html>
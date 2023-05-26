<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
		<h3>Welcome, ${loggedInUser.userName}</h3>
		<a href="/users/logout" class="btn btn-primary">Logout</a>
	</div>
	
	<div class="navbar m-3">
		<p>Books from everyone's shelves:</p>
		<a href="/books/new">+ Add to my shelf!</a>
	</div>


	<div class="container">
	
		<div class="d-flex justify-content-end">
    		<form action="/" method="get" >
    			<div class="form-group d-flex align-items-center" >
        			<label for="sort" class="w-100">Sort by:</label>
       	 			<select name="sort" id="sort" class="form-control">
        			    <option value="title">Title</option>
      	    			<option value="author">Author</option>
     	 		  	</select>
     	  	 	<button type="submit" class="btn btn-secondary ml-3">Sort</button>
     		   </div>
   	 		</form>
		</div>

				<table class="table table-light table-bordered table-striped text-center">
					<thead class="table-secondary">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Title</th>
							<th scope="col">Author Name</th>
							<th scope="col">Posted By</th>
						<tr>
					</thead>
					<tbody>
					
					<c:forEach var="oneBook" items="${booksFromMyController }">
						<tr>
							<td class="align-middle"><c:out value="${oneBook.id }"></c:out></td>
							<td class="align-middle">
								<a href="/books/${oneBook.id }"><c:out value="${oneBook.title }"></c:out></a>
							</td>
							<td class="align-middle"><c:out value="${oneBook.author }"></c:out></td>		
							<td class="align-middle"><c:out value="${oneBook.reader.userName }"></c:out></td>

						</tr>
						</c:forEach>	
					</tbody>
				</table>
	
	</div>
</body>
</html>
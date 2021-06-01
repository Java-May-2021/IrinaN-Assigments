<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome! Display all books</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>

<div class="container">
<h2> Welcome to books.com </h2>
<h4> All books will be displayed here</h4>
<br>

<table class="table table-dark">
	<thead>
		<tr>
			<td>id </td>
			<td>Name </td>
			<td>Description </td>
			<td>Language </td>
			<td>Number of pages </td>
	
	</thead>
	<tbody>
	<c:forEach items="${allbooks}" var="book">
	<tr>
		<td>${book.id}</td>
		<td>${book.name}</td>
		<td>${book.description}</td>
		<td>${book.language}</td>
		<td>${book.noPages}</td>
		
	</tr>
	
	
	</c:forEach>
	
	</tbody>
	


</table>

</div>

</body>
</html>
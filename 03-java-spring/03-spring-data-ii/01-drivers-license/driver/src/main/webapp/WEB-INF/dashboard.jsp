<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

</head>
<body>

<div class="container">
<h2> Welcome to Persons </h2>
<h4> All persons will be displayed here</h4>
<br>

<table class="table table-dark">
	<thead>
		<tr>
			<td>id </td>
			<td>First Name </td>
			<td>Last Name </td>
			<td>License Number </td>
			<td>State</td>
			<td>Expiration</td>
			<td>Edit Person</td>
			<td>Delete Person</td>
			
	
	</thead>
	<tbody>
	<c:forEach items="${allpersons}" var="a">
	<tr>
		<td>${a.id}</td>
		<td><a href="/${a.id}">${a.firstName}</a></td>
		<td>${a.lastName}</td>
		<td>${a.license.number}</td>
		<td>${a.license.state}</td>
		<td>${a.license.expiration_date}</td>
		<td><a href="/edit/${a.id}">Edit</a></td>
		<td><a href="/delete/${a.id}">Delete</a></td>
		
	</tr>
	
	
	</c:forEach>
	
	</tbody>
	


</table>

<a href="/addperson" >Add a new person!</a>
<br>
<a href="/addlicense" >Add a new license!</a>

</div>




</body>
</html>
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
<h2> Welcome to Songs you like </h2>
<h4> All songs will be displayed here</h4>
<br>

<table class="table table-dark">
	<thead>
		<tr>
			<td>id </td>
			<td>Name </td>
			<td>Artist </td>
			<td>Duration (min) </td>
			<td>Edit</td>
			<td>Delete</td>
	
	</thead>
	<tbody>
	<c:forEach items="${allsongs}" var="a">
	<tr>
		<td>${a.id}</td>
		<td>${a.name}</td>
		<td>${a.singer}</td>
		<td>${a.duration}</td>
		<td><a href="/edit/${a.id}">Edit song</a></td>
		<td><a href="/delete/${a.id}">Delete song</a></td>
		
	</tr>
	
	
	</c:forEach>
	
	</tbody>
	


</table>

</div>

<a href="/add">Add another song</a>

</body>
</html>
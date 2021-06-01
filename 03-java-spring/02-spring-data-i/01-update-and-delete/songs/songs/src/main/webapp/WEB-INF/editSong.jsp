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
<h2>Add a new song</h2>

	<form action="/edit/${thissong.id}" method="POST">
		<div class="form-group">
			<label for="name"> Song Name </label>
			<input type="text" name="name" value='<c:out value="${thissong.name}"></c:out>'>
		</div>
		<div class="form-group">
			<label for="singer"> Artist </label>
			<input type="text" name="singer" value='<c:out value="${thissong.singer}"></c:out>'>
		</div>
		<br>
		<div class="form-group">
			<label for="duration"> Duration </label>
			<input type="text" name="duration" value='<c:out value="${thissong.duration}"></c:out>'>
		</div>
		<br>
		<button>Submit!!</button>
		</div>
		</form>


</body>
</html>
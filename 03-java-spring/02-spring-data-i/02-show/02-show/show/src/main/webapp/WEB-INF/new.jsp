<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a new book</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

</head>
<body>

<div class="container">
<h2>Add a new book</h2>

	<form action="/new" method="POST">
		<div class="form-group">
			<label for="fname"> Book Name </label>
			<input type="text" name="fname">
		</div>
		<div class="form-group">
<br>
			<label for="desc"> Description </label>
			<input type="text" name="desc">
		</div>
		<br>
		<div class="form-group">
			<label for="lang"> Language </label>
			<input type="text" name="lang">
		</div>
<br>
		<div class="form-group">
			<label for="noPages"> Number of pages </label>
			<input type="text" name="noPages">
		</div>
<br>
		<button>Submit!!</button>
</div>

</body>
</html>
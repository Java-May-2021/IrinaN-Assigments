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

<form action="/edit/${thislang.id}" method="POST">
	<label for="name"> Language Name </label>
	<input type="text" name="name" value='<c:out value="${thislang.name}"></c:out>'>
	<br>
	
	<label for="creator"> Creator </label>
	<input type="text" name="creator" value='<c:out value="${thislang.creator}"></c:out>'>
	<br>
	<label for="version"> Version of language </label>
	<input type="text" name="version" value='<c:out value="${thislang.version}"></c:out>'>
	<br>
	
	<button>Submit!!!</button>

</form>
</body>
</html>
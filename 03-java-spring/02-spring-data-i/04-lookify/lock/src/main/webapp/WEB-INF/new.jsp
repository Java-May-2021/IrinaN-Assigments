<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/add" method="POST">
	<label for="title">Title </label>
	<input type="text" name="title">
	<br>
	
	<label for="artist"> Artist </label>
	<input type="text" name="artist">
	<br>
	<label for="rating"> Rating (1-10) </label>
	<input type="text" name="rating">
	<br>
	
	<button>Submit!!!</button>

</form>

</body>
</html>
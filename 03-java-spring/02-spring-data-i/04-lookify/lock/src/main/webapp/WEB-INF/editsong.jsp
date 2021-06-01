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

<form action="/edit/${thissong.id}" method="POST">
	<label for="title">Title </label>
	<input type="text" name="title" value='<c:out value="${thissong.title}"></c:out>'>
	<br>
	
	<label for="artist"> Artist </label>
	<input type="text" name="artist" value='<c:out value="${thissong.artist}"></c:out>'>
	<br>
	<label for="rating"> Rating (1-10) </label>
	<input type="text" name="rating" value='<c:out value="${thissong.rating}"></c:out>'>
	<br>
	
	<button>Submit!!!</button>

</form>

</body>
</html>
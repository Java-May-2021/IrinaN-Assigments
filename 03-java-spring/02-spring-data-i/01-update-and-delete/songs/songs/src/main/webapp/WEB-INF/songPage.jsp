<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is the specific song page</title>
</head>
<body>

<h3> Name of the song: <c:out value="${thissong.name}"/> </h3>
<h3> Artist: <c:out value="${thissong.singer}"/> </h3>
<h3> Duration: <c:out value="${thissong.duration}"/> </h3>
<br>

<a href="/edit/${thissong.id}">Edit Book</a>

<br>
<a href="/">Back to the main page</a>

</body>
</html>
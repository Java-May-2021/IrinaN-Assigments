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

<form action="/addperson" method="POST">
	<label for="firstName">First Name:  </label>
	<input type="text" name="firstName">
	<br>
	
	<label for="lastName"> Last Name </label>
	<input type="text" name="lastName">
	<br>
	
	<button>Create!</button>

</form>

</body>
</html>
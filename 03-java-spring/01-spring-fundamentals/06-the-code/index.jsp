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
<h1><c:out value="${mistakes}"/></h1>
<h2>What is the code?</h2>
<form action="/test" method="POST">
  <label for="code"></label><br>
  <input type="text" name="code"><br>

  <button> Submit! </button>
</form> 

</body>
</html>
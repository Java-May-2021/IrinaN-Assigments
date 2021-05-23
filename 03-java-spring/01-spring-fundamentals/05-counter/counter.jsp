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

<p> Dear user, you have visited </p>
<a href="/" >Main page</a>
<c:out value="${counter}"/>
<p>times</p>

<a href="/" >Test another visit</a>

</body>
</html>
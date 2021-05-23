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

<p>Your name is: <c:out value="${fname}"/> </p>
<p>The location you attended is: <c:out value="${loc}"/> </p>
<p>Your fav language is: <c:out value="${lang}"/> </p>
<p>Your commentary is: <c:out value="${comment}"/> </p>

</body>
</html>
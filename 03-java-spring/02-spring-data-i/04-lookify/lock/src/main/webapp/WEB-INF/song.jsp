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

<h2>Song title: <c:out value = "${thissong.title }"/>  </h2>
<h2>Song artist: <c:out value = "${thissong.artist }"/> </h2>
<h2>Song rating:<c:out value = "${thissong.rating }"/> </h2>

<a href="/dashboard"> Take us back to dashboard</a>

</body>
</html>
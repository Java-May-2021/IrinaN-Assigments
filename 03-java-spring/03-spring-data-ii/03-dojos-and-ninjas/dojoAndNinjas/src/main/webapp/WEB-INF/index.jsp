<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Page</title>
</head>
<body>
<h1>${thisdojo.name} Location Ninjas</h1>

<table class="table table-dark">
<thead>
<tr>
<td>First Name</td>
<td>Last Name</td>
<td>Age</td>
</thead>
<tbody>

<c:forEach items="${thisdojo.ninjas}" var="ninja">
<tr>
<td>${ninja.fName}</td>
<td>${ninja.lName}</td>
<td>${ninja.age}</td>
</tr>
</c:forEach>
</tbody>
</table>

</div>

</body>
</html>
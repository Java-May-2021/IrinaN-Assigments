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

<form action="/addlicense" method="POST" modelAttribute="license">
	<label for="person"> Person </label>
    <select name="person">
      <c:forEach items="${ allpersons }" var="p">
     	<option value="${ p.id }"> ${ p.firstName} ${p.lastName }</option>
     </c:forEach>
     </select>

	<br>
	
	<label for="number">Driver's License #:  </label>
	<input type="text" name="number">
	
	<br>
	
	<label for="expiration_date">Expiration Date:  </label>
	<input type="date" name="expiration_date">
	
	<br>
	
	<label for="state"> State </label>
	<input type="text" name="state">
	<br>
	
	<button>Create!</button>

</form>

</body>
</html>
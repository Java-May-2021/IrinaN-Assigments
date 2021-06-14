<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>

<div class="container">
<h1>New Ninja</h1>

<form:form method="POST" action="/newNinja" modelAttribute="ninja">
	<div class="form-group">
	<form:label path="dojo">Select a Dojo</form:label>
	<form:errors path="dojo"/>
	<form:select path="dojo">
	<c:forEach items="${allDojos }" var="dojo">
	<option value="${dojo.id}">${dojo.name}</option>
	</c:forEach>
	</form:select>
	</div>
	
	<div class="form-group">
	    <form:label path="fName">First Name
	    <form:errors path="fName"/>
	    <form:input path="fName"/></form:label>
    </div>
    
    <div class="form-group">
	    <form:label path="lName">Last Name
	    <form:errors path="lName"/>
	    <form:input path="lName"/></form:label>
    </div>

    <div class="form-group">
	    <form:label path="age">Age
	    <form:errors path="age"/>
	    <form:input path="age"/></form:label>
    </div>
    
    <button>Create</button>

</form:form>

</div>


</body>
</html>
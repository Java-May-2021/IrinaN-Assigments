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

<form action="/share" method="POST">

<label for="fname"> Your Name </label>
<input type="text" name="fname">
<br>
<br>
<br>

<label for="loc">Dojo Location</label>
<select name="loc" id="loc">
    <option value="san jose">San Jose</option>
    <option value="chicago">Chicago</option>
    <option value="new york">New York</option>
</select>

<br>
<br>
<br>

<label for="lang">Favorite Language</label>
<select name="lang" id="lang">
    <option value="python">Python</option>
    <option value="Java">Java</option>
</select>

<br>
<br>
<br>
<textarea name="comment"></textarea>

<br>
<br>

<button>Submit!!</button>

</form>

</body>
</html>
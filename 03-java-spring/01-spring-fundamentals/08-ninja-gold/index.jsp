<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
<link rel="stylesheet" href="css/style.css">

</head>
<body>

<p>Your Gold: <c:out value="${totalgold}"/></p>

<div class="building">
	<form method="POST" action="/addGold">
	<input type="hidden" value="farm" name="building">
	<p>Farm: </p>
	<p>Earns 10-20 Gold </p>
	<button> Find Gold!</button>
	</form>
</div>

<div class="building">
	<form method="POST" action="/addGold">
	<input type="hidden" value="cave" name="building">
	<p>Cave: </p>
	<p>Earns 5-10 Gold </p>
	<button> Find Gold!</button>
	</form>
</div>

<div class="building">
	<form method="POST" action="/addGold">
	<input type="hidden" value="house" name="building">
	<p>House: </p>
	<p>Earns 2-5 Gold </p>
	<button> Find Gold!</button>
	</form>
</div>

<div class="building">
	<form method="POST" action="/addGold">
	<input type="hidden" value="casino" name="building">
	<p>Casino: </p>
	<p>Earns or loses 50 Gold </p>
	<button> Find Gold!</button>
	</form>
</div>

<h2> Activities </h2>
<div class="activities">
<c:forEach items="${activity}" var="act">
<p class='${act.contains("OhOh")? "red" : "green" }'>${act}</p>

</c:forEach>

</div>

</body>
</html>
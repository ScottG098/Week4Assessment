<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Week 4 Assessment - two numbers</title>
</head>
<body>
	<h1>Find the total of two numbers</h1>
	<form action="getTotalServlet" method="post">
	Enter the first number:
	<input type="text" name="userFirstNum" size="10"><br />
	Enter the second number:
	<input type="text" name="userSecondNum" size="10"><br />
	<input type="submit" value="Calculate Total" />
	</form>
</body>
</html>
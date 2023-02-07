<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results of Two Numbers</title>
</head>
<body>
<p>
First Number: ${totalOfTwoNum.getFirstNumber()} <br />
Second Number: ${totalOfTwoNum.getSecondNumber()}<br />
Total: ${totalOfTwoNum.getTotal()}<br />
</p>
<a href="index.jsp">Enter two more numbers</a>
</body>
</html>
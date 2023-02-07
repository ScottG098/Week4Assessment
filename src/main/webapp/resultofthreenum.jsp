<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results of Three Numbers</title>
</head>
<body>
<p>
First Number: ${totalOfThreeNum.getFirstNumber()} <br />
Second Number: ${totalOfThreeNum.getSecondNumber()}<br />
third Number: ${totalOfThreeNum.getThirdNumber()}<br />
Total: ${totalOfThreeNum.getTotal()}<br />
</p>
<a href="indexthreenumbers.jsp">Enter three more numbers</a>
</body>
</html>
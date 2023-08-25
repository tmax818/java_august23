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
	<h1>Here's Your Omikuji</h1>
	<p>In 10 years, you will live in <c:out value="${city }"/> 
	with <c:out value="${name}"/> as your roomate, <c:out value="${interest }"/>
	for a living. The next time you see a <c:out value="${animal }"/>, 
	you will have good luck. Also, You <c:out value="${compliment }"/>.</p>
	<a href="/omikuji"> Go back</a>
</body>
</html>
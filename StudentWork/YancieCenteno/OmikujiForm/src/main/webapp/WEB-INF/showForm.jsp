<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css"/>
<meta charset="ISO-8859-1">
<title>Omikuji Result</title>
</head>
<body>
	<div class="page" >
		<div>
			<h1>Here's Your Omikuji!</h1>
			<p class="container">
				In <c:out value="${number}" /> years, you will live in <c:out value="${city}" /> with <c:out value="${person}" /> 
				as your roommate, <c:out value="${hobby}" /> for a living.
				The next time you see a <c:out value="${livingThing}" />, you will have good luck. Also, <c:out value="${somethingNice}" />.
			</p>
		</div>
	</div>
</body>
</html>
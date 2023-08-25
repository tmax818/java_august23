<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Fruity Loop Assignment</title>
</head>
<body>
	<div class="container ">
		<h1>Fruit Store</h1>
		<div class="container border border-5 border-danger">
			<table class="table">
				<tbody>
					<tr>
						<th>Name</th>
						<th>Price</th>
					</tr>
					<c:forEach var="fruit" items="${fruits }">
						<tr>
							<td><c:out value="${fruit.getName()}"/></td>
							<td><c:out value="${fruit.getPrice()}"/></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
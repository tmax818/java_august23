<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
 <c:forEach var="fruit" items="${fruits}">
            <tr>
                <td><c:out value="${fruit.name1}" /></td>
                <td><c:out value="${fruit.price}" /></td>
            </tr>
        </c:forEach>
	</table>




<h1>Fruit here</h1>


<h1>Displaying Fruits</h1>

<p><c:out value="${name}"/></p>
<p><c:out value="${ageFromController}"/></p>
<p><c:out value="${isHungry}"/></p>

	<h1> if-statement</h1>
	<c:if test="${isHungry}">
		<p><c:out value="${name}"/> id hungry </p>
	</c:if>

	<h1> if-statement</h1>
	<c:choose>
		<c:when test="${ageFromController < 21}">
		<p>is above 21</p>
		</c:when>
		<c:otherwise>
			<p>is under 21</p>
		</c:otherwise>
	</c:choose>
	
	<h1>for Each Example</h1>
	<c:forEach var="user" items="${users}">
		<p><c:out value="${user}"/></p>	
	</c:forEach>
	

</body>
</html>
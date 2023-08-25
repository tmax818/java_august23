<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/form/submit" method="post">
	
	<div>
		<label>Pick Any Number from 5 to 25 </label>
		<input type="number" name="anyNumber"/>
	</div>
	
	<div>
		<label>Enter the name of a city. </label>
		<input type="text" name="city"/>
	</div>
	
	<div>
		<label>Enter the name of any real person. </label>
		<input type="text" name="realPerson"/>
	</div>
	
	<div>
		<label>Enter professional endeavor or hobby: </label>
		<input type="text" name="hobby"/>
	</div>
	
	<div>
		<label>Enter any type of living thing. </label>
		<input type="text" name="living"/>
	</div>
	
	<div>
		<label>Say something nice to someone: </label>
		<textarea name="nice"></textarea>
	</div>
		<input type="submit" value="send"/>
	</form>
	


</body>
</html>
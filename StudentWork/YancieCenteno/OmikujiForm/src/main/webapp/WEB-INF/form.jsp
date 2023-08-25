<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css"/>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
	<div class="page">
		<div>
			<div>
				<h1>Send an Omikuji!</h1>
			</div>
			<div class="container">
				<form action="/omikuji/process" method="post" >
					<div>
						<label>Pick any number from 5 to 25:</label>
						<input type="number" name="number">
					</div>
					<div>
						<label>Enter the name of any city:</label>
						<input type="text" name="city">
					</div>
					<div>
						<label>Enter the name of any real person:</label>
						<input type="text" name="person">
					</div>
					<div>
						<label>Enter professional endeavor or hobby:</label>
						<input type="text" name="hobby">
					</div>
					<div>
						<label>Enter any type of living thing:</label>
						<input type="text" name="livingThing">
					</div>
					<div>
						<label>Say something nice to someone:</label>
						<textarea name="somethingNice"></textarea>
					</div>
					<div>
						<input type="submit" value="submit form">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
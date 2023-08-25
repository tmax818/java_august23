<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Send an Omikuji!</h3>
    <form action='/post' method='POST'>
    
    <label>Pick any number from 5 to 25</label>
		<input type="number" name="picker" min="5" max="25" />
    
	<label>Enter the name of any city:</label>
    	<input type="text" name='city'>
    	
	<label>Enter the name of any real person:</label>
    	<input type='text' name='person'>
    	
    <label>Enter professional endeavor or hobby:</label>
    	<input type='text' name='hobby'>
    	
    <label>Enter any type of living thing:</label>
    	<input type='text' name='animal'>		
    	
    <label>Say something nice to someone:</label>
    	<input type='text' name='nice'>	
    	
    <h3>Send and show a friend</h3>
    
    <input type='submit' value='send'>
    
    </form>
	
</body>
</html>
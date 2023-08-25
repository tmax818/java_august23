<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Form</title>
</head>
<body>
	<h1>Send an Omikuji</h1>
		<form action='/omikuji/submit' method="post">
			<label>Pick any number from 5 to 25</label>
			<select name="number">
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
				<option value="13">13</option>
				<option value="14">14</option>
				<option value="15">15</option>
				<option value="16">16</option>
				<option value="17">17</option>
				<option value="18">18</option>
				<option value="19">19</option>
				<option value="20">20</option>
				<option value="21">21</option>
				<option value="22">22</option>
				<option value="23">23</option>
				<option value="24">24</option>
				<option value="25">25</option>				
			</select>
			<label>Enter the name of any city</label>
			<input type="text" name='city'>
			<label>Enter the name of any real person</label>
			<input type="text" name="name">
			<label>Enter professional endeavor or hobby:</label>
			<input type="text" name="interest">
			<label>Enter any kind of living thing</label>
			<input type="text" name="animal">
			<label>Say something nice to someone</label>
			<input type="text" name="compliment">
			<input type="submit" value='Send Omikuji'>
		</form>
</body>
</html>
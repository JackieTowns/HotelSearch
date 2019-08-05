<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="HotelStyle.css">
<title>Hotel Search</title>
</head>
<body>

<h1>Hotel Search</h1>
<br/> 


<div id="cityleft">
<h4>Choose a City: </h4>
</div>



<div id="cityright">
	<form action="/hotel-result" id="form" >

		<select name="city">
			<option value="">--------</option>
			<option value="Detroit" >Detroit</option>
			<option value="Chicago" >Chicago</option>
			<option value="Windsor" >Windsor</option>
		</select>

		<button type="submit">Submit</button>
	</form>
</div>
</body>
</html>
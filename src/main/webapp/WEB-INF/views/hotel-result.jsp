<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<link rel="stylesheet" href="HotelStyle.css">
<title>Hotel Search</title>
</head>
<body>

<header>
	<p>
		<a href="/">Home</a>
	</p>
</header>

	<h1>Hotels in ${hotel[0].city}</h1>


	<table class="table table-bordered table-dark" id="table">
		<thead>
			<tr>
				<th>City</th>
				<th>Name</th>
				<th>Price Per Night</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="hotelAll" items="${hotel}">
				<tr>
					<td>${hotelAll.city}</td>
					<td>${hotelAll.name}</td>
					<td>$${hotelAll.pricePerNight}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>


	


</body>
</html>
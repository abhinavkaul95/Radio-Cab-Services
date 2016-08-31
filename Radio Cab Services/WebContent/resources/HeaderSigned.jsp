<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.inline{
	display: inline-block;
}
</style>
<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript" src="scripts/script.js"></script>

</head>
<body>
<h1>Ramesh Taxi Company</h1>
<div id="dashBoard" class="inline">Back to Dashboard</div>
<div id="bookACab" class="inline">Book a Cab</div>
<div id="bookedHistory" class="inline">Booked History</div>
<div id="rateCard" class="inline">Rate Card</div>
</body>
<div style="float: right;">
Hi, <%= session.getAttribute("email") %>
<a href="LogOutServlet" class="inline">Log Out</a>
</div>
</html>
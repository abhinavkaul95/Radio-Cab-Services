<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.tab_inline{
display: inline-table;
}
.section_inline{
display: inline-table;
}
</style>
<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript" src="scripts/script.js"></script>
</head>
<body>
<header style="text-align: center;"><%@ include file="resources/HeaderUnsigned.jsp" %></header>
<section id="section_left" class="section_inline">
<div class="tab_inline" id="newUser">New Users</div><div class="tab_inline" id="regUser">Registered Users</div>
<div id="form"></div>
</section>
<section id="section_right" class="section_inline">
<div id="mainDataUnsigned"  style="padding-left: 5%; padding-top: 3%;">
<b>Demo Data on index page.</b>
<p>This demo data is on the page to complete the text</p>
<p>This is intended for the promotional purposes of a fictitious company for radio cab services called Ramesh Taxi Company.</p>
<p>On this link, we will see about the company a bit and how it working.</p>

</div>
</section>
<footer style="text-align: center;"><%@ include file="resources/FooterUnsigned.jsp" %></footer>
</body>
</html>
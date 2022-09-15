<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<%
		session.setAttribute("status", "ok");
	%>
	<div class="login-box">
		<img src="foto/avatar.png" class="avatar"> 
		<h1>Insert Login Information</h1>
		<form action="Logcheck" method="post">
			<p><FONT size="4">Email</FONT></p>
			<input type="text" name="email" placeholder="Email" required>
			<p><FONT size="4">Password</FONT></p>
			<input type="password" name="password" placeholder="Password" required>
			 <input type="submit" value="Login"></form>
		<% String sito = request.getParameter("log");
		%>
		<% if (sito != null && sito.contentEquals("false")) {
		%>
		<font color="red"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Username or Password not valid</font>
		<%
			}
		%>
		<form action="Register.jsp">
		 <input type="submit" value="Register"></form>
	</div>
</body>
</html>
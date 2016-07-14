<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
</head>
<body style="background-color:yellow;">
	<form action="LoginServ" method="POST">
		<fieldset>
			<legend>Personal information:</legend>
			First name:<br> 
			<input type="text" name="firstname"><br> 
			Password:<br> 
			<input type="text" name="password"><br>
			<br> <input type="submit" value="Login">
		</fieldset>
	</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>


<body style="background-color:powderblue;">

<h2>Hello <%= (String)request.getAttribute("firstname") %></h2>



<ul>

		<a href = "#"><h1>User</h1></a>

		<a href = "#"><h1>Task</h1></a>
		
		<a href = "#"><h1>Project</h1></a>
</ul>

</body>
</html>

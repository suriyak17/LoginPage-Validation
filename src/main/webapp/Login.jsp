<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>

<div align = center>
<h1>User Login</h1>

<form action="Loginservlet" method="Post">
 
<table>
 
<tr>
<td> USERNAME : </td>
 
<td><input type="text" name="username"></td>
 
</tr>
 
<tr>
<td> PASSWORD : </td>
<td><input type="password" name="password"></td>
 
</tr>
 
</table>
 
<input type="submit" value="Login">

</form>
</div>

</body>
</html>
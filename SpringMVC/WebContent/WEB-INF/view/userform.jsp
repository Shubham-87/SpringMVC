<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User form</title>
</head>
<body>
<form:form action="showdata" method="post" modelAttribute="user">
		User Name: <form:input type="text" path="name" />
		<br>
		<br>
		Email: <form:input type="email" path="email" style="margin-left:34px;" />
		<br>
		<br> 
		Password: <form:input type="password" path="password"  style="margin-left:10px;" />
		<br>
		<br>
		Confirm Password: <form:input type="password" path="confirm_password" />
		<br>
		<br>
		<input type="submit" value="Register">
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User form</title>
</head>
<body>
<form action="showdata" method="post">
		<spring:message code="label.name"/>
		<br>
		<input type="text" name="name"/>
		<br>
		<spring:message code="label.email"/>
		<br>
		<input type="email" name="email" />
		<br>
		<input type="submit" value="<spring:message code="label.register"/>">
	</form>
</body>
</html>
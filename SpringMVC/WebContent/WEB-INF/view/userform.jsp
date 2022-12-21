<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User form</title>
</head>
<style type="text/css">
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<body>
<form:form modelAttribute="user" action="showdata" method="Post">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<br>
		<label>Enter User Name </label>
		<br>
		<br>
		<form:input path="name" />
		<br>
		<br>
		<label>Enter Email </label>
		<br>
		<br>
		<form:input path="email" />
		<br>
		<br>
		<input type="submit" value="Register">
		<br>
	</form:form>
	<spring:hasBindErrors name="userform" ></spring:hasBindErrors>
</body>
</html>
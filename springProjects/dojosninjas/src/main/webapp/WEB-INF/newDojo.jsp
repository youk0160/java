<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
</head>
<body>
	<h1>New Dojo</h1>
	<form:form action="/createDojo" method="post" modelAttribute="expense">
	    <p>
	    	<form:errors path="name"/>
	        <form:label path="name">Expense Name</form:label>
	        <form:input path="name"/>
	    </p>
	    <input type="submit" value="Submit"/>
	</form:form>    
</body>
</html>
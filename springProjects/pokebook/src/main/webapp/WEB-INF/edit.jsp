<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Expense</h1>
	<form:form action="/edit/${exp.id}" method="post" modelAttribute="exp">
	<input type="hidden" name="_method" value="put">
	    <p>
	        <form:label path="name">Expense Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name" />
	    </p>
	    <p>
	        <form:label path="vendor">vendor</form:label>
	        <form:errors path="vendor"/>
	        <form:input path="vendor"/>
	    </p>
	    <p>
	        <form:label path="amount">amount</form:label>
	        <form:errors path="amount"/>
	        <form:input path="amount"/>
	    </p>
	    <p>
	        <form:label path="description">description</form:label>
	        <form:errors path="description"/>     
	        <form:textarea path="description"/>
	    </p> 
	    <input type="submit" value="Submit"/>
	</form:form>   
</body>
</html>
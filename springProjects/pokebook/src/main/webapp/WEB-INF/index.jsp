<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>PokeBook</h1>
	<table>
	    <thead>
	        <tr>
	            <th>Expense</th>
	            <th>Vendor</th>
	            <th>Amount</th>
	            <th>Actions</th>
	        </tr>
	    </thead>
	    <tbody>
	         <c:forEach var="exp" items="${exps}">
	         <tr>
	         	<td><a href="/expenses/${exp.id}"><c:out value="${exp.name}"></c:out></a></td>
	         	<td><c:out value="${exp.vendor}"></c:out></td>
	         	<td><c:out value="${exp.amount}"></c:out></td>
	         	<td>
		         	<a href="/expenses/edit/${exp.id}">edit</a>
		         	<a href="/delete/${exp.id}">delete</a>
	         	</td>
	         </tr>
	         </c:forEach>
	    </tbody>
	</table>
	
	<h1>New Book</h1>
	<form:form action="/submit" method="post" modelAttribute="expense">
	    <p>
	        <form:label path="name">Expense Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
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
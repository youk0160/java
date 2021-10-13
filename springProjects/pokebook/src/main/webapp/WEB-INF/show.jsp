<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Expense</title>
</head>
<body>
	<h2>Expense Details</h2>
	<a href="/expenses">Go Back</a>
	<table>
		<tr>
			<td>Expense Name:</td>
			<td><c:out value="${exp.name}"></c:out></td>
		</tr>
		<tr>
			<td>Expense Description:</td>
			<td><c:out value="${exp.description}"></c:out></td>
		</tr>
		<tr>
			<td>Vendor:</td>
			<td><c:out value="${exp.vendor}"></c:out></td>
		</tr>
		<tr>
			<td>Amount Spent:</td>
			<td><c:out value="${exp.amount}"></c:out></td>
		</tr>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Fruit Store</h2>
	<table>
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="x" items="${fruits}">
		<tr>
			<td><c:out value="${x.getName()}"></c:out></td>
			<td><c:out value="${x.getPrice()}"></c:out></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
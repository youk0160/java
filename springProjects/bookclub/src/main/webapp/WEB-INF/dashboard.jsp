<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome ${user_name}</h2>
	<table>
		<h5>Books from everyone's shelves:</h5>
		<a href="/logout">logout</a>
		<a href="/books/new">+ Add a book to my shelf!</a>
		<thead>
			<tr>
				<td>ID</td>
				<td>Title</td>
				<td>Author Name</td>
				<td>Posted By</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.id}</td>
				<td><a href="/books/${book.id}">${book.title}</a></td>
				<td>${book.author}</td>
				<td>${user_name}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
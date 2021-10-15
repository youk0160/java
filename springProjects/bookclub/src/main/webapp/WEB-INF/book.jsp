<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${book.title}</h2>
	<h4>${user_name} read ${book.title} by ${book.author}</h4>
	<h6>${book.thoughts}</h6>
	<c:if test="${user_id==book.user.id}">
		<a href="/books/${book.id}/edit">Edit</a>
	</c:if>
</body>
</html>
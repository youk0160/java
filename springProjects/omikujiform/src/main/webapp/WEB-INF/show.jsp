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
	<h2>Here's Your Omikuji!</h2>
	<p>
	In <c:out value="${num}"></c:out> years, 
	you will live in <c:out value="${city}"></c:out>
	with <c:out value="${name}"></c:out> as your roommate,
	<c:out value="${hobby}"></c:out> for a living.
	The next time you see a <c:out value="${living}"></c:out>,
	you will have good luck. Also, <c:out value="${fortune}"></c:out>
	</p>
</body>
</html>
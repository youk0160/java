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
	<a href="/dashboard">back to shelves</a>
	<form:form action="/books/create" method="post" modelAttribute="newBook">
        <div class="form-group">
            <label>Title:</label>
            <form:input path="title" class="form-control" />
            <form:errors path="title" class="text-danger" />
        </div>
        <div class="form-group">
            <label>Author:</label>
            <form:input path="author" class="form-control" />
            <form:errors path="author" class="text-danger" />
        </div>
        <div class="form-group">
            <label>My thoughts:</label>
            <form:textarea path="thoughts" class="form-control" />
            <form:errors path="thoughts" class="text-danger" />
        </div>
        <form:hidden path="user" class="form-control" value="${user_id}"/>
        <input type="submit" value="Register" class="btn btn-primary" />
    </form:form>
</body>
</html>
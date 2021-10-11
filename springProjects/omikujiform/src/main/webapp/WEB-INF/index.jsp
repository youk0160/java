<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h2>Send an Omikuji!</h2>
	<form action="/omikuji/submit" method="post" class="mx-3">
		<div class="mb-3">
			<label for="number" class="form-label">Pick any number from 5 to 25</label>
			<select id="number" name="number" class="form-control">
			<% for(int x=5; x<=25; x++) { %>
			  <option value="<%= x %>"><%= x %></option>
			<% } %>
			</select>
		</div>
		
		<div class="mb-3">
			<label for="city" class="form-label">Enter the name of any city</label>
			<input type="text" id="city" name="city" class="form-control">
		</div>
		
		<div class="mb-3">
			<label for="fullName" class="form-label">Enter the name of any real person</label>
			<input type="text" id="fullName" name="fullName" class="form-control">
		</div>
		
		<div class="mb-3">
			<label for="hobby" class="form-label">Enter professional endeavor or hobby</label>
			<input type="text" id="hobby" name="hobby" class="form-control">
		</div>
		
		<div class="mb-3">
			<label for="living" class="form-label">Enter any type of living thing</label>
			<input type="text" id="living" name="living" class="form-control">
		</div>
		
		<div class="mb-3">
			<label for="fortune" class="form-label">Say something nice to someone</label>
			<textarea id="fortune" name="fortune" rows="4" cols="50" class="form-control"></textarea>
		</div>
		<p class="fw-lighter fst-italic">Send or show a friend </p>
		<input type="submit" value="Send">
	</form>
</body>
</html>
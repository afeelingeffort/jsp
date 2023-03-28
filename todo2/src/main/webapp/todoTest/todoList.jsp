<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: row;
}

h2 span {
	background-color: purple;
}

ul li {
	list-style: none;
	margin-right: 30px;
	float: left;
}
</style>
</head>
<body>
	<h1>
		<span>TodoList</span>
	</h1>

	<ul>
		<li>ID</li>
		<li>title</li>
		<li>description</li>
		<li>priority</li>
		<li>completed</li>
		<li>createdAt</li>
		<li>category_id</li>
	</ul>

	<c:forEach var="a" items="${todoList}">
		<ul>
			<li>${a.id}</li>
			<li>${todoList.title}</li>
			<li>${todoList.description}</li>
			<li>${todoList.priority}</li>
			<li>${todoList.completed}</li>
			<li>${todoList.createdAt}</li>
			<li>${todoList.category_id}</li>
		</ul>
	</c:forEach>
</body>
</html>
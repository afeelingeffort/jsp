<%@page import="com.tenco.todo.dto.TodoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
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
	flex-direction: column;
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

	<%--
	<table>
		<tr>
			<th>ID</th>
			<th>title</th>
			<th>description</th>
			<th>priority</th>
			<th>completed</th>
			<th>createdAt</th>
			<th>categoryId</th>

		</tr>
	<c:forEach var="todoList" items="${todoList}">
		<tr>
			<td>${todoList.id}</td>
			<td>${todoList.title}</td>
			<td>${todoList.description}</td>
			<td>${todoList.priority}</td>
			<td>${todoList.completed}</td>
			<td>${todoList.createdAt}</td>
			<td>${todoList.categoryId}</td>
			<button>
				<a href="/todo2/sTodoTest?action=delete&cid=${todoList.id}">delete
				</a>
			</button>
		</tr>
	</c:forEach>
	</table>

	--%>

	<ul>
		<li>id</li>
		<li>title</li>
		<li>description</li>
		<li>priority</li>
		<li>completed</li>
		<li>createdAt</li>
		<li>categoryId</li>
	</ul>

		<ul>
		<c:forEach var="todoList" items="${todoList}">
			<li>${todoList.id}</li>
			<li>${todoList.title}</li>
			<li>${todoList.description}</li>
			<li>${todoList.priority}</li>
			<li>${todoList.completed}</li>
			<li>${todoList.createdAt}</li>
			<li>${todoList.categoryId}</li>
			<button>
				<a href="/todo2/sTodoTest?action=delete&cid=${todoList.id}">delete
			</button>
			<br>
		</c:forEach>
	</ul>
</body>
</html>
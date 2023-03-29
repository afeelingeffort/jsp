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
	flex-direction: column;
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
	<h2>
		<span>list</span>
	</h2>
	<ul>
		<li>ID</li>
		<li>NAME</li>
	</ul>
	<c:forEach var="category" items="${list2}">
		<ul>
			<li>${category.id}<button>delete</button>
			</li>
			<li>${category.name}</li>
		</ul>
	</c:forEach>
</body>
</html>
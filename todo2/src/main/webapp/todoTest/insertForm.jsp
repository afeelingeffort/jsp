<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

</style>
</head>

<%-- String title, String description, int priority, boolean completed, String createdAt, int category_id --%>
<body>

	<h1>
		<span>Todo insert</span>
	</h1>
	<form action="/todo2/sTodoTest?action=insert" method="post">
		카테고리 번호 <input type="number" name="categoryId">
		제목 <input type="text" name="title" maxlength="255"> 
		내용 <input type="text" name="description"> 
		우선 순위 <input type="number" name="priority" min="1" max="10"> 
		<input type="submit" value="등록">
	</form>
	
	<h1>
		<span>Todo update</span>
	</h1>
	
	<!-- int id, String title -->
	<form action="/todo2/sTodoTest?action=update" method="post">
		번호 <input type="number" name="id">
		제목 <input type="text" name="title" maxlength="255">
		<input type="submit" value="등록">
	</form>
</body>
</html>
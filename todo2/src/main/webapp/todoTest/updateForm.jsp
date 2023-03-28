<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/todo2/sTodoTest?action=update" method="post">
		번호 <input type="number" name="id"> 제목 
		<input type="text" name="title" maxlength="255"> 
		<input type="submit" value="등록">
	</form>
</body>
</html>
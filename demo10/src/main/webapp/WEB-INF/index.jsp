<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 index.jsp입니다.</h1>
	<form action="inc" method ="post">
		username : <input type="text" name="name" value="홍길동">
		<br>
		pw : <input type="password" name="pw" value="1234">
		<br>
		<!-- submit 버튼을 누르면 doPost로 들어감 -->
		<input type="submit" value="보내기">
	</form>
</body>
</html>
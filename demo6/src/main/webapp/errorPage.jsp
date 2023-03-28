<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
여기 jsp파일을 error 전용 페이지로 사용하려면 
반드시 isErrorPage = true를 선언해주어야 한다.
 -->
<%@page isErrorPage="true"%>
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
	margin: 100px;
	flex-direction: column;
}

h1 {
	font-size: 100px;
	color: red;
}

a {
	text-decoration: none;
	color: black;
}

a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<div>
		<h1>Error 404 Page Not Found</h1>
	</div>
	<div>
		<h2>잘못된 요청입니다.</h2>
		<h2>
			<a href="#">새로고침</a>
		</h2>
	</div>
	<!-- 이쁘게 에러 페이지 꾸며보기 -->
</body>
</html>
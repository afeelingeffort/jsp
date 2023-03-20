<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>If Example</title>
</head>
<body>
	<h1>if Example</h1>
	<p>
		<%
		int i = 1;
		int j = 2;

		// System.out.println() : 이클립스 콘솔에 출력
		// out.println() : 웹 화면에 출력
		if (i < j) {
			out.println("안녕");
		}
		%>
	</p>
</body>
</html>
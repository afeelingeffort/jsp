<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 바로 login.jsp로 이동
// 세션을 꺼내는 방법 확인
String username = (String) session.getAttribute("username");
if (username == null) {
	response.sendRedirect("login.jsp");
}
//저장되어 있던 아이디 확인
%>

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
<body>

	<h1>
		Welcome,
		<%=username%>!
	</h1>

	<form action="logout.jsp">
		<input type="submit" value="logout">
	</form>
</body>
</html>
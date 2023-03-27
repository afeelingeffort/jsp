<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String sessionUserName = (String)session.getAttribute("username");
// 문제 로그인이 안 되어 있으면 login.jsp페이지로 이동시키시오.
if(sessionUserName == null){
	response.sendRedirect("login.jsp");
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 상태이어야만 이 페이지를 보여줍니다.</h1>
	<h1>Hi <%=sessionUserName %></h1>
	
	<h1>로그아웃 하는 기능도 만들어 보시오</h1>
	
	<form action="logout.jsp">
		<label for = "logout">
			<input type="submit" id="logout" name="logout" value="logout">
		</label>
	</form>
	
</body>
</html>
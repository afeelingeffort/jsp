<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

//1. 첫 쿠키 생성은 null이라 if문을 수행하지 않고 html로 넘어감. (request)
//6. 응답 온 userId와 같다면 값을 넣어줌. 
// --> 쿠키가 저장됨.
Cookie[] cookies = request.getCookies();

String hasUserId = "";

if (cookies != null) {
	for (Cookie c : cookies) {
		if (c.getName().equals("userId")) {
			hasUserId = c.getValue();
			//표현식으로 input value태그에 넣음
			//out.println("쿠키에 저장된 사용자 아이디 : " + hasUserId);
			break;
		}
	}
}
%>

<!-- 2. html에서 웹 브라우저 띄우고 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 사용해보기</title>
</head>
<body>
	<form action="loginProc.jsp" method="post">
		<div>
			아이디 : <input type="text" name="userId" value="<%=hasUserId %>"
				required="required">
		</div>
		<div>
			비밀번호 : <input type="password" name="password" value="1234"
				required="required">
		</div>
		<div>
			<input type="checkbox" name="remember" value=""> 아이디 기억하기
		</div>
		<div>
			<input type="submit" value="쿠키저장및삭제">
		</div>
	</form>
</body>
</html>
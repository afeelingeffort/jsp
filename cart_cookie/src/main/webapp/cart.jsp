<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%

Cookie[] cookies = request.getCookies();

String cookieName = "";
String cookieValue = "";

if (cookies != null && cookies.length > 0) {
	//사용자가 체크박스를 하나 이상 선택한 경우
	for(int i=0; i<cookies.length; i++){
		if(cookies[i].getName().equals("cookieName")){
			cookieName = cookies[i].getName();
			cookieValue = cookies[i].getValue();
			break;
		}
	}
}

if(cookies != null){
	for(int i=0; i<cookies.length; i++){
		cookies[i].setMaxAge(0);
		response.addCookie(cookies[i]);
		break;
	}
	
}
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
}
</style>

</head>
<body>
	<form action="cartProc.jsp" method="post">
		<label for="apple"> 사과 <input type="checkbox" id="apple" name="cookies">
		</label> 
		<label for="banana"> 바나나 <input type="checkbox" id="banana" name="cookies">
		</label> 
		<label for="peach"> 복숭아 <input type="checkbox" id="peach" name="cookies">
		</label>

		<button type="submit" class="btn" value="save">저장</button>
		<button type="submit" class="btn" value="delete">삭제</button>
	</form>
</body>
</html>
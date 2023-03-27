<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
	forward() 방식
	<%
	response.setCharacterEncoding("UTF-8");
	String msg = (String)request.getAttribute("msg");
	out.println(msg);
	%>
	</p>
	
	<p>
	include() 방식
	<%
	response.setCharacterEncoding("UTF-8");
	String msg2 = (String)request.getAttribute("msg2");
	out.println(msg2);
	%>	
	</p>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String imgDir;
	String testServerIp;
	String realServerIp;

	imgDir = application.getInitParameter("imgDir");
	testServerIp = application.getInitParameter("testServerIp");
	realServerIp = application.getInitParameter("realServerIp");
	%>
	
	<p><%=imgDir %></p>
	<p><%=testServerIp %></p>
	<p><%=realServerIp %></p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
String error;

error = application.getInitParameter("error");
%>

<body>
	<p>errorImg <%=error %></p>
	<div>
		<img src="demo6_1/<%=error %>/error.jpg">
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
String img1;
String testIp;

img1 = application.getInitParameter("img1");
testIp = application.getInitParameter("testIp");

%>
<body>
	<p>img1 <%=img1 %></p>
	<p>testIp <%=testIp %></p>
	
	<div>
		<img src="/demo6_1/<%=img1 %>/a.png">
	</div>
	<%
	String str = null;
	out.print(str.split("/"));
	%>
	
	<%
	int op1=0;
	int op2=1;
	
	int result = op1/op2;
	System.out.println(result);
	%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

String email = (String)session.getAttribute("email");
if(email == null){
	response.sendRedirect("meSignin.jsp");
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome <%=email %></h1>
	
	<form action="logout.jsp">
		<input type="submit" value="logout">
	</form>
</body>
</html>
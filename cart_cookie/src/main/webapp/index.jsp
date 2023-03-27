<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%


Cookie[] cks = request.getCookies();
String cName="";
String cValue="";

if(cks != null){
	for(int i=0; i<cks.length; i++){
		if(cks[i].getName().equals("cName")){
			cName = cks[i].getName();
			cValue = cks[i].getValue();
		}
	}
	
}

response.sendRedirect("cart.jsp");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1></h1>
</body>
</html>
<%--
String hasfruits = "";
Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for (Cookie c : cookies) {
		if (c.getName().equals("apple")) {
			hasfruits = c.getValue();
			break;
		}
	}
}
 --%>
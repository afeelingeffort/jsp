<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String email = request.getParameter("email");
String password = request.getParameter("password");

if (email != null && password != null) {

	if (email.equals("asdf") && password.equals("1234")) {
		//로그인 성공

		session.setAttribute("email", email);
		response.sendRedirect("/demo4/meSignin.jsp");
	} else {
		//로그인 실패
		out.print("<p>로그인 실패</p>");
	}
}
%>
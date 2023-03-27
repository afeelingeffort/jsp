<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--String[] fruits = request.getParameterValues(""); --%>
<%
String apple = request.getParameter("cookies");
String banana = request.getParameter("cookies");
String peach = request.getParameter("cookies");

Cookie[] cookies = new Cookie[3];
if (apple != null && banana != null && peach != null) {
	
	cookies[0] = new Cookie("cookies", apple);
	cookies[1] = new Cookie("cookies", banana);
	cookies[2] = new Cookie("cookies", peach);
	
	cookies[0].setMaxAge(60*60*24*7);
}	
%>


<%--
if (apple != null && banana != null && peach != null) {
	Cookie cookie = new Cookie("apple", apple);
	Cookie cookie2 = new Cookie("banana", banana);
	Cookie cookie3 = new Cookie("peach", peach);
	
	cookie.setMaxAge(60);
	cookie2.setMaxAge(60);
	cookie3.setMaxAge(60);
	
	response.addCookie(cookie);
} else {
	// 쿠키 삭제 remember에 사용자가 체크를 하지 않은 상태라면 쿠키를 삭제하기
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie c: cookies){
			if(c.getName().equals("userId")){
				c.setMaxAge(0);
				response.addCookie(c);
				break;
			}
		}
	}
}
 --%>
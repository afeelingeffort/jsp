<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%

// 3. 쿠키는 키와 값으로 이루어져 있으니 매개변수로 request해서 값을 긁어내야 함.
// 4. remember를 선택했다면 if문 실행해서 Cookie를 생성, 유효기간 지정 후 response해서 응답해줌.
// 4-2. remember를 선택하지 않았다면 else문을 실행해서 foreach문으로 유효기간 삭제, 그 지운 값을 response해서 응답해줌.
// 5. login.jsp로 다시 응답 처리

//form 태그로 넘어오는 값을 파싱하는 기술
//form 태그에 MIME TYPE -> application/x-form ...
//name="" 키 값을 찾아서 값을 긁어낼 수 있다.
String inputId = request.getParameter("userId");
String inputPwd = request.getParameter("password");
String remember = request.getParameter("remember");

//여기 파일에 목적은 remember 값 유무에 따라 로직을 작성해서 (쿠키 사용)
// remember는 <아이디 기억하기> 
if (remember != null) {
	// 쿠키 생성 - 생성자에 키와 값을 할당한다.
	Cookie cookie = new Cookie("userId", inputId); //쿠키 생성
	cookie.setMaxAge(60 * 60 * 24 * 7); //쿠키 유효기간 : 7일간 유지
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

response.sendRedirect("login.jsp");
%>
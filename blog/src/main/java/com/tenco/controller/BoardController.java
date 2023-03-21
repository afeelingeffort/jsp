package com.tenco.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardController
 */

//URL : http://localhost:8080/blog/index.html
// -> 어떤 폴더에 어떤 파일이다 구분 짓는 것. 
//URI : http://localhost:8080:blog/boardcontroller
// -> 식별자  

//web.xml 환경설정에서 해야되는 부분인데
//web.xml 파일은 웹 서버가 동작시 한번만 로딩되기 때문에 서버를 재시작해야 한다.
@WebServlet("/boardcontroller")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {
		super();
	}

	// GET
	// GET은 body가 없다. 데이터를 보낼 때 시작줄에 보내면 됨.
	// http://localhost:8080:blog/boardcontroller?name=kim
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("boardController 동작");

		/*
		 * contextPath : /blog cookies : null session :
		 * org.apache.catalina.session.StandardSessionFacade@7ded40a8 parameterNames :
		 * java.util.Collections$3@7669dab4
		 */
		System.out.println(" contextPath : " + request.getContextPath());
		System.out.println(" cookies : " + request.getCookies());
		// JSESSIONID 라는 것은 사용자가 웹 서버에 최초 요청시에 요청하고
		// 응답시에 값을 담아서 보낸다. ????
		System.out.println(" session : " + request.getSession()); // 중요!
		System.out.println(" parameterNames : " + request.getParameterNames());
		System.out.println(" test : " + request.getParameter("name"));

		// ex) 아이디 저장하기
		// response 객체
		response.addCookie(new Cookie("mycookie", "asdf123"));
		response.getWriter();
		response.getStatus(); //200, 404
		// 새로운 response가 생성 ?? 
		response.sendRedirect("/usercontroller");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
